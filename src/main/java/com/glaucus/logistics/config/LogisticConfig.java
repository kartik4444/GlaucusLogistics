package com.glaucus.logistics.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.glaucus.logistics.model.LogisticModel;

@Configuration
public class LogisticConfig {
	@Bean
	public LogisticModel getEntity()
	{
		return new LogisticModel();
	}

}
