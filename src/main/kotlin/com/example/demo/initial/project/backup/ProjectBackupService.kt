package com.example.demo.initial.project.backup

import com.example.demo.base.dataaccess.service.BaseService
import org.springframework.stereotype.Service

@Service
class ProjectBackupService(
  override val repo: ProjectBackupRepo
) : BaseService<ProjectBackupEntity> {
  fun findAllProjectBackups(projectId: Long): List<ProjectBackupEntity> {
    return repo.findAllByRelProjectId(projectId)
  }
}