package com.brm.brmbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brm.brmbank.entities.Gabs;

@Repository
public interface GabsRepository extends JpaRepository<Gabs, Long>{

    public Gabs findOneByCode(String code);
}
