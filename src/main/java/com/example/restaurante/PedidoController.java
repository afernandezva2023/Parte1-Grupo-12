package com.example.restaurante;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurante.model.Pedido;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private Map<Long, Pedido> pedidos = new HashMap<>();
    private Long contador = 1L;

    // GET TODOS
    @GetMapping
    public Collection<Pedido> getPedidos() {
        return pedidos.values();
    }

    // POST CREAR
    @PostMapping
    public Pedido crearPedido(@RequestBody Pedido pedido) {
        pedido.setId(contador++);
        pedidos.put(pedido.getId(), pedido);
        return pedido;
    }

    // GET POR ID
    @GetMapping("/{id}")
    public Pedido getPedido(@PathVariable Long id) {
        return pedidos.get(id);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void borrarPedido(@PathVariable Long id) {
        pedidos.remove(id);
    }

    // PATCH (EDITAR)
    @PatchMapping("/{id}")
    public Pedido actualizarParcial(@PathVariable Long id, @RequestBody Pedido nuevo) {

        Pedido pedido = pedidos.get(id);

        if (pedido != null) {

            if (nuevo.getClienteNombre() != null) {
                pedido.setClienteNombre(nuevo.getClienteNombre());
            }

            if (nuevo.getPlatos() != null) {
                pedido.setPlatos(nuevo.getPlatos());
            }

            if (nuevo.getTotal() != null) {
                pedido.setTotal(nuevo.getTotal());
            }
        }

        return pedido;
    }
}
