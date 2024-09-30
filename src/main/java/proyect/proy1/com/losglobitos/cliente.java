package proyect.proy1.com.losglobitos;

public class cliente {
    private String nombre;
    private String contacto;

    // Constructor
    public cliente(String nombre, String contacto) {
        this.nombre = nombre;
        this.contacto = contacto;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
}
