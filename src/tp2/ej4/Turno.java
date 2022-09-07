package tp2.ej4;

import java.time.LocalDate;

public class Turno {
    private Cancha cancha;
    private Usuario usuario;
    private LocalDate fecha;
    private int hora;
    private int horas;

    public Turno(Cancha cancha, Usuario usuario, int hora, int horas, LocalDate fecha) {
        this.cancha = cancha;
        this.usuario = usuario;
        this.hora = hora;
        this.horas = horas;
        this.fecha = fecha;
    }

    public Cancha getCancha() {
        return cancha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public int getHora() {
        return hora;
    }

    public int getHoras() {
        return horas;
    }

    public void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public String toString() {
        return "Turno [cancha=" + cancha + ", fecha=" + fecha + ", hora=" + hora + ", horas=" + horas + ", usuario="
                + usuario + "]";
    }
}
