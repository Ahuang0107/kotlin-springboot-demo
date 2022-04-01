package com.example.demo.initial

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest

@DataJpaTest
@AutoConfigureTestDatabase(replace = NONE)
internal class DogRepoTest @Autowired constructor(
  private val dogRepo: DogRepo
) {

  @Test
  fun testData() {
    val dog = DogEntity("Golden Retriever")

    val savedDog = dogRepo.save(dog)
    val findDog = dogRepo.findById(savedDog.id).get()

    assertThat(findDog).isEqualTo(dog)
  }
}