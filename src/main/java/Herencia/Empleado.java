package Herencia;

public class Empleado extends Persona{
    protected Double sueldo;
    private String cargo;

    public Empleado() {
        super ();
        this.sueldo = 0.0;
        this.cargo = "";
    }
        public Empleado(Double sueldo, String cargo) {
        super();
        this.sueldo = sueldo;
        this.cargo = cargo;
    }

    public Empleado(String nombre, String dni, String tlf, Double sueldo, String cargo) {
        super(nombre, dni, tlf);
        this.sueldo = sueldo;
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre="+ getNombre()+ '\'' +
                "dni='" + getDni() + '\'' +
                ", tlf='" + getTlf() + '\'' +
                "sueldo=" + sueldo +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
