# spring-cloud
    Spring-Cloud的简单Demo

# 关于子模块端口的记录:
    1. bus:
        (1) 端口: 8070
        (2) 服务名: service-bus
        
    2. client:
        (1) 端口: 8071
        (2) 服务名: service-client
         
    3. config:
        (1) 端口: 8072
        (2) 服务名:  service-config
        
    4. consul:
        (1) 端口: 8073
        (2) 服务名:  service-consul
        
    5. feign:
        (1) 端口: 8074
        (2) 服务名:  service-feign
        
    6. gateway:
        (1) 端口: 8075
        (2) 服务名:  service-gateway
        
    7. lucy:
        (1) 端口: 8076
        (2) 服务名:  service-lucy
        
    8. ribbon:
        (1) 端口: 8077
        (2) 服务名:  service-ribbon
        
    9. turbine:
        (1) 端口: 8078
        (2) 服务名:  service-turbline
        
    10. zipkin:
        (1) 端口: 8079
        (2) 服务名:  service-zipkin
        
    11. zuul:
        (1) 端口: 8080
        (2) 服务名:  service-zuul
        
    12. server:
        (1) 端口: 8081
        (2) 服务名:  service-server

# 子项目说明:
    1. client是客户端,可以认为是子服务,用于提供服务.
    2. server是服务端,可以认为是注册中心.
    3. ribbon是服务消费者,可以认为是消费者,该实现方式是rest+ribbon.
    4. feign是服务消费者,可以认为是消费者,该实现方式是Feign
    5. 