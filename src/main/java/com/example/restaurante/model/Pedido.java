package com.example.restaurante.model;

import java.util.List;

public class Pedido {

    private Long id;
    private String clienteNombre;
    private List<String> platos;
    private Double total;

    public Pedido() {}

    public Pedido(Long id, String clienteNombre, List<String> platos, Double total) {
        this.id = id;
        this.clienteNombre = clienteNombre;
        this.platos = platos;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClienteNombre() {
        return clienteNombre;
    }

    public void setClienteNombre(String clienteNombre) {
        this.clienteNombre = clienteNombre;
    }

    public List<String> getPlatos() {
        return platos;
    }

    public void setPlatos(List<String> platos) {
        this.platos = platos;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}