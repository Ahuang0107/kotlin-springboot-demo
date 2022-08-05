package com.example.demo.initial.project.backup

import com.example.demo.base.dataaccess.repository.BaseSimpleRepo

interface ProjectBackupRepo : BaseSimpleRepo<ProjectBackupEntity> {
  fun findAllByRelProjectId(relProjectId: Long): List<ProjectBackupEntity>
}