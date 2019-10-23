package com.brm.brmbank.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gabs")
public class Gabs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private long idGabs;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="adresse_postale")
	private String adressePostale;
	
	@Column(name="coordonnees_gps")
	private String coordonneesGps;

	protected Gabs() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected Gabs(long idGabs, String nom, String adressePostale, String coordonneesGps) {
		super();
		this.idGabs = idGabs;
		this.nom = nom;
		this.adressePostale = adressePostale;
		this.coordonneesGps = coordonneesGps;
	}

	public long getIdGabs() {
		return idGabs;
	}

	public void setIdGabs(long idGabs) {
		this.idGabs = idGabs;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdressePostale() {
		return adressePostale;
	}

	public void setAdressePostale(String adressePostale) {
		this.adressePostale = adressePostale;
	}

	public String getCoordonneesGps() {
		return coordonneesGps;
	}

	public void setCoordonneesGps(String coordonneesGps) {
		this.coordonneesGps = coordonneesGps;
	}

	public void save(Gabs gabsrepository) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
