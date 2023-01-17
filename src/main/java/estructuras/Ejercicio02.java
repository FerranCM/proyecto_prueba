package estructuras;

public class Ejercicio02 {
    /*
    Programa para definir estructuras de programacion if, while, case,...
     */
    public static void main(String[] args) {
        // while
        int i=0;
        while (i<10){
            System.out.println("Vuelta while: "+i);
            i++;
        }
        // do while
        int j=0;
        do{
            System.out.println("Vuelta do while: "+j);
            j++;
        }while (j<10);
        // for
        int l;
        for (l=0;l<10;l++) {
            System.out.println("Vuelta for: " + l);
        }
        // switch
        int edad = 17;
        switch (edad) {
            case 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17-> {System.out.println("No puede conducir");}
            default -> {System.out.println("Puede conducir");}
            }
        int edadamericana = 22;
        switch (edadamericana) {
            case 18-> {System.out.println("Puede conducir");}
            case 21-> {System.out.println("Puede beber");}
            default -> {System.out.println("No puede conducir ni beber, a casita. Tienes, "+edadamericana);}
        }
        //uso de etiquetas en sentencias
        int m=0;
        while (m<10){
            System.out.println("Vuelta while: "+m);
            if (m==2){
                m++;
                continue;
            }
            if (m==5){
                break;
            }
            m++;
        }
    }
}

