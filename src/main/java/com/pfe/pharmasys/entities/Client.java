package com.pfe.pharmasys.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


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
	
	@Temporal(TemporalType.DATE)
	@Column(name="ajout")
	private LocalDate date_ajout;
	
	@Temporal(TemporalType.DATE)
	@Column(name="modification")
	private LocalDate date_modification;

	public Client() {
		super();
	}

	public Client(UUID id_client, String nom_client, LocalDate date_ajout, LocalDate date_modification) {
		super();
		this.id_client = id_client;
		this.nom_client = nom_client;
		this.date_ajout = date_ajout;
		this.date_modification = date_modification;
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
	
	
	
}
