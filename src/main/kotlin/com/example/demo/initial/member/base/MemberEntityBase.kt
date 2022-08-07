package com.example.demo.initial.member.base

import com.example.demo.base.dataaccess.entity.BaseEntity
import com.example.demo.initial.member.Hour
import com.example.demo.initial.member.MemberStatistics
import org.hibernate.annotations.Type
import javax.persistence.MappedSuperclass

@MappedSuperclass
open class MemberEntityBase(
  var relProjectId: Long = 0,
  var memberName: String = "",
  var memberGpn: String = "",
  var totalHours: Double = .0,
  var totalSer: Double = .0,
  @Type(type = "json")
  var statistics: MemberStatistics? = null,
  @Type(type = "json")
  var hours: List<Hour> = emptyList(),
) : BaseEntity()