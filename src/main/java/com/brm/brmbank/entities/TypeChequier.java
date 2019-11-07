package com.brm.brmbank.entities;

import javax.persistence.*;

@Entity
@Table(name = "type_chequier")
public class TypeChequier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idTypeChequier;

    @Column(unique = true)
    private  String codeTypeChequier;

    @Column(name = "libelle_type_chequier")
    private String libelleTypeChequier;

    public TypeChequier() {
    }

    public TypeChequier(String codeTypeChequier, String libelleTypeChequier) {
        this.codeTypeChequier = codeTypeChequier;
        this.libelleTypeChequier = libelleTypeChequier;
    }

    public long getIdTypeChequier() {
        return idTypeChequier;
    }

    public void setIdTypeChequier(long idTypeChequier) {
        this.idTypeChequier = idTypeChequier;
    }

    public String getCodeTypeChequier() {
        return codeTypeChequier;
    }

    public void setCodeTypeChequier(String codeTypeChequier) {
        this.codeTypeChequier = codeTypeChequier;
    }

    public String getLibelleTypeChequier() {
        return libelleTypeChequier;
    }

    public void setLibelleTypeChequier(String libelleTypeChequier) {
        this.libelleTypeChequier = libelleTypeChequier;
    }
}
