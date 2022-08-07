package com.example.demo.initial.member.base

import com.example.demo.base.dataaccess.service.BaseService

class MemberServiceBase<T : MemberEntityBase>(
  override val repo: MemberRepoBase<T>
) : BaseService<T> {
  fun findAllByProjectId(id: Long): List<T> {
    return repo.findAllByRelProjectId(id)
  }
}