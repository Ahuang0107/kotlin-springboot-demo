package com.example.demo.base.api

import com.example.demo.base.property.SystemConst
import com.example.demo.base.restful.AppResponse
import com.example.demo.base.restful.successResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(SystemConst.API_PREFIX + "/base")
class BaseController {
  @GetMapping
  fun helloWorld(): AppResponse<String> = "Hello World".successResult()
}