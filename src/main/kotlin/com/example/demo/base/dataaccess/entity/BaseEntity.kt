package com.example.demo.base.dataaccess.entity

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.EntityListeners
import javax.persistence.MappedSuperclass

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
open class BaseEntity : BaseSimpleEntity() {

  @CreatedDate
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @Column(updatable = false)
  lateinit var createAt: LocalDateTime

  @LastModifiedDate
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  lateinit var updateAt: LocalDateTime
}