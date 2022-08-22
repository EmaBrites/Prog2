package tp1;

public class Rectangulo {
    private PuntoGeometrico vertice1;
    private PuntoGeometrico vertice2;
    private PuntoGeometrico vertice3;
    private PuntoGeometrico vertice4;

    public Rectangulo(PuntoGeometrico vertice1, PuntoGeometrico vertice2, PuntoGeometrico vertice3, PuntoGeometrico vertice4) {
        if(vertice1.getX() == vertice2.getX() && vertice1.getY() == vertice4.getY() &&
                vertice3.getX() == vertice4.getX() && vertice2.getY() == vertice3.getY()) {
            this.vertice1 = vertice1;
            this.vertice2 = vertice2;
            this.vertice3 = vertice3;
            this.vertice4 = vertice4;
        }
    }

    public void desplazar(double x, double y) {
        vertice1.desplazar(x, y);
        vertice2.desplazar(x, y);
        vertice3.desplazar(x, y);
        vertice4.desplazar(x, y);
    }

    public double getArea() {
        return (vertice2.getX() - vertice1.getX()) * (vertice4.getY() - vertice1.getY());
    }

    public int compareTo(Rectangulo otroRectangulo) {
        return Double.compare(getArea(), otroRectangulo.getArea());
    }

    public boolean esCuadrado(){
        return getBase() == getAltura();
    }

    public double getBase(){
        return vertice2.getDistancia(vertice1);
    }

    public double getAltura(){
        return vertice4.getDistancia(vertice1);
    }

    public boolean acostado(){
        return getBase() > getAltura();
    }
}
