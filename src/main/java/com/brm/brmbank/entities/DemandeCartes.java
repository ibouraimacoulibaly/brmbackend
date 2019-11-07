package com.brm.brmbank.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class DemandeCartes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idDemandeCartes;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "numero_compte", nullable = false)
    @JsonIgnore
    private Compte compte;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "code_type_carte", nullable = false)
    @JsonIgnore
    private TypeCarte typeCarte;

    @Column(name = "type_commande")
    private String typeCommande;

    @Column(name = "titulaire_carte")
    private  String titulaireCarte;

    @Column(name = "type_utilisation")
    private String typeUtilisation;

    @Column(name = "type_debit")
    private String typeDebit;

    @Column(name = "montant_debit")
    private float montantDebit;

    @Column(name = "date_commande")
    private Date dateCommande;

    @Column(name = "status")
    private String status;

    public DemandeCartes(Compte compte, TypeCarte typeCarte, String typeCommande, String titulaireCarte, String typeUtilisation, String typeDebit, float montantDebit, Date dateCommande, String status) {
        this.compte = compte;
        this.typeCarte = typeCarte;
        this.typeCommande = typeCommande;
        this.titulaireCarte = titulaireCarte;
        this.typeUtilisation = typeUtilisation;
        this.typeDebit = typeDebit;
        this.montantDebit = montantDebit;
        this.dateCommande = dateCommande;
        this.status = status;
    }

    public DemandeCartes() {
    }

    public long getIdDemandeCartes() {
        return idDemandeCartes;
    }

    public void setIdDemandeCartes(long idDemandeCartes) {
        this.idDemandeCartes = idDemandeCartes;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public TypeCarte getTypeCarte() {
        return typeCarte;
    }

    public void setTypeCarte(TypeCarte typeCarte) {
        this.typeCarte = typeCarte;
    }

    public String getTypeCommande() {
        return typeCommande;
    }

    public void setTypeCommande(String typeCommande) {
        this.typeCommande = typeCommande;
    }

    public String getTitulaireCarte() {
        return titulaireCarte;
    }

    public void setTitulaireCarte(String titulaireCarte) {
        this.titulaireCarte = titulaireCarte;
    }

    public String getTypeUtilisation() {
        return typeUtilisation;
    }

    public void setTypeUtilisation(String typeUtilisation) {
        this.typeUtilisation = typeUtilisation;
    }

    public String getTypeDebit() {
        return typeDebit;
    }

    public void setTypeDebit(String typeDebit) {
        this.typeDebit = typeDebit;
    }

    public float getMontantDebit() {
        return montantDebit;
    }

    public void setMontantDebit(float montantDebit) {
        this.montantDebit = montantDebit;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
