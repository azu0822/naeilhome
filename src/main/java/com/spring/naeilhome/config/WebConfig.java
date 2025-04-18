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
    
<<<<<<< HEAD
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		if (System.getProperty("os.name").toLowerCase().contains("win")) {
			registry.addResourceHandler("/memberProfileImage/**")
					.addResourceLocations("file:/C:/naeilhome/memberProfileImage/");
			registry.addResourceHandler("/board_myhome/**")
					.addResourceLocations("file:/C:/naeilhome/board/board_myhome/");
		}else {
			registry.addResourceHandler("/memberProfileImage/**")
			.addResourceLocations("file:/home/ubuntu/naeilhome-img/memberProfileImage/");
			registry.addResourceHandler("/board_myhome/**")
			.addResourceLocations("file:/home/ubuntu/naeilhome-img/board/board_myhome/");			
		}
	}
=======
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/memberProfileImage/**")
                .addResourceLocations("file:/C:/naeilhome/memberProfileImage/");
        registry.addResourceHandler("/board_myhome/**")
                .addResourceLocations("file:/C:/naeilhome/board/board_myhome/");
    }
>>>>>>> 2eafbecfc2a83bfd92ac7d294cc658c427d9bf98

}
