package vsu.csf.shaforostov.auth_service.repository

import org.springframework.data.repository.CrudRepository
import vsu.csf.shaforostov.auth_service.entity.RolesActivity

interface RolesActivityRepository: CrudRepository<RolesActivity, Int>