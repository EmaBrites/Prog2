package tp4.ej2;

public class Sensor {
    private int id;
    private String ubicacion;
    private boolean activo;

    public Sensor(int id, String ubicacion) {
        this.id = id;
        this.ubicacion = ubicacion;
        activo = false;
    }

    public int getId() {
        return id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
