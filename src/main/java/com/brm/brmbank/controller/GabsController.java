package com.brm.brmbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.brm.brmbank.entities.Gabs;
import com.brm.brmbank.repository.GabsRepository;

@RestController
@RequestMapping("gabs")
public class GabsController {
	
	@Autowired
	private GabsRepository gabsrepository;
	
	@RequestMapping(value ="",  method = RequestMethod.GET)
	public List<Gabs> getAll() {
		return gabsrepository.findAll();
		
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveGabs(@ModelAttribute("gabsrepository") Gabs gabsrepository) {
		gabsrepository.save(gabsrepository);
	     
	    return "redirect:/";
	}

}
