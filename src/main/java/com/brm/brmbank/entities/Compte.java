package com.brm.brmbank.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="comptes")
public class Compte {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private long idCompte;
	@ManyToOne(
			fetch = FetchType.LAZY,
			optional = false
	)
	@JoinColumn(
			name = "id_client",
			nullable = false
	)
	@JsonIgnore
	private Abonnees abonnees;

	@ManyToOne(
			fetch = FetchType.LAZY,
			optional = false
	)
	@JoinColumn(
			name = "code_agence",
			nullable = false
	)
	@JsonIgnore
	private Agence agence;
	
	@Column(unique = true)
	private int numeroCompte;
	
	@Column(name="solde")
	private float solde;
	
	@Column(name="solde_disponible")
	private float soldeDisponible;
	
	@Column(name="intitule_du_compte")
	private String intituleDuCompte;

	@Column(name = "devise_du_compte")
	private  String deviseDuCompte;

	@Column(name = "date_dernier_mise_a_jours")
	private Date dateDernierMiseAjours;

	@Column(name = "iban")
	private  String iban;

	@Column(name = "bicswift" )
	private  String bicswift;

	@Column(name = "carte")
	private boolean carte;

	@Column(name = "chequier")
	private boolean chequier;



	protected Compte() {

	}

	public Compte(Abonnees abonnees, Agence agence, int numeroCompte, float solde, float soldeDisponible, String intituleDuCompte, String deviseDuCompte, Date dateDernierMiseAjours, String iban, String bicswift, boolean carte, boolean chequier) {
		this.abonnees = abonnees;
		this.agence = agence;
		this.numeroCompte = numeroCompte;
		this.solde = solde;
		this.soldeDisponible = soldeDisponible;
		this.intituleDuCompte = intituleDuCompte;
		this.deviseDuCompte = deviseDuCompte;
		this.dateDernierMiseAjours = dateDernierMiseAjours;
		this.iban = iban;
		this.bicswift = bicswift;
		this.carte = carte;
		this.chequier = chequier;
	}

	public long getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(long idCompte) {
		this.idCompte = idCompte;
	}

	public Abonnees getAbonnees() {
		return abonnees;
	}

	public void setAbonnees(Abonnees abonnees) {
		this.abonnees = abonnees;
	}

	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
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

	public String getDeviseDuCompte() {
		return deviseDuCompte;
	}

	public void setDeviseDuCompte(String deviseDuCompte) {
		this.deviseDuCompte = deviseDuCompte;
	}

	public Date getDateDernierMiseAjours() {
		return dateDernierMiseAjours;
	}

	public void setDateDernierMiseAjours(Date dateDernierMiseAjours) {
		this.dateDernierMiseAjours = dateDernierMiseAjours;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getBicswift() {
		return bicswift;
	}

	public void setBicswift(String bicswift) {
		this.bicswift = bicswift;
	}

	public boolean isCarte() {
		return carte;
	}

	public void setCarte(boolean carte) {
		this.carte = carte;
	}

	public boolean isChequier() {
		return chequier;
	}

	public void setChequier(boolean chequier) {
		this.chequier = chequier;
	}
}
