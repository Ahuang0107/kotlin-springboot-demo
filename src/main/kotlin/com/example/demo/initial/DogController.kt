package com.example.demo.initial

import com.example.demo.base.property.SystemConst
import com.example.demo.base.restful.AppResponse
import com.example.demo.base.restful.successResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(SystemConst.API_PREFIX + "/dog")
class DogController(
  private val service: DogService,
) {

  @GetMapping("/public")
  fun public(): AppResponse<String> = "Hello World".successResult()

  @GetMapping("/all")
  fun getDogs(): AppResponse<List<DogEntity>> {
    return service.findAll().successResult()
  }
}