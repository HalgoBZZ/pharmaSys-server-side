package com.pfe.pharmasys.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.pfe.pharmasys.entities.Categorie;

public interface CategorieService {
	
	public void addCategorie(Categorie categorie);
	
	public void updateCategorie(Categorie categorie);
	
	public Optional<Categorie> findCategorie(UUID id);
	
	public List<Categorie> listCategorie();
	
	public void deleteCategorie(UUID id);

}
