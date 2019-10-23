package com.brm.brmbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.brm.brmbank.entities.Virement;
import com.brm.brmbank.repository.VirementRepository;



public class VirementService {
	
	@Autowired
    private VirementRepository virement;
	
	
	public List<Virement> listAll() {
        return virement.findAll();
    }
     
    public void save(Virement virement) {
    	virement.save(virement);
    }
    
    public List<Virement> get(long id) {
        return virement.findAll();
    }
     
    public void delete(Virement id) {
    	virement.delete(id);
    }


}
