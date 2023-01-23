package Herencia.casas;

public class CasasApp {
    public static void main(String[] args) {
        Casa casa   = new Casa();
        System.out.println("casa sin datos, "+casa);
        Chalet chalet = new Chalet();
        System.out.println("chalet sin datos, "+chalet);
        chalet.setDireccion("Sanse");
        chalet.setPlantas(2);
        chalet.setMetrosCuadrados(340F);
        System.out.println("inicializando chalet, "+chalet);
        Piso piso = new Piso();
        System.out.println("piso sin inicializar, "+piso);
        piso = new Piso("Fuenla", 85f,1);
        System.out.println("piso inicializado, "+piso);
        ChaletDeLujo chaletDeLujo = new ChaletDeLujo();
        System.out.println("chalet de lujo sin inicializar, "+chaletDeLujo);
        ChaletDeLujo chaletDeLujo1 = new ChaletDeLujo("La Moraleja", 450f, 4, 2);
        System.out.println("chalet de lujo inicializado, "+ chaletDeLujo1);
    }
}
