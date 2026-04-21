package com.example.restaurante;

import com.example.restaurante.model.Plato;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/platos")

public class PlatoController {
    private Map<Long, Plato> platos = new HashMap<>();
    private Long contador = 1L;

    @GetMapping
    public Collection<Plato> getPlatos() {
        return platos.values();
    }

    @PostMapping
    public Plato crearPlato(@RequestBody Plato plato) {
        plato.setId(contador++);
        platos.put(plato.getId(), plato);
        return plato;
    }

    @GetMapping("/{id}")
    public Plato getPlato(@PathVariable Long id) {
        return platos.get(id);
    }

    @DeleteMapping("/{id}")
    public void borrarPlato(@PathVariable Long id) {
        platos.remove(id);
    }

    @PatchMapping("/{id}")
    public Plato actualizarParcial(@PathVariable Long id, @RequestBody Plato nuevo) {
        Plato plato = platos.get(id);
        if (plato != null) {
            if (nuevo.getNombre() != null) plato.setNombre(nuevo.getNombre());
            if (nuevo.getPrecio() != 0) plato.setPrecio(nuevo.getPrecio());
        }
        return plato;
    }
}
