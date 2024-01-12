package ClasesAbstractas;

public class Circulo extends Figura {
    private float radio;

    public Circulo(String color, float radio) {
        super();
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio del círculo debe ser un valor positivo.");
        }
        this.radio = radio;
    }

    @Override
    public float area() {
        return (float) (Math.PI * Math.pow(radio, 2));
    }

    @Override
    public float perimetro() {
        return (float) (2 * Math.PI * radio);
    }

    @Override
    public void printColor() {
        System.out.println("El color del círculo es: " + color);
    }
}
