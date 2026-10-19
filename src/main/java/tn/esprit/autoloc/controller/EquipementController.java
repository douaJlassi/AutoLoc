package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Equipement;
import tn.esprit.autoloc.service.IEquipementService;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/equipement")
public class EquipementController {

    private final IEquipementService equipementService;

    @PostMapping("/addEquipement")
    public Equipement addEquipement(@RequestBody Equipement equipement){
        return equipementService.addEquipement( equipement);
    }

    @PutMapping("/updateEquipement")
    public Equipement updateEquipement(@RequestBody Equipement equipement){
        return equipementService.updateEquipement(equipement);
    }
    @GetMapping("/getAllEquipement")
    public List<Equipement> getEquipement(){
        return equipementService.getAllEquipement();
    }

    @GetMapping("/getEquipement/{id}")
    public Equipement getEquipementById(@PathVariable Long id){
        return equipementService.getEquipement(id);
    }

    @DeleteMapping("/deleteEquipement/{id}")
    public void deleteEquipement(@PathVariable Long id){
        equipementService.deleteEquipement(id);
    }
}
