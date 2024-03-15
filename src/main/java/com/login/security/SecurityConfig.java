package com.login.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public UserDetailsService userDetailsService(){
        return new UserDetailsServiceImpl();
    }

    @Bean
    public DaoAuthenticationProvider AuthenticationProvider(){

        DaoAuthenticationProvider daoauthenticationProvider = new DaoAuthenticationProvider();
        daoauthenticationProvider.setUserDetailsService(this.userDetailsService());
        return daoauthenticationProvider;
    }

        @Bean
        public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {

            httpSecurity.csrf().disable()
                    .authorizeRequests()
                    .mvcMatchers("/user/hello").hasRole("USER")
                    .mvcMatchers("/**")
                    .permitAll().and()
                    .formLogin().loginPage("/signin")
                    .defaultSuccessUrl("/user/hello");

            httpSecurity.authenticationProvider(AuthenticationProvider());

            return httpSecurity.build();
        }




}
