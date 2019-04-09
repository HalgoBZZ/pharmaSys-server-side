package com.pfe.pharmasys.services.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.pharmasys.doa.ClientDao;
import com.pfe.pharmasys.entities.Client;
import com.pfe.pharmasys.services.ClientService;

@Service
@Transactional
public class ClientServiceImpl implements ClientService{
	
	@Autowired
	private ClientDao clientDao;

	@Override
	public void addClient(Client client) {
		client.setDate_ajout(LocalDate.now());
		client.setDate_modification(LocalDate.now());
		clientDao.save(client);
	}

	@Override
	public void updateClient(Client client) {
		client.setDate_modification(LocalDate.now());
		clientDao.save(client);
		
	}

	@Override
	public Optional<Client> findClient(UUID id) {
		return clientDao.findById(id);
	}

	@Override
	public List<Client> listClient() {
		return clientDao.findAll();
	}

	@Override
	public void deleteClient(UUID id) {
		clientDao.deleteById(id);
		
	}

}
