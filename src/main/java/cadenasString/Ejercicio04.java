package cadenasString;

public class Ejercicio04 {
    /* Ejercicios con cadenas de caracteres
    Ejercicio 4:
Declara una cadena llamada saludo con el valor "Hola"
Ejercicio 5:
Saca por pantalla el número de caracteres de la cadena
Ejercicio 6:
Saca por pantalla el 4º caracter de la cadena
Ejercicio 7:
Saca por pantalla la cadena en mayúsculas
Ejercicio 8:
Saca por pantalla la cadena en minúsculas
Ejercicio 9:
Saca por pantalla la posición del carácter 'l'
Ejercicio 10:
Declara otra cadena llamada saludo2 y compárala con la cadena saludo, saca un mensaje por pantalla indicando si son o no iguales
     */
    public static void main(String[] args){
        //ejercicio 4 y 5
        String saludo = "Hola";
        System.out.println(saludo.length());
        //ejercicio 6
        System.out.println(saludo.charAt(3));
        char c1 = saludo.charAt(2);
        System.out.println(c1);
        //ejercicio 7 y 8
        System.out.println("En mayusculas: "+saludo.toUpperCase());
        System.out.println("En minusculas: "+saludo.toLowerCase());
        //ejercicio 9
        System.out.println("La letra l esta en la posicion "+saludo.indexOf("l"));
        // ejercicio 10
        String saludo2 = "Adios";
        if (saludo.equals(saludo2)){
            System.out.println("Ambos textos son iguales");
        }else{
            System.out.println("Ambos textos son diferentes");
        }
        int i,j;
        uno: for (i=0;i<saludo.length();i++){
            dos: for (j=0;j<saludo2.length();j++){
                if (saludo.charAt(i)==saludo2.charAt(j)){
                    System.out.println("Esta letra esta en ambos textos: "+saludo.charAt(i));
                    System.out.println("Esta en la posicion, "+i+" en saludo");
                    System.out.println("Esta en la posicion, "+j+" en saludo2");
                    continue uno;
                }
            }
        }

    }
}
