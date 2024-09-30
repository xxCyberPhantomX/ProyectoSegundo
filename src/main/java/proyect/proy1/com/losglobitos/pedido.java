package proyect.proy1.com.losglobitos;

import java.util.List;

public class Pedido {
    private int id;
    private Cliente cliente;
    private List<Producto> productos;
    private String estado;

    // Constructor
    public Pedido(int id, Cliente cliente, List<Producto> productos) {
        this.id = id;
        this.cliente = cliente;
        this.productos = productos;
        this.estado = "En proceso";
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Método para actualizar estado del pedido
    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    // Sobrescribir toString() para representar el pedido como texto
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido ID: ").append(id)
          .append(", Cliente: ").append(cliente.getNombre())  // Asumiendo que Cliente tiene un método getNombre()
          .append(", Estado: ").append(estado)
          .append(", Productos: ");
        
        for (Producto producto : productos) {
            sb.append(producto.getNombre()).append(", "); // Asumiendo que Producto tiene un método getNombre()
        }

        // Eliminar la última coma y espacio
        if (sb.length() > 2) {
            sb.setLength(sb.length() - 2);
        }

        return sb.toString();
    }
}
