package com.brm.brmbank.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="abonnees")
public class Abonnees {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
     private long idAbonnees;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="email")
	private String email;
	
	@Column(name="adresse")
	private String adresse;
	
	@Column(name="telephone")
	private int telephone;
	
	

	protected Abonnees() {
		super();
		
	}

	protected Abonnees(long idAbonnees, String nom, String email, String adresse, int telephone) {
		super();
		this.idAbonnees = idAbonnees;
		this.nom = nom;
		this.email = email;
		this.adresse = adresse;
		this.telephone = telephone;
	}

	public long getIdAbonnees() {
		return idAbonnees;
	}

	public void setIdAbonnees(long idAbonnees) {
		this.idAbonnees = idAbonnees;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public void save(Abonnees abonnees) {
	
		
	}
	
	
	
	

}
