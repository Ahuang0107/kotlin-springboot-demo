package com.example.demo.initial.project

fun ProjectEntity.updateFrom(req: UpdateProjectReq): ProjectEntity {
  return this.apply {
    projectName = req.projectName
    engageCode = req.engageCode
    totalFee = req.totalFee
  }
}