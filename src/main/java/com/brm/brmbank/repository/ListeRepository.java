package com.brm.brmbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brm.brmbank.entities.Liste;

@Repository
public interface ListeRepository extends JpaRepository<Liste, Long>  {

}
