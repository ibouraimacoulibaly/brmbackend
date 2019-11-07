package com.brm.brmbank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.brm.brmbank.entities.Agence;
import com.brm.brmbank.repository.AgenceRepository;

@RestController
@RequestMapping("agence")
public class AgenceController {
	
	@Autowired
	private AgenceRepository agencerepository;
	
	@RequestMapping(value ="",  method = RequestMethod.GET)
	public List<Agence> getAll() {
		return agencerepository.findAll();
		
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveAgence(@ModelAttribute("agencerepository") Agence agencerepository) {
		agencerepository.save(agencerepository);
	     
	    return "redirect:/";
	}

	
	
	@RequestMapping("/delete/{idAgence}")
	public ResponseEntity<String> deleteAgence(@PathVariable("idAgence") long idAgence) {
		System.out.println("Delete Customer with ID = " + idAgence + "...");

		agencerepository.deleteById(idAgence);

		return new ResponseEntity<>("L'agence a été supprimé", HttpStatus.OK);
	}
	
	//details 
	@GetMapping(value = "/details/{idAgence}")
	public Optional<Agence> findById(@PathVariable Long idAgence) {

		Optional<Agence> agence = agencerepository.findById(idAgence);
		return agence;
	}
}
