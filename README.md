
- 启动Redis：

  Redis 采用Docker 示例，在运行本项目之前，请先运行如下命令：

```shell
docker run --name some-redis -d -p 6379:6379 redis redis-server --save 60 1 --loglevel warning# MsaWithSpringBoot
```


- ActiveMQ
  
  ActiveMQ 既可以用SpringBoot 内置的实例，也可以调用外部的Active MQ 。
这里采用的是阿里云的一个Active MQ 实例

`tcp://tcp://121.196.166.234:61616`