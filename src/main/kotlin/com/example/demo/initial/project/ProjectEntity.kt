package com.example.demo.initial.project

import com.example.demo.base.dataaccess.entity.BaseEntity
import javax.persistence.Entity

@Entity(name = "p_project")
class ProjectEntity(
  var name: String = "",
) : BaseEntity()