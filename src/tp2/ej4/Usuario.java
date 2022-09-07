package tp2.ej4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String apellido;
    private ArrayList<Turno> turnos;
    private static final int MIN_TURNOS = 4;
    private static final int MESES = 2;

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.turnos = new ArrayList<>();
    }

    public boolean esSocio() {
        int cantTurnos = 0;
        for ( Turno t : turnos ) {
            if ( t.getFecha().isAfter(LocalDate.now().minusMonths(MESES))&& t.getFecha().isBefore(LocalDate.now()) ) {
                cantTurnos++;
            }
        }
        return cantTurnos >= MIN_TURNOS;
    }

    public void agregarTurno(Turno turno) {
        turnos.add(turno);
    }

    public void eliminarTurno(Turno turno) {
        turnos.remove(turno);
    }

    public String toString() {
        return "Usuario [apellido=" + apellido + ", nombre=" + nombre + "]";
    }
}
