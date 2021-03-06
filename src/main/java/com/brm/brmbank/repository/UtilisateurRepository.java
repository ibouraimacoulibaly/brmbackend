package com.brm.brmbank.repository;


import com.brm.brmbank.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

    public Utilisateur findOneByUsername(String username);



}
