package proyect.proy1.com.losglobitos;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class inventario {
    private static inventario instancia;
    private Map<producto, Integer> stock;

    // Constructor privado (Singleton)
    private inventario() {
        this.stock = new HashMap<>();
    }

    // Método para obtener la instancia (singleton)
    public static inventario getInstancia() {
        if (instancia == null) {
            instancia = new inventario();
        }
        return instancia;
    }

    // Método para agregar un producto al inventario
    public void agregarProducto(producto p, int cantidad) {
        stock.put(p, stock.getOrDefault(p, 0) + cantidad);
    }

    // Método para eliminar un producto del inventario
    public void eliminarProducto(producto p) {
        stock.remove(p);
    }

    // Método para obtener la cantidad de un producto
    public int obtenerCantidad(producto p) {
        return stock.getOrDefault(p, 0);
    }

    // Método para obtener todos los productos
    public List<producto> getProductos() {
        return new ArrayList<>(stock.keySet());
    }

    // Método para mostrar el inventario
    public void mostrarInventario() {
        System.out.println("Inventario de productos:");
        for (Map.Entry<producto, Integer> entry : stock.entrySet()) {
            System.out.println("Producto: " + entry.getKey().getNombre() + ", Cantidad: " + entry.getValue());
        }
    }
}
