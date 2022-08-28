package tp1;

public class PuntoGeometrico {
    private double x;
    private double y;

    public PuntoGeometrico() {
        this.x = 0;
        this.y = 0;
    }

    public PuntoGeometrico(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void desplazar(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public double getDistancia(PuntoGeometrico otroPunto) {
        return Math.sqrt(Math.pow(otroPunto.getX() - getX(), 2) + Math.pow(otroPunto.getY() - getY(), 2));
    }
}
