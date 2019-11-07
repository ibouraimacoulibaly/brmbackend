package com.brm.brmbank.entities;

import javax.persistence.*;

@Entity
@Table(name = "type_opearations")
public class TypeOperations {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idTypeOperation;

    @Column(name = "code_operation")
    private String codeOperation;

    @Column(name = "libelle")
    private String libelle;

    public TypeOperations() {
    }

    public TypeOperations(String codeOperation, String libelle) {
        this.codeOperation = codeOperation;
        this.libelle = libelle;
    }

    public long getIdTypeOperation() {
        return idTypeOperation;
    }

    public void setIdTypeOperation(long idTypeOperation) {
        this.idTypeOperation = idTypeOperation;
    }

    public String getCodeOperation() {
        return codeOperation;
    }

    public void setCodeOperation(String codeOperation) {
        this.codeOperation = codeOperation;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
