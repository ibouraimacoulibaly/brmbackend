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
	
	@Column(name="nom_gabs")
	private String nomGabs;
	
	@Column(name="adresse_postale")
	private String adressePostale;
	
	@Column(name="coordonnees_gps")
	private String coordonneesGps;

     @Column(name = "etat")
	 private String etat;

     @Column(unique = true)
	 private String code;

	protected Gabs() {

	}

	public Gabs(String nomGabs, String adressePostale, String coordonneesGps, String etat, String code) {
		this.nomGabs = nomGabs;
		this.adressePostale = adressePostale;
		this.coordonneesGps = coordonneesGps;
		this.etat = etat;
		this.code = code;
	}

	public long getIdGabs() {
		return idGabs;
	}

	public void setIdGabs(long idGabs) {
		this.idGabs = idGabs;
	}

	public String getNomGabs() {
		return nomGabs;
	}

	public void setNomGabs(String nomGabs) {
		this.nomGabs = nomGabs;
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

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
