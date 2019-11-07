package com.brm.brmbank.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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



	@PostMapping("save")
	public ResponseEntity<Remise> saveRemise (@RequestBody Remise remi ){
		Remise rem = remise.save(remi);
	    return ResponseEntity.ok().body(rem);
	}
	
	@RequestMapping("/delete/{idRemise}")
	public ResponseEntity<String> deleteRemise(@PathVariable("idParametre") long idRemise) {
		System.out.println("Delete Customer with ID = " + idRemise + "...");

		remise.deleteById(idRemise);

		return new ResponseEntity<>("Remise a été supprimée", HttpStatus.OK);
	}
	
	
	        //details 
			@GetMapping(value = "/details/{idRemise}")
			public Optional<Remise> findById(@PathVariable Long idRemise) {

				Optional<Remise> rem = remise.findById(idRemise);
				return rem;
			}
}
