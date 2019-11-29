package com.brm.brmbank.controller;

import com.brm.brmbank.entities.Devise;
import com.brm.brmbank.repository.DeviseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@CrossOrigin
@RestController
@RequestMapping("devise")
public class DeviseController {
	
	
	
	@Autowired
	private DeviseRepository devise;
	
	
	@GetMapping
	public Iterable<Devise> getAll() {
		return devise.findAll();
    }


	@PostMapping("save")
	public ResponseEntity<Devise> saveDevise(@RequestBody   Devise devise1) {
		Devise dev = devise.save(devise1);
		return ResponseEntity.ok().body(dev);
	}



	@PostMapping("delete")
	public ResponseEntity<Devise> delete(@RequestBody Devise devis) {
		devise.delete(devis);
		return ResponseEntity.ok().body(devis);

	}
	
	//details 
			@GetMapping(value = "/details/{idDevise}")
			public Optional<Devise> findById(@PathVariable Long idDevise) {

				Optional<Devise> dev = devise.findById(idDevise);
				return dev;
			}

}
