package com.brm.brmbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brm.brmbank.entities.Virement;

@Repository
public interface VirementRepository extends JpaRepository<Virement, Long> {

}
