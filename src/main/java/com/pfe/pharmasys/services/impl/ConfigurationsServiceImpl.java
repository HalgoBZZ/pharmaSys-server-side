package com.pfe.pharmasys.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.pharmasys.doa.ConfigurationsDao;
import com.pfe.pharmasys.entities.Configurations;
import com.pfe.pharmasys.services.ConfigurationsService;

@Service
public class ConfigurationsServiceImpl implements ConfigurationsService{
	
	@Autowired
	private ConfigurationsDao dao;

	@Override
	public List<Configurations> getAll() {
		
		return dao.findAll();
	}

	@Override
	public void save(Configurations configuration) {
		dao.save(configuration);
		
	}

}
