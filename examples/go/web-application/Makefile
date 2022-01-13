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
	kubectl apply -f cdk8sgen/dist
k8sdel:
	kubectl delete -f cdk8sgen/dist

