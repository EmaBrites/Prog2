package tp2.ej2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Reunion> reuniones;

    public Agenda() {
        this.reuniones = new ArrayList<>();
    }

    public Agenda(ArrayList<Reunion> reuniones) {
        this.reuniones = reuniones;
    }

    public void agregarReunion(Reunion reunion) {
        for (Reunion r:reuniones) {
            if (r.getFecha().equals(reunion.getFecha()) && r.getHora().equals(reunion.getHora())) {
                System.out.println("No se puede agregar la reunion, ya existe una en ese horario");
                return;
            }
        }
        reuniones.add(reunion);
    }
    public void eliminarReunion(Reunion reunion) {
        reuniones.remove(reunion);
    }
    public void getReunion(LocalDate fecha, String hora) {
        for (Reunion r:reuniones) {
            if (r.getFecha().equals(fecha) && r.getHora().equals(hora)) {
                System.out.println(r);
                return;
            }
        }
        System.out.println("No se encontro la reunion");
    }
    public void editarReunion(Reunion reunion, String lugar, LocalDate fecha, String hora, String asunto, Asistente[] asistentes, int duracion) {
        for (Reunion r:reuniones) {
            if (r.getFecha().equals(fecha) && r.getHora().equals(hora)) {
                System.out.println("No se puede editar la reunion, ya existe una en ese horario");
                return;
            }
        }
        reunion.setLugar(lugar);
        reunion.setFecha(fecha);
        reunion.setHora(hora);
        reunion.setAsunto(asunto);
        reunion.setAsistentes(asistentes);
        reunion.setDuracion(duracion);
    }
}
