package vsu.csf.shaforostov.auth_service.repository

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import vsu.csf.shaforostov.auth_service.entity.Activity

interface ActivityRepository: CrudRepository<Activity, Int> {
    @Query("""
        select a
        from Activity a 
        join RolesActivity ra on ra.roleId = :roleId and ra.activityId = a.id
        join UserRole ur on ur.userId = :userId and ur.roleId = :roleId 
    """)
    fun getUserActivities(userId: Long, roleId: Long): Collection<Activity>
}

