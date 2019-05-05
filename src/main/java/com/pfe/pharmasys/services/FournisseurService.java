package com.pfe.pharmasys.services;

import java.util.List;
import java.util.Optional;


import com.pfe.pharmasys.entities.Fournisseur;


public interface FournisseurService {
	
	public void addFournisseur(Fournisseur fournisseur);
	
	public void updateFournisseur(Fournisseur fournisseur);
	
	public Optional<Fournisseur> findFournisseur(Long id);
	
	public List<Fournisseur> listFournisseur();
	
	public void deleteFournisseur(Long id);

}
