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
	private Date date;
	
	@Column(name="montant_total")
	private float montantTotal;
	
	@Column(name="nombre_de_cheque")
	private int nombreDeCheque;
	


	protected Remise() {

	}

	public long getIdRemise() {
		return idRemise;
	}

	public Remise(String numeroCompte, int nombreDeCheque, float montantTotal, Date date) {
		this.numeroCompte = numeroCompte;
		this.nombreDeCheque = nombreDeCheque;
		this.montantTotal = montantTotal;
		this.date = date;
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

	public float getMontantTotal() {
		return montantTotal;
	}

	public void setMontantTotal(float montantTotal) {
		this.montantTotal = montantTotal;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getNombreDeCheque() {
		return nombreDeCheque;
	}

	public void setNombreDeCheque(int nombreDeCheque) {
		this.nombreDeCheque = nombreDeCheque;
	}
}
