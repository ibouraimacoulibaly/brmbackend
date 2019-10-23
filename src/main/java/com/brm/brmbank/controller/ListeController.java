package com.brm.brmbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.brm.brmbank.entities.Liste;
import com.brm.brmbank.repository.ListeRepository;

@RestController
@RequestMapping("liste")
public class ListeController {
	
@Autowired ListeRepository liste;
	
	@RequestMapping(value ="",  method = RequestMethod.GET)
	public List<Liste> getAll() {
		return liste.findAll();
		
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveListe(@ModelAttribute("liste") Liste liste) {
	    liste.save(liste);
	     
	    return "redirect:/";
	}

 
}
