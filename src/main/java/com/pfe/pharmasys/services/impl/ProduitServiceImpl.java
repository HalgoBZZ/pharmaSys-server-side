package com.pfe.pharmasys.services.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.pharmasys.doa.ProduitDao;
import com.pfe.pharmasys.entities.Produit;
import com.pfe.pharmasys.services.ProduitService;

@Service
@Transactional
public class ProduitServiceImpl implements ProduitService{

	
	@Autowired
	private ProduitDao produitDao;
	
	@Override
	public void addProduit(Produit produit) {
		produit.setDate_ajout(LocalDate.now());
		produit.setDate_modification(LocalDate.now());
		produitDao.save(produit);
		
	}

	@Override
	public void updateProduit(Produit produit) {
		produit.setDate_modification(LocalDate.now());
		produitDao.save(produit);
	}

	@Override
	public Optional<Produit> findProduit(Long id) {
		return produitDao.findById(id);
	}

	@Override
	public List<Produit> listProduit() {
		return produitDao.findAll();
	}

	@Override
	public void deleteProduit(Long id) {
		produitDao.deleteById(id);
	}

}
