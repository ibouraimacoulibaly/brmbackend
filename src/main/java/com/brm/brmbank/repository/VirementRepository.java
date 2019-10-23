package com.brm.brmbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.brm.brmbank.entities.Virement;

public interface VirementRepository extends JpaRepository<Virement, Long> {

}
