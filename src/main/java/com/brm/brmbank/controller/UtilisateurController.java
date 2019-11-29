package com.brm.brmbank.controller;


import com.brm.brmbank.entities.Utilisateur;
import com.brm.brmbank.repository.UtilisateurRepository;
import netscape.security.Principal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("utilisateur")
public class UtilisateurController {

    @Autowired
    private UtilisateurRepository utilisateurRepository;


    public static final Logger logger = LoggerFactory.getLogger(UtilisateurController.class);

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Utilisateur> getAll() {
        return utilisateurRepository.findAll();

    }


    @PostMapping("save")
    public ResponseEntity<Utilisateur> saveUtilisateur(@RequestBody Utilisateur utilisateur) {

        Utilisateur user = utilisateurRepository.save(utilisateur);
        return ResponseEntity.ok().body(user);
    }

    //LOGIN
    @RequestMapping("/login")
    public Principal users(Principal principal) {
        logger.info("user logged " + principal);
        return principal;
    }


    //supprimer un  utilisateur

    /*@RequestMapping("/delete/{idUtilisateur}")
    public ResponseEntity<String> deleteUser(@PathVariable("idUtilisateur") long id) {
        //System.out.println("Delete Customer with ID = " + idUtilisateur + "...");
        utilisateurRepository.deleteById(id);

        return new ResponseEntity<>("L'utilisateur a été supprimé!", HttpStatus.OK);
    }*/
    @PostMapping("delete")
    public ResponseEntity<Utilisateur> delete(@RequestBody Utilisateur user) {
        utilisateurRepository.delete(user);
        return ResponseEntity.ok().body(user);

    }
    @CrossOrigin("*")
    @GetMapping("details/{username}")
    public Optional<Utilisateur> findOneByUsername(@PathVariable String username) {
        Optional<Utilisateur> utilisateur = Optional.ofNullable(utilisateurRepository.findOneByUsername(username));
        return utilisateur;

    }

    /*//details
    @GetMapping(value = "/details/{idUtilisateur}")
    public Optional<Utilisateur> findById(@PathVariable Long idUtilisateur) {

        Optional<Utilisateur> utilisateur = utilisateurRepository.findById(idUtilisateur);
        return utilisateur;
    }*/


    @PutMapping("modifier/{username}")
    public ResponseEntity<Utilisateur> updateUtilisateur(@PathVariable String username, @RequestBody Utilisateur utilisateur) {
        System.out.println("Update Customer with ID = " + utilisateur + "...");

        Optional<Utilisateur> utilisateurData = Optional.ofNullable(utilisateurRepository.findOneByUsername(username));

        if (utilisateurData.isPresent()) {
            Utilisateur _utilisateur = utilisateurData.get();
            _utilisateur.setNom(utilisateur.getNom());
            _utilisateur.setIdUtilisateur(utilisateur.getIdUtilisateur());
            _utilisateur.setUsername(utilisateur.getUsername());
            _utilisateur.setPassword(utilisateur.getPassword());
            _utilisateur.setPrenom(utilisateur.getPrenom());
            _utilisateur.setEmail(utilisateur.getEmail());
            _utilisateur.setFonction(utilisateur.getFonction());
            _utilisateur.setDepartement(utilisateur.getDepartement());
            _utilisateur.setProfil(utilisateur.getProfil());
            _utilisateur.setTelephone(utilisateur.getTelephone());
            _utilisateur.setStatus(utilisateur.getStatus());
            _utilisateur.setMatricule(utilisateur.getMatricule());

            return new ResponseEntity<>(utilisateurRepository.save(_utilisateur), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
