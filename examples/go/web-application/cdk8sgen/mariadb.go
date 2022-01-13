package main

import (
	"github.com/aws/jsii-runtime-go"
	"github.com/cdk8s-team/cdk8s-core-go/cdk8s"
	kplus "github.com/cdk8s-team/cdk8s-plus-go/cdk8splus22"
)

// mariadbDefinition creates the resources necessary to deploy mariaDB and populate it
// with some sample data
func mariadbDefinition(app *cdk8s.App) {
	mariadbChart := cdk8s.NewChart(*app, jsii.String("mariadb"), nil)

	mariadbMetadata := cdk8s.ApiObjectMetadata{
		Annotations: &map[string]*string{"cdk8s_plus": js("22")},
		Name:        js("mariadb"),
	}

	mariadbConfig := kplus.NewConfigMap(mariadbChart, js("mariadb"), &kplus.ConfigMapProps{
		Metadata: &mariadbMetadata,
		Data:     &map[string]*string{"MYSQL_ROOT_PASSWORD": js("TestDB@home2")},
	})

	//  SQL to pre-populate the database
	mariadbInitdbSql := "CREATE DATABASE IF NOT EXISTS `test`;" +
		" USE `test`;" +
		" CREATE TABLE IF NOT EXISTS `test`.`test` (`id` serial,`name` varchar(50) NOT NULL, PRIMARY KEY (id));" +
		" insert into test (`name`) VALUES ('Cheese Bread'),('Lasagna'),('Baguette'),('Pizza'),('Spaghetti');"

	// Mount the SQL above as a configmap. This will be mounted on the container
	// and used to pre-populate the DB the first time the container is initialized
	mariadbInitdbConfig := kplus.NewConfigMap(mariadbChart, js("mariaDbInitConfig"),
		&kplus.ConfigMapProps{
			Metadata: &cdk8s.ApiObjectMetadata{
				Annotations: &map[string]*string{"cdk8s_plus": js("22")},
				Name:        js("mariadbinitdb"),
			},
			Data: &map[string]*string{"initdb.sql": js(mariadbInitdbSql)},
		})

	mariadbInitVolumeMount := &kplus.VolumeMount{
		Path:   js("/docker-entrypoint-initdb.d"),
		Volume: kplus.Volume_FromConfigMap(mariadbInitdbConfig, nil),
	}

	// Deploy the DB
	mariadbDeployment := kplus.NewDeployment(mariadbChart, js("mariaDbDeployment"),
		&kplus.DeploymentProps{
			Metadata: &mariadbMetadata,
			Containers: &[]*kplus.ContainerProps{{
				Image:           js("mariadb"),
				Name:            js("mariadbcont"),
				Port:            jn(3306),
				ImagePullPolicy: kplus.ImagePullPolicy_IF_NOT_PRESENT,
				VolumeMounts:    &[]*kplus.VolumeMount{mariadbInitVolumeMount},
				Env: &map[string]kplus.EnvValue{"MYSQL_ROOT_PASSWORD": kplus.EnvValue_FromConfigMap(mariadbConfig,
					js("MYSQL_ROOT_PASSWORD"), nil)},
			}},
			PodMetadata: &mariadbMetadata,
			Replicas:    jn(1),
		})

	// Expose DB internally on port 3306
	mariadbDeployment.ExposeViaService(&kplus.ExposeDeploymentViaServiceOptions{
		Name:        js("mariadb"),
		Port:        jn(3306),
		ServiceType: kplus.ServiceType_CLUSTER_IP,
	})

}
