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

import com.pfe.pharmasys.entities.types.Genre;
import com.pfe.pharmasys.entities.types.Role;

@Entity
@Table(name="employe")
public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_emp", nullable=false, updatable=false)
	private UUID id_emp;
	
	@Column(name="nom")
	private String nom_emp;
	
	@Column(name="prenom")
	private String prenom_emp;
	
	@Temporal(TemporalType.DATE)
	@Column(name="naissance")
	private LocalDate date_naiss_emp;
	
	@Column(name="email")
	private String email_emp;
	
	@Column(name="adresse")
	private String adresse;
	
	@Column(name="tel")
	private int tel_emp;
	
	@Column(name="poste")
	private String poste_emp;
	
	@Enumerated(EnumType.STRING)
	@Column(name="role")
	private Role role_emp;
	
	@Enumerated(EnumType.STRING)
	@Column(name="sexe")
	private Genre sexe_emp;
	
	@Temporal(TemporalType.DATE)
	@Column(name="ajout")
	private LocalDate date_ajout;
	
	@Temporal(TemporalType.DATE)
	@Column(name="modification")
	private LocalDate date_modification;
	
	@Column(name="login")
	private String login;
	
	@Column(name="pwd")
	private String pwd;
	
	@Column(name="photo", length = 1000000)
	private String photo;

	public Employee() {
		super();
	}

	public Employee(UUID id_emp, String nom_emp, String prenom_emp, LocalDate date_naiss_emp, String email_emp,
			String adresse, int tel_emp, String poste_emp, Role role_emp, Genre sexe_emp, LocalDate date_ajout,
			LocalDate date_modification, String login, String pwd, String photo) {
		super();
		this.id_emp = id_emp;
		this.nom_emp = nom_emp;
		this.prenom_emp = prenom_emp;
		this.date_naiss_emp = date_naiss_emp;
		this.email_emp = email_emp;
		this.adresse = adresse;
		this.tel_emp = tel_emp;
		this.poste_emp = poste_emp;
		this.role_emp = role_emp;
		this.sexe_emp = sexe_emp;
		this.date_ajout = date_ajout;
		this.date_modification = date_modification;
		this.login = login;
		this.pwd = pwd;
		this.photo = photo;
	}

	public UUID getId_emp() {
		return id_emp;
	}

	public void setId_emp(UUID id_emp) {
		this.id_emp = id_emp;
	}

	public String getNom_emp() {
		return nom_emp;
	}

	public void setNom_emp(String nom_emp) {
		this.nom_emp = nom_emp;
	}

	public String getPrenom_emp() {
		return prenom_emp;
	}

	public void setPrenom_emp(String prenom_emp) {
		this.prenom_emp = prenom_emp;
	}

	public LocalDate getDate_naiss_emp() {
		return date_naiss_emp;
	}

	public void setDate_naiss_emp(LocalDate date_naiss_emp) {
		this.date_naiss_emp = date_naiss_emp;
	}

	public String getEmail_emp() {
		return email_emp;
	}

	public void setEmail_emp(String email_emp) {
		this.email_emp = email_emp;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getTel_emp() {
		return tel_emp;
	}

	public void setTel_emp(int tel_emp) {
		this.tel_emp = tel_emp;
	}

	public String getPoste_emp() {
		return poste_emp;
	}

	public void setPoste_emp(String poste_emp) {
		this.poste_emp = poste_emp;
	}

	public Role getRole_emp() {
		return role_emp;
	}

	public void setRole_emp(Role role_emp) {
		this.role_emp = role_emp;
	}

	public Genre getSexe_emp() {
		return sexe_emp;
	}

	public void setSexe_emp(Genre sexe_emp) {
		this.sexe_emp = sexe_emp;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
}
