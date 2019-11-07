package com.brm.brmbank.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "connexions")
public class Connexions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idConnexions;

    @Column(name = "user")
    private String user;

    @Column(name = "date_connexion")
    private Date dateConnexion;

    @Column(name = "date_deconnexion")
    private Date dateDeconnexion;

    @Column(name = "rubrique_visitees")
    private String rubriqueVistees;

    public Connexions() {
    }

    public Connexions(String user, Date dateConnexion, Date dateDeconnexion, String rubriqueVistees) {
        this.user = user;
        this.dateConnexion = dateConnexion;
        this.dateDeconnexion = dateDeconnexion;
        this.rubriqueVistees = rubriqueVistees;
    }

    public long getIdConnexions() {
        return idConnexions;
    }

    public void setIdConnexions(long idConnexions) {
        this.idConnexions = idConnexions;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getDateConnexion() {
        return dateConnexion;
    }

    public void setDateConnexion(Date dateConnexion) {
        this.dateConnexion = dateConnexion;
    }

    public Date getDateDeconnexion() {
        return dateDeconnexion;
    }

    public void setDateDeconnexion(Date dateDeconnexion) {
        this.dateDeconnexion = dateDeconnexion;
    }

    public String getRubriqueVistees() {
        return rubriqueVistees;
    }

    public void setRubriqueVistees(String rubriqueVistees) {
        this.rubriqueVistees = rubriqueVistees;
    }
}
