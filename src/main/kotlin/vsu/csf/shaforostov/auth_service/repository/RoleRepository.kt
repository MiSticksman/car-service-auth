package vsu.csf.shaforostov.auth_service.repository

import org.springframework.data.repository.CrudRepository
import vsu.csf.shaforostov.auth_service.entity.Role

interface RoleRepository: CrudRepository<Role, Int>