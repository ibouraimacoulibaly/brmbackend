package com.brm.brmbank.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Date;
import java.time.format.DateTimeFormatterBuilder;

import javax.persistence.*;

@Entity
@Table(name = "Virements")
public class Virement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idVirement;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id_beneficiaire", nullable = false)
	@JsonIgnore
	private Beneficiaire beneficiaire;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "compte_a_crediter", nullable = false)
	@JsonIgnore
	private Compte compte;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "code_devise", nullable = false)
	@JsonIgnore
	private Devise devise;

	@Column(name = "frequence_virements")
	private String frequenceVirements;
	
	@Column(name="compte_a_debiter")
	private String compteDebiter;
	
	@Column(name="date_heure")
	private Date dateHeure;
	
	@Column(name="motif")
	private float motif;
	
	@Column(name="date_execution")
	private Date dateExecution;
	
	@Column(name="date_expiration")
	private String dateExpiration;
	
	@Column(name="description")
	private float description;
	
	@Column(name="type_virement")
	private String typeVirement;

	@Column(name = "etat")
	private String etat;

	@Column(name = "montant")
	private  float montant;

	@Column(name = "periodicite")
	private String periodicite;

	protected Virement() {
		
	}

	public Virement(Beneficiaire beneficiaire, Compte compte, Devise devise, String frequenceVirements, String compteDebiter, Date dateHeure, float motif, Date dateExecution,
					String dateExpiration, float description, String typeVirement, String etat, float montant, String periodicite) {
		this.beneficiaire = beneficiaire;
		this.compte = compte;
		this.devise = devise;
		this.frequenceVirements = frequenceVirements;
		this.compteDebiter = compteDebiter;
		this.dateHeure = dateHeure;
		this.motif = motif;
		this.dateExecution = dateExecution;
		this.dateExpiration = dateExpiration;
		this.description = description;
		this.typeVirement = typeVirement;
		this.etat = etat;
		this.montant = montant;
		this.periodicite = periodicite;
	}

	public long getIdVirement() {
		return idVirement;
	}

	public void setIdVirement(long idVirement) {
		this.idVirement = idVirement;
	}

	public Beneficiaire getBeneficiaire() {
		return beneficiaire;
	}

	public void setBeneficiaire(Beneficiaire beneficiaire) {
		this.beneficiaire = beneficiaire;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public Devise getDevise() {
		return devise;
	}

	public void setDevise(Devise devise) {
		this.devise = devise;
	}

	public String getFrequenceVirements() {
		return frequenceVirements;
	}

	public void setFrequenceVirements(String frequenceVirements) {
		this.frequenceVirements = frequenceVirements;
	}

	public String getCompteDebiter() {
		return compteDebiter;
	}

	public void setCompteDebiter(String compteDebiter) {
		this.compteDebiter = compteDebiter;
	}

	public Date getDateHeure() {
		return dateHeure;
	}

	public void setDateHeure(Date dateHeure) {
		this.dateHeure = dateHeure;
	}

	public float getMotif() {
		return motif;
	}

	public void setMotif(float motif) {
		this.motif = motif;
	}

	public Date getDateExecution() {
		return dateExecution;
	}

	public void setDateExecution(Date dateExecution) {
		this.dateExecution = dateExecution;
	}

	public String getDateExpiration() {
		return dateExpiration;
	}

	public void setDateExpiration(String dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

	public float getDescription() {
		return description;
	}

	public void setDescription(float description) {
		this.description = description;
	}

	public String getTypeVirement() {
		return typeVirement;
	}

	public void setTypeVirement(String typeVirement) {
		this.typeVirement = typeVirement;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public String getPeriodicite() {
		return periodicite;
	}

	public void setPeriodicite(String periodicite) {
		this.periodicite = periodicite;
	}
}
