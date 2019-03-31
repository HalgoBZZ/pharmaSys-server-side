package com.pfe.pharmasys.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.pharmasys.entities.Categorie;
import com.pfe.pharmasys.services.CategorieService;

@RestController
@RequestMapping(value="categorie")
public class CategorieController {
	
	@Autowired
	private CategorieService categorieService;
	
	@PostMapping(value="/add")
	public void addCategorie(@RequestBody Categorie categorie) {
		categorieService.addCategorie(categorie);
	}
	
	@PutMapping(value="/update")
	public void updateCategorie(@RequestBody Categorie categorie) {
		categorieService.updateCategorie(categorie);
	}
	
	@GetMapping(value="/find/{id}")
	public Optional<Categorie> findProduit(@PathVariable("id") UUID id){
		return categorieService.findCategorie(id);
	}
	
	@GetMapping(value="/all")
	public List<Categorie> listProduit(){
		return categorieService.listCategorie();
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void deleteProduit(@PathVariable("id") UUID id) {
		categorieService.deleteCategorie(id);
	}

}
