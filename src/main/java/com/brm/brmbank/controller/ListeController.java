package com.brm.brmbank.controller;

import com.brm.brmbank.entities.Liste;
import com.brm.brmbank.repository.ListeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("liste")
public class ListeController {
	
@Autowired ListeRepository liste;
	
	@RequestMapping(value ="",  method = RequestMethod.GET)
	public List<Liste> getAll() {
		return liste.findAll();
		
	}

	@PostMapping("save")
	public ResponseEntity<Liste> saveUtilisateur(@RequestBody   Liste list) {
		Liste listes = liste.save(list);
		return ResponseEntity.ok().body(listes);
	}


	    //details 
		@GetMapping(value = "/details/{idListe}")
		public Optional<Liste> findById(@PathVariable Long idListe) {

			Optional<Liste> gabs = liste.findById(idListe);
			return gabs;
		}
}
