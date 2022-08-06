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
    repo.findAllById(idList)

  fun findAll(): List<E> =
    repo.findAll()

  fun existedById(id: Long): Boolean =
    repo.existsById(id)

  fun save(entity: E): E =
    repo.save(entity)

  fun saveAndFlush(entity: E): E =
    repo.saveAndFlush(entity)

  fun saveAll(entities: List<E>): List<E> =
    repo.saveAll(entities)

  fun delete(id: Long) =
    repo.deleteById(id)

  fun delete(idList: List<Long>) =
    repo.deleteAllById(idList)
}