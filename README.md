# spring_cloud
集成了Eureka（服务注册），Feign（基于注解的负载均衡），Hystrix（断路器），Gateway（路由网关），Config（配置中心），Turbine（断路器监控），Ribbon（负载均衡），zipkin（服务链路追踪）





# 启动顺序
eureka-server 服务注册  
config-server 配置中心  
service-provider 服务提供者  
service-feign 负载均衡 基于注解  
service-ribbon 负载均衡 基于restTemplate  
service-turbine 断路器监控  
service-gateway 路由网关  

