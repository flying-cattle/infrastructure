# infrastructure
以Spring Boot和Mybatis 整理一些基础架构集合（聚合工程）

# 使用说明
item-parent：
        是一个父级项目，打包方式是POM，作用：控制其下所有子项目的jar包版本，利于项目包版本统一、项目版本统一升级，降低所用包版本迭代快的影响。

item-common:
        这个就不用多介绍了，你认为你每个项目都用的到的，就可以扔进去，包括JAR包。
        
springboot-mybatis：集成最全的代码生成工具：entity集成lombok、格式校验，swagger；dao自动加@mapper，service自动注释和依赖；Controller实现restful 增删改查API，并集成swagger与生成配置文件。
