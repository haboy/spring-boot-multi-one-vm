# 微服务使用springboot+cloud在同一JVM内启动多服务的测试  
## micro-common (微服务基础设施)  
测试环境：集成eureka-server(服务发现服务器), config-server(配置中心), zuul(网关路由)  
启动后将在8888，9999，随机端口和8761分别启动服务
启动方式

./run.sh
