package com.example.demo.initial.project

import com.example.demo.base.dataaccess.entity.BaseEntity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.MappedSuperclass

@MappedSuperclass
open class ProjectBaseEntity(
  var financeYear: Int = 0,
  var projectName: String = "",
  var engageCode: String = "",
  var totalFee: Double = .0,
  @Enumerated(EnumType.STRING)
  var stage: ProjectStage = ProjectStage.NOT_STARTED,
  var closed: Boolean = false,
) : BaseEntity()