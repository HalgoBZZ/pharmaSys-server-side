package com.pfe.pharmasys.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="client")
public class Client implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_client")
	private UUID id_client;
	
	@Column(name="nom")
	private String nom_client;
	
	@Column(name="ajout")
	private LocalDate date_ajout;
	
	@Column(name="modification")
	private LocalDate date_modification;
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,mappedBy="client")
	private List<Facture> factures;

	public Client() {
		super();
	}

	public Client(UUID id_client, String nom_client, LocalDate date_ajout, LocalDate date_modification) {
		super();
		this.id_client = id_client;
		this.nom_client = nom_client;
		this.date_ajout = date_ajout;
		this.date_modification = date_modification;
		factures = new ArrayList<>();
	}

	public UUID getId_client() {
		return id_client;
	}

	public void setId_client(UUID id_client) {
		this.id_client = id_client;
	}

	public String getNom_client() {
		return nom_client;
	}

	public void setNom_client(String nom_client) {
		this.nom_client = nom_client;
	}

	public LocalDate getDate_ajout() {
		return date_ajout;
	}

	public void setDate_ajout(LocalDate date_ajout) {
		this.date_ajout = date_ajout;
	}

	public LocalDate getDate_modification() {
		return date_modification;
	}

	public void setDate_modification(LocalDate date_modification) {
		this.date_modification = date_modification;
	}

	public List<Facture> getFactures() {
		return factures;
	}

	public void setFactures(List<Facture> factures) {
		this.factures = factures;
	}
	
	
}
