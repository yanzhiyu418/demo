package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

//扩展Springmvc
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Bean
        public ViewResolver myViewResolver(){
            return new MyViewResolver();
        }
        public  static  class  MyViewResolver implements ViewResolver {
            @Override
            public View resolveViewName(String viewName, Locale locale)throws Exception {
                return  null;
            }
        }
    }
    
