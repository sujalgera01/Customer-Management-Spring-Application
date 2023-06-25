package com.sujal.springcms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {

        UserDetails user1 = User.withDefaultPasswordEncoder()
                .username("sujal")
                .password("#Sujal1003")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(user1);
    }
}
