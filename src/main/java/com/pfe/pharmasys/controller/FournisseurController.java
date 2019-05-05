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

import com.pfe.pharmasys.entities.Fournisseur;
import com.pfe.pharmasys.services.FournisseurService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value="/fournisseur")
public class FournisseurController {

	@Autowired
	private FournisseurService service;
	
	@PostMapping(value="/add")
	public void addFournisseur(@RequestBody Fournisseur fournisseur) {
		service.addFournisseur(fournisseur);
	}
	
	@PutMapping(value="/update")
	public void updateFournisseur(@RequestBody Fournisseur fournisseur) {
		service.updateFournisseur(fournisseur);
	}
	
	@GetMapping(value="/find/{id}")
	public Optional<Fournisseur> findFournisseur(@PathVariable("id") Long id){
		return service.findFournisseur(id);
	}
	
	@GetMapping(value="/all")
	public List<Fournisseur> listFournisseur() {
		return service.listFournisseur();
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void delete(@PathVariable("id") Long id) {
		service.deleteFournisseur(id);
	}
}
