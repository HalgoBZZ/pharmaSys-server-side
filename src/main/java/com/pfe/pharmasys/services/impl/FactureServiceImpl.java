package com.pfe.pharmasys.services.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


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
		facture.setDate_ajout(LocalDate.now());
		facture.setDate_modification(LocalDate.now());
		factureDao.save(facture);
	}

	@Override
	public void updateFacture(Facture facture) {
		facture.setDate_modification(LocalDate.now());
		factureDao.save(facture);
		
	}

	@Override
	public Optional<Facture> findFacture(Long id) {
		return factureDao.findById(id);
	}

	@Override
	public List<Facture> listFacture() {
		return factureDao.findAll();
	}

	@Override
	public void deleteFacture(Long id) {
		factureDao.deleteById(id);
	}

}
