package com.pfe.pharmasys.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.pharmasys.entities.Conges;

@Repository
public interface CongesDao extends JpaRepository<Conges, Long>{

}
