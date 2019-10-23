package com.brm.brmbank.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="beneficiaire")
public class Beneficiaire {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
     private long idBeneficiaire;
	
	@Column(name="nom_prenom")
	private String nomPrenom;
   
	@Column(name="numero_compte")
	private int numeroCompte;
	
	@Column(name="iban")
	private String iban;

	protected Beneficiaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected Beneficiaire(long idBeneficiaire, String nomPrenom, int numeroCompte, String iban) {
		super();
		this.idBeneficiaire = idBeneficiaire;
		this.nomPrenom = nomPrenom;
		this.numeroCompte = numeroCompte;
		this.iban = iban;
	}

	public long getIdBeneficiaire() {
		return idBeneficiaire;
	}

	public void setIdBeneficiaire(long idBeneficiaire) {
		this.idBeneficiaire = idBeneficiaire;
	}

	public String getNomPrenom() {
		return nomPrenom;
	}

	public void setNomPrenom(String nomPrenom) {
		this.nomPrenom = nomPrenom;
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
		// TODO Auto-generated method stub
		
	}
	
	
}
