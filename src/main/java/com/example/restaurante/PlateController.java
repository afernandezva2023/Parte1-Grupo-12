package com.example.restaurante;

import com.example.restaurante.model.Plate;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/plates")

public class PlateController {
    private Map<Long, Plate> plates = new HashMap<>();
    private Long count = 1L;

    @GetMapping
    public Collection<Plate> getPlates() {
        return plates.values();
    }

    @PostMapping
    public Plate createPlate(@RequestBody Plate plate) {
        plate.setId(contador++);
        plates.put(plate.getId(), plate);
        return plate;
    }

    @GetMapping("/{id}")
    public Plate getPlate(@PathVariable Long id) {
        return plates.get(id);
    }

    @DeleteMapping("/{id}")
    public void errasePlate(@PathVariable Long id) {
        plates.remove(id);
    }

    @PatchMapping("/{id}")
    public Plate uptdateParcial(@PathVariable Long id, @RequestBody Plate new) {
        Plate plate = plates.get(id);
        if (plate != null) {
            if (new.getName() != null) plate.setName(new.getName());
            if (new.getPrice() != 0) plate.setPrice(new.getPrice());
        }
        return plate;
    }
}
