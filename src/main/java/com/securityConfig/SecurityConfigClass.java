package com.securityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity(prePostEnabled = true)
public class SecurityConfigClass {
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails noramlUser=org.springframework.security.core.userdetails.User.withUsername("ajinkya")
		.password(passwordEncoder().encode("ajinkya"))
		.roles("NORMAL")
		.build();
		
		UserDetails adminUser=org.springframework.security.core.userdetails.User.withUsername("ajinkya1")
				.password(passwordEncoder().encode("ajinkya1"))
				.roles("ADMIN")
				.build();
		
		InMemoryUserDetailsManager inMemoryUserDetailsManager=new InMemoryUserDetailsManager(noramlUser,adminUser);
		return inMemoryUserDetailsManager;
	}
	
//	@Bean
//	public SecurityFilterChain filterchain(HttpSecurity httpSecurity) throws Exception {
//		httpSecurity.csrf().disable()
//		.authorizeHttpRequests()
//		.antMatchers("/eventManagement/*")
//		.hasRole("ADMIN")
//		.antMatchers("/attendeeManagement/allAttendees")
//		.hasRole("NORMAL")
//		.antMatchers("/attendeeManagement/registration")
//		.permitAll()
//		.anyRequest()
//		.authenticated()
//		.and()
//		.formLogin();
//		return httpSecurity.build();
//	}
}
