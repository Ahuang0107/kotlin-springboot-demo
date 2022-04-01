package com.example.demo.base.dataaccess.repository

import com.example.demo.base.dataaccess.entity.BaseSimpleEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.NoRepositoryBean

@NoRepositoryBean
interface BaseSimpleRepo<E : BaseSimpleEntity> : JpaRepository<E, Long>