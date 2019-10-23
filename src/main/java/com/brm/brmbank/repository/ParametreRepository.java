package com.brm.brmbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brm.brmbank.entities.Parametre;
@Repository
public interface ParametreRepository extends JpaRepository<Parametre, Long>{

}
