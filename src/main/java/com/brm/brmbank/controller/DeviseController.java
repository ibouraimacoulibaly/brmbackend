package com.brm.brmbank.controller;

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
	
	
	

	
	@RequestMapping("/delete/{idDevise}")
	public ResponseEntity<String> deleteDevise(@PathVariable("idDevise") long idDevise) {
		System.out.println("Delete Customer with ID = " + idDevise + "...");

		devise.deleteById(idDevise);

		return new ResponseEntity<>("le compte a été supprimée", HttpStatus.OK);
	}
	
	//details 
			@GetMapping(value = "/details/{idDevise}")
			public Optional<Devise> findById(@PathVariable Long idDevise) {

				Optional<Devise> dev = devise.findById(idDevise);
				return dev;
			}

}
