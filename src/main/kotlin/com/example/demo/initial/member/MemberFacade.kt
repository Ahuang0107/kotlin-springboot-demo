package com.example.demo.initial.member

import org.springframework.stereotype.Service

@Service
class MemberFacade(
  private val memberService: MemberService,
) {
  fun findAllMembers(projectId: Long): List<MemberEntity> {
    return memberService.findAllByProjectId(projectId)
  }

  fun createMember(req: UpdateMemberReq): MemberEntity {
    return MemberEntity().updateFrom(req).let { memberService.save(it) }
  }

  fun deleteMember(id: Long) {
    memberService.delete(id)
  }
}