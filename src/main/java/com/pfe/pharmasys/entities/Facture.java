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
	private UUID id_fact;
	
	@Column(name="numero")
	private String num_fact;
	
	@Temporal(TemporalType.DATE)
	@Column(name="date_fact")
	private LocalDate date_fact;
	
	@Enumerated(EnumType.STRING)
	@Column(name="type")
	private TypeFacture type_fact;
	
	public Facture() {
		super();
	}

	public Facture(UUID id_fact, String num_fact, LocalDate date_fact, TypeFacture type_fact) {
		this.id_fact = id_fact;
		this.num_fact = num_fact;
		this.date_fact = date_fact;
		this.type_fact = type_fact;
	}

	public UUID getId_fact() {
		return id_fact;
	}

	public void setId_fact(UUID id_fact) {
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
	
}
