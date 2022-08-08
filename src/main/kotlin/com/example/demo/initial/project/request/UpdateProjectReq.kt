package com.example.demo.initial.project.request

data class UpdateProjectReq(
  var financeYear: Int = 0,
  var projectName: String = "",
  var engageCode: String = "",
  var totalFee: Double = .0,
)
