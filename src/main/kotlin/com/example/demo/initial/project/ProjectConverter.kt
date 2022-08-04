package com.example.demo.initial.project

fun ProjectEntity.updateFrom(req: UpdateProjectReq): ProjectEntity {
  return this.apply {
    name = req.name
  }
}