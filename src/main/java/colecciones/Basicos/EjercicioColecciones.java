package colecciones.Basicos;

import java.util.*;

public class EjercicioColecciones {
    public static void main(String[] args) {
        List<String> listado = new LinkedList<>();
        listado.add("uno");
        listado.add("dos");
// imprime el primer elemento
        System.out.println(listado.get(0));
// imprime todos los elementos
        for (String s:listado) {
            System.out.println(s);
        }
// borramos el elemento 1
        listado.remove(1);
// imprime todos los elementos
        for (String s:listado) {
            System.out.println(s);
        }
// intenta acceder al elemento eliminado
    try{
        System.out.println(listado.get(1));
    } catch (IndexOutOfBoundsException e){
        System.out.println(e.getMessage());
        System.out.println("listado de un elemento "+listado);
    }
    if (listado.contains("dos")) {
        System.out.println("existe");
    }else {
        System.out.println("no existe");
    }
    Set<Integer> numeros = new HashSet<Integer>();
    numeros.add(1);
    numeros.add(2);
    for (Integer i:numeros) {
// sacamos por pantalla
        System.out.println(i);
    }
    /*
    Crea un objeto de tipo Mapa cuya clave sea un Integer y el valor sea una String
Mete dos valores con sus respectivas claves en el mapa
Imprime por pantalla el primer valor que has introducido
     */
    Map<Integer,String> mapa = new HashMap<>();
    mapa.put(1,"uno");
    mapa.put(2,"dos");
        System.out.println(mapa.get(1));
// Recorre el mapa e imprime la clave y el valore por pantalla
    Set <Integer> claves = mapa.keySet();
    for (Integer i: claves) {
        // imprimimos el valor de cada clave
        System.out.println("Clave "+i + " "+mapa.get(i));
    }
    Collection<String > coleccionValores = mapa.values();
    for (String s: coleccionValores) {
// recorre e imprime el valor
        System.out.println("valores "+s);
    }
    // Objeto Actor
    Actor actor = new Actor();
    actor.setNombre ("Marlon Brando");
    actor.setGeneroFavorito("Drama");
    actor.setAgnosExperiencia(20);
    Actor actriz = new Actor();
    actriz.setNombre("Penelope");
    actriz.setGeneroFavorito("Comedia");
    actriz.setAgnosExperiencia(15);
    // incluimos a los actores en un listado
    List<Actor> listadoActores = new ArrayList<>();
    listadoActores.add(actor);
    listadoActores.add(actriz);
    // objeto de la Serie
    Serie serie = new Serie();
    serie.setTitulo("Ahi va ese");
    serie.setAgnoPublicacion(1999);
    serie.setGenero("Comedia");
    }
}
