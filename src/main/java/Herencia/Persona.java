package Herencia;

public class Persona {
    private String nombre;
    private String dni;
    private String tlf;

    public Persona() {
        this.nombre = "";
        this.dni = "";
        this.tlf = "";
    }
    public Persona(String nombre, String dni, String tlf) {
            this.nombre = nombre;
            this.dni = dni;
            this.tlf = tlf;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", tlf='" + tlf + '\'' +
                '}';
    }
}