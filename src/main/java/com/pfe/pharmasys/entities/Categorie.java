package com.pfe.pharmasys.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


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
@Table(name="categorie")
public class Categorie implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_cat", nullable=false, updatable=false)
	private Long id_cat;
	
	@Column(name="nom")
	private String nom_cat;
	
	@Column(name="ajout")
	private LocalDate date_ajout;

	@Column(name="modification")
	private LocalDate date_modification;
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,mappedBy="categorie")
	private List<Produit> produits;
	
	public Categorie() {
		super();
	}

	public Categorie(Long id_cat, String nom_cat, LocalDate date_ajout, LocalDate date_modification) {
		super();
		this.id_cat = id_cat;
		this.nom_cat = nom_cat;
		this.date_ajout = date_ajout;
		this.date_modification = date_modification;
		produits = new ArrayList<>();
	}

	public String getNom_cat() {
		return nom_cat;
	}

	public void setNom_cat(String nom_cat) {
		this.nom_cat = nom_cat;
	}

	public Long getId_cat() {
		return id_cat;
	}

	public void setId_cat(Long id_cat) {
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

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
	
}
