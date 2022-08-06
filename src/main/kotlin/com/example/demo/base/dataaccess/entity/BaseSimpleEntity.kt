package com.example.demo.base.dataaccess.entity

import com.vladmihalcea.hibernate.type.json.JsonBinaryType
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.TypeDef
import org.hibernate.annotations.TypeDefs
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@TypeDefs(
  TypeDef(name = "json", typeClass = JsonBinaryType::class),
)
@MappedSuperclass
abstract class BaseSimpleEntity(
  @Id
  @GenericGenerator(name = "snowflakeId", strategy = "com.example.demo.base.dataaccess.util.IdGenerator")
  @GeneratedValue(generator = "snowflakeId")
  var id: Long = 0
)