package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.service.IAgenceService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/agence")

public class AgenceController {

    private final IAgenceService agenceService;

    @GetMapping("/getAllAgences")
    public List<Agence> getAgences(){
        return agenceService.getAgences();
    }

    @PostMapping("/addAgence")
    public Agence addAgence(@RequestBody Agence agence){
        return agenceService.addAgence(agence);
    }

    @PutMapping("/updateAgence")
    public Agence updateAgence(@RequestBody Agence agence){
        return agenceService.updateAgence(agence);
    }
    @GetMapping("/getAgence/{id}")
    public Agence getAgenceById(@PathVariable Long id){
        return agenceService.getAgenceById(id);
    }

    @DeleteMapping("/deleteAgence/{id}")
    public void deleteAgence(@PathVariable Long id){
        agenceService.deleteAgence(id);
    }
}
