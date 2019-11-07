package com.brm.brmbank.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "cours_devise")
public class CoursDevise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idCoursDevise;

    @Column(name = "vente")
    private String vente;

    @Column(name = "achat")
    private String achat;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_chargement_cours_devise", nullable = false)
    @JsonIgnore
    private ChargementCoursDevise chargementCoursDevise;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "code_devise", nullable = false)
    @JsonIgnore
    private Devise devise;

    public CoursDevise() {
    }

    public CoursDevise(String vente, String achat, ChargementCoursDevise chargementCoursDevise, Devise devise) {
        this.vente = vente;
        this.achat = achat;
        this.chargementCoursDevise = chargementCoursDevise;
        this.devise = devise;
    }

    public long getIdCoursDevise() {
        return idCoursDevise;
    }

    public void setIdCoursDevise(long idCoursDevise) {
        this.idCoursDevise = idCoursDevise;
    }

    public String getVente() {
        return vente;
    }

    public void setVente(String vente) {
        this.vente = vente;
    }

    public String getAchat() {
        return achat;
    }

    public void setAchat(String achat) {
        this.achat = achat;
    }

    public ChargementCoursDevise getChargementCoursDevise() {
        return chargementCoursDevise;
    }

    public void setChargementCoursDevise(ChargementCoursDevise chargementCoursDevise) {
        this.chargementCoursDevise = chargementCoursDevise;
    }

    public Devise getDevise() {
        return devise;
    }

    public void setDevise(Devise devise) {
        this.devise = devise;
    }
}
