package com.brm.brmbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.brm.brmbank.entities.Parametre;
import com.brm.brmbank.repository.ParametreRepository;

@RestController
@RequestMapping("parametre")
public class ParametreController {
    
	@Autowired
	private ParametreRepository parametrRepository;
	
	@RequestMapping(value ="",  method = RequestMethod.GET)
	public List<Parametre> getAll() {
		return parametrRepository.findAll();
		
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveParametre(@ModelAttribute("parametrRepository") Parametre parametrRepository) {
		parametrRepository.save(parametrRepository);
	     
	    return "redirect:/";
	}
}
