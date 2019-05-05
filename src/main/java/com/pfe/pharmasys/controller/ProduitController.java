package com.pfe.pharmasys.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.pharmasys.entities.Produit;
import com.pfe.pharmasys.services.ProduitService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value="/produit")
public class ProduitController {

	@Autowired
	private ProduitService produitService;
	
	@PostMapping(value="/add")
	public void addProduit(@RequestBody Produit produit) {
		produitService.addProduit(produit);
	}
	
	@PutMapping(value="/update")
	public void updateProduit(@RequestBody Produit produit) {
		produitService.updateProduit(produit);
	}
	
	@GetMapping(value="/find/{id}")
	public Optional<Produit> findProduit(@PathVariable("id") Long id){
		return produitService.findProduit(id);
	}
	
	@GetMapping(value="/all")
	public List<Produit> listProduit(){
		return produitService.listProduit();
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void deleteProduit(@PathVariable("id") Long id) {
		produitService.deleteProduit(id);
	}
}
