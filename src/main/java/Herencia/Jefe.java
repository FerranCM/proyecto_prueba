package Herencia;

public class Jefe extends Empleado{
    private String reuniones;

    public Jefe() {
        super();
        this.reuniones = "";
    }
    public Jefe(String reuniones) {
        super();
        this.reuniones = reuniones;
    }

    public String getReuniones() {
        return reuniones;
    }

    public void setReuniones(String reuniones) {
        this.reuniones = reuniones;
    }

    @Override
    public String toString() {
        return "Jefe{" +
                "reuniones='" + reuniones + '\'' +
                '}';
    }
}
