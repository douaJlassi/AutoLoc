package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Maintenance;
import tn.esprit.autoloc.domain.Paiement;
import tn.esprit.autoloc.service.IPaiementService;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/paiement")
public class PaiementController {

    private final IPaiementService paiementService;

    @PostMapping("/addPaiement")
    public Paiement addMaintenance(@RequestBody Paiement paiement){
        return paiementService.addPaiement( paiement);
    }

    @PutMapping("/updatePaiement")
    public Paiement updatePaiement(@RequestBody Paiement paiement){
        return paiementService.updatePaiement(paiement);
    }
    @GetMapping("/getAllPaiement")
    public List<Paiement> getPaiement(){
        return paiementService.getAllPaiements();
    }

    @GetMapping("/getPaiement/{id}")
    public Paiement getPaiementById(@PathVariable Long id){
        return paiementService.getPaiementById(id);
    }

    @DeleteMapping("/deletePaiement/{id}")
    public void deletePaiement(@PathVariable Long id){
        paiementService.deletePaiement(id);
    }
}
