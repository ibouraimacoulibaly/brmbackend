package com.brm.brmbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.brm.brmbank.entities.Remise;
import com.brm.brmbank.repository.RemiseRepository;

@RestController
@RequestMapping("remise")
public class RemiseController {
	
	@Autowired
	private RemiseRepository remise;
	
	
	@GetMapping
	public List<Remise> getAll() {
		return remise.findAll();
    }
	
	
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String saveRemise(@ModelAttribute("remise") Remise remise) {
	    remise.save(remise);
	     
	    return "redirect:/";
	}

}
