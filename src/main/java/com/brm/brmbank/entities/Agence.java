package com.brm.brmbank.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="agences")
public class Agence {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
     private long idAgence;
	
	@Column(name="nom")
	private String nom;
    
	@Column(unique = true)
	private String codeAgence;
	
	@Column(name="adresse_postale")
	private String adressePostale;
	
	@Column(name="telephone")
	private Integer telephone;
	
	@Column(name="coordonnees_gps")
	private String coordonneesGps;
	
	@Column(name="horaire")
	private String horaire;
	
	

	protected Agence() {

	}



	protected Agence(long idAgence, String nom, String codeAgence, String adressePostale, Integer telephone,
			String coordonneesGps, String horaire) {
		super();
		this.idAgence = idAgence;
		this.nom = nom;
		this.codeAgence = codeAgence;
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



	public String getCodeAgence() {
		return codeAgence;
	}



	public void setCodeAgence(String codeAgence) {
		this.codeAgence = codeAgence;
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
