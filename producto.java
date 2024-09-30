package proyect.proy1.com.losglobitos;

public class producto {
    private String nombre;
    private String descripcion;
    private boolean esImportado;
    private double precio;
    private int cantidad;

    // Constructor
    public producto(String nombre, String descripcion, boolean esImportado, double precio, int cantidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.esImportado = esImportado;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Getters y Setters
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

    public boolean isEsImportado() {
        return esImportado;
    }

    public void setEsImportado(boolean esImportado) {
        this.esImportado = esImportado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
