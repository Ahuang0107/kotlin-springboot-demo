package com.example.demo.initial.member.request

import com.example.demo.initial.member.base.Hour

data class UpdateMemberReq(
  var relProjectId: Long = 0,
  var memberGpn: String = "",
  var hours: List<Hour> = emptyList(),
)
