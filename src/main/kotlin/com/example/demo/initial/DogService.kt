package com.example.demo.initial

import org.springframework.stereotype.Service

@Service
class DogService(
    private val repo: DogRepo,
) {
    fun findAll(): List<DogEntity> {
        return repo.findAll()
    }

    fun findById(id: Long): DogEntity {
        return repo.findById(id).get()
    }

    fun save(dog: DogEntity): DogEntity {
        return repo.save(dog)
    }
}