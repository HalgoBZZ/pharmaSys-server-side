package com.pfe.pharmasys.services.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.pharmasys.doa.CongesDao;
import com.pfe.pharmasys.entities.Conges;
import com.pfe.pharmasys.entities.types.Etat;
import com.pfe.pharmasys.services.CongesService;

@Service
@Transactional
public class CongesServiceImpl implements CongesService{

	@Autowired
	private CongesDao congesDao;
	@Override
	public void addConges(Conges conges) {
		conges.setDate_ajout(LocalDate.now());
		conges.setDate_modification(LocalDate.now());
		conges.setEtat_conges(Etat.En_Attente);
		congesDao.save(conges);
		
	}

	@Override
	public void updateConges(Conges conges) {
		conges.setDate_modification(LocalDate.now());
		congesDao.save(conges);
	}

	@Override
	public Optional<Conges> findConges(Long id) {
		return congesDao.findById(id);
	}

	@Override
	public List<Conges> listConges() {
		return congesDao.findAll();
	}

	@Override
	public void deleteConges(Long id) {
		congesDao.deleteById(id);
	}
	
	

}
