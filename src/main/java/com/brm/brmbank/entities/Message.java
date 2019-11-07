package com.brm.brmbank.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="messages")
public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
     private long idMessage;
	
	@Column(name="destinataire")
	private String destinataire;
	
	@Column(name="objet")
	private String objet;
	
	@Column(name="texte")
	private String texte;

	@Column(name = "expediteur")
	private String expediteur;

	@Column(name = "date")
	private Date date;

	@Column(name = "etat")
	private String etat;

	@Column(name = "fichier_joints")
	private String fichierJoints;

	@Column(name = "type")
	private String type;

	protected Message() {

	}

	public Message(String destinataire, String objet, String texte, String expediteur, Date date, String etat, String fichierJoints, String type) {
		this.destinataire = destinataire;
		this.objet = objet;
		this.texte = texte;
		this.expediteur = expediteur;
		this.date = date;
		this.etat = etat;
		this.fichierJoints = fichierJoints;
		this.type = type;
	}

	public long getIdMessage() {
		return idMessage;
	}

	public void setIdMessage(long idMessage) {
		this.idMessage = idMessage;
	}

	public String getDestinataire() {
		return destinataire;
	}

	public void setDestinataire(String destinataire) {
		this.destinataire = destinataire;
	}

	public String getObjet() {
		return objet;
	}

	public void setObjet(String objet) {
		this.objet = objet;
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

	public String getExpediteur() {
		return expediteur;
	}

	public void setExpediteur(String expediteur) {
		this.expediteur = expediteur;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getFichierJoints() {
		return fichierJoints;
	}

	public void setFichierJoints(String fichierJoints) {
		this.fichierJoints = fichierJoints;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
