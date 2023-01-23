package Herencia;

public class Currito extends Empleado{
    private String horario;
    public Currito() {
        super();
        this.horario = "";
    }

    public Currito(String horario) {
        super();
        this.horario = horario;
    }

    public Currito(Double sueldo, String cargo, String horario) {
        super(sueldo,cargo);
        this.horario = horario;
    }

    public Currito(String nombre, String dni, String tlf, Double sueldo, String cargo, String horario) {
        super(nombre, dni, tlf, sueldo, cargo);
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Currito{" +
                    "nombre="+ getNombre()+ '\'' +
                    "dni='" + getDni() + '\'' +
                    ", tlf='" + getTlf() + '\'' +
                    "sueldo=" + getSueldo() +
                    ", cargo='" + getCargo() + '\'' +
                "horario='" + horario +
                '}';
    }
}
