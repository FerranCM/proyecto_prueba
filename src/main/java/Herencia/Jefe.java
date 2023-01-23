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

    public Jefe(Double sueldo, String cargo, String reuniones) {
        super(sueldo, cargo);
        this.reuniones = reuniones;
    }

    public Jefe(String nombre, String dni, String tlf, Double sueldo, String cargo, String reuniones) {
        super(nombre, dni, tlf, sueldo, cargo);
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
                "nombre="+ getNombre()+ '\'' +
                "dni='" + getDni() + '\'' +
                ", tlf='" + getTlf() + '\'' +
                "sueldo=" + getSueldo() +
                ", cargo='" + getCargo() + '\'' +
                "reuniones='" + reuniones + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
