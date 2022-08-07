package com.example.demo.initial.project.backup

import com.example.demo.initial.project.base.ProjectRepoBase

interface ProjectBackupRepo : ProjectRepoBase<ProjectBackupEntity> {
  fun findAllByRelProjectId(relProjectId: Long): List<ProjectBackupEntity>
}