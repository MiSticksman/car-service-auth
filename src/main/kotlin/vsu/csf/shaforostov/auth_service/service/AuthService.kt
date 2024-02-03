package vsu.csf.shaforostov.auth_service.service

import org.springframework.stereotype.Service
import vsu.csf.shaforostov.auth_service.dto.AuthRequestDto

@Service
class AuthService {



    fun authorizathion(dto: AuthRequestDto): Boolean {
        return endpointsRolesMap[dto.urlToAuthCheck]?.let{
            true

        } ?:  false
    }


    companion object {
        val allRolesList = listOf(
            "client",
            "manager",
            "employee"
        )

        val endpointsRolesMap = mapOf(
            "/endpoint" to allRolesList
        )
    }
}