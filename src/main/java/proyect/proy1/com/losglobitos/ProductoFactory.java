package com.losglobitos.model;

public class producto {
    // Atributos
    private String nombre;
    private String descripcion;
    private double precio;
    private EstadoProducto estado;

    // Constructor
    public producto(String nombre, String descripcion, double precio, EstadoProducto estado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estado = estado;
    }

    // Métodos Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public EstadoProducto getEstado() {
        return estado;
    }

    public void setEstado(EstadoProducto nuevoEstado) {
        this.estado = nuevoEstado;
    }

    // ... otros métodos
}

// Enumeración para los estados del producto
enum EstadoProducto {
    DISPONIBLE,
    NO_DISPONIBLE,
    EN_PROMOCION
}
