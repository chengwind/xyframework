package org.xiaoyao.demo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableConfigurationProperties
public class QuickServiceApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(QuickServiceApplication.class, args);
	}

	@Bean
	public UrlBasedViewResolver setupViewResolver() {
		System.out.println("####21start...");
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		System.out.println("####3start...");
		return resolver;
	}

}
