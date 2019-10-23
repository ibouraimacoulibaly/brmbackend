package com.brm.brmbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.brm.brmbank.entities.Abonnees;
import com.brm.brmbank.repository.AbonneesRepository;


@RestController
@RequestMapping("abonnees")

public class AbonneesController {
	
	@Autowired AbonneesRepository abrp;
	
	@RequestMapping(value ="",  method = RequestMethod.GET)
	public List<Abonnees> getAll() {
		return abrp.findAll();
		
	}
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String saveAbonnees(@ModelAttribute("abonnees") Abonnees abonnees) {
	    abonnees.save(abonnees);
	     
	    return "redirect:/";
	}

}
