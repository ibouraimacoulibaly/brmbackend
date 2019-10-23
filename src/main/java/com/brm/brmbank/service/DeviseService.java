package com.brm.brmbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.brm.brmbank.entities.Devise;

import com.brm.brmbank.repository.DeviseRepository;


public class DeviseService {
	
	@Autowired
    private DeviseRepository devise;
	
	
	public Iterable<Devise> listAll() {
        return devise.findAll();
    }
     
    public void save(Devise devise) {
    	devise.save(devise);
    }
    
    public Iterable<Devise> get(long id) {
        return devise.findAll();
    }
     
    public void delete(Devise id) {
    	devise.delete(id);
    }

	public List<Devise> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
