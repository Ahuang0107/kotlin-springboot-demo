package com.example.demo.initial.member

import com.example.demo.initial.member.base.MemberServiceBase
import org.springframework.stereotype.Service

@Service
class MemberService(
  override val repo: MemberRepo,
) : MemberServiceBase<MemberEntity>(repo)