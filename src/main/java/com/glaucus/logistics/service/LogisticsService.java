package com.glaucus.logistics.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.glaucus.logistics.model.LogisticModel;
import com.glaucus.logistics.repository.LogisticsRepository;

import ch.qos.logback.classic.Logger;

@Service
public class LogisticsService {

	private LogisticsRepository repository;
	private LogisticModel model;
	private static final Object lock = new Object();
	Logger log = (Logger) org.slf4j.LoggerFactory.getLogger(LogisticsService.class);

	@Autowired
	public LogisticsService(LogisticsRepository repository,LogisticModel model) {
		this.repository = repository;
		this.model=model;
	}

	public  void incrementService() {
		synchronized (lock) {
			try {
			int currSeq=repository.findById(0);
			log.info("Current index_counter value: {}",currSeq);
			currSeq++;
			log.info("Incremented index_counter value: {}",currSeq);
			model.setIndex_counter(currSeq);
			repository.save(model);
			} catch (DataAccessException e) {
				log.error("Counter increment operation failed :: error {}", e);
				throw e;
			}
		}
	}

	
}
