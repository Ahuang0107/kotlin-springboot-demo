package com.example.demo.initial

import org.springframework.data.jpa.repository.JpaRepository

interface DogRepo : JpaRepository<DogEntity, Long>