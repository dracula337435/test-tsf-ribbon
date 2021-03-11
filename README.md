# 试验tsf下对ribbon的配置

试验一下用```tsf```的话如何不过注册中心发起调用，尝试如下：

## 尝试一

配置```NIWSServerListClassName```无效，例如：在```client```模块```application.yml```中有
```
test-server:
  ribbon:
    NIWSServerListClassName: com.netflix.loadbalancer.ConfigurationBasedServerList
```
但实际不启作用

## 尝试二

配置```ribbon.consul.enabled=false```失败。

## 尝试三

接尝试二，配置```spring.cloud.consul.enabled=false```也不行，但是发现使用的```ServerList```类型为```ConfigurationBasedServerList```，已经对了；
作为对比，动态情形下为```ConsulServerList```。  
经过调试，发现是被```tsf-route```过滤掉了：  
```tsf-route```的```ConsulServerEnablePredicate```过滤时判```server```类型为```ConsulServer```才通过，
但静态列表中```server```类型为```Server```，直接```false```。  
于是，排除```tsf-route```。  

至此，主要做的：
1. 排除```tsf-route```依赖
1. 配置```spring.cloud.consul.enabled=false```
1. 配置```<service-name>.ribbon.listOfServers=...```

副作用：因为禁用了```consul```，即所有服务都是静态；配不出一部分动，一部分静的效果；另外，虽然禁用了```consul```，但是启动时还尝试连```consul```，连不上报错，启动后```consul```界面没有服务。
