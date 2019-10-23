package com.brm.brmbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.brm.brmbank.entities.Agence;
import com.brm.brmbank.repository.AgenceRepository;

@RestController
@RequestMapping("agence")
public class AgenceController {
	
	@Autowired
	private AgenceRepository agencerepository;
	
	@RequestMapping(value ="",  method = RequestMethod.GET)
	public List<Agence> getAll() {
		return agencerepository.findAll();
		
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveAgence(@ModelAttribute("agencerepository") Agence agencerepository) {
		agencerepository.save(agencerepository);
	     
	    return "redirect:/";
	}

}
