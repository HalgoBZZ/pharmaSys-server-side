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
@Table(name="fournisseur")
public class Fournisseur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_four", nullable=false, updatable=false)
	private Long id_four;
	
	@Column(name="nom")
	private String nom_four;
	
	@Column(name="email")
	private String email_four;
	
	@Column(name="adresse")
	private String adresse_four;
	
	@Column(name="tel")
	private int tel_four;
	
	@Column(name="ajout")
	private LocalDate date_ajout;
	
	@Column(name="modification")
	private LocalDate date_modification;
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,mappedBy="fournisseur")
	private List<Produit> produits;
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,mappedBy="fournisseur")
	private List<Facture> factures;

	public Fournisseur() {
		super();
	}

	public Fournisseur(Long id_four, String nom_four, String email_four, String adresse_four, int tel_four,
			LocalDate date_ajout, LocalDate date_modification) {
		super();
		this.id_four = id_four;
		this.nom_four = nom_four;
		this.email_four = email_four;
		this.adresse_four = adresse_four;
		this.tel_four = tel_four;
		this.date_ajout = date_ajout;
		this.date_modification = date_modification;
		produits = new ArrayList<>();
		factures = new ArrayList<>();
	}


	public Long getId_four() {
		return id_four;
	}

	public void setId_four(Long id_four) {
		this.id_four = id_four;
	}

	public String getNom_four() {
		return nom_four;
	}

	public void setNom_four(String nom_four) {
		this.nom_four = nom_four;
	}

	public String getEmail_four() {
		return email_four;
	}

	public void setEmail_four(String email_four) {
		this.email_four = email_four;
	}

	public String getAdresse_four() {
		return adresse_four;
	}

	public void setAdresse_four(String adresse_four) {
		this.adresse_four = adresse_four;
	}

	public int getTel_four() {
		return tel_four;
	}

	public void setTel_four(int tel_four) {
		this.tel_four = tel_four;
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

	public List<Facture> getFactures() {
		return factures;
	}

	public void setFactures(List<Facture> factures) {
		this.factures = factures;
	}
	
	
	
}
