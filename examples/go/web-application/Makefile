# Docker compose
start:
	docker compose up
stop:
	docker compose down

#DockerHub
pushtohub:
	docker compose build nodewithdb
	docker tag cdk8s_nodewithdb  $${account}/cdk8sdemo
	docker push $${account}/cdk8sdemo

#K8s

k8sapply:
	kubectl apply --recursive  -f cdk8sgen/dist
k8sdel:
	kubectl delete --recursive -f cdk8sgen/dist

