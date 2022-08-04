package com.example.demo.base.dataaccess.util

import cn.hutool.core.util.IdUtil
import org.hibernate.engine.spi.SharedSessionContractImplementor
import org.hibernate.id.IdentifierGenerator
import java.io.Serializable

@Suppress("UNUSED")
class IdGenerator : IdentifierGenerator {
  companion object {
    private val snowflake = IdUtil.getSnowflake(1, 1)

    @JvmStatic
    fun generate() = snowflake.nextId()
  }

  override fun generate(session: SharedSessionContractImplementor?, `object`: Any?): Serializable {
    return snowflake.nextId()
  }
}