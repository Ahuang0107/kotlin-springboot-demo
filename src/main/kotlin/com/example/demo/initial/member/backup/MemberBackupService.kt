package com.example.demo.initial.member.backup

import com.example.demo.initial.member.base.MemberServiceBase
import org.springframework.stereotype.Service

@Service
class MemberBackupService(
  override val repo: MemberBackupRepo,
) : MemberServiceBase<MemberBackupEntity>(repo)