package com.example.demo.initial.project

import com.example.demo.base.dataaccess.entity.BaseEntity
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated

@Entity(name = "p_project")
class ProjectEntity(
  var projectName: String = "",
  var engageCode: String = "",
  var totalFee: Double = .0,
  @Enumerated(EnumType.STRING)
  var stage: ProjectStage = ProjectStage.NOT_STARTED,
  var closed: Boolean = false,
) : BaseEntity()