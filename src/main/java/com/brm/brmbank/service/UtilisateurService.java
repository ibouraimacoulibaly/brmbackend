package com.brm.brmbank.service;

import com.brm.brmbank.entities.Utilisateur;
import com.brm.brmbank.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurService {
	@Autowired
	UtilisateurRepository utilisateurRepository;

	public Utilisateur find(String username) {
		return utilisateurRepository.findOneByUsername(username);
	}


}
