# MicroService-Study-Samples

>微服务(Microservices)架构以及云原生应用(Cloud-Native)学习示例，主要涉及Spring Cloud、Docker等技术。

## 云原生应用(Cloud-Native)介绍：
<div  align="center">    
 <img src="http://oosk9q3p6.bkt.clouddn.com/lab_contrast.png" width = "300" height = "300" alt="云原生" align=center />
 <h4>云原生黄金三角</h4>
</div>

> 云原生包含了一组应用的模式，用于帮助企业快速，持续，可靠，规模化地交付业务软件。
云原生由以下几个部分组成：微服务架构，DevOps 和以容器为代表的敏捷基础架构。

## 云原生相关介绍
<table>
    <tr>
        <th>微服务架构</th>
        <th>容器</th>
        <th>DevOps</th>
    </tr>
    <tr>
        <td>使用分而治之的方式，将一个复杂系统围绕着业务逻辑分解为一组微服务。微服务架构使得系统能够被快速迭代和扩展，满足了又快又好的业务要求。</td>
        <td>容器相比标准的虚拟机更加高效。容器的交付标准化，帮助企业在业务应用开发、封装、测试、发布等方面形成标准，同时大大提高了运维的效率。</td>
        <td>DevOps是一套实践方法，在保证高质量的前提下缩短系统变更从提交到部署至生产环境的时间，提高组织高速交付业务的能力。</td>
    </tr>
</table>

## 对比

 传统架构   |  微服务架构
------------- | -------------
<img align="center" src="http://oosk9q3p6.bkt.clouddn.com/micro_contrast1.png" style="width:700px;height:180px;"/> 传统单体应用架构庞大且难以扩展，不能满足互联网时代又快又好的需求 | <img align="center" src="http://oosk9q3p6.bkt.clouddn.com/micro_contrast2.png" style="width:300px;height:300px;"/> 使用分而治之的方式，将一个复杂系统分解为一组微服务，微服务之间是松耦合的，每个微服务只关注于一个业务功能，可以由不同的独立团队开发，从而满足互联网时代又快又好的要求。

 传统架构   |  微服务架构
------------- | -------------
![传统单体应用架构庞大且难以扩展，不能满足互联网时代又快又好的需求。](http://oosk9q3p6.bkt.clouddn.com/micro_contrast1.png)  | ![使用分而治之的方式，将一个复杂系统分解为一组微服务，微服务之间是松耦合的，每个微服务只关注于一个业务功能，可以由不同的独立团队开发，从而满足互联网时代又快又好的要求。](http://oosk9q3p6.bkt.clouddn.com/micro_contrast2.png)

*** 
```markdown
1 Eureka 服务注册与发现:
服务注册与发现-microservice-discovery-eureka-server
运行示例：
> cd ./microservice-discovery-eureka-server/
> mvn spring-boot:run
```


  [1]: http://oosk9q3p6.bkt.clouddn.com/micro_contrast1.png
  [2]: http://oosk9q3p6.bkt.clouddn.com/micro_contrast2.png