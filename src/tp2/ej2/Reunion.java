package tp2.ej2;

import java.time.LocalDate;

public class Reunion {
    private String lugar;
    private LocalDate fecha;
    private String hora;
    private String asunto;
    private Asistente[] asistentes;
    private int duracion;

    public Reunion(String lugar, LocalDate fecha, String hora, String asunto, Asistente[] asistentes, int duracion) {
        this.lugar = lugar;
        this.fecha = fecha;
        this.hora = hora;
        this.asunto = asunto;
        this.asistentes = asistentes;
        this.duracion = duracion;
    }

    public String getLugar() {
        return lugar;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getAsunto() {
        return asunto;
    }

    public Asistente[] getAsistentes() {
        return asistentes;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public void setAsistentes(Asistente[] asistentes) {
        this.asistentes = asistentes;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
