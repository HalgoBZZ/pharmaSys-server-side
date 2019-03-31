package com.pfe.pharmasys.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.pfe.pharmasys.entities.Produit;

public interface ProduitService {
	
	public void addProduit(Produit produit);
	
	public void updateProduit(Produit produit);
	
	public Optional<Produit> findProduit(UUID id);
	
	public List<Produit> listProduit();
	
	public void deleteProduit(UUID id);

}
