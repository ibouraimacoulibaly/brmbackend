package com.brm.brmbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.brm.brmbank.entities.Utilisateur;
import com.brm.brmbank.repository.UtilisateurRepository;




@Controller
@RequestMapping("utilisateur")
public class UtilisateurController {

	@Autowired
	private UtilisateurRepository service;
	
	@RequestMapping(value ="", method = RequestMethod.GET)
	public List<Utilisateur> getAll() {
		return service.findAll();
		
	}
	
	
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String saveUtilisateur(@ModelAttribute("utilisateur") Utilisateur utilisateur) {
	    service.save(utilisateur);
	     
	    return "redirect:/";
	}
}
