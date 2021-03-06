Lolibox
=======

A simple, fast image hosting software

###DEMO
http://hime.io/

###Environment
Java 1.8

###Run

####Configuration

Config file `application.properties` is in `lolibox/lolibox-server/src/main/resources/`

```
spring.application.name=lolibox
## Server port
server.port=8080
## Server address
# server.address=
## Max upload size
multipart.max-file-size=20MB
## Advanced management path 
management.context-path=/admin/
## Your email
email=you@email.com
password=password

## Another path for CDN
# cdnHost=

## storage.type can be 'filesystem', 'aliyun', 'qiniu'
storage.type=filesystem
## Where images saved while storage.type is 'filesystem'
storage.filesystem.imageFolder=/home/choco/lolibox/

## aliyun cloud storage settings
#storage.aliyun.url=
#storage.aliyun.key=
#storage.aliyun.secret=
#storage.aliyun.name=

## DB properties
spring.h2.console.enabled=false
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:h2:file:~/lolibox/db;FILE_LOCK=FS
spring.datasource.username=sa
spring.datasource.password=sa
```

####Configuration for Aliyun OSS Cloud Storage

```
storage.type=aliyun

## aliyun cloud storage settings
storage.aliyun.url=aliyun.url
storage.aliyun.key=aliyun.key
storage.aliyun.secret=aliyun.secret
storage.aliyun.name=aliyun.bucketname
```

#### Qiniu
```
## Qiniu cloud storage settings
storage.qiniu.key=qiniu.key
storage.qiniu.secret=qiniu.secret
storage.qiniu.name=qiniu.bucketname
```

#### Baidu cloud storage settings
```
storage.baidu.key=baidu.key
storage.baidu.secret=baidu.secret
storage.baidu.url=baidu.url
storage.baidu.name=baidu.bucketname
```

You should alse uncomment all lines in application.yml.


###Build from github
####Environment
1. Java 1.8
2. Maven 3

####Commands
```
git clone https://github.com/chocotan/lolibox.git
cd lolibox
mvn clean package
./lolibox-server/target/lolibox-server-x.y.z-SNAPSHOT.jar
```

Open `http://host:port/admin.html` and login with email/password in application.properties
to manage images uploaded

####Screenshots

![抓图162.png](http://c.hime.io/images/la.png)
