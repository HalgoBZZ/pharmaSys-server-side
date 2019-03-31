package com.pfe.pharmasys.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
		fournisseurDao.save(fournisseur);
		
	}

	@Override
	public void updateFournisseur(Fournisseur fournisseur) {
		fournisseurDao.save(fournisseur);
		
	}

	@Override
	public Optional<Fournisseur> findFournisseur(UUID id) {
		return fournisseurDao.findById(id);
	}

	@Override
	public List<Fournisseur> listFournisseur() {
		return fournisseurDao.findAll();
	}

	@Override
	public void deleteFournisseur(UUID id) {
		fournisseurDao.deleteById(id);
	}

}
