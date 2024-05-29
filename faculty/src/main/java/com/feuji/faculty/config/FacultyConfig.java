package com.feuji.faculty.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.feuji.faculty")
public class FacultyConfig {

	@Bean
	WebMvcConfigurer configurer() {
		return new WebMvcConfigurer() {
		   public void addCorsMappings(CorsRegistry registry) {
			   registry.addMapping("/**").allowedMethods("*").allowedHeaders("*").allowedOrigins("*");
		   }
		};
	}
	
}
