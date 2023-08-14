package com.aghazaly.springcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringCiCdApplication {
	public static Logger logger = LoggerFactory.getLogger(SpringCiCdApplication.class);

	@PostConstruct
	public void intt(){
		logger.info("spring boot is here");
	}

	public static void main(String[] args) {

		logger.info("spring boot is ready");

		SpringApplication.run(SpringCiCdApplication.class, args);
	}

}
