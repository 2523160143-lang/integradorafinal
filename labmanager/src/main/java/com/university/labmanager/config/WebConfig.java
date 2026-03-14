package com.university.labmanager.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(@NonNull ResourceHandlerRegistry registry) {
        // Resolve absolute path dynamically to work reliably in both Windows and Linux Docker
        java.nio.file.Path uploadDir = java.nio.file.Paths.get("uploads");
        String uploadPath = uploadDir.toFile().getAbsolutePath();
        
        registry.addResourceHandler("/uploads/**")
                .addResourceLocations("file:" + uploadPath + "/");
    }
}
