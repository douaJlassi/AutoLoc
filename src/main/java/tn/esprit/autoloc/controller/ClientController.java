package tn.esprit.autoloc.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.service.IClientService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class ClientController {

    private final IClientService clientService;

    @PostMapping("/addClient")
    public Client addClient(@RequestBody Client client){
        return clientService.ajouterClient( client);
    }

    @PutMapping("/updateClient")
    public Client updateClient(@RequestBody Client client){
        return clientService.modifierClient(client);
    }
    @GetMapping("/getAllClient")
    public List<Client> getClient(){
        return clientService.afficherAllClients();
    }

    @GetMapping("/getClient/{id}")
    public Client getClientById(@PathVariable Long id){
        return clientService.afficherClientById(id);
    }

    @DeleteMapping("/deleteClient/{id}")
    public void deleteClient(@PathVariable Long id){
        clientService.supprimerClient(id);
    }

}
