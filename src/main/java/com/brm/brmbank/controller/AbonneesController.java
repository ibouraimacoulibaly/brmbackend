package com.brm.brmbank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
	
	@PostMapping("save")
	public ResponseEntity<Abonnees> saveAbonnees(@RequestBody   Abonnees abonnees) {
		Abonnees user = abrp.save(abonnees);
		return ResponseEntity.ok().body(user);
	}


	
	@RequestMapping("/delete/{idAbonnees}")
	public ResponseEntity<String> deleteAbonnees(@PathVariable("idAgence") long idAbonnees) {
		System.out.println("Delete Customer with ID = " + idAbonnees + "...");

		abrp.deleteById(idAbonnees);

		return new ResponseEntity<>("L'abonnées a été supprimée", HttpStatus.OK);
	}
	
	//details 
			@GetMapping(value = "/details/{idAbonnees}")
			public Optional<Abonnees> findById(@PathVariable Long idAbonnees) {

				Optional<Abonnees> bene =abrp.findById(idAbonnees);
				return bene;
			}

}
