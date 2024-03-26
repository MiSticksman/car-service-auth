package vsu.csf.shaforostov.auth_service.entity

import jakarta.persistence. *
import vsu.csf.shaforostov.auth_service.model.Roles

@Entity
@Table(name = "roles")
class Role(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,
    @Column(name = "role")
    var role: Roles,
    @Column(name = "display_name")
    var displayName: String,
)