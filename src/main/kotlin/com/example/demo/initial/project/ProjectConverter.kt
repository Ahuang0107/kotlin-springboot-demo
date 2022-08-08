package com.example.demo.initial.project

import com.example.demo.initial.project.backup.ProjectBackupEntity
import com.example.demo.initial.project.primary.ProjectEntity
import com.example.demo.initial.project.request.UpdateProjectReq

fun ProjectEntity.updateFrom(source: UpdateProjectReq): ProjectEntity {
  return this.apply {
    financeYear = source.financeYear
    projectName = source.projectName
    engageCode = source.engageCode
    totalFee = source.totalFee
  }
}

fun ProjectBackupEntity.updateFrom(source: ProjectEntity): ProjectBackupEntity {
  return this.apply {
    financeYear = source.financeYear
    projectName = source.projectName
    engageCode = source.engageCode
    totalFee = source.totalFee
    stage = source.stage
    closed = source.closed
  }
}

fun ProjectEntity.toBackup(): ProjectBackupEntity {
  return ProjectBackupEntity(this.id).updateFrom(this)
}