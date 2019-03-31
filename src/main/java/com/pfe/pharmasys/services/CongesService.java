package com.pfe.pharmasys.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.pfe.pharmasys.entities.Conges;

public interface CongesService {
	
	public void addConges(Conges conges);
	
	public void updateConges(Conges conges);
	
	public Optional<Conges> findConges(UUID id);
	
	public List<Conges> listConges();
	
	public void deleteConges(UUID id);


}
