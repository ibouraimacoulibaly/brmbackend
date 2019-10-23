package com.brm.brmbank.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="message")
public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
     private long idMessage;
	
	@Column(name="destinatoire")
	private String destinataire;
	
	@Column(name="objet")
	private String objet;
	
	@Column(name="message")
	private String message;

	protected Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected Message(long idMessage, String destinataire, String objet, String message) {
		super();
		this.idMessage = idMessage;
		this.destinataire = destinataire;
		this.objet = objet;
		this.message = message;
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void save(Message messagerepository) {
		
		
	}
	
	

}
