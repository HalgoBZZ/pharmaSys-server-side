package com.pfe.pharmasys.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.pharmasys.doa.CongesDao;
import com.pfe.pharmasys.entities.Conges;
import com.pfe.pharmasys.services.CongesService;

@Service
@Transactional
public class CongesServiceImpl implements CongesService{

	@Autowired
	private CongesDao congesDao;
	@Override
	public void addConges(Conges conges) {
		congesDao.save(conges);
		
	}

	@Override
	public void updateConges(Conges conges) {
		congesDao.save(conges);
		
	}

	@Override
	public Optional<Conges> findConges(UUID id) {
		return congesDao.findById(id);
	}

	@Override
	public List<Conges> listConges() {
		return congesDao.findAll();
	}

	@Override
	public void deleteConges(UUID id) {
		congesDao.deleteById(id);
	}

}
