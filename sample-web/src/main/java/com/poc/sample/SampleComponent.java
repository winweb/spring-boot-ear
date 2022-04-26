package com.poc.sample;

import com.poc.sample.commons.services.CommonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Component
public class SampleComponent {

	@Resource
	final CommonsService service;

	public SampleComponent(CommonsService service) {
		this.service = service;

		service.printCommonService();
	}
}
