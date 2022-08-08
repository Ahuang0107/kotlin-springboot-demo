package com.example.demo.initial.member

import com.example.demo.initial.member.backup.MemberBackupService
import com.example.demo.initial.member.primary.MemberEntity
import com.example.demo.initial.member.primary.MemberService
import com.example.demo.initial.member.request.UpdateMemberReq
import org.springframework.stereotype.Service

@Service
class MemberFacade(
  private val memberService: MemberService,
  private val memberBackupService: MemberBackupService,
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