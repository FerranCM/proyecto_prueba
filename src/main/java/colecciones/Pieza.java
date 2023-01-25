package colecciones;

import java.io.Serializable;
import java.util.Objects;

public class Pieza implements Serializable {
    private String nombre;
    private String tipoPieza;
    public Pieza() {
        this.nombre = "";
        this.tipoPieza = "";
    }
    public Pieza(String nombre, String tipoPieza) {
        this.nombre = nombre;
        this.tipoPieza = tipoPieza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoPieza() {
        return tipoPieza;
    }

    public void setTipoPieza(String tipoPieza) {
        this.tipoPieza = tipoPieza;
    }

    @Override
    public String toString() {
        return "Pieza{" +
                "nombre='" + nombre + '\'' +
                ", tipoPieza='" + tipoPieza + '\'' +
                '}';
    }
// Definimos el equals y el hash, para que al sacar el print del Set en la aplicación, solo saque los elemento no repetidos
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pieza pieza = (Pieza) o;
        return Objects.equals(nombre, pieza.nombre) && Objects.equals(tipoPieza, pieza.tipoPieza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, tipoPieza);
    }
}
