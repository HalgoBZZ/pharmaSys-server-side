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
@Table(name="categorie")
public class Categorie implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_cat", nullable=false, updatable=false)
	private UUID id_cat;
	
	@Column(name="nom")
	private String nom_cat;
	
	@Temporal(TemporalType.DATE)
	@Column(name="ajout")
	private LocalDate date_ajout;
	
	@Temporal(TemporalType.DATE)
	@Column(name="modification")
	private LocalDate date_modification;
	
	public Categorie() {
		super();
	}

	public Categorie(UUID id_cat, String nom_cat, LocalDate date_ajout, LocalDate date_modification) {
		super();
		this.id_cat = id_cat;
		this.nom_cat = nom_cat;
		this.date_ajout = date_ajout;
		this.date_modification = date_modification;
	}

	public String getNom_cat() {
		return nom_cat;
	}

	public void setNom_cat(String nom_cat) {
		this.nom_cat = nom_cat;
	}

	public UUID getId_cat() {
		return id_cat;
	}

	public void setId_cat(UUID id_cat) {
		this.id_cat = id_cat;
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