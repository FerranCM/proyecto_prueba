package Estaticos;

public class EstaticaApp {
    public static void main(String[] args) {
        // ejemplo clases estaticas
        Estatica constante = new Estatica();
        System.out.println(constante.Pi);
        Estatica.berrinche();
    }
}
