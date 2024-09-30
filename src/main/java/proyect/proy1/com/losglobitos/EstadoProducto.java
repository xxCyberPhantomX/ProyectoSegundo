package proyect.proy1.com.losglobitos;

public class EstadoProducto {
    private String nombre;
    private String descripcion;

    public EstadoProducto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getInfo() {
        return nombre + ": " + descripcion;
    }
}
