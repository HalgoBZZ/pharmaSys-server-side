package com.pfe.pharmasys.services;

import java.util.List;
import java.util.Optional;


import com.pfe.pharmasys.entities.Client;

public interface ClientService {
	
	public void addClient(Client client);
	
	public void updateClient(Client client);
	
	public Optional<Client> findClient(Long id);
	
	public List<Client> listClient();
	
	public void deleteClient(Long id);

}
