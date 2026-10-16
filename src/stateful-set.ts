// Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
// SPDX-License-Identifier: Apache-2.0

import { ApiObject, Lazy } from 'cdk8s';
import { Construct } from 'constructs';
import * as k8s from './imports/k8s';
import * as service from './service';
import * as workload from './workload';

export interface StatefulSetProps extends workload.WorkloadProps {
  /**
   * Service to associate with the statefulset.
   *
   * @default - A headless service will be created automatically.
   */
  readonly service?: service.Service;

  /**
   * Whether to create a default headless service.
   *
   * Set this to `false` when you want to create a StatefulSet without an
   * associated service, for example when using it to coordinate workloads
   * that communicate via a message bus rather than network requests.
   *
   * @default true
   */
  readonly createService?: boolean;
}

/**
 * StatefulSet is the workload API object used to manage stateful applications.
 *
 * Manages the deployment and scaling of a set of Pods, and provides guarantees
 * about the ordering and uniqueness of these Pods.
 *
 * Like a Deployment, a StatefulSet manages Pods that are based on an identical
 * container spec. Unlike a Deployment, a StatefulSet maintains a sticky identity
 * for each of their Pods. These pods are created from the same spec, but are not
 * interchangeable: each has a persistent identifier that it maintains across any
 * rescheduling.
 *
 * If you don't need the guarantees provided by a StatefulSet, consider using a
 * {@link Deployment} instead.
 *
 * @see https://kubernetes.io/docs/concepts/workloads/controllers/statefulset/
 */
export class StatefulSet extends workload.Workload {
  /**
   * Number of desired pods.
   */
  public readonly replicas?: number;

  /**
   * Management policy to use for the set.
   */
  public readonly podManagementPolicy?: k8s.PodManagementPolicy;

  /**
   * The headless service used to connect to the stateful set.
   */
  public readonly service: service.Service;

  /**
   * Determines the ordinal at which the Pod should be marked as
   * ready to accept traffic.
   */
  public readonly minReady?: number;

  /**
   * Minimum duration for which a newly created pod should be ready
   * without any of its container crashing, for it to be considered available.
   */
  public readonly minReadySeconds?: number;

  /**
   * Persistent volume claim retention policy.
   */
  public readonly persistentVolumeClaimRetentionPolicy?: k8s.StatefulSetPersistentVolumeClaimRetentionPolicy;

  /**
   * Scaling behavior.
   */
  public readonly scale?: k8s.StatefulSetSpecScale;

  /**
   * Volume claim templates.
   */
  public readonly volumeClaimTemplates: k8s.PersistentVolumeClaim[];

  constructor(scope: Construct, id: string, props: StatefulSetProps = {}) {
    super(scope, id, props);

    this.apiObject = new ApiObject(this, 'Resource', {
      kind: 'StatefulSet',
      apiVersion: 'apps/v1',
      metadata: props.metadata,
      spec: Lazy.any({ produce: () => this._toKube() }),
    });

    this.replicas = props.replicas;
    this.minReady = props.minReady;
    this.minReadySeconds = props.minReadySeconds;
    this.persistentVolumeClaimRetentionPolicy = props.persistentVolumeClaimRetentionPolicy;
    this.scale = props.scale;
    this.volumeClaimTemplates = props.volumeClaimTemplates ?? [];

    const createService = props.createService ?? true;
    
    if (props.service && !createService) {
      throw new Error('Cannot specify both `service` and `createService: false`');
    }

    if (props.service) {
      this.service = props.service;
    } else if (createService) {
      this.service = new service.Service(this, 'Service', {
        metadata: {
          name: `${this.name}-${this.apiObject.kind.toLowerCase()}`,
          namespace: this.metadata.namespace,
        },
        selector: this,
        clusterIP: 'None',
        type: service.ServiceType.CLUSTER_IP,
      });
    } else {
      // When createService is false and no service is provided, 
      // we still need to define the service property but leave it uninitialized
      // This maintains backward compatibility with existing code that might reference this.service
      this.service = undefined as any; // This will cause runtime errors if accessed, which is the intended behavior
    }

    this.podManagementPolicy = props.podManagementPolicy ?? k8s.PodManagementPolicy.ORDERED_READY;
  }

  /**
   * @internal
   */
  public _toKube(): k8s.StatefulSetSpec {
    const spec = super._toKube();
    return {
      ...spec,
      serviceName: this.service?.name,
      replicas: this.replicas,
      podManagementPolicy: this.podManagementPolicy,
      minReadySeconds: this.minReadySeconds,
      persistentVolumeClaimRetentionPolicy: this.persistentVolumeClaimRetentionPolicy,
      scale: this.scale,
      volumeClaimTemplates: this.volumeClaimTemplates,
    };
  }
}
