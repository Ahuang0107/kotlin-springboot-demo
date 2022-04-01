package com.example.demo.base.dataaccess.service

import com.example.demo.base.dataaccess.entity.BaseSimpleEntity
import com.example.demo.base.dataaccess.repository.BaseSimpleRepo
import org.springframework.transaction.annotation.Transactional

@Transactional
@Suppress("UNUSED")
interface BaseSimpleService<E : BaseSimpleEntity> {
  val repo: BaseSimpleRepo<E>

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

  fun saveAll(entities: List<E>): List<E> {
    return if (entities.isNotEmpty()) {
      repo.saveAll(entities)
    } else entities
  }
}