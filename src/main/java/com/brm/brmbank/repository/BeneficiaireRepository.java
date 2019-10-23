package com.brm.brmbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brm.brmbank.entities.Beneficiaire;

@Repository
public interface BeneficiaireRepository extends JpaRepository<Beneficiaire, Long> {

}
