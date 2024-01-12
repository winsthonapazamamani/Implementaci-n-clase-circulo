package ClasesAbstractas;

public class Cuadrado extends ClasesAbstractas.Figura {
    private float lado;

    public Cuadrado(String color, float lado) {
        super(color);
        if (lado <= 0) {
            throw new IllegalArgumentException("El lado del cuadrado debe ser un valor positivo.");
        }
        this.lado = lado;
    }

    @Override
    public float area() {
        return lado * lado;
    }

    @Override
    public float perimetro() {
        return 4 * lado;
    }

    @Override
    public void printColor() {
        System.out.println("El color del cuadrado es: " + color);
    }
}
