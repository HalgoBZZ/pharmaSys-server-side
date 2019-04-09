package com.pfe.pharmasys.services.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.pharmasys.doa.CategorieDao;
import com.pfe.pharmasys.entities.Categorie;
import com.pfe.pharmasys.services.CategorieService;

@Service
@Transactional
public class CategorieServiceImpl implements CategorieService{
	
	@Autowired
	private CategorieDao categorieDao;

	@Override
	public void addCategorie(Categorie categorie) {
		categorie.setDate_ajout(LocalDate.now());
		categorie.setDate_modification(LocalDate.now());
		categorieDao.save(categorie);
		
	}

	@Override
	public void updateCategorie(Categorie categorie) {
		categorie.setDate_modification(LocalDate.now());
		categorieDao.save(categorie);
	}

	@Override
	public Optional<Categorie> findCategorie(UUID id) {
		return categorieDao.findById(id);
	}

	@Override
	public List<Categorie> listCategorie() {
		return categorieDao.findAll();
	}

	@Override
	public void deleteCategorie(UUID id) {
		categorieDao.deleteById(id);		
	}

}
