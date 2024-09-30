package proyect.proy1.com.losglobitos;

public class factura {
    private pedido pedido;
    private double impuesto;
    private double total;

    // Constructor
    public factura(pedido pedido, double impuesto) {
        this.pedido = pedido;
        this.impuesto = impuesto;
        calcularTotal();
    }

    // Método para calcular el total de la factura
    private void calcularTotal() {
        double subtotal = 0;
        for (producto p : pedido.getProductos()) {
            subtotal += p.getPrecio() * p.getCantidad();
        }
        this.total = subtotal + (subtotal * impuesto);
    }

    // Método para mostrar los detalles de la factura
    public void mostrarFactura() {
        System.out.println("Factura para el cliente: " + pedido.getCliente().getNombre());
        System.out.println("Productos:");
        for (producto p : pedido.getProductos()) {
            System.out.println("- " + p.getNombre() + " x " + p.getCantidad() + " = " + p.getPrecio() * p.getCantidad());
        }
        System.out.println("Subtotal: " + (total / (1 + impuesto)));
        System.out.println("Impuesto (" + (impuesto * 100) + "%): " + (total - (total / (1 + impuesto))));
        System.out.println("Total a pagar: " + total);
    }

    // Getters para acceder a los valores si es necesario
    public double getTotal() {
        return total;
    }
}
