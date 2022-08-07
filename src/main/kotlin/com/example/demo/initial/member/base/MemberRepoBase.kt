package com.example.demo.initial.member.base

import com.example.demo.base.dataaccess.repository.BaseSimpleRepo
import org.springframework.data.repository.NoRepositoryBean

@NoRepositoryBean
interface MemberRepoBase<T : MemberEntityBase> : BaseSimpleRepo<T> {
  fun findAllByRelProjectId(relProjectId: Long): List<T>
}