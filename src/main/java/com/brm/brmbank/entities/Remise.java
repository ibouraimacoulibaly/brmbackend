package com.brm.brmbank.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="remises")
public class Remise {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
     private long idRemise;
	
	@Column(name="numero_compte")
	private String numeroCompte;
	
	@Column(name="date")
	private Date nombreDeCheque;
	
	@Column(name="montant_total")
	private float montantTotal;
	
	@Column(name="numero_de_cheque")
	private int numeroDeCheque;
	


	protected Remise() {

	}

	public long getIdRemise() {
		return idRemise;
	}

	public Remise(String numeroCompte, Date nombreDeCheque, float montantTotal, int numeroDeCheque) {
		this.numeroCompte = numeroCompte;
		this.nombreDeCheque = nombreDeCheque;
		this.montantTotal = montantTotal;
		this.numeroDeCheque = numeroDeCheque;
	}

	public void setIdRemise(long idRemise) {
		this.idRemise = idRemise;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public Date getNombreDeCheque() {
		return nombreDeCheque;
	}

	public void setNombreDeCheque(Date nombreDeCheque) {
		this.nombreDeCheque = nombreDeCheque;
	}

	public float getMontantTotal() {
		return montantTotal;
	}

	public void setMontantTotal(float montantTotal) {
		this.montantTotal = montantTotal;
	}

	public int getNumeroDeCheque() {
		return numeroDeCheque;
	}

	public void setNumeroDeCheque(int numeroDeCheque) {
		this.numeroDeCheque = numeroDeCheque;
	}
}
