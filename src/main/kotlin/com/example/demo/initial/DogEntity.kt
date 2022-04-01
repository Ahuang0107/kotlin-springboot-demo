package com.example.demo.initial

import com.example.demo.base.dataaccess.entity.BaseSimpleEntity
import javax.persistence.Entity

@Entity(name = "d_dog")
class DogEntity(
  var name: String? = null,
) : BaseSimpleEntity()