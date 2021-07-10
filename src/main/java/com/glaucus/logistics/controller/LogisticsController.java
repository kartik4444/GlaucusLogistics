package com.glaucus.logistics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.glaucus.logistics.service.LogisticsService;

/*
 * Rest Controller Entrypoint
 */
@RestController
public class LogisticsController {

	private LogisticsService logisticsService;

	@Autowired
	public LogisticsController(LogisticsService logisticsService) {
		this.logisticsService = logisticsService;
	}

	/*
	 * Endpoint to increment counter in DB
	 */
	@PostMapping(value = "/increment")
	public ResponseEntity<String> incrementCounter() {
		return logisticsService.incrementService();
	}

}
