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

	
	@RequestMapping("/delete/{idParametre}")
	public ResponseEntity<String> deleteParametre(@PathVariable("idParametre") long idParametre) {
		System.out.println("Delete Customer with ID = " + idParametre + "...");

		parametrRepository.deleteById(idParametre);

		return new ResponseEntity<>("Parametre a été supprimée", HttpStatus.OK);
	}
	
	//details 
		@GetMapping(value = "/details/{idParametre}")
		public Optional<Parametre> findById(@PathVariable Long idParametre) {

			Optional<Parametre> parametre = parametrRepository.findById(idParametre);
			return parametre;
		}
}
