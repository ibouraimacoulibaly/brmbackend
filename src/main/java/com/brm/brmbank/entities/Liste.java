package com.brm.brmbank.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="liste")
public class Liste {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
     private long idListe;
	
	@Column(name="type")
	private String type;
	
	@Column(name="nom")
	private String nom;
	
	@ManyToOne(
	          fetch = FetchType.LAZY,
	          optional = false
	  )
	  @JoinColumn(
	          name = "id_utlisateur",
	          nullable = false
	  )
	  @JsonIgnore
	  private Utilisateur utilisateur;
	
	
	

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}


	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}


	protected Liste() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected Liste(long idListe, String type, String nom) {
		super();
		this.idListe = idListe;
		this.type = type;
		this.nom = nom;
	}


	public long getIdListe() {
		return idListe;
	}


	public void setIdListe(long idListe) {
		this.idListe = idListe;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public void save(Liste liste) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
