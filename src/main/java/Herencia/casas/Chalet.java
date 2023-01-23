package Herencia.casas;

import lombok.Data;

@Data
public class Chalet extends Casa{
    private Integer plantas;

    public Chalet(String direccion, Float metrosCuadrados, Integer plantas) {
        super(direccion, metrosCuadrados);
        this.plantas = plantas;
    }

    public Chalet() {
        super();
        this.plantas = 0;
    }

    @Override
    public String toString() {
        return "Chalet{" +
                "direccion, " + getDireccion()+", "+
                "metrosCuadrados, " + getMetrosCuadrados()+", "+
                "plantas=" + plantas +
                '}';
    }
}
