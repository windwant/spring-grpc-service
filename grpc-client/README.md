# grpc-client

用于引入进行服务调用。

此模块不是必须提供的，服务使用方可以自行配置定义。

### 配置示例：

spring:
  application:
    name: grpc-client  # 服务名称
  cloud:
    zookeeper:
      connect-string: 127.0.0.1:2181 # 用于发现服务的 zookeeper 信息 host:port
      discovery:
        register: false  #是否注册 client

