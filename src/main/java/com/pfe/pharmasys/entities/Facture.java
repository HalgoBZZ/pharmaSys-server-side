package com.pfe.pharmasys.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.pfe.pharmasys.entities.types.TypeFacture;

@Entity
@Table(name="facture")
public class Facture implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_fact",nullable=false, updatable=false)
	private Long id_fact;
	
	@Column(name="numero")
	private String num_fact;
	
	@Column(name="date_fact")
	private LocalDate date_fact;
	
	@Enumerated(EnumType.STRING)
	@Column(name="type")
	private TypeFacture type_fact;
	
	@Column(name="ajout")
	private LocalDate date_ajout;
	
	@Column(name="modification")
	private LocalDate date_modification;
	
	@OneToMany
	private List<Produit> produits;
	
	@ManyToOne
	private Client client;
	
	@ManyToOne
	private Fournisseur fournisseur;
	
	public Facture() {
		super();
	}

	public Facture(Long id_fact, String num_fact, LocalDate date_fact, TypeFacture type_fact, LocalDate date_ajout, LocalDate date_modification) {
		this.id_fact = id_fact;
		this.num_fact = num_fact;
		this.date_fact = date_fact;
		this.type_fact = type_fact;
		this.date_ajout = date_ajout;
		this.date_modification = date_modification;
		produits = new ArrayList<>();
	}

	public Long getId_fact() {
		return id_fact;
	}

	public void setId_fact(Long id_fact) {
		this.id_fact = id_fact;
	}

	public String getNum_fact() {
		return num_fact;
	}

	public void setNum_fact(String num_fact) {
		this.num_fact = num_fact;
	}

	public LocalDate getDate_fact() {
		return date_fact;
	}

	public void setDate_fact(LocalDate date_fact) {
		this.date_fact = date_fact;
	}

	public TypeFacture getType_fact() {
		return type_fact;
	}

	public void setType_fact(TypeFacture type_fact) {
		this.type_fact = type_fact;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
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
