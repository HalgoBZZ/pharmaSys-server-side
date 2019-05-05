package com.pfe.pharmasys.services;

import java.util.List;

import com.pfe.pharmasys.entities.Configurations;

public interface ConfigurationsService {

	public List<Configurations> getAll();
	
	public void save(Configurations configuration);
}
