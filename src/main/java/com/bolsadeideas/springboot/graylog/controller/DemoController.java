package com.bolsadeideas.springboot.graylog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/demo")
public class DemoController {

	private static final Logger log = LoggerFactory.getLogger(DemoController.class);
	
	@GetMapping("/success")
	public ResponseEntity<Void> success() {
		log.info("++++++++++++REST request received successfully");//level 6
		return ResponseEntity.accepted().build();
	}

	@GetMapping("/error")
	public ResponseEntity<Void> error() {
		log.error("++++++++++++REST request triggered error");//level 3
		return ResponseEntity.badRequest().build();
	}
}
