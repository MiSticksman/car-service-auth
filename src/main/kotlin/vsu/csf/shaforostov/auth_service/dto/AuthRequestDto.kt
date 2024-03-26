package vsu.csf.shaforostov.auth_service.dto

data class AuthRequestDto(
    val urlToAuthCheck: String,
    val user: UserDto,
    val method: String,
)