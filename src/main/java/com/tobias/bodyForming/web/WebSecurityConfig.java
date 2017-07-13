package com.tobias.bodyForming.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by satuk on 27.06.17.
 */
@Configuration
public class WebSecurityConfig {
    
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            
            @Override
            public void addCorsMappings( CorsRegistry registry ) {
                registry.addMapping( "/**" );
            }
        };
    }
    
}