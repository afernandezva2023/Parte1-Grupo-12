package com.example.restaurante.model;

import java.util.List;

public class Order {

    private Long id;
    private String clientName;
    private List<String> plates;
    private Double total;

    public Order() {}

    public Order(Long id, String clientName, List<String> plates, Double total) {
        this.id = id;
        this.clientName = clientName;
        this.plates = plates;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public List<String> getPlates() {
        return plates;
    }

    public void setPlates(List<String> plates) {
        this.plates = plates;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
