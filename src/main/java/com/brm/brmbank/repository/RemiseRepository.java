package com.brm.brmbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brm.brmbank.entities.Remise;

@Repository
public interface RemiseRepository extends JpaRepository<Remise, Long> {

}
