# Meshed Cloud Client

> meshed-cloud-workflow-client

## 推送制品库
```shell
mvn clean install org.apache.maven.plugins:maven-deploy-plugin:2.8:deploy -DskipTests
```

## 使用Client
Maven
```xml
<dependency>
    <groupId>${groupId}</groupId>
    <artifactId>meshed-cloud-workflow-client</artifactId>
    <version>${version}</version>
</dependency>
```

## 领域划分

### 引擎领域

工作流核心领域，该领域服务内部系统，底层当前采用flowable流程引擎，前端采用XFlow设计器

### 流程领域

流程平台业务管理领域，对引擎中表单和流程扩展设计的补充，对控制台业务的服务提供

### 表单领域

流程平台提供的通用动态表单，前端采用formily方案


