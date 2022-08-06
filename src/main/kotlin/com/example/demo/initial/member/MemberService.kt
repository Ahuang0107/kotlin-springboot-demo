package com.example.demo.initial.member

import com.example.demo.base.dataaccess.service.BaseService
import org.springframework.stereotype.Service

@Service
class MemberService(
  override val repo: MemberRepo
) : BaseService<MemberEntity> {
  fun findAllByProjectId(id: Long): List<MemberEntity> {
    return repo.findAllByRelProjectId(id)
  }
}