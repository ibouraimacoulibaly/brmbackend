package com.brm.brmbank.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="beneficiaires")
public class Beneficiaire {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private long idBeneficiaire;
	
	@Column(name="nomComplet")
	private String nomComplet;
   
	@Column(unique = true, nullable = false)
	private int numeroCompte;
	
	@Column(name="iban")
	private String iban;

	protected Beneficiaire() {

	}

	protected Beneficiaire(long idBeneficiaire, String nomComplet, int numeroCompte, String iban) {
		super();
		this.idBeneficiaire = idBeneficiaire;
		this.nomComplet = nomComplet;
		this.numeroCompte = numeroCompte;
		this.iban = iban;
	}

	public long getIdBeneficiaire() {
		return idBeneficiaire;
	}

	public void setIdBeneficiaire(long idBeneficiaire) {
		this.idBeneficiaire = idBeneficiaire;
	}

	public String getNomComplet() {
		return nomComplet;
	}

	public void setNomComplet(String nomComplet) {
		this.nomComplet = nomComplet;
	}

	public int getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public void save(Beneficiaire beneficiaire) {

		
	}
	
	
}
