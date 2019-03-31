package com.pfe.pharmasys.doa;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.pharmasys.entities.Produit;

@Repository
public interface ProduitDao extends JpaRepository<Produit, UUID>{

}
