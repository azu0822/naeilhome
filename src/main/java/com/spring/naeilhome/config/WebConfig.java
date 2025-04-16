package com.spring.naeilhome.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("redirect:/naeilhome/");
    }
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/memberProfileImage/**")
                .addResourceLocations("file:/C:/naeilhome/memberProfileImage/");
        registry.addResourceHandler("/board_myhome/**")
                .addResourceLocations("file:/C:/naeilhome/board/board_myhome/");
    }

}
