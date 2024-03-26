package vsu.csf.shaforostov.auth_service.client

import org.springframework.stereotype.Component
import org.springframework.web.client.RestClient

@Component
class AuthenticationClient {

    private val restClient = RestClient.builder().build()

    fun authenticate() {
        restClient

    }
}