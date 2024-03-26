package vsu.csf.shaforostov.auth_service.entity

import jakarta.persistence. *

@Entity
@Table(name = "activity")
class Activity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,
    @Column(name = "url")
    var url: String,
    @Column(name = "url_regex")
    var urlRegex: String,
    @Column(name = "method")
    var method: String,
)