package com.jtool.rest.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.io.Serializable;

@Configuration
@EnableWebMvc
@Slf4j
public class WebConfiguration extends WebMvcConfigurerAdapter implements Serializable{

//	private static final long serialVersionUID = SpringSecurityCoreVersion.SERIAL_VERSION_UID;

	public WebConfiguration() {	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(
                "/webjars/**"
                , "/img/**"
                , "/css/**"
                , "/js/**"
                , "/bower_components/**"
        		)
        .addResourceLocations(
                "classpath:/META-INF/resources/webjars/"
                , "classpath:/static/img/"
                , "classpath:/static/css/"
                , "classpath:/static/js/"
                , "classpath:/static/bower_components/"
        		)
        .addResourceLocations(
                "classpath:/static/img/**"
                , "classpath:/static/css/**"
                , "classpath:/static/js/**"
                , "classpath:/static/bower_components/**"
        		);
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/index").setViewName("index");

//        logger.error("addViewControllers Error");
		log.error("addViewControllers Error");
	}
}
