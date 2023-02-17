package com.inventory.products.config;



import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AnonymousAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/", "/inventory/sale/*", "/inventory/products/*/*").permitAll()
                        .anyRequest()
                ).csrf().disable()
               /* .formLogin((form) -> form
                        .loginPage("/login")
                        .permitAll()
                )*/
                .addFilter(new AnonymousAuthenticationFilter("anonymous"))
                .logout((logout) -> logout.permitAll());

        return http.build();
    }

    /*
    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user =
                User.withDefaultPasswordEncoder()
                        .username("admin")
                        .password("s$cret")
                        .build();

        return new InMemoryUserDetailsManager(user);
    }*/
}