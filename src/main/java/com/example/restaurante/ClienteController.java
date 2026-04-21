package com.example.restaurante;

import com.example.restaurante.model.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private Map<Long, Cliente> clientes = new HashMap<>();
    private Long contador = 1L;

    // GET -> obtener todos
    @GetMapping
    public Collection<Cliente> getClientes() {
        return clientes.values();
    }

    // POST -> crear cliente
    @PostMapping
    public Cliente crearCliente(@RequestBody Cliente cliente) {
        cliente.setId(contador++);
        clientes.put(cliente.getId(), cliente);
        return cliente;
    }

    // GET por id
    @GetMapping("/{id}")
    public Cliente getCliente(@PathVariable Long id) {
        return clientes.get(id);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void borrarCliente(@PathVariable Long id) {
        clientes.remove(id);
    }

    // PATCH (actualización parcial)
    @PatchMapping("/{id}")
    public Cliente actualizarParcial(@PathVariable Long id, @RequestBody Cliente nuevo) {
        Cliente cliente = clientes.get(id);
        if (cliente != null) {
            if (nuevo.getNombre() != null) cliente.setNombre(nuevo.getNombre());
            if (nuevo.getEmail() != null) cliente.setEmail(nuevo.getEmail());
        }
        return cliente;
    }
}