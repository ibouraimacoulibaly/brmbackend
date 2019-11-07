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

import com.brm.brmbank.entities.Virement;
import com.brm.brmbank.repository.VirementRepository;

@RestController
@RequestMapping("virement")
public class VirementController {
	
	@Autowired
	private VirementRepository virement;
	
	
	@RequestMapping(value ="", method = RequestMethod.GET)
	public List<Virement> getAll() {
		return virement.findAll();
		
	}
	
	

  
	@RequestMapping("/delete/{idVirement}")
	public ResponseEntity<String> deleteVirement(@PathVariable("idVirement") long idVirement) {
		System.out.println("Delete Customer with ID = " + idVirement + "...");

		virement.deleteById(idVirement);

		return new ResponseEntity<>("Virement a été supprimée", HttpStatus.OK);
	}
	
	//details 
	@GetMapping(value = "/details/{idVirement}")
	public Optional<Virement> findById(@PathVariable Long idVirement) {

		Optional<Virement> vire = virement.findById(idVirement);
		return vire;
	}
}
