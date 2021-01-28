package com.mycompany.app;

import software.constructs.Construct;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import org.cdk8s.App;
import org.cdk8s.Chart;
import org.cdk8s.ChartProps;

import imports.io.jenkins.Jenkins;
import imports.io.jenkins.JenkinsProps;
import imports.io.jenkins.JenkinsSpec;
import imports.io.jenkins.JenkinsSpecSeedJobs;
import imports.io.jenkins.JenkinsSpecJenkinsApiSettings;
import imports.io.jenkins.JenkinsSpecMaster;

import imports.com.mattermost.ClusterInstallation;
import imports.com.mattermost.ClusterInstallationSpec;
import imports.com.mattermost.ClusterInstallationProps;
import imports.com.mattermost.ClusterInstallationSpecMinio;
import imports.com.mattermost.ClusterInstallationSpecDatabase;

/**
 * Hello world!
 */
public class Main extends Chart 
{

    public Main(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public Main(final Construct scope, final String id, final ChartProps props) {
        super(scope, id, props);

        final List<JenkinsSpecSeedJobs> seedJobs = new ArrayList();
        final JenkinsSpecSeedJobs seedJob = new JenkinsSpecSeedJobs.Builder()
            .description("Jenkins Operator repository")
            .id("jenkins-operator")
            .repositoryBranch("master")
            .repositoryUrl("https://github.com/jenkinsci/kubernetes-operator.git")
            .targets("cicd/jobs/*.jenkins")
            .build();

        seedJobs.add(seedJob);

        final JenkinsSpecJenkinsApiSettings apiSettings = new JenkinsSpecJenkinsApiSettings.Builder()
            .authorizationStrategy("foo")
            .build();

        final JenkinsSpecMaster master = new JenkinsSpecMaster.Builder().disableCsrfProtection(false).build();

        final JenkinsSpec spec = new JenkinsSpec.Builder()
            .seedJobs(seedJobs)
            .jenkinsApiSettings(apiSettings)
            .master(master)
            .build();

        final JenkinsProps jenkinsProps = new JenkinsProps.Builder().spec(spec).build();
        new Jenkins(this, "jenkins", jenkinsProps);

        final ClusterInstallationSpecMinio minio = new ClusterInstallationSpecMinio.Builder()
            .storageSize("10Gi")
            .replicas(4)
            .build();
        
        final ClusterInstallationSpecDatabase database = new ClusterInstallationSpecDatabase.Builder()
            .storageSize("10Gi")
            .replicas(4)
            .build();

        final Map<String, String> serviceAnnotations = new HashMap();
        serviceAnnotations.put("service.beta.kubernetes.io/aws-load-balancer-backend-protocol", "tcp");
        serviceAnnotations.put("service.beta.kubernetes.io/aws-load-balancer-ssl-cert", "arn:aws:acm:us-east-1:xxxx:certificate/xxxxx-xxx-xxx-xxx-xxxxx");
        serviceAnnotations.put("service.beta.kubernetes.io/aws-load-balancer-ssl-ports", "https");


        final ClusterInstallationSpec mattermostSpec = new ClusterInstallationSpec.Builder()
            .ingressName("example.mattermost-example.dev")
            .replicas(2)
            .minio(minio)
            .database(database)
            .useServiceLoadBalancer(true)
            .serviceAnnotations(serviceAnnotations)
            .mattermostLicenseSecret("mattermost-license")
            .build();

        final ClusterInstallationProps mattermostProps = new ClusterInstallationProps.Builder().spec(mattermostSpec).build();

        new ClusterInstallation(this, "mattermost", mattermostProps);
    }

    public static void main(String[] args) {
        final App app = new App();
        new Main(app, "crd-java");
        app.synth();
    }
}