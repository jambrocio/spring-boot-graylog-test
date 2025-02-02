package com.bolsadeideas.springboot.graylog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootGraylogTestApplication implements CommandLineRunner{
	
	private static final Logger log = LoggerFactory.getLogger(SpringBootGraylogTestApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootGraylogTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		log.error("==================log error");//level 3
        log.warn("==================log warn");//level 4
        log.info("==================log info");
        log.debug("==================log debug");
	}

}
