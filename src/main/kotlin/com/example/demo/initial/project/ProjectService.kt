package com.example.demo.initial.project

import com.example.demo.base.dataaccess.service.BaseService
import org.springframework.stereotype.Service

@Service
class ProjectService(
  override val repo: ProjectRepo,
) : BaseService<ProjectEntity>