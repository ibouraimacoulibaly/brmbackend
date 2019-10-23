package com.brm.brmbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brm.brmbank.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, Long> {

}
