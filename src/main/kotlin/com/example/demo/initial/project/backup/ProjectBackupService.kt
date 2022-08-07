package com.example.demo.initial.project.backup

import com.example.demo.initial.project.base.ProjectServiceBase
import org.springframework.stereotype.Service

@Service
class ProjectBackupService(
  override val repo: ProjectBackupRepo,
) : ProjectServiceBase<ProjectBackupEntity>(repo) {
  fun findAllProjectBackups(projectId: Long): List<ProjectBackupEntity> {
    return repo.findAllByRelProjectId(projectId)
  }
}