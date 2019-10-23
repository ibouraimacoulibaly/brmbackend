package com.brm.brmbank.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="parametre")
public class Parametre {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
     private long idParametre;
	
	@Column(name="cle")
	private String cle;
	
	@Column(name="valeur")
	private String valeur;
	
	@Column(name="description")
	private String description;

	protected Parametre() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected Parametre(long idParametre, String cle, String valeur, String description) {
		super();
		this.idParametre = idParametre;
		this.cle = cle;
		this.valeur = valeur;
		this.description = description;
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

	public void save(Parametre parametrRepository) {
		
	}
	

}
