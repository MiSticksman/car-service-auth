package vsu.csf.shaforostov.auth_service.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.SecurityFilterChain
import vsu.csf.shaforostov.auth_service.model.Roles

@Configuration
class SecurityConfig {
    @Bean
    fun securityFilterChain(http: HttpSecurity): SecurityFilterChain {
        return http
            .authorizeHttpRequests {
                it.anyRequest().authenticated()
                it.requestMatchers("").permitAll()
                it.requestMatchers("").permitAll()
                it.requestMatchers("").permitAll()
                it.requestMatchers("").permitAll()
                it.requestMatchers("", "dada", "dakdal").hasRole(Roles.CLIENT.name)
                it.requestMatchers("").hasRole(Roles.EMPLOYEE.name)
                it.requestMatchers("").hasRole(Roles.MANAGER.name)
            }.build()
    }
}