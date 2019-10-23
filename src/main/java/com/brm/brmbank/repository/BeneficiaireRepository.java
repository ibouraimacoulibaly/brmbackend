package com.brm.brmbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brm.brmbank.entities.Beneficiaire;

public interface BeneficiaireRepository extends JpaRepository<Beneficiaire, Long> {

}
