package com.example.demo.initial

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.transaction.annotation.Transactional

@SpringBootTest
@Transactional
internal class DogServiceTest @Autowired constructor(
    private val dogService: DogService,
) {
    @Test
    fun testData() {
        val dog = DogEntity("Golden Retriever")

        val saveDog = dogService.save(dog)
        val findDog = dogService.findById(saveDog.id!!)

        assertThat(findDog.id).isEqualTo(dog.id)
        assertThat(findDog.name).isEqualTo(dog.name)
    }
}