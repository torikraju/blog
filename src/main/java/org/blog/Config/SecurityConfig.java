package org.blog.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.thymeleaf.extras.springsecurity4.dialect.SpringSecurityDialect;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .formLogin()
                .loginPage("/login").defaultSuccessUrl("/")
                .and()
                .logout().logoutSuccessUrl("/")
                .and()
                .authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/forgot-password").permitAll()
                .antMatchers("/dashboard").permitAll()
                .antMatchers("/vendor/**", "/css/**").permitAll()
                .antMatchers("/login", "/registration").not().authenticated()
                .anyRequest().denyAll();
    }

    @Bean
    public SpringSecurityDialect springSecurityDialect() {
        SpringSecurityDialect dialect = new SpringSecurityDialect();
        return dialect;
    }
}
