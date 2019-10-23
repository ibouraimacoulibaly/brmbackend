package com.brm.brmbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.brm.brmbank.entities.Beneficiaire;

import com.brm.brmbank.repository.BeneficiaireRepository;




@RestController
@RequestMapping("beneficiaire")

public class BeneficiareController {
	@Autowired
	private BeneficiaireRepository beneficiaire;
	
	
	@RequestMapping(value ="", method = RequestMethod.GET)
	public List<Beneficiaire> getAll() {
		return beneficiaire.findAll();
	}
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String saveBeneficiaire(@ModelAttribute(" beneficiaire")  Beneficiaire  beneficiaire) {
		 beneficiaire.save(beneficiaire);
	     
	    return "redirect:/";
	}

}
