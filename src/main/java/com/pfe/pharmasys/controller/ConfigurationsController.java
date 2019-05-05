package com.pfe.pharmasys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.pharmasys.entities.Configurations;
import com.pfe.pharmasys.services.ConfigurationsService;

@RestController
@RequestMapping(value="configurations")
public class ConfigurationsController {
	
	@Autowired
	private ConfigurationsService service;
	
	@PostMapping(value="/save")
	public void save(@RequestBody Configurations configurations) {
		service.save(configurations);
	}
	
	@GetMapping(value="/all")
	public List<Configurations> getAll(){
		return service.getAll();
	}

}
