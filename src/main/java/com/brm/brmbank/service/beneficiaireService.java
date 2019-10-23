package com.brm.brmbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.brm.brmbank.entities.Beneficiaire;
import com.brm.brmbank.repository.BeneficiaireRepository;

public class beneficiaireService {
	@Autowired
    private BeneficiaireRepository beneficiaire;
	
	
	public List<Beneficiaire> listAll() {
        return beneficiaire.findAll();
    }
     
    public void save(Beneficiaire beneficiaire) {
    	beneficiaire.save(beneficiaire);
    }
    
    public List<Beneficiaire> get(long id) {
        return beneficiaire.findAll();
    }
     
    public void delete(Beneficiaire id) {
    	beneficiaire.delete(id);
    }

}
