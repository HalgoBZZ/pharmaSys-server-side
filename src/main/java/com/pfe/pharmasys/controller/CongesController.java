package com.pfe.pharmasys.controller;

import java.time.LocalDate;
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

import com.pfe.pharmasys.entities.Conges;
import com.pfe.pharmasys.entities.types.Etat;
import com.pfe.pharmasys.services.CongesService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value="/conges")
public class CongesController {

	@Autowired
	private CongesService service;
	
	@PostMapping(value="/add")
	public void addConges(@RequestBody Conges conges) {
		service.addConges(conges);
	}
	
	@PutMapping(value="/update")
	public void updateConges(@RequestBody Conges conges) {
		service.updateConges(conges);
	}
	
	@GetMapping(value="/find/{id}")
	public Optional<Conges> findConges(@PathVariable("id")Long id){
		return service.findConges(id);
	}
	
	@GetMapping(value="/all")
	public List<Conges> listConges(){
		return service.listConges();
	}
	
	@PutMapping("/valide")
	public void valideConges(@RequestBody Conges conges) {
		conges.setDate_modification(LocalDate.now());
		conges.setEtat_conges(Etat.Valide);
		service.updateConges(conges);
	}
	
	@PutMapping("/refuse")
	public void refuseConges(@RequestBody Conges conges) {
		conges.setDate_modification(LocalDate.now());
		conges.setEtat_conges(Etat.Refuse);
		service.updateConges(conges);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteConges(@PathVariable("id")Long id) {
		service.deleteConges(id);
	}
}
