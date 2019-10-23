package com.brm.brmbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.brm.brmbank.entities.Compte;
import com.brm.brmbank.repository.CompteRepository;

@RestController
@RequestMapping("compte")
public class CompteController {
	
	@Autowired
	private CompteRepository compte;
	
	
	@GetMapping
	public List<Compte> getAll() {
		return compte.findAll();
    }
	
	
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String saveCompte(@ModelAttribute("compte") Compte compte) {
	    compte.save(compte);
	     
	    return "redirect:/";
	}

}
