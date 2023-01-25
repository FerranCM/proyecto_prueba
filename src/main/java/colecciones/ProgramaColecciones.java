package colecciones;

import java.util.*;

public class ProgramaColecciones {
    public static void main(String[] args) {
        /*
        Ejercicio 12
        Funcionaba hasta hacer Pieza un List en Ordenador
        */
        Pieza pieza = new Pieza("disco duro","HDD");
        Pieza pieza2 = new Pieza ("i9 13900K", "CPU");
        Pieza pieza3 = new Pieza("teclardo","periferico");
        Pieza pieza4 = new Pieza ("pantalla", "HDMI");
        Pieza pieza5 = new Pieza ("pantalla", "HDMI");
        // definimos un LIST
        List<Pieza> listado = new ArrayList<>();
        // Añadimos una pieza al listado
        listado.add(pieza);
        listado.add(pieza2);
        listado.add(pieza3);
        listado.add(pieza4);
        listado.add(pieza5);
        //añadimos el listao al ordenador
        Ordenador ordenador = new Ordenador("Dell","Latitude 7400", listado);
        Ordenador ordenador1 = new Ordenador("Dell","Latitude 6400",listado);
        System.out.println("pieza, "+pieza);
        System.out.println("ordenador, "+ordenador);
        System.out.println("ordenador1, "+ordenador1);
        System.out.println(ordenador.getPiezas().add(new Pieza()));
        System.out.println(ordenador);
        ordenador.getPiezas().get(2).setTipoPieza("Memoria");
        ordenador.getPiezas().get(2).setNombre("Kingston");
        System.out.println(ordenador);
        System.out.println(ordenador.getPiezas().get(2));
// creamos un Set
        Set<Pieza> misPiezas = new HashSet<Pieza>();
        misPiezas.add(pieza);
        misPiezas.add(pieza2);
        misPiezas.add(pieza3);
        misPiezas.add(pieza4);
        misPiezas.add(pieza5);
        System.out.println("Set, "+misPiezas);
// creamos un nuevo conjunto ordenado
        /* da un error el punto
        STreeSet<Pieza> piezasOrdenadas = new TreeSet<Pieza>();
        piezasOrdenadas.add(pieza);
        piezasOrdenadas.add(pieza2);
        piezasOrdenadas.add(pieza3);
        piezasOrdenadas.add(pieza4);
        piezasOrdenadas.add(pieza5);
        System.out.println("Piezas ordenadas, "+piezasOrdenadas);
*/
// Creamos un Map
        Map<String,String> cliente = new HashMap<>();
        cliente.put("nombre","Ferran");
        cliente.put("direccion", "mi calle");
        cliente.put("tlf","677623434");
        cliente.put("email","arroba@uni.com");
        System.out.println("Map, "+cliente);
// listado de objetos tipo Map
        List<Map<String,String>> listadoMapas = new ArrayList<>();
        listadoMapas.add(cliente);
        listadoMapas.add(cliente);
        System.out.println("Listado de mapas, "+listadoMapas);
    }
}
