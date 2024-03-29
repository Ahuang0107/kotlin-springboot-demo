package com.example.demo.initial.project.primary

import com.example.demo.initial.project.base.ProjectServiceBase
import org.springframework.stereotype.Service

@Service
class ProjectService(
  override val repo: ProjectRepo,
) : ProjectServiceBase<ProjectEntity>(repo)