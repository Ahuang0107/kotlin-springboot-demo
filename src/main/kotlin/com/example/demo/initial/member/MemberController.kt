package com.example.demo.initial.member

import com.example.demo.base.property.SystemConst
import com.example.demo.base.restful.AppResponse
import com.example.demo.base.restful.successResult
import com.example.demo.initial.member.primary.MemberEntity
import com.example.demo.initial.member.request.UpdateMemberReq
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(SystemConst.API_PREFIX + "/member")
class MemberController(
  private val memberFacade: MemberFacade,
) {

  @GetMapping("/all")
  fun findAllMembers(projectId: Long): AppResponse<List<MemberEntity>> {
    return memberFacade.findAllMembers(projectId).successResult()
  }

  @PostMapping("/create")
  fun createMember(@RequestBody req: UpdateMemberReq): AppResponse<MemberEntity> {
    return memberFacade.createMember(req).successResult()
  }

  @DeleteMapping("/delete")
  fun deleteMember(id: Long): AppResponse<Unit> {
    return memberFacade.deleteMember(id).successResult()
  }
}