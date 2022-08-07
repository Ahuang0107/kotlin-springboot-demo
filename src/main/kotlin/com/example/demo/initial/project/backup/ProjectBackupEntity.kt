package com.example.demo.initial.project.backup

import com.example.demo.initial.project.base.ProjectBaseEntity
import javax.persistence.Entity

@Entity(name = "p_project_bak")
class ProjectBackupEntity(
  var relProjectId: Long = 0,
) : ProjectBaseEntity()