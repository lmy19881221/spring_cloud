# spring_cloud
集成了Eureka（服务注册），Feign（REST调用），Hystrix（断路器），Gateway（路由网关），Config（配置中心），Turbine（断路器监控），Ribbon（负载均衡）





# 启动顺序
eureka-server 服务注册
config-server 配置中心
service-gateway 路由网关
service-feign 负载均衡 基于注解
service-ribbon 负载均衡 基于restTemplate
service-turbine 断路器监控
service-provider 服务提供者
