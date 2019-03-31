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

import com.pfe.pharmasys.entities.Facture;
import com.pfe.pharmasys.services.FactureService;

@RestController
@RequestMapping(value="/facture")
public class FactureController {
	
	@Autowired
	private FactureService service;
	
	@PostMapping(value="/add")
	public void addFacture(@RequestBody Facture facture) {
		service.addFacture(facture);
	}
	
	@PutMapping(value="/update")
	public void updateFacture(@RequestBody Facture facture) {
		service.updateFacture(facture);
	}
	
	@GetMapping(value="/find/{id}")
	public Optional <Facture> findFacture(@PathVariable("id") UUID id){
		return service.findFacture(id);
	}
	
	@GetMapping(value="/all")
	public List<Facture> listFacture(){
		return service.listFacture();
	}

	@DeleteMapping(value="/delete/{id}")
	public void deleteFacture(@PathVariable("id") UUID id) {
		service.deleteFacture(id);
	}

}
