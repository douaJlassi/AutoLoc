package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Maintenance;
import tn.esprit.autoloc.service.IMaintenanceService;

import java.util.List;

@RequestMapping("/maintenance")
@RestController
@AllArgsConstructor
public class MaintenanceController {

    private final IMaintenanceService maintenanceService;

    @PostMapping("/addMaintenance")
    public Maintenance addMaintenance(@RequestBody Maintenance maintenance){
        return maintenanceService.addMaintenance( maintenance);
    }

    @PutMapping("/updateMaintenance")
    public Maintenance updateMaintenance(@RequestBody Maintenance maintenance){
        return maintenanceService.updateMaintenance(maintenance);
    }
    @GetMapping("/getAllMaintenance")
    public List<Maintenance> getMaintenance(){
        return maintenanceService.getAllMaintenances();
    }

    @GetMapping("/getMaintenance/{id}")
    public Maintenance getMaintenanceById(@PathVariable Long id){
        return maintenanceService.getMaintenanceById(id);
    }

    @DeleteMapping("/deleteMaintenance/{id}")
    public void deleteMaintenance(@PathVariable Long id){
        maintenanceService.deleteMaintenance(id);
    }
}
