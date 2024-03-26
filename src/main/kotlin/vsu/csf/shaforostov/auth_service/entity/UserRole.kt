package vsu.csf.shaforostov.auth_service.entity
import jakarta.persistence. *

@Entity
@Table(name = "user_roles")

class UserRole (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,
    @Column(name = "user_id")
    var userId: Int,
    @Column(name = "role_id")
    var roleId: Int,
)