package com.brm.brmbank.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "cartes")
public class Cartes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCartes;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "code_type_carte", nullable = false)
    @JsonIgnore
    private TypeCarte typeCarte;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "numero_compte", nullable = false)
    @JsonIgnore
    private Compte compte;

    @Column(unique = true, nullable = false)
    private int numeroCarte;

    @Column (name = "debit")
    private String debit;

    @Column(name = "etat")
    private String etat;

    public Cartes() {
    }

    public Cartes(TypeCarte typeCarte, Compte compte, int numeroCarte, String debit, String etat) {
        this.typeCarte = typeCarte;
        this.compte = compte;
        this.numeroCarte = numeroCarte;
        this.debit = debit;
        this.etat = etat;
    }

    public long getIdCartes() {
        return idCartes;
    }

    public void setIdCartes(long idCartes) {
        this.idCartes = idCartes;
    }

    public TypeCarte getTypeCarte() {
        return typeCarte;
    }

    public void setTypeCarte(TypeCarte typeCarte) {
        this.typeCarte = typeCarte;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public int getNumeroCarte() {
        return numeroCarte;
    }

    public void setNumeroCarte(int numeroCarte) {
        this.numeroCarte = numeroCarte;
    }

    public String getDebit() {
        return debit;
    }

    public void setDebit(String debit) {
        this.debit = debit;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }


}
