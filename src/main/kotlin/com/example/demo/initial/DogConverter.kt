package com.example.demo.initial

fun DogEntity.updateFrom(req: UpdateDogReq): DogEntity {
  return this.apply {
    name = req.name
  }
}