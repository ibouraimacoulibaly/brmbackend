package com.brm.brmbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brm.brmbank.entities.Agence;
@Repository
public interface AgenceRepository extends JpaRepository<Agence, Long> {

}
