package com.brm.brmbank.entities;

import javax.persistence.*;

@Entity
@Table(name = "agents_messages")
public class AgentsMessages {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idAgentsMessages;

    @Column(name = "nom")
    private String nom;

    @Column(name = "matricule")
    private String matricule;

    @Column(name = "email")
    private String email;

    @Column(name = "numero_telephone")
    private int numeroTelephone;

    @Column(name = "departement")
    private String departement;

    public AgentsMessages() {
    }

    public AgentsMessages(String nom, String matricule, String email, int numeroTelephone, String departement) {
        this.nom = nom;
        this.matricule = matricule;
        this.email = email;
        this.numeroTelephone = numeroTelephone;
        this.departement = departement;
    }

    public long getIdAgentsMessages() {
        return idAgentsMessages;
    }

    public void setIdAgentsMessages(long idAgentsMessages) {
        this.idAgentsMessages = idAgentsMessages;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(int numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }
}
