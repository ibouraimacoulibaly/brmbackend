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
import com.brm.brmbank.entities.Compte;
import com.brm.brmbank.repository.CompteRepository;

@RestController
@RequestMapping("compte")
public class CompteController {
	
	@Autowired
	private CompteRepository compte;
	
	/*
	@GetMapping
	public List<Compte> getAll() {
		return compte.findAll();
    }
	
	
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String saveCompte(@ModelAttribute("compte") Compte compte) {
	    compte.save(compte);
	     
	    return "redirect:/";
	}

	@RequestMapping("/delete/{idCompte}")
	public ResponseEntity<String> deleteCompte(@PathVariable("idCompte") long idCompte) {
		System.out.println("Delete Customer with ID = " + idCompte + "...");

		compte.deleteById(idCompte);

		return new ResponseEntity<>("le compte a été supprimée", HttpStatus.OK);
	}
	
	//details 
		@GetMapping(value = "/details/{idCompte}")
		public Optional<Compte> findById(@PathVariable Long idCompte) {

			Optional<Compte> comp = compte.findById(idCompte);
			return comp;
		}*/
}
