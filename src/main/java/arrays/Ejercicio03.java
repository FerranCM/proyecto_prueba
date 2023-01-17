package arrays;

public class Ejercicio03 {
    // ejercicio de creacion de arrays
    public static void main(String[] args) {
        int miArray[] = new int[4];
        miArray[0] = 1;
        miArray[1] = 2;
        miArray[2] = 3;
        miArray[3] = 4;
        int i;
        for (i = 0; i < miArray.length; i++) {
            System.out.println("El contenido del array en el for es, posicion " +i+", valor: " + miArray[i]);
        }
        int j = 0;
        while (j < miArray.length) {
            System.out.println("El contenido del array en el while es, posicion " +j+", valor: " + miArray[j]);
            j++;
        }
        int m = 0;
        do {
            System.out.println("El contenido del array en el do while es, posicion " +m+", valor: " + miArray[m]);
            m++;
        } while (m < miArray.length);
        float flotanteArray[] = new float[2000];
        int n;
        for (n=0;n<flotanteArray.length;n++){
            flotanteArray[n]=0;
        }
        for (n=0;n<flotanteArray.length;n++) {
            if (n == 2) {
                flotanteArray[n] = 7.3f;
                System.out.println("Valor del array modificado: " + flotanteArray[n]);
            }
        }
        int l = 0;
        int p = 1;
        while (l < miArray.length) {
            if (p==miArray.length){
                System.out.println("El array tiene, "+p+" elementos");
            }
            p++;
            l++;
        }
        while (l < flotanteArray.length) {
            if (p==flotanteArray.length){
                System.out.println("El array flotante tiene, "+p+" elementos");
            }
            p++;
            l++;
        }
    }
}