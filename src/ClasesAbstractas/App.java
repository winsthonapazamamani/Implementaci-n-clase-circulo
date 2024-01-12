package ClasesAbstractas;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el color del cuadrado: ");
        String colorCuadrado = scanner.nextLine();
        System.out.println("Ingrese el lado del cuadrado: ");
        float ladoCuadrado = scanner.nextFloat();

        Cuadrado cuadrado = new Cuadrado(colorCuadrado, ladoCuadrado);
        cuadrado.printColor();
        System.out.println("Área del cuadrado: " + cuadrado.area());
        System.out.println("Perímetro del cuadrado: " + cuadrado.perimetro());

        System.out.println("Ingrese el color del círculo: ");
        String colorCirculo = scanner.next();
        System.out.println("Ingrese el radio del círculo: ");
        float radioCirculo = scanner.nextFloat();

        Circulo circulo = new Circulo(colorCirculo, radioCirculo);
        circulo.printColor();
        System.out.println("Área del círculo: " + circulo.area());
        System.out.println("Perímetro del círculo: " + circulo.perimetro());

        scanner.close();
    }
}