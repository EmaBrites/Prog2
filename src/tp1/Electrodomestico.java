package tp1;

public class Electrodomestico {
    private String nombre;
    private double precioBase = 100;
    private int peso = 2;
    private String color = "gris perla";
    private int consumoEnergetico = 10;
    private static final int MAX_CONSUMO_ENERGETICO = 45;
    private static final int MIN_BALANCE = 3;

    public Electrodomestico(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoEnergetico(int consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public int getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    public int getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public boolean bajoConsumoEnergetico() {
        return getConsumoEnergetico() <= MAX_CONSUMO_ENERGETICO;
    }

    public double getBalace(){
        return getPrecioBase()/getPeso();
    }

    public boolean altaGama(){
        return getBalace()>=MIN_BALANCE;
    }
}
