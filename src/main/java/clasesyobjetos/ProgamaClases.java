package clasesyobjetos;
/*
Ejercicio 1:
Crea un proyecto llamado clases
Ejercicio 2:
Crea una clase llamda ProgamaClases que tengo un método main
Comprueba que funciona bien al ejecutarla
Ejercicio 3:
Crea una clase Perro.
Ejercicio 4:
Introduce en la clase Perro un atributo llamado raza de la Clase String
Ejercicio 5:
Desde la clase Programa inicializa un objeto de la clase Perro llamado toby
Ejercicio 6:
Di que la raza de toby es Terrier
Ejercicio 7:
Inicializa otro perro llamado otto
Ejercicio 8:
La raza de otto es Pastor Alemán
Ejercicio 9:
Saca por pantalla las razas de otto y de toby
Ejercicio 10:
Crea un consgtructor en la clase Perro sin parámetros e inicializa a "" el atributo raza
Ejercicio 11:
Comprueba que al inicilizar un objeto de la clase Perro se inicializa correctamente el atributo raza
Ejercicio 12:
Crea un constructor con parámetro para la raza dle perro
Ejercicio 13:
Crea un nuevo perro llamdo fluky de la raza Pastor de aguas mediante el constructor con un parámetro
Ejercicio 14:
Coloca en la clase Perro el getter y el setter de raza
Ejercicio 15,
Utiliza el getter y el setter en fluky para modificar e imprimir por pantalla su raza
Ejercicio 16:
introduce en la clase Perro el método toString para que devuelva lo normal en un toString (Clase [atributos-valores]). Usa el generate toString de Eclipse. Recuerda el @Override
 */
public class ProgamaClases {
    public static void main(String[] args) {
//incializamos un objeto de la clase perro
/*
Ejercicio 5:
Desde la clase Programa inicializa un objeto de la clase Perro llamado toby
Ejercicio 6:
Di que la raza de toby es Terrier
Ejercicio 7:
Inicializa otro perro llamado otto
Ejercicio 8:
La raza de otto es Pastor Alemán
Ejercicio 9:
Saca por pantalla las razas de otto y de toby
 */
    Perro toby;
    toby = new Perro();
    toby.raza = "terrier";
    System.out.println(toby.raza);
    Perro otto;
    otto = new Perro();
    otto.raza = "Pastor Alemán";
    System.out.println(otto.raza);
/*
        Ejercicio 11:
        Comprueba que al inicilizar un objeto de la clase Perro se inicializa correctamente el atributo raza
*/
    Perro perrito;
    perrito = new Perro();
    System.out.println(perrito.raza);
/*
Ejercicio 13:
Crea un nuevo perro llamdo fluky de la raza Pastor de aguas mediante el constructor con un parámetro
 */
    Perro fluky = new Perro("Pastor de aguas");
    System.out.println(fluky.raza);
/*
Ejercicio 15,
Utiliza el getter y el setter en fluky para modificar e imprimir por pantalla su raza
 */
    fluky.setRaza ("Caniche");
    System.out.println(fluky.raza);
    }
}
