package com.brm.brmbank.controller;

import com.brm.brmbank.entities.Devise;
import com.brm.brmbank.repository.DeviseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
	@CrossOrigin("*")
	@GetMapping("details/{codeDevise}")
	public Optional<Devise> findOneByCodeDevise(@PathVariable String codeDevise) {

		Optional<Devise> dev = Optional.ofNullable(devise.findOneByCodeDevise(codeDevise));
		return dev;

	}
	@PutMapping("modifier/{codeDevise}")
	public ResponseEntity<Devise> updateDevise(@PathVariable String codeDevise, @RequestBody Devise devis) {
		System.out.println("Update Customer with ID = " + devis + "...");

		Optional<Devise> utilisateurData = Optional.ofNullable(devise.findOneByCodeDevise(codeDevise));

		if (utilisateurData.isPresent()) {
			Devise _gabs = utilisateurData.get();
			_gabs.setSymbole(_gabs.getSymbole());
			_gabs.setIdDevise(_gabs.getIdDevise());
			_gabs.setCode(_gabs.getCodeDevise());

			return new ResponseEntity<>(devise.save(_gabs), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
