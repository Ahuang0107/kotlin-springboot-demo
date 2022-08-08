package com.example.demo.initial.member

import com.example.demo.initial.member.primary.MemberEntity
import com.example.demo.initial.member.request.UpdateMemberReq

fun MemberEntity.updateFrom(source: UpdateMemberReq): MemberEntity {
  return this.apply {
    relProjectId = source.relProjectId
    memberGpn = source.memberGpn
    hours = source.hours
  }
}