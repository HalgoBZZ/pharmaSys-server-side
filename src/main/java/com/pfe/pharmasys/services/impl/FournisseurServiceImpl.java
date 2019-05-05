package com.pfe.pharmasys.services.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.pharmasys.doa.FournisseurDao;
import com.pfe.pharmasys.entities.Fournisseur;
import com.pfe.pharmasys.services.FournisseurService;


@Service
@Transactional
public class FournisseurServiceImpl implements FournisseurService{

	
	@Autowired
	private FournisseurDao fournisseurDao;
	
	@Override
	public void addFournisseur(Fournisseur fournisseur) {
		fournisseur.setDate_ajout(LocalDate.now());
		fournisseur.setDate_modification(LocalDate.now());
		fournisseurDao.save(fournisseur);
		
	}

	@Override
	public void updateFournisseur(Fournisseur fournisseur) {
		fournisseur.setDate_modification(LocalDate.now());
		fournisseurDao.save(fournisseur);
		
	}

	@Override
	public Optional<Fournisseur> findFournisseur(Long id) {
		return fournisseurDao.findById(id);
	}

	@Override
	public List<Fournisseur> listFournisseur() {
		return fournisseurDao.findAll();
	}

	@Override
	public void deleteFournisseur(Long id) {
		fournisseurDao.deleteById(id);
	}

}
