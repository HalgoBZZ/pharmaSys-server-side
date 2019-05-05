package com.pfe.pharmasys.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.pharmasys.entities.Categorie;

@Repository
public interface CategorieDao extends JpaRepository<Categorie,Long>{

}
