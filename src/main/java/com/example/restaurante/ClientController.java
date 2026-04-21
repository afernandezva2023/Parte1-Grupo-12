package com.example.restaurante;

import com.example.restaurante.model.Client;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/clientss")
public class ClientController {

    private Map<Long, Client> clients = new HashMap<>();
    private Long count = 1L;

    // GET 
    @GetMapping
    public Collection<Client> getClients() {
        return clients.values();
    }

    // POST -> create
    @PostMapping
    public Client createClient(@RequestBody Client client) {
        client.setId(count++);
        clients.put(client.getId(), client);
        return client;
    }

    // GET por id
    @GetMapping("/{id}")
    public Client getClient(@PathVariable Long id) {
        return clients.get(id);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void erraseClient(@PathVariable Long id) {
        clients.remove(id);
    }

    // PATCH (update parcial)
    @PatchMapping("/{id}")
    public Client updateParcial(@PathVariable Long id, @RequestBody Client newClient) {
        Client client = clients.get(id);
        if (client != null) {
        if (newClient.getName() != null) client.setName(newClient.getName());
        if (newClient.getEmail() != null) client.setEmail(newClient.getEmail());
        }   
        return client;
    }
}

