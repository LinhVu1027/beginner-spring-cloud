package com.cloud.greeting;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(GreetingProperties.class)
@EnableDiscoveryClient
public class GreetingApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetingApplication.class, args);
	}

	@Bean
	public Sampler getSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

}
