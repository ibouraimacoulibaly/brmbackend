package com.brm.brmbank.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.brm.brmbank.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {


}
