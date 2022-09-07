package tp2.ej4;

public class Cancha {
    private String nombre;
    private String tipo;
    private int costo;

    public Cancha(String nombre, String tipo, int costo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCosto() {
        return costo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String toString() {
        return "Cancha [costo=" + costo + ", nombre=" + nombre + ", tipo=" + tipo + "]";
    }
}
