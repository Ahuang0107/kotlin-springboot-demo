package com.example.demo.initial

import com.example.demo.base.dataaccess.service.BaseSimpleService
import org.springframework.stereotype.Service

@Service
class DogService(
  override val repo: DogRepo,
) : BaseSimpleService<DogEntity>