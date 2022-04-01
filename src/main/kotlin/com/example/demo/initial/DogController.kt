package com.example.demo.initial

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/dog")
class DogController(
    private val service: DogService,
) {
    @GetMapping("/all")
    fun getDogs(): List<DogEntity> {
        return service.findAll()
    }
}