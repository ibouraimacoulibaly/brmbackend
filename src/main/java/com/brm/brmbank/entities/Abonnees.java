package com.brm.brmbank.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="abonnes")
public class Abonnees {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private long idAbonnes;
	
	@Column(name="nom")
	private String nom;

	@Column(name = "prenom")
	private String prenom;

	@Column(unique = true, nullable = false)
	private String username;
	
	@Column(unique = true, nullable = false)
	private String email;

	@Column(name="adresse")
	private String adresse;

	@Column(name="telephone")
	private Integer telephone;

	@Column(name = "password")
	private String password;

	@Column(unique = true, nullable = false)
	private String idClient;

	@Column(name = "ville")
	private String ville;

	@Column(name = "region")
	private String region;

	@Column(name = "pays")
	private String pays;

	@Column(name = "date_derniere_connexion")
	private Date dateDerniereConnexion;

	

	protected Abonnees() {

	}

	public Abonnees(String nom, String prenom, String username, String email, String adresse, Integer telephone, String password, String idClient, String ville, String region, String pays, Date dateDerniereConnexion) {
		this.nom = nom;
		this.prenom = prenom;
		this.username = username;
		this.email = email;
		this.adresse = adresse;
		this.telephone = telephone;
		this.password = password;
		this.idClient = idClient;
		this.ville = ville;
		this.region = region;
		this.pays = pays;
		this.dateDerniereConnexion = dateDerniereConnexion;
		
	}

	public long getIdAbonnes() {
		return idAbonnes;
	}

	public void setIdAbonnes(long idAbonnes) {
		this.idAbonnes = idAbonnes;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Integer getTelephone() {
		return telephone;
	}

	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIdClient() {
		return idClient;
	}

	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public Date getDateDerniereConnexion() {
		return dateDerniereConnexion;
	}

	public void setDateDerniereConnexion(Date dateDerniereConnexion) {
		this.dateDerniereConnexion = dateDerniereConnexion;
	}


}
