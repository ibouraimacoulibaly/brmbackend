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

import com.brm.brmbank.entities.Beneficiaire;
import com.brm.brmbank.repository.BeneficiaireRepository;




@RestController
@RequestMapping("beneficiaire")

public class BeneficiareController {
	@Autowired
	private BeneficiaireRepository beneficiaire;
	
	
	@RequestMapping(value ="", method = RequestMethod.GET)
	public List<Beneficiaire> getAll() {
		return beneficiaire.findAll();
	}
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String saveBeneficiaire(@ModelAttribute(" beneficiaire")  Beneficiaire  beneficiaire) {
		 beneficiaire.save(beneficiaire);
	     
	    return "redirect:/";
	}

	@RequestMapping("/delete/{idBeneficiaire}")
	public ResponseEntity<String> deleteBeneficiaire(@PathVariable("idBeneficiaire") long idBeneficiaire) {
		System.out.println("Delete Customer with ID = " + idBeneficiaire + "...");

		beneficiaire.deleteById(idBeneficiaire);

		return new ResponseEntity<>("L'abonnées a été supprimée", HttpStatus.OK);
	}
	
	//details 
		@GetMapping(value = "/details/{idBeneficiaire}")
		public Optional<Beneficiaire> findById(@PathVariable Long idBeneficiaire) {

			Optional<Beneficiaire> bene =beneficiaire.findById(idBeneficiaire);
			return bene;
		}
}
