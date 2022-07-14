package com.example.demo.base.dataaccess.repository

import com.example.demo.base.dataaccess.entity.BaseEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.NoRepositoryBean

@NoRepositoryBean
interface BaseRepo<E : BaseEntity> : JpaRepository<E, Long>