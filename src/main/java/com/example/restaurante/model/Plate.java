package com.example.restaurante.model;

public class Plate {
     private Long id;
    private String name;
    private double price;

    public Plate() {}

    public Plate(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String nombre) { this.name = nombre; }

    public double getPrice() { return price; }
    public void setPrice(double precio) { this.price = precio; }
