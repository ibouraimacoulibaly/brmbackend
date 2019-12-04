package com.brm.brmbank.controller;

import com.brm.brmbank.entities.Gabs;
import com.brm.brmbank.repository.GabsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("gabs")
public class GabsController {
	
	@Autowired
	private GabsRepository gabsrepository;
	
	@RequestMapping(value ="",  method = RequestMethod.GET)
	public List<Gabs> getAll() {
		return gabsrepository.findAll();
		
	}



	@PostMapping("save")
	public ResponseEntity<Gabs> saveAbonnees(@RequestBody   Gabs gabs) {
		Gabs user = gabsrepository.save(gabs);
		return ResponseEntity.ok().body(user);
	}



	@PostMapping("delete")
	public ResponseEntity<Gabs> delete(@RequestBody Gabs gabs) {
		gabsrepository.delete(gabs);
		return ResponseEntity.ok().body(gabs);

	}
	@CrossOrigin("*")
	@GetMapping("details/{code}")
	public Optional<Gabs> findOneByCode(@PathVariable String code) {
		Optional<Gabs> utilisateur = Optional.ofNullable(gabsrepository.findOneByCode(code));
		return utilisateur;

	}

	@PutMapping("modifier/{code}")
	public ResponseEntity<Gabs> updateUtilisateur(@PathVariable String code, @RequestBody Gabs gabs) {
		System.out.println("Update Customer with ID = " + gabs + "...");

		Optional<Gabs> utilisateurData = Optional.ofNullable(gabsrepository.findOneByCode(code));

		if (utilisateurData.isPresent()) {
			Gabs _gabs = utilisateurData.get();
			_gabs.setCode(gabs.getCode());
			_gabs.setIdGabs(gabs.getIdGabs());
			_gabs.setNomGabs(gabs.getNomGabs());
			_gabs.setCoordonneesGps(gabs.getCoordonneesGps());
			_gabs.setEtat(gabs.getEtat());
			_gabs.setAdressePostale(gabs.getAdressePostale());




			return new ResponseEntity<>(gabsrepository.save(_gabs), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
