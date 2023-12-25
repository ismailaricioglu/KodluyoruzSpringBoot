package com.iaricioglu.security;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.factory.PasswordEncoderFactories;
//import org.springframework.security.crypto.password.PasswordEncoder;

/*@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {*/
public class WebSecurityConfig {

    /*@Override
    protected void configure(HttpSecurity http) throws Exception {
//        super.configure(http);
//        -*-
        http
                .authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
    }*/
//        -*-
    /*@Autowired
    public void configureGlobal(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder
                .inMemoryAuthentication()
                .withUser("ismailaricioglu")
                .password("{noop}root") // maskesiz şifre yönetimi
                .roles("USER");
    }*/
//        -*-
    /*@Autowired
    public void configureGlobalEneryped(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        authenticationManagerBuilder
                .inMemoryAuthentication()
                .withUser("ismailaricioglu")
                .password(passwordEncoder.encode("root")) // maskeli şifre yönetimi
                .roles("USER");
    }*/
}


