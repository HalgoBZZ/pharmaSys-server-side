package com.pfe.pharmasys.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.pfe.pharmasys.entities.Fournisseur;


public interface FournisseurService {
	
	public void addFournisseur(Fournisseur fournisseur);
	
	public void updateFournisseur(Fournisseur fournisseur);
	
	public Optional<Fournisseur> findFournisseur(UUID id);
	
	public List<Fournisseur> listFournisseur();
	
	public void deleteFournisseur(UUID id);

}
