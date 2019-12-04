package com.brm.brmbank.repository;


import com.brm.brmbank.entities.Devise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DeviseRepository extends JpaRepository<Devise, Long> {



    public Devise findOneByCodeDevise(String codeDevise);


}
