package com.accenture.lkm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SleuthZipkinConsumer {

    public static void main(String[] args) {
        SpringApplication.run(SleuthZipkinConsumer.class, args);
    }

    @Bean
    public RestTemplate getRestTemplate(){
    	return new RestTemplate();
    }

    @Bean
    public AlwaysSampler bean(){
    	return new AlwaysSampler();
    }
//http://localhost:8096/emp/controller/getDetails
}