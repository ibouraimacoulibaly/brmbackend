package com.brm.brmbank.controller;


import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brm.brmbank.entities.Utilisateur;
import com.brm.brmbank.repository.UtilisateurRepository;









@CrossOrigin
@RestController
@RequestMapping("utilisateur")
public class UtilisateurController {

	@Autowired
	private UtilisateurRepository utilisateurRepository;
	
	public static final Logger logger = LoggerFactory.getLogger(UtilisateurController.class);
	
	@GetMapping
	public List<Utilisateur> getAll() {
		return utilisateurRepository.findAll();
		
	}
	
	@PostMapping("save")
	public ResponseEntity<Utilisateur> saveUtilisateur(@RequestBody   Utilisateur utilisateur) {
		Utilisateur user = utilisateurRepository.save(utilisateur);
	    return ResponseEntity.ok().body(user);
	}
	
	//LOGIN
	/*@GetMapping(produces = "application/json")
	 @RequestMapping("/login")
	public Principal user(Principal principal) {
		logger.info("user logged "+principal);
		return principal;
	}*/
	
	
	
	
	@GetMapping(produces = "application/json")
	@RequestMapping({ "/login" })
	public Utilisateur login() {
		return new Utilisateur("User successfully authenticated");
	}
	
	
	
	
	
	//supprimer un  utilisateur
	@RequestMapping("/delete/{idUtilisateur}")
	public ResponseEntity<String> deleteUser(@PathVariable("idUtilisateur") long idUtilisateur) {
		System.out.println("Delete Customer with ID = " + idUtilisateur + "...");

		utilisateurRepository.deleteById(idUtilisateur);

		return new ResponseEntity<>("L'utilisateur a été supprimé!", HttpStatus.OK);
	}
	
	//details 
	@GetMapping(value = "/details/{idUtilisateur}")
	public Optional<Utilisateur> findById(@PathVariable Long idUtilisateur) {

		Optional<Utilisateur> utilisateur = utilisateurRepository.findById(idUtilisateur);
		return utilisateur;
	}
	
	
	
	@RequestMapping("/modifier/{idUtilisateur}")
	public ResponseEntity<Utilisateur> updateUtilisateur(@PathVariable("idUtilisateur") long idUtilisateur, @RequestBody Utilisateur utilisateur) {
		System.out.println("Update Customer with ID = " + idUtilisateur + "...");

		Optional<Utilisateur> utilisateurData = utilisateurRepository.findById(idUtilisateur);

		if (utilisateurData.isPresent()) {
			Utilisateur _utilisateur = utilisateurData.get();
			_utilisateur.setNom(utilisateur.getNom());
			_utilisateur.setUsername(utilisateur.getUsername());
			_utilisateur.setPassword(utilisateur.getPassword());
			_utilisateur.setEmail(utilisateur.getEmail());
			_utilisateur.setFonction(utilisateur.getFonction());
			_utilisateur.setDepartement(utilisateur.getDepartement());
			_utilisateur.setProfil(utilisateur.getProfil());
			_utilisateur.setTelephone(utilisateur.getTelephone());
			
			
			
			return new ResponseEntity<>(utilisateurRepository.save(_utilisateur), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
