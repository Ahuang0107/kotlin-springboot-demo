package com.example.demo.initial.member

import com.example.demo.base.dataaccess.repository.BaseSimpleRepo

interface MemberRepo : BaseSimpleRepo<MemberEntity> {
  fun findAllByRelProjectId(relProjectId: Long): List<MemberEntity>
}