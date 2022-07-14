package com.example.demo.base.dataaccess.service

import com.example.demo.base.dataaccess.entity.BaseEntity
import com.example.demo.base.dataaccess.repository.BaseRepo
import org.springframework.transaction.annotation.Transactional

@Transactional
@Suppress("UNUSED")
interface BaseService<E : BaseEntity> {
  val repo: BaseRepo<E>

  fun findById(id: Long): E? =
    repo.findById(id).orElse(null)

  fun findAllById(idList: List<Long>): List<E> =
    if (idList.isEmpty()) emptyList()
    else repo.findAllById(idList)

  fun findAll(): List<E> =
    repo.findAll()

  fun existedById(id: Long): Boolean =
    repo.existsById(id)

  fun save(entity: E): E =
    repo.save(entity)

  fun saveAndFlush(entity: E): E =
    repo.saveAndFlush(entity)

  fun saveAll(entities: List<E>): List<E> {
    return if (entities.isNotEmpty()) {
      repo.saveAll(entities)
    } else entities
  }
}