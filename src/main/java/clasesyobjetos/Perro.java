package clasesyobjetos;

public class Perro {
    public String raza;
    /*
Ejercicio 3:
Crea una clase Perro.
Ejercicio 4:
Introduce en la clase Perro un atributo llamado raza de la Clase String
    Ejercicio 10:
    Crea un consgtructor en la clase Perro sin parámetros e inicializa a "" el atributo raza
 */
    Perro(){
        raza = "";
    }
/*
Ejercicio 12:
Crea un constructor con parámetro para la raza dle perro
 */
    public Perro(String raza) {
        this.raza = raza;
    }
/*
Ejercicio 14:
Coloca en la clase Perro el getter y el setter de raza
 */
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    @Override
    public String toString() {
        return "Perro de {" +
                "raza, '" + raza + '\'' +
                '}';
    }
}
