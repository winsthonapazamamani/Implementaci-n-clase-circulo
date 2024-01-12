package ClasesAbstractas;

public abstract class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public Figura() {

    }

    public abstract float area();

    public abstract float perimetro();

    public abstract void printColor();
}
