package com.pfe.pharmasys.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.pharmasys.doa.FactureDao;
import com.pfe.pharmasys.entities.Facture;
import com.pfe.pharmasys.services.FactureService;


@Service
@Transactional
public class FactureServiceImpl implements FactureService{

	
	@Autowired
	private FactureDao factureDao;
	
	@Override
	public void addFacture(Facture facture) {
		factureDao.save(facture);
	}

	@Override
	public void updateFacture(Facture facture) {
		factureDao.save(facture);
		
	}

	@Override
	public Optional<Facture> findFacture(UUID id) {
		return factureDao.findById(id);
	}

	@Override
	public List<Facture> listFacture() {
		return factureDao.findAll();
	}

	@Override
	public void deleteFacture(UUID id) {
		factureDao.deleteById(id);
	}

}
