package com.brm.brmbank.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Virement")
public class Virement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idVirement;
	
	@Column(name="agence")
	private String agence;
	
	@Column(name="titulaireDuCompte")
	private String titulaireDuCompte;
	
	@Column(name="solde")
	private float solde;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="devise")
	private String devise;
	
	@Column(name="montant")
	private float montant;
	
	@Column(name="type")
	private String type;

	protected Virement() {
		
	}

	protected Virement(long idVirement, String agence, String titulaireDuCompte, float solde, Date date, String devise,
			float montant, String type) {
		
		this.idVirement = idVirement;
		this.agence = agence;
		this.titulaireDuCompte = titulaireDuCompte;
		this.solde = solde;
		this.date = date;
		this.devise = devise;
		this.montant = montant;
		this.type = type;
	}

	public long getIdVirement() {
		return idVirement;
	}

	public void setIdVirement(long idVirement) {
		this.idVirement = idVirement;
	}

	public String getAgence() {
		return agence;
	}

	public void setAgence(String agence) {
		this.agence = agence;
	}

	public String getTitulaireDuCompte() {
		return titulaireDuCompte;
	}

	public void setTitulaireDuCompte(String titulaireDuCompte) {
		this.titulaireDuCompte = titulaireDuCompte;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDevise() {
		return devise;
	}

	public void setDevise(String devise) {
		this.devise = devise;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void save(Virement virement) {
		// TODO Auto-generated method stub
		
	}
	
	

}
