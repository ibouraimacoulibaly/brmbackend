package com.brm.brmbank.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "cheque_remise")
public class ChequeRemises {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idChequeRemise;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_remise", nullable = false)
    @JsonIgnore
    private Remise remise;

    @Column(name = "emmetteur")
    private String emmetteur;
    @Column(name = "numero_cheque")
    private int numeroCheque;

    @Column(name = "nom_bank")
    private  String nomBank;

    @Column(name = "montant_cheque")
    private float montantCheque;

    public ChequeRemises() {
    }

    public ChequeRemises(Remise remise, String emmetteur, int numeroCheque, String nomBank, float montantCheque) {
        this.remise = remise;
        this.emmetteur = emmetteur;
        this.numeroCheque = numeroCheque;
        this.nomBank = nomBank;
        this.montantCheque = montantCheque;
    }

    public long getIdChequeRemise() {
        return idChequeRemise;
    }

    public void setIdChequeRemise(long idChequeRemise) {
        this.idChequeRemise = idChequeRemise;
    }

    public Remise getRemise() {
        return remise;
    }

    public void setRemise(Remise remise) {
        this.remise = remise;
    }

    public String getEmmetteur() {
        return emmetteur;
    }

    public void setEmmetteur(String emmetteur) {
        this.emmetteur = emmetteur;
    }

    public int getNumeroCheque() {
        return numeroCheque;
    }

    public void setNumeroCheque(int numeroCheque) {
        this.numeroCheque = numeroCheque;
    }

    public String getNomBank() {
        return nomBank;
    }

    public void setNomBank(String nomBank) {
        this.nomBank = nomBank;
    }

    public float getMontantCheque() {
        return montantCheque;
    }

    public void setMontantCheque(float montantCheque) {
        this.montantCheque = montantCheque;
    }

}
