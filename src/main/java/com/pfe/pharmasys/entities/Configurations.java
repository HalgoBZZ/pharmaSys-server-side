package com.pfe.pharmasys.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="configurtions")
public class Configurations implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_conf")
	private Long id_config;
	
	@Column(name="expiration")
	private int expiration;
	
	@Column(name="seuil_qte")
	private int seuil_qte;
	
	@Column(name="ajout")
	private LocalDate date_ajout;
	
	@Column(name="modification")
	private LocalDate date_modification;

	public Configurations() {
		
	}

	public Configurations(Long id_config, int expiration, int seuil_qte, LocalDate date_ajout,
			LocalDate date_modification) {
		super();
		this.id_config = id_config;
		this.expiration = expiration;
		this.seuil_qte = seuil_qte;
		this.date_ajout = date_ajout;
		this.date_modification = date_modification;
	}

	public Long getId_config() {
		return id_config;
	}

	public void setId_config(Long id_config) {
		this.id_config = id_config;
	}

	public int getExpiration() {
		return expiration;
	}

	public void setExpiration(int expiration) {
		this.expiration = expiration;
	}

	public int getSeuil_qte() {
		return seuil_qte;
	}

	public void setSeuil_qte(int seuil_qte) {
		this.seuil_qte = seuil_qte;
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
