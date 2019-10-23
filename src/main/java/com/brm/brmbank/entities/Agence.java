package com.brm.brmbank.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="agence")
public class Agence {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
     private long idAgence;
	
	@Column(name="nom")
	private String nom;
    
	@Column(name="code")
	private int code;
	
	@Column(name="adresse_postale")
	private String adressePostale;
	
	@Column(name="telephone")
	private Integer telephone;
	
	@Column(name="coordonnees_gps")
	private String coordonneesGps;
	
	@Column(name="horaire")
	private String horaire;
	
	

	protected Agence() {
		super();
		// TODO Auto-generated constructor stub
	}



	protected Agence(long idAgence, String nom, int code, String adressePostale, Integer telephone,
			String coordonneesGps, String horaire) {
		super();
		this.idAgence = idAgence;
		this.nom = nom;
		this.code = code;
		this.adressePostale = adressePostale;
		this.telephone = telephone;
		this.coordonneesGps = coordonneesGps;
		this.horaire = horaire;
	}



	public long getIdAgence() {
		return idAgence;
	}



	public void setIdAgence(long idAgence) {
		this.idAgence = idAgence;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public int getCode() {
		return code;
	}



	public void setCode(int code) {
		this.code = code;
	}



	public String getAdressePostale() {
		return adressePostale;
	}



	public void setAdressePostale(String adressePostale) {
		this.adressePostale = adressePostale;
	}



	public Integer getTelephone() {
		return telephone;
	}



	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}



	public String getCoordonneesGps() {
		return coordonneesGps;
	}



	public void setCoordonneesGps(String coordonneesGps) {
		this.coordonneesGps = coordonneesGps;
	}



	public String getHoraire() {
		return horaire;
	}



	public void setHoraire(String horaire) {
		this.horaire = horaire;
	}



	public void save(Agence agencerepository) {
		// TODO Auto-generated method stub
		
	}
	
	
}
