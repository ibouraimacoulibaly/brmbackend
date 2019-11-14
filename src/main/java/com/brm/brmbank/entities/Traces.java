package com.brm.brmbank.entities;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "traces")
public class Traces {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTraces;

    @Column(name = "utilisateur")
    private  String utilisateur;

    @Column(name = "date")
    private Date date;

    @Column(name = "objet")
    private String  objet;

    @Column(name = "commentaire")
    private String commentaire;

    @Column(name = "action")
    private String action;

    public Traces() {
    }

    public Traces(String utilisateur, Date date, String objet, String commentaire, String action) {
        this.utilisateur = utilisateur;
        this.date = date;
        this.objet = objet;
        this.commentaire = commentaire;
        this.action = action;
    }

    public long getIdTraces() {
        return idTraces;
    }

    public void setIdTraces(long idTraces) {
        this.idTraces = idTraces;
    }

    public String getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(String utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
