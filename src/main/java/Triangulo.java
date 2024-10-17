public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double obtenerArea() {
        return 0.5 * base * altura;
    }

    @Override
    public double obtenerPerimetro() {
        double ladoOblicuo = Math.sqrt((base/2)*(base/2) + altura*altura);
        return base + 2 * ladoOblicuo;
    }
}
