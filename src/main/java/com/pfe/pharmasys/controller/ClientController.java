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

import com.pfe.pharmasys.entities.Client;
import com.pfe.pharmasys.services.ClientService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value="/client")
public class ClientController {

	@Autowired
	private ClientService service;
	
	@PostMapping(value="/add")
	public void addClient(@RequestBody Client client) {
		service.addClient(client);
	}
	
	@PutMapping(value="/update")
	public void updateClient(@RequestBody Client client) {
		service.updateClient(client);
	}
	
	@GetMapping(value="/find/{id}")
	public Optional<Client> findClient(@PathVariable("id")Long id) {
		return service.findClient(id);
	}
	
	@GetMapping(value="/all")
	public List<Client> listClient(){
		return service.listClient();
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void deleteClient(@PathVariable("id") Long id) {
		service.deleteClient(id);
	}
}
