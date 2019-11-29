package com.brm.brmbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brm.brmbank.entities.Abonnees;

@Repository
public interface AbonneesRepository extends JpaRepository<Abonnees, Long> {

    public Abonnees findOneByUsername(String username);
}
