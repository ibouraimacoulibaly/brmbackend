package com.brm.brmbank.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "chargement_cours_devises")
public class ChargementCoursDevise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChargementCoursDevise;

    @Column(name = "date_chargement_cours_devises")
    private Date dateChargementCoursDevise;

    @Column(name = "devise_reference")
    private String deviseReference;

    public ChargementCoursDevise() {
    }

    public long getIdChargementCoursDevise() {
        return idChargementCoursDevise;
    }

    public void setIdChargementCoursDevise(long idChargementCoursDevise) {
        this.idChargementCoursDevise = idChargementCoursDevise;
    }

    public Date getDateChargementCoursDevise() {
        return dateChargementCoursDevise;
    }

    public void setDateChargementCoursDevise(Date dateChargementCoursDevise) {
        this.dateChargementCoursDevise = dateChargementCoursDevise;
    }

    public String getDeviseReference() {
        return deviseReference;
    }

    public void setDeviseReference(String deviseReference) {
        this.deviseReference = deviseReference;
    }
}
