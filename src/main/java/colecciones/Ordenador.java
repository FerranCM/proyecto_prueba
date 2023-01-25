package colecciones;

import java.io.Serializable;
import java.util.*;

public class Ordenador implements Serializable {

    private static final long serialVersionUID = 1L;
    private String marca;
    private String modelo;
    //definimos piezas como listado
    private List<Pieza> piezas;

    public Ordenador() {
        this.marca = "";
        this.modelo = "";
        // puede ser ArrayList
        this.piezas = new LinkedList<>();
    }

    public Ordenador(String marca, String modelo, List<Pieza> piezas) {
        this.marca = marca;
        this.modelo = modelo;
        this.piezas = piezas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<Pieza> getPiezas() {
        return piezas;
    }

    public void setPiezas(List<Pieza> piezas) {
        this.piezas = piezas;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", piezas=" + piezas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ordenador ordenador = (Ordenador) o;
        return Objects.equals(marca, ordenador.marca) && Objects.equals(modelo, ordenador.modelo) && Objects.equals(piezas, ordenador.piezas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, piezas);
    }
}
