package com.example.demo.base.dataaccess.entity

import org.hibernate.annotations.GenericGenerator
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class BaseSimpleEntity(
  @Id
  @GenericGenerator(name = "snowflakeId", strategy = "com.example.demo.base.dataaccess.util.IdGenerator")
  @GeneratedValue(generator = "snowflakeId")
  var id: Long = 0
)