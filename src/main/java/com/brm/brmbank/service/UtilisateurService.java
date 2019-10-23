package com.brm.brmbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.brm.brmbank.entities.Utilisateur;
import com.brm.brmbank.repository.UtilisateurRepository;


public class UtilisateurService {

	@Autowired
    private UtilisateurRepository repo;
	
	
	public List<Utilisateur> listAll() {
        return repo.findAll();
    }
     
    public void save(Utilisateur utilisateur) {
        repo.save(utilisateur);
    }
    
    public List<Utilisateur> get(long id) {
        return repo.findAll();
    }
     
    public void delete(Utilisateur id) {
        repo.delete(id);
    }
	

}
