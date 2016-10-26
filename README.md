# spring-cloud-consul-example

使用`consul`注册服务

### 1. 启动`consul`

```
consul agent -dev -ui
```

### 2. 启动`server`

```
mvn -f server/pom.xml spring-boot:run
mvn -f server/pom.xml spring-boot:run
mvn -f server/pom.xml spring-boot:run
```

启动三个服务端，客户端会轮询调用这三个服务，注意观察服务端控制台输出

### 3. 启动`client`

```
mvn -f client/pom.xml spring-boot:run
```

### 4. 客户端服务调用

http://localhost:8080/int

客户端负载均衡轮询调用之前步骤中启动的三个服务端程序，注意观察服务端控制台输出

### 5. consul ui

http://localhost:8500/ui

`consul`注册服务控制台

