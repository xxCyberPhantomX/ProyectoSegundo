package com.losglobitos.factory;

import com.losglobitos.model.Producto;
import com.losglobitos.model.EstadoProducto;

public class ProductoFactoryImpl implements ProductoFactory {

    @Override
    public Producto crearProducto(String tipo) {
        switch (tipo) {
            case "Sombrilla":
                return new Producto("SOM-001", "Sombrilla", 19.99, new EstadoProducto("Disponible", "Producto en inventario"));
            case "Camiseta":
                return new Producto("CAM-001", "Camiseta", 15.99, new EstadoProducto("Disponible", "Producto en inventario"));
            case "Taza":
                return new Producto("TAZ-001", "Taza", 10.50, new EstadoProducto("Disponible", "Producto en inventario"));
            default:
                return null; // Podrías lanzar una excepción aquí si prefieres manejar los errores de forma más estricta
        }
    }
}
