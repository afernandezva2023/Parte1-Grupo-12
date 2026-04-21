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

import com.example.restaurante.model.Order;

@RestController
@RequestMapping("/orders")
public class orderController {

    private Map<Long, Order> orders = new HashMap<>();
    private Long count = 1L;

    // GET TODOS
    @GetMapping
    public Collection<Order> getOrders() {
        return orders.values();
    }

    // POST CREAR
    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        order.setId(contador++);
        order.put(order.getId(), order);
        return order;
    }

    // GET POR ID
    @GetMapping("/{id}")
    public Order getOrder(@PathVariable Long id) {
        return order.get(id);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void erraseOrder(@PathVariable Long id) {
        orders.remove(id);
    }

    // PATCH (EDITAR)
    @PatchMapping("/{id}")
    public Pedido updateParcial(@PathVariable Long id, @RequestBody Order new) {

        Order order = orders.get(id);

        if (order != null) {

            if (new.getClientName() != null) {
                order.setClientName(new.getClientName());
            }

            if (new.getPlates() != null) {
                order.setPlates(nuevo.getPlatos());
            }

            if (nuevo.getTotal() != null) {
                pedido.setTotal(nuevo.getTotal());
            }
        }

        return pedido;
    }
}
