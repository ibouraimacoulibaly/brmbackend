package com.brm.brmbank.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "commande_chequiers")
public class CommandeChequier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idCommandeChequier;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_type_chequier", nullable = false)
    @JsonIgnore
    private TypeChequier typeChequier;

    @Column(name = "numero_compte")
    private String numeroCompte;

    @Column(name = "livraison")
    private String livraison;

    @Column(name = "etat")
    private String etat;

    @Column(name = "nombre")
    private int nombre;

    @Column(name = "date_heure")
    private Date dateHeure;

    public CommandeChequier() {
    }

    public CommandeChequier(TypeChequier typeChequier, String numeroCompte, String livraison, String etat, int nombre, Date dateHeure) {
        this.typeChequier = typeChequier;
        this.numeroCompte = numeroCompte;
        this.livraison = livraison;
        this.etat = etat;
        this.nombre = nombre;
        this.dateHeure = dateHeure;
    }

    public long getIdCommandeChequier() {
        return idCommandeChequier;
    }

    public void setIdCommandeChequier(long idCommandeChequier) {
        this.idCommandeChequier = idCommandeChequier;
    }

    public TypeChequier getTypeChequier() {
        return typeChequier;
    }

    public void setTypeChequier(TypeChequier typeChequier) {
        this.typeChequier = typeChequier;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public String getLivraison() {
        return livraison;
    }

    public void setLivraison(String livraison) {
        this.livraison = livraison;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public Date getDateHeure() {
        return dateHeure;
    }

    public void setDateHeure(Date dateHeure) {
        this.dateHeure = dateHeure;
    }
}
