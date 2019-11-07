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

import com.brm.brmbank.entities.Gabs;
import com.brm.brmbank.repository.GabsRepository;

@RestController
@RequestMapping("gabs")
public class GabsController {
	
	@Autowired
	private GabsRepository gabsrepository;
	
	@RequestMapping(value ="",  method = RequestMethod.GET)
	public List<Gabs> getAll() {
		return gabsrepository.findAll();
		
	}
	

	
	@RequestMapping("/delete/{idGabs}")
	public ResponseEntity<String> deleteGabs(@PathVariable("idGabs") long idGabs) {
		System.out.println("Delete Customer with ID = " + idGabs + "...");

		gabsrepository.deleteById(idGabs);

		return new ResponseEntity<>("le gabs a été supprimée", HttpStatus.OK);
	}
	
	
	//details 
	@GetMapping(value = "/details/{idGabs}")
	public Optional<Gabs> findById(@PathVariable Long idGabs) {

		Optional<Gabs> gabs = gabsrepository.findById(idGabs);
		return gabs;
	}

}
