package com.brm.brmbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.brm.brmbank.entities.Abonnees;
import com.brm.brmbank.repository.AbonneesRepository;


public class AbonneesService {
	
	@Autowired
    private AbonneesRepository repo;
	
	
	public List<Abonnees> listAll() {
        return repo.findAll();
    }
     
    public void save(Abonnees abonnees) {
        repo.save(abonnees);
    }
    
    public List<Abonnees> get(long id) {
        return repo.findAll();
    }
     
    public void delete(Abonnees id) {
        repo.delete(id);
    }

}
