package com.pfe.pharmasys.services;

import java.util.List;
import java.util.Optional;


import com.pfe.pharmasys.entities.Categorie;

public interface CategorieService {
	
	public void addCategorie(Categorie categorie);
	
	public void updateCategorie(Categorie categorie);
	
	public Optional<Categorie> findCategorie(Long id);
	
	public List<Categorie> listCategorie();
	
	public void deleteCategorie(Long id);

}
