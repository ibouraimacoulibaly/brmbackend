package com.brm.brmbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.brm.brmbank.entities.Virement;
import com.brm.brmbank.repository.VirementRepository;

@RestController
@RequestMapping("virement")
public class VirementController {
	
	@Autowired
	private VirementRepository virement;
	
	
	@RequestMapping(value ="", method = RequestMethod.GET)
	public List<Virement> getAll() {
		return virement.findAll();
		
	}
	
	
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String saveVirement(@ModelAttribute("virement") Virement virement) {
	    virement.save(virement);
	     
	    return "redirect:/";
	}

}
