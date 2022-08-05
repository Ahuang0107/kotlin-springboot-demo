package com.example.demo.initial.project

import com.example.demo.initial.project.backup.ProjectBackupEntity
import com.example.demo.initial.project.backup.ProjectBackupService
import org.springframework.stereotype.Service

@Service
class ProjectFacade(
  private val projectService: ProjectService,
  private val projectBackupService: ProjectBackupService,
) {
  fun findAllProjects(): List<ProjectEntity> {
    return projectService.findAll()
  }

  fun findAllProjectBackups(projectId: Long): List<ProjectBackupEntity> {
    return projectBackupService.findAllProjectBackups(projectId)
  }

  fun createProject(req: UpdateProjectReq): ProjectEntity {
    return ProjectEntity().updateFrom(req).let { projectService.save(it) }
  }

  fun updateProject(id: Long, req: UpdateProjectReq): ProjectEntity? {
    return projectService.findById(id)?.also {
      val backup = it.toBackup()
      projectBackupService.save(backup)
    }?.updateFrom(req)?.let { projectService.save(it) }
  }

  fun changeProjectStage(id: Long, targetStage: ProjectStage): ProjectEntity? {
    return projectService.findById(id)?.let {
      it.stage = targetStage
      projectService.save(it)
    }
  }

  fun closeProject(id: Long): ProjectEntity? {
    return projectService.findById(id)?.let {
      it.closed = true
      projectService.save(it)
    }
  }

  fun deleteProject(id: Long) {
    projectService.deleteById(id)
  }
}