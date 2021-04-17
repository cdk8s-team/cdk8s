import { ApiObject, Lazy } from 'cdk8s';
import { Construct } from 'constructs';
import { Resource, ResourceProps } from './base';
import * as k8s from './imports/k8s';
import { ISecret } from './secret';
import { Service } from './service';

/**
 * Properties for `Ingress`.
 */
export interface IngressV1Beta1Props extends ResourceProps {
  /**
   * The default backend services requests that do not match any rule.
   *
   * Using this option or the `addDefaultBackend()` method is equivalent to
   * adding a rule with both `path` and `host` undefined.
   */
  readonly defaultBackend?: IngressV1Beta1Backend;

  /**
   * Routing rules for this ingress.
   *
   * Each rule must define an `IngressBackend` that will receive the requests
   * that match this rule. If both `host` and `path` are not specifiec, this
   * backend will be used as the default backend of the ingress.
   *
   * You can also add rules later using `addRule()`, `addHostRule()`,
   * `addDefaultBackend()` and `addHostDefaultBackend()`.
   */
  readonly rules?: IngressV1Beta1Rule[];


  /**
   * TLS settings for this ingress.
   *
   * Using this option tells the ingress controller to expose a TLS endpoint.
   * Currently the Ingress only supports a single TLS port, 443. If multiple
   * members of this list specify different hosts, they will be multiplexed on
   * the same port according to the hostname specified through the SNI TLS
   * extension, if the ingress controller fulfilling the ingress supports SNI.
   */
  readonly tls?: IngressV1Beta1Tls[];
}

/**
 * Ingress is a collection of rules that allow inbound connections to reach the
 * endpoints defined by a backend. An Ingress can be configured to give services
 * externally-reachable urls, load balance traffic, terminate SSL, offer name
 * based virtual hosting etc.
 */
export class IngressV1Beta1 extends Resource {

  /**
   * @see base.Resource.apiObject
   */
  protected readonly apiObject: ApiObject;

  private readonly _rulesPerHost: { [host: string]: k8s.HttpIngressPath[] } = {};
  private _defaultBackend?: IngressV1Beta1Backend;
  private readonly _tlsConfig: IngressV1Beta1Tls[] = [];

  constructor(scope: Construct, id: string, props: IngressV1Beta1Props = {}) {
    super(scope, id);

    this.apiObject = new k8s.KubeIngressV1Beta1(this, 'Resource', {
      metadata: props.metadata,
      spec: {
        backend: Lazy.any({ produce: () => this._defaultBackend?._toKube() }),
        rules: Lazy.any({ produce: () => this.synthRules() }),
        tls: Lazy.any({ produce: () => this.tlsConfig() }),
      },
    });

    if (props.defaultBackend) {
      this.addDefaultBackend(props.defaultBackend);
    }

    this.addRules(...props.rules ?? []);

    if (props.tls) {
      this.addTls(props.tls);
    }
  }

  protected onValidate() {
    if (!this._defaultBackend && Object.keys(this._rulesPerHost).length === 0) {
      return ['ingress with no rules or default backend'];
    }
    return [];
  }

  /**
   * Defines the default backend for this ingress. A default backend capable of
   * servicing requests that don't match any rule.
   *
   * @param backend The backend to use for requests that do not match any rule.
   */
  public addDefaultBackend(backend: IngressV1Beta1Backend) {
    this.addRules({ backend });
  }

  /**
   * Specify a default backend for a specific host name. This backend will be used as a catch-all for requests
   * targeted to this host name (the `Host` header matches this value).
   *
   * @param host The host name to match
   * @param backend The backend to route to
   */
  public addHostDefaultBackend(host: string, backend: IngressV1Beta1Backend) {
    if (!host) { throw new Error('host must not be an empty string'); }
    this.addRules({ host, backend });
  }

  /**
   * Adds an ingress rule applied to requests to a specific host and a specific
   * HTTP path (the `Host` header matches this value).
   *
   * @param host The host name
   * @param path The HTTP path
   * @param backend The backend to route requests to
   */
  public addHostRule(host: string, path: string, backend: IngressV1Beta1Backend) {
    if (!host) { throw new Error('host must not be an empty string'); }
    this.addRules({ host, backend, path });
  }

  /**
   * Adds an ingress rule applied to requests sent to a specific HTTP path.
   *
   * @param path The HTTP path
   * @param backend The backend to route requests to
   */
  public addRule(path: string, backend: IngressV1Beta1Backend) {
    this.addRules({ backend, path });
  }

  /**
   * Adds rules to this ingress.
   * @param rules The rules to add
   */
  public addRules(...rules: IngressV1Beta1Rule[]) {
    for (const rule of rules) {

      // default backend is not really a rule
      if (!rule.host && !rule.path) {
        if (this._defaultBackend) {
          throw new Error('a default backend is already defined for this ingress');
        }
        this._defaultBackend = rule.backend;
        continue;
      }

      const host = rule.host ?? '';
      const backend = rule.backend;
      const path = rule.path;

      if (path && !path.startsWith('/')) {
        throw new Error(`ingress paths must begin with a "/": ${path}`);
      }

      const routes = this._rulesPerHost[host] = this._rulesPerHost[host] ?? [];

      // check if we already have a rule for this host/path
      if (routes.find(r => r.path === path)) {
        throw new Error(`there is already an ingress rule for ${host}${path}`);
      }

      routes.push({ backend: backend._toKube(), path });
    }
  }

  private synthRules(): undefined | k8s.IngressRule[] {
    const rules = new Array<k8s.IngressRule>();

    for (const [host, paths] of Object.entries(this._rulesPerHost)) {
      rules.push({
        host: host ? host : undefined,
        http: { paths: paths.sort(sortByPath) },
      });
    }

    return rules.length > 0 ? rules : undefined;
  }

  public addTls(tls: IngressV1Beta1Tls[]) {
    this._tlsConfig.push(...tls);
  }

  private tlsConfig(): undefined | k8s.IngressTls[] {
    if (this._tlsConfig.length == 0) {
      return undefined;
    }

    const tls = new Array<k8s.IngressTls>();
    for (const entry of this._tlsConfig) {
      tls.push({
        hosts: entry.hosts,
        secretName: entry.secret?.name,
      });
    }

    return tls;
  }
}

/**
 * Options for setting up backends for ingress rules.
 */
export interface ServiceIngressV1BetaBackendOptions {
  /**
   * The port to use to access the service.
   *
   * - This option will fail if the service does not expose any ports.
   * - If the service exposes multiple ports, this option must be specified.
   * - If the service exposes a single port, this option is optional and if
   *   specified, it must be the same port exposed by the service.
   *
   * @default - if the service exposes a single port, this port will be used.
   */
  readonly port?: number;
}

/**
 * The backend for an ingress path.
 */
export class IngressV1Beta1Backend {
  /**
   * A Kubernetes `Service` to use as the backend for this path.
   * @param service The service object.
   */
  public static fromService(service: Service, options: ServiceIngressV1BetaBackendOptions = {}) {
    if (service.ports.length === 0) {
      throw new Error('service does not expose any ports');
    }

    let servicePort;
    if (service.ports.length === 1) {
      servicePort = service.ports[0].port;
    } else {
      if (options.port !== undefined) {
        const found = service.ports.find(p => p.port === options.port);
        if (found) {
          servicePort = found.port;
        } else {
          throw new Error(`service exposes ports ${service.ports.map(p => p.port).join(',')} but backend is defined to use port ${options.port}`);
        }
      } else {
        throw new Error(`unable to determine service port since service exposes multiple ports: ${service.ports.map(x => x.port).join(',')}`);
      }
    }

    if (options.port !== undefined && servicePort !== options.port) {
      throw new Error(`backend defines port ${options.port} but service exposes port ${servicePort}`);
    }

    return new IngressV1Beta1Backend({
      serviceName: service.name,
      servicePort,
    });
  }

  private constructor(private readonly backend: k8s.IngressBackend) {

  }

  /**
   * @internal
   */
  public _toKube() { return this.backend; }
}

/**
 * Represents the rules mapping the paths under a specified host to the related
 * backend services. Incoming requests are first evaluated for a host match,
 * then routed to the backend associated with the matching path.
 */
export interface IngressV1Beta1Rule {
  /**
   * Backend defines the referenced service endpoint to which the traffic will
   * be forwarded to.
   */
  readonly backend: IngressV1Beta1Backend;

  /**
   * Host is the fully qualified domain name of a network host, as defined by
   * RFC 3986. Note the following deviations from the "host" part of the URI as
   * defined in the RFC: 1. IPs are not allowed. Currently an IngressRuleValue
   * can only apply to the IP in the Spec of the parent Ingress. 2. The `:`
   * delimiter is not respected because ports are not allowed. Currently the
   * port of an Ingress is implicitly :80 for http and :443 for https. Both
   * these may change in the future. Incoming requests are matched against the
   * host before the IngressRuleValue.
   *
   * @default - If the host is unspecified, the Ingress routes all traffic based
   * on the specified IngressRuleValue.
   */
  readonly host?: string;

  /**
   * Path is an extended POSIX regex as defined by IEEE Std 1003.1, (i.e this
   * follows the egrep/unix syntax, not the perl syntax) matched against the
   * path of an incoming request. Currently it can contain characters disallowed
   * from the conventional "path" part of a URL as defined by RFC 3986. Paths
   * must begin with a '/'.
   *
   * @default - If unspecified, the path defaults to a catch all sending traffic
   * to the backend.
   */
  readonly path?: string;
}

/**
 * Represents the TLS configuration mapping that is passed to the ingress
 * controller for SSL termination.
 */
export interface IngressV1Beta1Tls {

  /**
   * Hosts are a list of hosts included in the TLS certificate. The values in
   * this list must match the name/s used in the TLS Secret.
   *
   * @default - If unspecified, it defaults to the wildcard host setting for
   * the loadbalancer controller fulfilling this Ingress.
   */
  readonly hosts?: string[];

  /**
   * Secret is the secret that contains the certificate and key used to
   * terminate SSL traffic on 443. If the SNI host in a listener conflicts with
   * the "Host" header field used by an IngressRule, the SNI host is used for
   * termination and value of the Host header is used for routing.
   *
   * @default - If unspecified, it allows SSL routing based on SNI hostname.
   */
  readonly secret?: ISecret;
}

function sortByPath(lhs: k8s.HttpIngressPath, rhs: k8s.HttpIngressPath) {
  const p1 = lhs.path ?? '';
  const p2 = rhs.path ?? '';
  return p1.localeCompare(p2);
}
