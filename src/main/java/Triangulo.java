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
        // Complejidad temporal: O(1) Tiempo constante.
        return 0.5 * base * altura;
    }

    @Override
    public double obtenerPerimetro() {
        // Complejidad temporal: O(1) Tiempo constante.
        // Nota: Este cálculo asume un triángulo isósceles. Para un cálculo preciso, se necesitarían los tres lados.
        double ladoOblicuo = Math.sqrt((base/2)*(base/2) + altura*altura);
        return base + 2 * ladoOblicuo;
    }
}
