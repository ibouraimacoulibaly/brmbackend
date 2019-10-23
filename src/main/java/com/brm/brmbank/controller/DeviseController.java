package com.brm.brmbank.controller;





import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.brm.brmbank.entities.Devise;
import com.brm.brmbank.repository.DeviseRepository;



@RestController

@RequestMapping("devise")
public class DeviseController {
	
	
	
	@Autowired
	private DeviseRepository devise;
	
	
	@GetMapping
	public Iterable<Devise> getAll() {
		return devise.findAll();
    }
	
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveDevise(@ModelAttribute("devise") Devise devise) {
	    devise.save(devise);
	     
	    return "redirect:/";
	}

}
