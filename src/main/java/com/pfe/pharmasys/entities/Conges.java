package com.pfe.pharmasys.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

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

import com.pfe.pharmasys.entities.types.Etat;


@Entity
@Table(name="conges")
public class Conges implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_conges")
	private UUID id_conges;
	
	@Temporal(TemporalType.DATE)
	@Column(name="debut")
	private LocalDate date_debut;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fin")
	private LocalDate date_fin;
	
	@Column(name="cause")
	private String cause;
	
	@Temporal(TemporalType.DATE)
	@Column(name="ajout")
	private LocalDate date_ajout;
	
	@Temporal(TemporalType.DATE)
	@Column(name="modification")
	private LocalDate date_modification;
	
	@Enumerated(EnumType.STRING)
	@Column(name="etat")
	private Etat etat_conges;

	public Conges() {
		super();
	}

	public Conges(UUID id_conges, LocalDate date_debut, LocalDate date_fin, String cause, LocalDate date_ajout,
			LocalDate date_modification, Etat etat_conges) {
		super();
		this.id_conges = id_conges;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.cause = cause;
		this.date_ajout = date_ajout;
		this.date_modification = date_modification;
		this.etat_conges = etat_conges;
	}

	public UUID getId_conges() {
		return id_conges;
	}

	public void setId_conges(UUID id_conges) {
		this.id_conges = id_conges;
	}

	public LocalDate getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(LocalDate date_debut) {
		this.date_debut = date_debut;
	}

	public LocalDate getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(LocalDate date_fin) {
		this.date_fin = date_fin;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
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

	public Etat getEtat_conges() {
		return etat_conges;
	}

	public void setEtat_conges(Etat etat_conges) {
		this.etat_conges = etat_conges;
	}
	
	
	
}
