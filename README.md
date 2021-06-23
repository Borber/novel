#### 项目结构

```
novel-cloud
├── novel-common -- 通用模块，供其他业务微服务模块依赖
├── novel-gen -- 持久层代码生成器，集成Swagger
├── novel-gateway -- 基于Spring Cloud Gateway构建的网关服务
├── novel-monitor -- 基于Spring Boot Admin构建的监控中心
├── novel-search -- 基于Elastic Search构建的搜索微服务
├── novel-file -- 基于阿里云OSS构建的文件微服务
├── novel-home -- 门户首页微服务
├── novel-news -- 新闻中心微服务
├── novel-user -- 用户中心微服务
├── novel-author -- 作家中心微服务
├── novel-book -- 小说微服务
└── novel-pay -- 支付微服务
```

#### 技术选型

| 技术                 | 说明                                                         
| --------------------| ---------------------------
| SpringBoot          | Spring应用快速开发脚手架     
| SpringCloud         | 微服务架构解决方案 
| Nacos               | 注册中心和配置中心
| Sentine              | 限流/熔断/降级
| SpringCloud Gateway | 微服务网关
| SpringBoot Admin    | 微服务监控
| MyBatis             | 持久层ORM框架 
| MyBatis Dynamic SQL | Mybatis动态sql
| PageHelper          | MyBatis分页插件
| MyBatisGenerator    | 持久层代码生成插件
| Seata               | 分布式事务中间件（待应用）
| Sharding-Jdbc       | 代码层分库分表中间件
| JJWT                | JWT登录支持  
| Redis               | 分布式缓存                              
| ElasticSearch       | 搜索引擎                
| RabbitMq            | 消息队列
| OSS                 | 阿里云对象存储服务   
| Mysql               | 数据库服务                 
| Redisson            | 实现分布式锁                                       
| Lombok              | 简化对象封装工具  
| Swagger             | API文档生成工具                                                                              
| Docker              | 应用容器引擎   
| Logstash            | 分布式日志采集   
| Vue                 | 前端开发框架


[Swagger 接口](http://localhost:625/swagger-ui.html)

[RabbitMQ](http://192.168.50.240:15672/#/)

[Kibana](http://192.168.50.240:5601/)



