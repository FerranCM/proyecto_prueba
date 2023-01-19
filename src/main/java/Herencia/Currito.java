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

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Currito{" +
                "horario='" + horario + '\'' +
                '}';
    }
}
