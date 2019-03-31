package com.pfe.pharmasys.doa;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.pharmasys.entities.Facture;

@Repository
public interface FactureDao extends JpaRepository<Facture, UUID> {

}
