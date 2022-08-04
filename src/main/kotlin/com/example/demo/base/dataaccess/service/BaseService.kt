package com.example.demo.base.dataaccess.service

import com.example.demo.base.dataaccess.entity.BaseEntity
import org.springframework.transaction.annotation.Transactional

@Transactional
@Suppress("UNUSED")
interface BaseService<E : BaseEntity> : BaseSimpleService<E>