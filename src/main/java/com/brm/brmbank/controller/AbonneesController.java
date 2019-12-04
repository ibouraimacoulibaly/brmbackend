package com.brm.brmbank.controller;

import com.brm.brmbank.entities.Abonnees;
import com.brm.brmbank.repository.AbonneesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("abonnes")

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



	@PostMapping("delete")
	public ResponseEntity<Abonnees> delete(@RequestBody Abonnees abonnees) {
		abrp.delete(abonnees);
		return ResponseEntity.ok().body(abonnees);

	}
	@CrossOrigin("*")
	@GetMapping("details/{username}")
	public Optional<Abonnees> findOneByUsername(@PathVariable String username) {
		Optional<Abonnees> utilisateur = Optional.ofNullable(abrp.findOneByUsername(username));
		return utilisateur;

	}

    @PutMapping("modifier/{username}")
    public ResponseEntity<Abonnees> updateUtilisateur(@PathVariable String username, @RequestBody Abonnees abonnees) {
        System.out.println("Update Customer with ID = " + abonnees + "...");

        Optional<Abonnees> utilisateurData = Optional.ofNullable(abrp.findOneByUsername(username));

        if (utilisateurData.isPresent()) {
            Abonnees _abonnees = utilisateurData.get();
            _abonnees.setNom(abonnees.getNom());
            _abonnees.setIdAbonnes(abonnees.getIdAbonnes());
            _abonnees.setUsername(abonnees.getUsername());
            _abonnees.setPassword(abonnees.getPassword());
            _abonnees.setPrenom(abonnees.getPrenom());
            _abonnees.setEmail(abonnees.getEmail());
            _abonnees.setTelephone(abonnees.getTelephone());
            _abonnees.setIdClient(abonnees.getIdClient());
            _abonnees.setDateDerniereConnexion(abonnees.getDateDerniereConnexion());
            _abonnees.setAdresse(abonnees.getAdresse());
            _abonnees.setPays(abonnees.getPays());
            _abonnees.setVille(abonnees.getVille());
            _abonnees.setRegion(abonnees.getRegion());




            return new ResponseEntity<>(abrp.save(_abonnees), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
