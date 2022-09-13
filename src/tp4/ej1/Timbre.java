package tp4.ej1;

public class Timbre {
    private boolean timbre;

    public Timbre() {
        timbre = false;
    }

    public void hacerSonar() {
        timbre = true;
    }

    public boolean isTimbre() {
        return timbre;
    }
}
