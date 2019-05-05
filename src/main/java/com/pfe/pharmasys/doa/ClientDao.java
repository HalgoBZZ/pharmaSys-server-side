package com.pfe.pharmasys.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.pharmasys.entities.Client;

@Repository
public interface ClientDao extends JpaRepository<Client, Long> {

}
