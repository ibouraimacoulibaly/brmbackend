package com.brm.brmbank.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="parametres")
public class Parametre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private long idParametre;
	
	@Column(name="cle")
	private String cle;
	
	@Column(name="valeur")
	private String valeur;
	
	@Column(name="description")
	private String description;

	@Column(name = "affiche")
	private boolean affiche;

	protected Parametre() {

	}

	public Parametre(String cle, String valeur, String description, boolean affiche) {
		this.cle = cle;
		this.valeur = valeur;
		this.description = description;
		this.affiche = affiche;
	}

	public long getIdParametre() {
		return idParametre;
	}

	public void setIdParametre(long idParametre) {
		this.idParametre = idParametre;
	}

	public String getCle() {
		return cle;
	}

	public void setCle(String cle) {
		this.cle = cle;
	}

	public String getValeur() {
		return valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isAffiche() {
		return affiche;
	}

	public void setAffiche(boolean affiche) {
		this.affiche = affiche;
	}
}
