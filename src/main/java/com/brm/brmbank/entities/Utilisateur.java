package com.brm.brmbank.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="utilisateur")
public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
     private long idUtilisateur;
	
	@Column(name="nom")
    private String nom;
	
	@Column(unique = true)
    private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="fonction")
    private String fonction;
	
	
	@Column(unique = true)
    private String email;
	
	

	@Column(name="departement")
    private String departement;
	
	@Column(name="telephone")
    private String telephone;
	
	@Column(name="profil")
    private String profil;
	
	public Utilisateur() {
		
	}

	protected Utilisateur(long idUtilisateur, String nom, String username, String fonction, String email,
			String departement, String telephone, String profil) {
		
		this.idUtilisateur = idUtilisateur;
		this.nom = nom;
		this.username = username;
		this.fonction = fonction;
		this.email = email;
		this.departement = departement;
		this.telephone = telephone;
		this.profil = profil;
	}

	public long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getProfil() {
		return profil;
	}

	public void setProfil(String profil) {
		this.profil = profil;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
