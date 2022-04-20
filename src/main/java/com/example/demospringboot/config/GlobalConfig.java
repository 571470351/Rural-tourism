package com.example.demospringboot.config;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GlobalConfig {


    @Value("${file-path}")
    public String globalFilePath;

    @Value("${hostUrl}")
    public String hostUrl;

    @Value("${static-path}")
    public String globalStaticPath;

}
