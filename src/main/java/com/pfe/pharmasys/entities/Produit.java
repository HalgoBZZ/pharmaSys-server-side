package com.pfe.pharmasys.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.pfe.pharmasys.entities.types.Forme;

@Entity
@Table(name="produit")
public class Produit implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_prod")
	private Long id_prod;
	
	@Column(name="nom_prod")
	private String nom_prod;
	
	@Column(name="ref_prod")
	private String ref_prod;

	@Enumerated(EnumType.STRING)
	@Column(name="forme")
	private Forme forme_prod;
	
	@Column(name="dosage")
	private String dosage_prod;
	
	@Column(name="quantite")
	private int qte_prod;
	
	@Temporal(TemporalType.DATE)
	@Column(name="expiration")
	private LocalDate expiration;
	
	@Column(name="prix")
	private float prix_prod;
	
	@Column(name="tva")
	private float tva_prod;
	
	@Temporal(TemporalType.DATE)
	@Column(name="added")
	private LocalDate date_ajout;
	
	@Temporal(TemporalType.DATE)
	@Column(name="updated")
	private LocalDate date_modification;

	public Produit() {
		super();
	}

	public Produit(Long id_prod, String nom_prod, String ref_prod, Forme forme_prod, String dosage_prod, int qte_prod,
			LocalDate expiration, float prix_prod, float tva_prod, LocalDate date_ajout, LocalDate date_modification) {
		super();
		this.id_prod = id_prod;
		this.nom_prod = nom_prod;
		this.ref_prod = ref_prod;
		this.forme_prod = forme_prod;
		this.dosage_prod = dosage_prod;
		this.qte_prod = qte_prod;
		this.expiration = expiration;
		this.prix_prod = prix_prod;
		this.tva_prod = tva_prod;
		this.date_ajout = date_ajout;
		this.date_modification = date_modification;
	}

	public Long getId_prod() {
		return id_prod;
	}

	public void setId_prod(Long id_prod) {
		this.id_prod = id_prod;
	}

	public String getNom_prod() {
		return nom_prod;
	}

	public void setNom_prod(String nom_prod) {
		this.nom_prod = nom_prod;
	}

	public String getRef_prod() {
		return ref_prod;
	}

	public void setRef_prod(String ref_prod) {
		this.ref_prod = ref_prod;
	}

	public Forme getForme_prod() {
		return forme_prod;
	}

	public void setForme_prod(Forme forme_prod) {
		this.forme_prod = forme_prod;
	}

	public String getDosage_prod() {
		return dosage_prod;
	}

	public void setDosage_prod(String dosage_prod) {
		this.dosage_prod = dosage_prod;
	}

	public int getQte_prod() {
		return qte_prod;
	}

	public void setQte_prod(int qte_prod) {
		this.qte_prod = qte_prod;
	}

	public LocalDate getExpiration() {
		return expiration;
	}

	public void setExpiration(LocalDate expiration) {
		this.expiration = expiration;
	}

	public float getPrix_prod() {
		return prix_prod;
	}

	public void setPrix_prod(float prix_prod) {
		this.prix_prod = prix_prod;
	}

	public float getTva_prod() {
		return tva_prod;
	}

	public void setTva_prod(float tva_prod) {
		this.tva_prod = tva_prod;
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
