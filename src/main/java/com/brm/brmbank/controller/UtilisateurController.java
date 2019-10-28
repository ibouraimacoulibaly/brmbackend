package com.brm.brmbank.controller;

import java.security.Principal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.brm.brmbank.entities.Utilisateur;
import com.brm.brmbank.repository.UtilisateurRepository;





@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("utilisateur")
public class UtilisateurController {

	@Autowired
	private UtilisateurRepository utilisateurRepository;
	
	public static final Logger logger = LoggerFactory.getLogger(UtilisateurController.class);
	
	@RequestMapping(value ="", method = RequestMethod.GET)
	public List<Utilisateur> getAll() {
		return utilisateurRepository.findAll();
		
	}
	
	
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String saveUtilisateur(@ModelAttribute("utilisateur") Utilisateur utilisateur) {
		utilisateurRepository.save(utilisateur);
	     
	    return "redirect:/";
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/login")
	public Principal user(Principal principal) {
		logger.info("user logged "+principal);
		return principal;
	}
	
	@DeleteMapping(value = "/{id}/delete")
    @ResponseStatus(value = HttpStatus.OK)
    public String deleteUtilisateur(@PathVariable("id") Long idUtilisateur, final RedirectAttributes redirectAttributes) {

        logger.debug("Delete user with Id {}", idUtilisateur);

        redirectAttributes.addFlashAttribute("css", "Success");
        redirectAttributes.addFlashAttribute("msg", "The user is deleted");

        // delete the user
        utilisateurRepository.deleteById(idUtilisateur);
        return "redirect:/";
    }
	
}
