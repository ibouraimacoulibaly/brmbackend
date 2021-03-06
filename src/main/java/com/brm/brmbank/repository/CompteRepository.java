package com.brm.brmbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brm.brmbank.entities.Compte;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {

}
