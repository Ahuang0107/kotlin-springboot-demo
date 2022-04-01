package com.example.demo.initial

import com.example.demo.base.restful.successResult
import com.google.gson.Gson
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@SpringBootTest
@AutoConfigureMockMvc
internal class DogControllerTest @Autowired constructor(
  private val mockMvc: MockMvc,
  private val gson: Gson,
) {

  @Test
  fun publicTest() {
    mockMvc.get("/api/dog/public") {
      accept(MediaType.APPLICATION_JSON)
    }.andExpect {
      status { this.isOk() }
      content {
        contentType(MediaType.APPLICATION_JSON)
        "Hello World".successResult().let {
          gson.toJson(it)
        }.let {
          json(it)
        }
      }
    }
  }

  @Test
  fun getDogsTest() {
    mockMvc.get("/api/dog/all") {
      accept(MediaType.APPLICATION_JSON)
    }.andExpect {
      status { this.isOk() }
      content {
        contentType(MediaType.APPLICATION_JSON)
        emptyList<DogEntity>().successResult().let {
          gson.toJson(it)
        }.let {
          json(it)
        }
      }
    }
  }
}