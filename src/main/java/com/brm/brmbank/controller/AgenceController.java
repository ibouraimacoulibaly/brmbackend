package com.brm.brmbank.controller;

import com.brm.brmbank.entities.Agence;
import com.brm.brmbank.repository.AgenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("agence")
public class AgenceController {

    @Autowired
    private AgenceRepository agencerepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Agence> getAll() {
        return agencerepository.findAll();

    }

    @PostMapping("save")
    public ResponseEntity<Agence> saveUtilisateur(@RequestBody Agence agence) {

        Agence user = agencerepository.save(agence);
        return ResponseEntity.ok().body(user);
    }


    @PostMapping("delete")
    public ResponseEntity<Agence> delete(@RequestBody Agence agence) {
        agencerepository.delete(agence);
        return ResponseEntity.ok().body(agence);

    }

    @CrossOrigin("*")
    @GetMapping("details/{codeAgence}")
    public Optional<Agence> findByCodeAgence(@PathVariable String codeAgence) {
        Optional<Agence> agence = Optional.ofNullable(agencerepository.findByCodeAgence(codeAgence));
        return agence;

    }

    @PutMapping("modifier/{codeAgence}")
    public ResponseEntity<Agence> updateUtilisateur(@PathVariable String codeAgence, @RequestBody Agence agence) {
        System.out.println("Update Customer with ID = " + agence + "...");

        Optional<Agence> agenceData = Optional.ofNullable(agencerepository.findByCodeAgence(codeAgence));

        if (agenceData.isPresent()) {
            Agence _agence = agenceData.get();
            _agence.setNom(agence.getNom());
            _agence.setIdAgence(agence.getIdAgence());
            _agence.setAdressePostale(agence.getAdressePostale());
            _agence.setCodeAgence(agence.getCodeAgence());
            _agence.setHoraire(agence.getHoraire());
            _agence.setTelephone(agence.getTelephone());
            _agence.setCoordonneesGps(agence.getCoordonneesGps());

            return new ResponseEntity<>(agencerepository.save(_agence), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
