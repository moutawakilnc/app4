package com.app3.hibernatetest1.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig {
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		return http.authorizeHttpRequests(auth -> {
			auth.requestMatchers("/visitor/").permitAll();
			auth.anyRequest().hasRole("ADMIN");
			//auth.anyRequest().authenticated();
		}).formLogin(Customizer.withDefaults()).build();
	}
	

	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
	
	
}
