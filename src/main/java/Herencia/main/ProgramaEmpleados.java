package Herencia.main;

import Herencia.Currito;
import Herencia.Empleado;
import Herencia.Jefe;
import Herencia.Persona;

public class ProgramaEmpleados {
    public static void main(String[] args) {
        Empleado empleado1;
        empleado1 = new Empleado();
        Empleado empleado2 = new Empleado(10002.83,"carretillero");
        System.out.println("datos empleado 1 "+empleado1);
        System.out.println("datos empleado 2"+empleado2);
        empleado1.setNombre("Tomas");
        empleado1.setDni("34556377v");
        empleado1.setTlf("67745443");
        empleado1.setSueldo(54545.23);
        empleado1.setCargo("jefe");
        System.out.println("datos empleado 1 "+empleado1);
        System.out.println("datos empleado 2"+empleado2);
/*
        empleado1.getNombre();
        empleado1.getDni();
        empleado1.getTlf();
        empleado1.getSueldo();
        empleado1.getCargo();
        empleado2.getNombre();
        empleado2.getDni();
        empleado2.getTlf();
        empleado2.getSueldo();
        empleado2.getCargo();
*/
        System.out.println("datos empleado 1 "+empleado1.getNombre()+" "+empleado1.getDni()+" "+empleado1.getTlf()+" "+empleado1.getSueldo()+" "+empleado1.getCargo()+" ahora");
        System.out.println("datos empleado 2"+empleado2.getNombre()+" "+empleado2.getDni()+" "+empleado2.getTlf()+" "+empleado2.getSueldo()+" "+empleado2.getCargo()+" ahora");
        Currito currito = new Currito();
        currito.setDni("987456j");
        currito.setCargo("oficinista");
        currito.setNombre("Carlos");
        currito.setTlf("8745434");
        currito.setSueldo(12234.98);
        currito.setHorario("L-V, de 9-18:00");
        Jefe jefe   = new Jefe();
        jefe.setDni("1987456j");
        jefe.setCargo("Jefaza");
        jefe.setNombre("Ana");
        jefe.setTlf("54145434");
        jefe.setSueldo(412234.98);
        jefe.setReuniones("a todas horas");
        System.out.println(currito);
        System.out.println(jefe);
        empleado2.setNombre("Carla");
        empleado2.setDni("4455377v");
        empleado2.setTlf("77745443");
        // saca solo el toString de Empleado
        System.out.println(empleado2);
        // saca toda la informacion de empleado2
        System.out.println("toda la info de empleado2 "+empleado2.getNombre()+" "+empleado2.getTlf()+" "+empleado2.getDni()+" "+empleado2);
        System.out.println("toda la informacion de empleado2 "+empleado2);
        //por qué da error al definir una persona y querer meterle los parametros de Empleado y Currito?
        //por qué da error al definir un currito querer meterle los parametros de Empleado y Persona?
        Persona persona = new Persona("Ferran","21387L","92384772");
        System.out.println(persona);
        Currito currito1 = new Currito("Ferran","21387L","92384772",4545654.99,"Barman","ticekts restaurant");
        System.out.println(currito1);
        jefe.setSueldo(85444.54);
        System.out.println("habiendo cambiado a protected "+jefe.getSueldo());
        // me deja cambiarlo porque ya tenía los getter
        // he cambiado el ProgramaEmpleados al main, he refactorizado y me ha dejado compilar
        // Currito currito1 = new Currito("Julian","23872347v","")
    }
}
