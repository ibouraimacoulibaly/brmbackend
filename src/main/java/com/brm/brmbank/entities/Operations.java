package com.brm.brmbank.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "operations")
public class Operations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idOperations;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "numero_compte", nullable = false)
    @JsonIgnore
    private Compte compte;

    @Column(name = "code_operation")
    private String codeOperation;

    @Column(name = "date_operation")
    private Date dateOperation;

    @Column(name = "date_valeur")
    private Date dateValeur;

    @Column(name = "sens")
    private String sens;

    public Operations() {
    }

    public Operations(Compte compte, String codeOperation, Date dateOperation, Date dateValeur, String sens) {
        this.compte = compte;
        this.codeOperation = codeOperation;
        this.dateOperation = dateOperation;
        this.dateValeur = dateValeur;
        this.sens = sens;
    }

    public long getIdOperations() {
        return idOperations;
    }

    public void setIdOperations(long idOperations) {
        this.idOperations = idOperations;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public String getCodeOperation() {
        return codeOperation;
    }

    public void setCodeOperation(String codeOperation) {
        this.codeOperation = codeOperation;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public Date getDateValeur() {
        return dateValeur;
    }

    public void setDateValeur(Date dateValeur) {
        this.dateValeur = dateValeur;
    }

    public String getSens() {
        return sens;
    }

    public void setSens(String sens) {
        this.sens = sens;
    }
}
