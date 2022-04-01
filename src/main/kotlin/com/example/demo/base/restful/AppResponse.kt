package com.example.demo.base.restful

class AppResponse<T> {
  var code: Int = ResponseCode.SUCCESS.code
  var success: Boolean = true
  var message: String = "success"
  var data: T? = null

  companion object {
    @JvmStatic
    fun <T> success(data: T): AppResponse<T> {
      return AppResponse<T>().apply {
        this.code = ResponseCode.SUCCESS.code
        this.success = true
        this.message = ResponseCode.SUCCESS.defaultMessage
        this.data = data
      }
    }
  }

  enum class ResponseCode constructor(val code: Int, val defaultMessage: String) {
    SUCCESS(200, "成功"),
    INVALID_REQUEST(401, "请求有误"),
    MISSING_REQUIRED_ARGS(402, "缺少必要请求参数"),
    ACCESS_DENIED(403, "权限不足"),
    NOT_FOUND(404, "目标资源不存在"),
    CONFLICTED(405, "数据冲突"),
    SYSTEM_ERROR(500, "系统异常"),
    FAILED(501, "业务异常")
  }
}

fun <T> T.successResult() = AppResponse.success(this)