package com.example.demo.initial

import com.example.demo.base.dataaccess.service.BaseService
import org.springframework.stereotype.Service

@Service
class DogService(
  override val repo: DogRepo,
) : BaseService<DogEntity>