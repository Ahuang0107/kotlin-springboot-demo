# Kotlin Springboot Demo

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