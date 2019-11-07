package com.brm.brmbank.entities;

import javax.persistence.*;

@Entity
@Table(name = "type_carte")
public class TypeCarte {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idTypeCarte;

    @Column(unique = true)
    private  String codeTypeCarte;

    @Column(name = "libelle_type_carte")
    private String libelleTypeCarte;

    public TypeCarte() {
    }

    public TypeCarte(String codeTypeCarte, String libelleTypeCarte) {
        this.codeTypeCarte = codeTypeCarte;
        this.libelleTypeCarte = libelleTypeCarte;
    }

    public long getIdTypeCarte() {
        return idTypeCarte;
    }

    public void setIdTypeCarte(long idTypeCarte) {
        this.idTypeCarte = idTypeCarte;
    }

    public String getCodeTypeCarte() {
        return codeTypeCarte;
    }

    public void setCodeTypeCarte(String codeTypeCarte) {
        this.codeTypeCarte = codeTypeCarte;
    }

    public String getLibelleTypeCarte() {
        return libelleTypeCarte;
    }

    public void setLibelleTypeCarte(String libelleTypeCarte) {
        this.libelleTypeCarte = libelleTypeCarte;
    }
}
