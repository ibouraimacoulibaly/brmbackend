package com.brm.brmbank.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="devise")
public class Devise {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
     private long idDevise;
	
	@Column(name="code")
    private int code;
	
	@Column(name="symbole")
    private String symbole;
	
	@Column(name="devise")
    private String devise;
	
	@Column(name="achat")
    private String achat;
	
	@Column(name="vente")
    private String vente;
	
    
	@Override
	public String toString() {
		return "Devise [idDevise=" + idDevise + ", code=" + code + ", symbole=" + symbole + ", devise=" + devise
				+ ", achat=" + achat + ", vente=" + vente + "]";
	}

	public Devise() {
		
	}

	public Devise(long idDevise, int code, String symbole, String devise, String achat, String vente) {
		
		this.idDevise = idDevise;
		this.code = code;
		this.symbole = symbole;
		this.devise = devise;
		this.achat = achat;
		this.vente = vente;
	}

	public long getIdDevise() {
		return idDevise;
	}

	public void setIdDevise(long idDevise) {
		this.idDevise = idDevise;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getSymbole() {
		return symbole;
	}

	public void setSymbole(String symbole) {
		this.symbole = symbole;
	}

	public String getDevise() {
		return devise;
	}

	public void setDevise(String devise) {
		this.devise = devise;
	}

	public String getAchat() {
		return achat;
	}

	public void setAchat(String achat) {
		this.achat = achat;
	}

	public String getVente() {
		return vente;
	}

	public void setVente(String vente) {
		this.vente = vente;
	}

	public void save(Devise devise2) {
		
		
	}

	
	
	
	
	
	
	
	
	

}
