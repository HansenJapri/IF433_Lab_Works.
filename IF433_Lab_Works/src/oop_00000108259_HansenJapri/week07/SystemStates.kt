package oop_00000108259_HansenJapri.week07

sealed class ApiResponse

data class Success(val data: String) : ApiResponse()
data class Error(val message: String) : ApiResponse()
object Loading : ApiResponse()