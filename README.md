# springboot-zookeeper-discovery

Please setup apache zookeeper (https://zookeeper.apache.org/)

- extract compressed at the path  (/usr/local/zookeeper) 
- see ${home}/conf/zoo.cfg   

```jshelllanguage
tickTime=2000
initLimit=10
syncLimit=5
dataDir=/tmp/zookeeper
clientPort=2181
#maxClientCnxns=60
``` 

### Run the Server
cd ${home}/bin 

./zkServer.sh start 

you can see the below message

```
ZooKeeper JMX enabled by default
Using config: /usr/local/zookeeper3.4/bin/../conf/zoo.cfg
Starting zookeeper ... STARTED
```

### Stop the Server

./zkServer.sh stop


### Connect the Server

./zkCli.sh -server localhost:2181



### Run the application


run all the projects (rest-api, provider-api, zookeeper-discovery) *Application.java 
and access the project below. 

```
http://localhost:8080/product
http://localhost:8080/helloworld
http://localhost:8080/name
http://localhost:8080/services
```


you can find out zookeeper discovery and load balancing end point 

https://2dell.blogspot.com/