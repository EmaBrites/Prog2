package tp2.ej4;

import java.util.ArrayList;

public class Sistema {

    private ArrayList<Usuario> socios;
    private ArrayList<Turno> turnos;

    private static final double DESCUENTO = 0.1;

    public Sistema() {
        this.turnos = new ArrayList<Turno>();
    }

    public void agregarTurno(Turno turno) {
        for ( Turno t : turnos ) {
            if ( t.getFecha().equals(turno.getFecha())) {
                if ( t.getHora() == turno.getHora() || (t.getHora() < turno.getHora() && t.getHora() + t.getHoras() > turno.getHora()) ) {
                    System.out.println("No se puede agregar el turno "+turno);
                }
            }
        }
        turnos.add(turno);
        turno.getUsuario().agregarTurno(turno);
        if ( turno.getUsuario().esSocio() ) {
            socios.add(turno.getUsuario());
        }
    }

    public void eliminarTurno(Turno turno) {
        turnos.remove(turno);
        turno.getUsuario().eliminarTurno(turno);
    }

    public boolean estaDisponible(Turno turno) {
        for ( Turno t : turnos ) {
            if ( t.getFecha().equals(turno.getFecha()) && t.getHora() == turno.getHora() ) {
                return false;
            }
        }
        return true;
    }
    public void editarTurno(Turno turno, Turno nuevoTurno) {
        if (estaDisponible(nuevoTurno)) {
            eliminarTurno(turno);
            agregarTurno(nuevoTurno);
        }
    }

    public double costoTurno(Turno turno) {
        double costo = turno.getCancha().getCosto();
        if (turno.getUsuario().esSocio()) {
            costo = costo - costo*DESCUENTO;
        }
        return costo;
    }

    public ArrayList<Turno> getTurnos() {
        return new ArrayList<>(turnos);
    }
}
