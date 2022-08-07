package com.example.demo.initial.project.base

import com.example.demo.base.dataaccess.service.BaseService

class ProjectServiceBase<T : ProjectBaseEntity>(
  override val repo: ProjectRepoBase<T>
) : BaseService<T>