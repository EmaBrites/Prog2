package tp1;

public class RectanguloV2 {
    private PuntoGeometrico vertice1;
    private double base;
    private double altura;

    public RectanguloV2(PuntoGeometrico vertice1, double base, double altura) {
        this.vertice1 = vertice1;
        this.base = base;
        this.altura = altura;
    }

    public RectanguloV2(PuntoGeometrico vertice1, PuntoGeometrico vertice2, PuntoGeometrico vertice3, PuntoGeometrico vertice4) {
        if(vertice1.getX() == vertice2.getX() && vertice1.getY() == vertice4.getY() &&
                vertice3.getX() == vertice4.getX() && vertice2.getY() == vertice3.getY()) {
            this.vertice1 = vertice1;
            this.base = vertice2.getDistancia(vertice1);
            this.altura = vertice4.getDistancia(vertice1);
        }
    }

    public void desplazar(double x, double y) {
        vertice1.desplazar(x, y);
    }

    public double getArea() {
        return base * altura;
    }
    public int compareTo(RectanguloV2 otroRectangulo) {
        return Double.compare(getArea(), otroRectangulo.getArea());
    }
    public boolean esCuadrado(){
        return base == altura;
    }
    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
    }
    public boolean acostado(){
        return base > altura;
    }
}
