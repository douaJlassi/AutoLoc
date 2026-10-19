package tn.esprit.autoloc.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Vehicule;
import tn.esprit.autoloc.service.IVehiculeServiceImpl;

import java.util.List;

@AllArgsConstructor
@RestController("/Vehicule")
@Tag(name="gestion de Vehicule ", description = "CRUD")

public class VehiculeController {

    private final IVehiculeServiceImpl vehiculeService;

    @GetMapping("/getAllVehicules")
    public List<Vehicule> getVehicule(){
        return vehiculeService.getAllVehicule();
    }

    @Operation(summary = "Ajouter une vehicule")
    @PostMapping("/addVehicule")
    public Vehicule addVehicule(@RequestBody Vehicule vehicule){
        return vehiculeService.addVehicule(vehicule);
    }

    @PutMapping("/updateVehicule")
    public Vehicule updateVehicule(@RequestBody Vehicule vehicule){
        return vehiculeService.updateVehicule(vehicule);
    }
    @GetMapping("/getVehicule/{id}")
    public Vehicule getVehiculeById(@PathVariable Long id){
        return vehiculeService.getVehiculeById(id);
    }

    @DeleteMapping("/deleteVehicule/{id}")
    public void deleteVehicule(@PathVariable Long id){
        vehiculeService.deleteVehicule(id);
    }

}
