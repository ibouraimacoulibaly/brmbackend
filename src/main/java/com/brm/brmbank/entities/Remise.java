package com.brm.brmbank.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="remise")
public class Remise {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
     private long idRemise;
	
	@Column(name="compte")
	private String compte;
	
	@Column(name="emetteur")
	private String emetteur;
	
	@Column(name="banque")
	private String banque;
	
	@Column(name="numero_de_cheque")
	private int numeroDeCheque;
	
	@Column(name="montant")
	private float montant;

	protected Remise() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected Remise(long idRemise, String compte, String emetteur, String banque, int numeroDeCheque, float montant) {
		super();
		this.idRemise = idRemise;
		this.compte = compte;
		this.emetteur = emetteur;
		this.banque = banque;
		this.numeroDeCheque = numeroDeCheque;
		this.montant = montant;
	}

	public long getIdRemise() {
		return idRemise;
	}

	public void setIdRemise(long idRemise) {
		this.idRemise = idRemise;
	}

	public String getCompte() {
		return compte;
	}

	public void setCompte(String compte) {
		this.compte = compte;
	}

	public String getEmetteur() {
		return emetteur;
	}

	public void setEmetteur(String emetteur) {
		this.emetteur = emetteur;
	}

	public String getBanque() {
		return banque;
	}

	public void setBanque(String banque) {
		this.banque = banque;
	}

	public int getNumeroDeCheque() {
		return numeroDeCheque;
	}

	public void setNumeroDeCheque(int numeroDeCheque) {
		this.numeroDeCheque = numeroDeCheque;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public void save(Remise remise) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
