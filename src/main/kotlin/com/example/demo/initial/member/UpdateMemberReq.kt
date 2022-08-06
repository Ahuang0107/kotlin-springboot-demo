package com.example.demo.initial.member

data class UpdateMemberReq(
  var relProjectId: Long = 0,
  var memberGpn: String = "",
  var hours: List<Hour> = emptyList(),
)
