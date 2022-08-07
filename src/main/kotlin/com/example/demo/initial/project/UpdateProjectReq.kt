package com.example.demo.initial.project

data class UpdateProjectReq(
  var financeYear: Int = 0,
  var projectName: String = "",
  var engageCode: String = "",
  var totalFee: Double = .0,
)
