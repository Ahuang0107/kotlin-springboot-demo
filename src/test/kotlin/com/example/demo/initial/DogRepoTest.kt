package com.example.demo.initial

import com.example.demo.base.enum.DataStatus
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.within
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import java.time.LocalDateTime
import java.time.temporal.ChronoUnit

@DataJpaTest
@AutoConfigureTestDatabase(replace = NONE)
internal class DogRepoTest @Autowired constructor(
  private val dogRepo: DogRepo
) {

  @Test
  fun testData() {
    val id = dogRepo.save(DogEntity("Golden Retriever")).id

    dogRepo.findById(id).get().let {
      assertThat(it.name).isEqualTo("Golden Retriever")
      assertThat(it.createAt).isCloseTo(LocalDateTime.now(), within(1, ChronoUnit.MINUTES))
      assertThat(it.updateAt).isCloseTo(LocalDateTime.now(), within(1, ChronoUnit.MINUTES))
      assertThat(it.dataStatus).isEqualTo(DataStatus.NORMAL)
    }

    dogRepo.findById(id).get().let {
      it.name = "Border Collie"
      dogRepo.save(it)
    }

    dogRepo.findById(id).get().let {
      assertThat(it.name).isEqualTo("Border Collie")
      assertThat(it.createAt).isCloseTo(LocalDateTime.now(), within(1, ChronoUnit.MINUTES))
      assertThat(it.updateAt).isCloseTo(LocalDateTime.now(), within(1, ChronoUnit.MINUTES))
      assertThat(it.dataStatus).isEqualTo(DataStatus.NORMAL)
    }

    dogRepo.findById(id).get().let {
      dogRepo.delete(it)
    }

    dogRepo.findById(id).let {
      assertThat(it.isPresent).isFalse
    }
  }
}