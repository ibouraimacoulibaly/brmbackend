package com.brm.brmbank.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "depots_a_termes")
public class DepotsATermes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDepotsATerme;

    @Column(name = "numero_compte", nullable = false)
    private int numeroCompte;

    @Column(name = "type_description")
    private String typeDescription;

    @Column(name = "taux_interet")
    private int tauxInteret;

    @Column(name = "date_value")
    private Date dateValue;

    @Column(name = "date_echeance")
    private Date dateEcheance;

    @Column(name = "montant")
    private float montant;

    @Column(name = "devise_compte")
    private String deviseCompte;

    public DepotsATermes() {
    }

    public DepotsATermes(int numeroCompte, String typeDescription, int tauxInteret, Date dateValue, Date dateEcheance, float montant, String deviseCompte) {
        this.numeroCompte = numeroCompte;
        this.typeDescription = typeDescription;
        this.tauxInteret = tauxInteret;
        this.dateValue = dateValue;
        this.dateEcheance = dateEcheance;
        this.montant = montant;
        this.deviseCompte = deviseCompte;
    }

    public long getIdDepotsATerme() {
        return idDepotsATerme;
    }

    public void setIdDepotsATerme(long idDepotsATerme) {
        this.idDepotsATerme = idDepotsATerme;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public String getTypeDescription() {
        return typeDescription;
    }

    public void setTypeDescription(String typeDescription) {
        this.typeDescription = typeDescription;
    }

    public int getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(int tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public Date getDateValue() {
        return dateValue;
    }

    public void setDateValue(Date dateValue) {
        this.dateValue = dateValue;
    }

    public Date getDateEcheance() {
        return dateEcheance;
    }

    public void setDateEcheance(Date dateEcheance) {
        this.dateEcheance = dateEcheance;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public String getDeviseCompte() {
        return deviseCompte;
    }

    public void setDeviseCompte(String deviseCompte) {
        this.deviseCompte = deviseCompte;
    }
}
