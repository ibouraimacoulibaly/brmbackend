package com.brm.brmbank.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="compte")
public class Compte {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private long idCompte;
	
	@Column(name="numero_compte")
	private int numeroCompte;
	
	@Column(name="solde")
	private float solde;
	
	@Column(name="solde_disponible")
	private float soldeDisponible;
	
	@Column(name="intitule_du_compte")
	private String intituleDuCompte;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="date_de_naissance")
	private Date dateDeNaissance;
	
	@Column(name="lieu_de_naissance")
	private String lieuDeNaissance;
	
	@Column(name="adresse")
	private String adresse;

	protected Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected Compte(long idCompte, int numeroCompte, float solde, float soldeDisponible, String intituleDuCompte,
			String nom, Date dateDeNaissance, String lieuDeNaissance, String adresse) {
		super();
		this.idCompte = idCompte;
		this.numeroCompte = numeroCompte;
		this.solde = solde;
		this.soldeDisponible = soldeDisponible;
		this.intituleDuCompte = intituleDuCompte;
		this.nom = nom;
		this.dateDeNaissance = dateDeNaissance;
		this.lieuDeNaissance = lieuDeNaissance;
		this.adresse = adresse;
	}

	public long getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(long idCompte) {
		this.idCompte = idCompte;
	}

	public int getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public float getSoldeDisponible() {
		return soldeDisponible;
	}

	public void setSoldeDisponible(float soldeDisponible) {
		this.soldeDisponible = soldeDisponible;
	}

	public String getIntituleDuCompte() {
		return intituleDuCompte;
	}

	public void setIntituleDuCompte(String intituleDuCompte) {
		this.intituleDuCompte = intituleDuCompte;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getLieuDeNaissance() {
		return lieuDeNaissance;
	}

	public void setLieuDeNaissance(String lieuDeNaissance) {
		this.lieuDeNaissance = lieuDeNaissance;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public void save(Compte compte) {
		// TODO Auto-generated method stub
		
	}
	
	

}
