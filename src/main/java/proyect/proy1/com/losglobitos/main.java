package proyect.proy1.com.losglobitos;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        Inventario inventario = Inventario.getInstancia();
        ProductoFactory factory = new ProductoFactoryImpl();
        ProductStorage storage = new ProductStorage();

        // Crear algunos productos para un pedido
        Producto sombrilla = new Producto(1, "Sombrilla", "local", 50.0);
        Producto taza = new Producto(2, "Taza", "importado", 30.0);
        List<Producto> productos = Arrays.asList(sombrilla, taza);

        // Crear un pedido
        Pedido pedido1 = new Pedido(101, new Cliente("Juan Pérez", "contacto@example.com"), productos);
        List<Pedido> pedidos = Arrays.asList(pedido1);

        // Guardar pedidos en un archivo
        try {
            controlador.guardarPedidos(pedidos, "pedidos.txt");
            System.out.println("Pedidos guardados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar pedidos: " + e.getMessage());
        }

        // Cargar pedidos desde un archivo
        try {
            List<String> pedidosCargados = controlador.cargarPedidos("pedidos.txt");
            System.out.println("Pedidos cargados desde archivo:");
            for (String pedido : pedidosCargados) {
                System.out.println(pedido);
            }
        } catch (IOException e) {
            System.out.println("Error al cargar pedidos: " + e.getMessage());
        }

        // Cargar productos desde el archivo
        List<Producto> productosCargados = storage.cargarProductos();
        for (Producto producto : productosCargados) {
            inventario.agregarProducto(producto);
        }

        // Crear productos
        Producto nuevaSombrilla = factory.crearProducto("Sombrilla");
        inventario.agregarProducto(nuevaSombrilla);

        // Guardar productos en el archivo
        storage.guardarProductos(inventario.getProductos()); // Asegúrate de crear un método getProductos en Inventario

        // Listar productos
        System.out.println("Productos en inventario:");
        inventario.listarProductos();
    }
}
