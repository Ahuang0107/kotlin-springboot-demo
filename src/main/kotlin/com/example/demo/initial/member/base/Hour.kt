package com.example.demo.initial.member.base

import java.time.LocalDate

data class Hour(
  var hour: Double = .0,
  var date: LocalDate = LocalDate.EPOCH,
)
