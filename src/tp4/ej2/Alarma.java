package tp4.ej2;

import tp4.ej1.Timbre;

import java.util.ArrayList;

public class Alarma {
    private ArrayList<Sensor> sensores;
    private Timbre timbre;

    public Alarma() {
        sensores = new ArrayList<Sensor>();
    }

    public void agregarSensor(Sensor sensor) {
        sensores.add(sensor);
    }

    public ArrayList<Sensor> getSensores() {
        return new ArrayList<>(sensores);
    }

    public void comprobarSensores() {
        for (Sensor sensor : sensores) {
            if (sensor.isActivo()) {
                timbre.hacerSonar();
                System.out.println("El sensor " + sensor.getUbicacion() + " está activo");
            }
        }
    }
}
