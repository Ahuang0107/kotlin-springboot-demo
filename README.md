# Kotlin Springboot Demo

## start

1. 首先如果是在windows系统上使用docker，那么mysql容器挂载的my.cnf会被修改权限，导致容器内会忽略该配置，需要进入容器`cd etc/mysql`，然后修改权限`chmod 644 my.cnf`
   ，然后再重启容器，此时配置才生效。

## Restful API

## MVC Architecture

* controller layer provide api
* facade layer provide business logic
    * facade repository layer provide complex (business level) querydsl function
* service layer provide database operations
    * repo layer provide jpa function
    * repository layer provide querydsl function
    * mapper layer provide mybatis function

## Json Serialize

* SpringMVC use Jackson as default
* Some part that need manually converter between json and object, such as unit test, use Gson.

### Json Serialize Library Comparison

* Serialize Single Object Performance: Fastjson > Jackson >> Gson
* Serialize Large Object Performance: Jackson >> Fastjson > Gson
* Deserialization Single Object Performance: Fastjson > Jackson > Gson
* Deserialization Large Object Performance: Fastjson > Jackson > Gson

## Unit Test

1. `@Rollback` or `@Transactional` is not necessary, `@DataJpaTest` default apply `@Transactional`.