package com.docker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docker.entity.DemoEntity;
import com.docker.repository.DemoRepository;

@Service
public class DemoService {
	
	@Autowired
	private DemoRepository repository;
	
	public String saveDemoModel() {
		DemoEntity entity = new DemoEntity(1, "Hello World");
		repository.save(entity);
		return entity.getName();
	}

}
