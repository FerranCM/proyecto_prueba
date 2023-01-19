package clasesyobjetos;

import java.util.Date;

public class PasajeroApp {
    // Ejemplo de aplicación de uso de clase con importacion de Lombok
    // en el pom.xml, hemos incluido el lombok
    public static void main(String[] args) {
        Pasajero pasajero = new Pasajero();
        pasajero.setNombre("Pasajero");
        pasajero.setEdad(17);
        pasajero.setVuelo("Miami");
        pasajero.setFecha(new Date(2021,1,12));
        System.out.println("pasajero "+pasajero.getNombre()+" edad "+pasajero.getEdad()+" vuelo "+ pasajero.getVuelo()+" fecha "+pasajero.getFecha());
        Pasajero pasajero2 = new Pasajero("Pax","Madrid",new Date(2022,5,22),19);
        System.out.println("pasajero "+pasajero2.getNombre()+" edad "+pasajero2.getEdad()+" vuelo "+ pasajero2.getVuelo()+" fecha "+pasajero2.getFecha());
    }
}
