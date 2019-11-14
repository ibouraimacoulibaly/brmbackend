package com.brm.brmbank.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.File;

@Entity
@Table(name="devises")
public class Devise {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private long idDevise;
	
	@Column(unique = true, nullable = false)
    private String codeDevise;
	
	@Column(name="symbole")
    private File symbole;
	
	@Column(name="nom")
    private String nom;
	

	
    


	public Devise() {
		
	}

	public Devise(long idDevise, String codeDevise, File symbole, String nom) {
		
		this.idDevise = idDevise;
		this.codeDevise = codeDevise;
		this.symbole = symbole;
		this.nom = nom;

	}

	public long getIdDevise() {
		return idDevise;
	}

	public void setIdDevise(long idDevise) {
		this.idDevise = idDevise;
	}

	public String getCodeDevise() {
		return codeDevise;
	}

	public void setCode(String codeDevise) {
		this.codeDevise = codeDevise;
	}

	public File getSymbole() {
		return symbole;
	}

	public void setSymbole(File symbole) {
		this.symbole = symbole;
	}

	public String getNom() {
		return nom;
	}

	public void setDevise(String nom) {
		this.nom = nom;
	}





}
