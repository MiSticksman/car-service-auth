package vsu.csf.shaforostov.auth_service.service

import org.springframework.stereotype.Service
import vsu.csf.shaforostov.auth_service.dto.AuthRequestDto
import vsu.csf.shaforostov.auth_service.repository.ActivityRepository
import vsu.csf.shaforostov.auth_service.repository.RoleRepository
import vsu.csf.shaforostov.auth_service.repository.RolesActivityRepository
import vsu.csf.shaforostov.auth_service.repository.UserRolesRepository

@Service
class AuthService(
    private val roleRepository: RoleRepository,
    private val userRolesRepository: UserRolesRepository,
    private val activityRepository: ActivityRepository,
    private val rolesActivityRepository: RolesActivityRepository,

    ) {


    fun authorizathion(dto: AuthRequestDto): Boolean {
        val userActivities = activityRepository.getUserActivities(
            dto.user.id.toLong(),
            dto.user.role.id.toLong(),
        )
        userActivities.filter {
            it.method == dto.method
        }.forEach {
                if (dto.urlToAuthCheck.matches(Regex(it.urlRegex))) {
                    return true
                }
        }
        return false
    }
}