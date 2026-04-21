package com.example.restaurante;

import com.example.restaurante.model.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/clientes")
public class ClientController {

    private Map<Long, Client> clients = new HashMap<>();
    private Long count = 1L;

    // GET -> obtener todos
    @GetMapping
    public Collection<Client> getClients() {
        return clients.values();
    }

    // POST -> crear cliente
    @PostMapping
    public Client createClient(@RequestBody Client client) {
        clients.setId(count++);
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

    // PATCH (actualización parcial)
    @PatchMapping("/{id}")
    public Client updateParcial(@PathVariable Long id, @RequestBody Client new) {
        Client client = clients.get(id);
        if (client != null) {
            if (new.getName() != null) client.setName(new.getName());
            if (new.getEmail() != null) client.setEmail(new.getEmail());
        }
        return client;
    }
}
