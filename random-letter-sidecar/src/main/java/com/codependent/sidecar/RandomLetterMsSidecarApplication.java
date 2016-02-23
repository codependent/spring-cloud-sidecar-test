package com.codependent.sidecar;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@EnableSidecar
@SpringBootApplication
public class RandomLetterMsSidecarApplication {
	
    public static void main(String[] args) {
    	new SpringApplicationBuilder(RandomLetterMsSidecarApplication.class).web(true).run(args);
    }
}
