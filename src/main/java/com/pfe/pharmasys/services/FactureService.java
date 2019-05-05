package com.pfe.pharmasys.services;

import java.util.List;
import java.util.Optional;


import com.pfe.pharmasys.entities.Facture;

public interface FactureService {
	
	public void addFacture(Facture facture);
	
	public void updateFacture(Facture facture);
	
	public Optional<Facture> findFacture(Long id);
	
	public List<Facture> listFacture();
	
	public void deleteFacture(Long id);

}
