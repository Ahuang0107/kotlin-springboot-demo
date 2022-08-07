package com.example.demo.initial.project.base

import com.example.demo.base.dataaccess.repository.BaseSimpleRepo
import org.springframework.data.repository.NoRepositoryBean

@NoRepositoryBean
interface ProjectRepoBase<T : ProjectBaseEntity> : BaseSimpleRepo<T>