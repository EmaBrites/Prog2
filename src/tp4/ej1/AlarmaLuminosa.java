package tp4.ej1;

public class AlarmaLuminosa extends Alarma {
    private Luz luz;

    public AlarmaLuminosa() {
        luz = new Luz();
    }

    public boolean isLuz() {
        return luz.isLuz();
    }

    public void comprobar() {
        super.comprobar();
        if (isTimbre()) {
            luz.encender();
        }
    }
}
