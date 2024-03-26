package vsu.csf.shaforostov.auth_service.entity

import jakarta.persistence. *

@Entity
@Table(name = "roles_activity")
class RolesActivity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,
    @Column(name = "role_id")
    var roleId: Int,
    @Column(name = "activity_id")
    var activityId: Int,
)