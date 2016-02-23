package com.codependent.sidecar;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@RefreshScope
@SpringBootApplication
public class RandomNameMsApplication {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Environment environment;
	
	@RequestMapping(value="/randomNumbers", params={"random=true", "fields=url"})
    public double getRandomNumber(HttpServletRequest request) {
		logger.info("getRandomNumber - env[{}]", new Object[]{environment.getActiveProfiles()});
		return Math.random();
    }
	
	
    public static void main(String[] args) {
    	new SpringApplicationBuilder(RandomNameMsApplication.class).web(true).run(args);
    }
}
