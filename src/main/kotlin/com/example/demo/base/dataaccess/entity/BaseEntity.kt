package com.example.demo.base.dataaccess.entity

import com.example.demo.base.enum.DataStatus
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDateTime
import javax.persistence.*

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

  @Enumerated(EnumType.ORDINAL)
  var dataStatus: DataStatus = DataStatus.NORMAL
}