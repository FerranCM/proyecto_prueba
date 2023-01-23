package Herencia.casas;

import lombok.Data;

@Data
public class ChaletDeLujo extends Chalet{
    private Integer mayordomo;

    public ChaletDeLujo(String direccion, Float metrosCuadrados, Integer plantas, Integer mayordomo) {
        super(direccion, metrosCuadrados, plantas);
        this.mayordomo = mayordomo;
    }

    public ChaletDeLujo() {
        super();
        this.mayordomo = 0;
    }

    @Override
    public String toString() {
        return "ChaletDeLujo{" +
                "direccion, " + getDireccion()+", "+
                "metrosCuadrados, " + getMetrosCuadrados()+", "+
                "plantas=" + getPlantas() + ", "+
                "mayordomo=" + mayordomo +
                '}';
    }
}
