package tp4.ej1;

public class Alarma {
    private boolean vidrioRoto;
    private boolean puertaAbierta;
    private boolean movimientoDetectado;
    private Timbre timbre;

    public Alarma() {
        vidrioRoto = false;
        puertaAbierta = false;
        movimientoDetectado = false;
        timbre = new Timbre();
    }

    public boolean isVidrioRoto() {
        return vidrioRoto;
    }

    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public boolean isMovimientoDetectado() {
        return movimientoDetectado;
    }

    //TODO: no me gusta esta definicion de metodo
    public boolean isTimbre() {
        return timbre.isTimbre();
    }

    public void setVidrioRoto(boolean vidrioRoto) {
        this.vidrioRoto = vidrioRoto;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }

    public void setMovimientoDetectado(boolean movimientoDetectado) {
        this.movimientoDetectado = movimientoDetectado;
    }

    public void comprobar(){
        if (vidrioRoto || puertaAbierta || movimientoDetectado) {
            timbre.hacerSonar();
        }
    }
}
