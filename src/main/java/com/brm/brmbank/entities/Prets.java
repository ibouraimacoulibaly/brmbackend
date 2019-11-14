package com.brm.brmbank.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "prets")
public class Prets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPrets;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "code_devise", nullable = false)
    @JsonIgnore
    private Devise devise;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_carte", nullable = false)
    @JsonIgnore
    private Abonnees abonnees;

    @Column(name = "numero_dosssier")
    private int numeroDossier;

    @Column(name = "numero_compte_prets")
    private  int numeroComptePrets;

    @Column(name = "montant")
    private float montant;

    @Column(name = "duree")
    private Time duree;

    @Column(name = "unite_duree")
    private String uniteDuree;

    @Column(name = "taux_interet")
    private String tauxInteret;

    @Column(name = "type_taux_interet")
    private String typeTauxInteret;

   @Column(name = "echeance_finale")
    private  float echeanceFinale;

   @Column(name = "nombre_amortissement_restant")
   private int nombreAmortissementRestant;

   @Column(name = "periodicite")
   private String periodicite;

   @Column(name = "capital_restant")
   private float capitalRestant;


    @Column(name = "date_prochain_amortissement")
   private Date dateProchainAmortissement;

   @Column(name = "montant_prochain_amortissement")
   private float montantProchainAmortissement;

   @Column(name = "nombre_echeance_impaye")
   private int nombreEcheanceImpaye;

   @Column(name = "montant_total_impaye")
   private float montntTotalImpaye;

    public Prets() {
    }

    public Prets(Devise devise, Abonnees abonnees, int numeroDossier, int numeroComptePrets, float montant, Time duree, String uniteDuree, String tauxInteret, String typeTauxInteret, float echeanceFinale, int nombreAmortissementRestant, String periodicite, float capitalRestant, Date dateProchainAmortissement, float montantProchainAmortissement, int nombreEcheanceImpaye, float montntTotalImpaye) {
        this.devise = devise;
        this.abonnees = abonnees;
        this.numeroDossier = numeroDossier;
        this.numeroComptePrets = numeroComptePrets;
        this.montant = montant;
        this.duree = duree;
        this.uniteDuree = uniteDuree;
        this.tauxInteret = tauxInteret;
        this.typeTauxInteret = typeTauxInteret;
        this.echeanceFinale = echeanceFinale;
        this.nombreAmortissementRestant = nombreAmortissementRestant;
        this.periodicite = periodicite;
        this.capitalRestant = capitalRestant;
        this.dateProchainAmortissement = dateProchainAmortissement;
        this.montantProchainAmortissement = montantProchainAmortissement;
        this.nombreEcheanceImpaye = nombreEcheanceImpaye;
        this.montntTotalImpaye = montntTotalImpaye;
    }

    public long getIdPrets() {
        return idPrets;
    }

    public void setIdPrets(long idPrets) {
        this.idPrets = idPrets;
    }

    public Devise getDevise() {
        return devise;
    }

    public void setDevise(Devise devise) {
        this.devise = devise;
    }

    public Abonnees getAbonnees() {
        return abonnees;
    }

    public void setAbonnees(Abonnees abonnees) {
        this.abonnees = abonnees;
    }

    public int getNumeroDossier() {
        return numeroDossier;
    }

    public void setNumeroDossier(int numeroDossier) {
        this.numeroDossier = numeroDossier;
    }

    public int getNumeroComptePrets() {
        return numeroComptePrets;
    }

    public void setNumeroComptePrets(int numeroComptePrets) {
        this.numeroComptePrets = numeroComptePrets;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public Time getDuree() {
        return duree;
    }

    public void setDuree(Time duree) {
        this.duree = duree;
    }

    public String getUniteDuree() {
        return uniteDuree;
    }

    public void setUniteDuree(String uniteDuree) {
        this.uniteDuree = uniteDuree;
    }

    public String getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(String tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public String getTypeTauxInteret() {
        return typeTauxInteret;
    }

    public void setTypeTauxInteret(String typeTauxInteret) {
        this.typeTauxInteret = typeTauxInteret;
    }

    public float getEcheanceFinale() {
        return echeanceFinale;
    }

    public void setEcheanceFinale(float echeanceFinale) {
        this.echeanceFinale = echeanceFinale;
    }

    public int getNombreAmortissementRestant() {
        return nombreAmortissementRestant;
    }

    public void setNombreAmortissementRestant(int nombreAmortissementRestant) {
        this.nombreAmortissementRestant = nombreAmortissementRestant;
    }

    public String getPeriodicite() {
        return periodicite;
    }

    public void setPeriodicite(String periodicite) {
        this.periodicite = periodicite;
    }

    public float getCapitalRestant() {
        return capitalRestant;
    }

    public void setCapitalRestant(float capitalRestant) {
        this.capitalRestant = capitalRestant;
    }

    public Date getDateProchainAmortissement() {
        return dateProchainAmortissement;
    }

    public void setDateProchainAmortissement(Date dateProchainAmortissement) {
        this.dateProchainAmortissement = dateProchainAmortissement;
    }

    public float getMontantProchainAmortissement() {
        return montantProchainAmortissement;
    }

    public void setMontantProchainAmortissement(float montantProchainAmortissement) {
        this.montantProchainAmortissement = montantProchainAmortissement;
    }

    public int getNombreEcheanceImpaye() {
        return nombreEcheanceImpaye;
    }

    public void setNombreEcheanceImpaye(int nombreEcheanceImpaye) {
        this.nombreEcheanceImpaye = nombreEcheanceImpaye;
    }

    public float getMontntTotalImpaye() {
        return montntTotalImpaye;
    }

    public void setMontntTotalImpaye(float montntTotalImpaye) {
        this.montntTotalImpaye = montntTotalImpaye;
    }
}
