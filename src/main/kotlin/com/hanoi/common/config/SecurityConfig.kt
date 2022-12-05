package com.hanoi.common.config

import org.springframework.context.annotation.Bean
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.web.SecurityFilterChain

@EnableWebSecurity
class SecurityConfig() {
    @Bean
    fun webSecurityCustomizer(): WebSecurityCustomizer? {
        return WebSecurityCustomizer { web: WebSecurity ->
            web.ignoring().antMatchers("/**")
        }
    }

    @Bean
    fun filterChain(http: HttpSecurity?): SecurityFilterChain {
        http!!
            .httpBasic().disable()
            .csrf().disable()
            .exceptionHandling()
            .and()
            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            .and()
            .authorizeRequests()
            .antMatchers("/**").permitAll()
            .anyRequest().authenticated()
        return http.build()
    }
}