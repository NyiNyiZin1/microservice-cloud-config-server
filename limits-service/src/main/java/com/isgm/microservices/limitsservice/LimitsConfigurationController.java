package com.isgm.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.isgm.microservices.limitsservice.bean.LimitsConfiguration;

@RestController
@RefreshScope
public class LimitsConfigurationController {
	
	//for only get and set
	@Autowired
	private Configuration configuration;
	
	
	@GetMapping(value = "/limits")
	public LimitsConfiguration retrieveLimitsFromConfiguration() {
		return new LimitsConfiguration(configuration.getMinimum(),configuration.getMaximum());

	}
}
