package vsu.csf.shaforostov.auth_service.controller

import jakarta.servlet.http.HttpServletRequest
import org.springframework.http.HttpHeaders
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import vsu.csf.shaforostov.auth_service.dto.AuthRequestDto

@RestController
class AuthController {

    @PostMapping("/auth")
    fun authorizathion(
        request: HttpServletRequest,
        @RequestBody dto: AuthRequestDto
    ): ResponseEntity<Any> {
        val auth = request.getHeader(HttpHeaders.AUTHORIZATION)
            ?: return ResponseEntity.badRequest().build()

        TODO()

    }

}
