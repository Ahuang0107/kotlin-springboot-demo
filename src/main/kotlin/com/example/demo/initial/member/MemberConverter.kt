package com.example.demo.initial.member

fun MemberEntity.updateFrom(source: UpdateMemberReq): MemberEntity {
  return this.apply {
    relProjectId = source.relProjectId
    memberGpn = source.memberGpn
    hours = source.hours
  }
}