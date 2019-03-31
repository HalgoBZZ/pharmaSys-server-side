package com.pfe.pharmasys.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
		produitDao.save(produit);
		
	}

	@Override
	public void updateProduit(Produit produit) {
		produitDao.save(produit);
	}

	@Override
	public Optional<Produit> findProduit(UUID id) {
		return produitDao.findById(id);
	}

	@Override
	public List<Produit> listProduit() {
		return produitDao.findAll();
	}

	@Override
	public void deleteProduit(UUID id) {
		produitDao.deleteById(id);
	}

}