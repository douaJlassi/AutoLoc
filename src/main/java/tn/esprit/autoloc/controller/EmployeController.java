package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.domain.Employe;
import tn.esprit.autoloc.service.IClientService;
import tn.esprit.autoloc.service.IEmployeService;

import java.util.List;

@RestController
@RequestMapping("/employe")
@AllArgsConstructor
public class EmployeController {
     private IEmployeService employeService;

    @PostMapping("/addEmploye")
    public Employe addEmploye(@RequestBody Employe employe){
        return employeService.addEmploye( employe);
    }

    @PutMapping("/updateEmploye")
    public Employe updateEmploye(@RequestBody Employe employe){
        return employeService.updateEmploye(employe);
    }
    @GetMapping("/getAllEmploye")
    public List<Employe> getEmploye(){
        return employeService.getEmployes();
    }

    @GetMapping("/getEmploye/{id}")
    public Employe getEmployeById(@PathVariable Long id){
        return employeService.getEmpById(id);
    }

    @DeleteMapping("/deleteEmploye/{id}")
    public void deleteEmploye(@PathVariable Long id){
        employeService.deleteEmploye(id);
    }
}
