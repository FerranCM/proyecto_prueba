package variables;

public class Ejercicio01 {
    public static void main(String[] args) {
    /*
    Programa para definir variables y sacar su valor por pantalla
     */
    int numero = 1;
    short marianico = 31210;
    long gasol = 1000*marianico;
    boolean indepencia = true;
    double presupuesto = -1.5*10;
    float longitud = -3*100;
    long suma = numero*marianico*gasol*(int)presupuesto*(int)longitud;
    System.out.println("Variable Entero "+numero);
    System.out.println("Variable Short "+marianico);
    System.out.println("Variable Long "+gasol);
    System.out.println("variable independencia "+indepencia);
    System.out.println("variable presupuesto "+presupuesto);
    System.out.println("variable longitud "+longitud);
    System.out.println("la suma de todas "+suma);
    System.out.println("Todos juntos, "+"\n"
        +"\tentero: "+numero+"\n"
        +"\t\t short: "+marianico+"\n"
        +"\tlong: "+gasol+"\n"
        +"\tboolean: "+indepencia+"\n"
        +"\tdouble: "+presupuesto+"\n"
        +"\tfloat: "+longitud);
    }
}
