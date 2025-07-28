package TrianguloRectangulo;

public class TrianguloRectangulo {
    public static void main(String[] args) {
        int a = 3; // Lado A
        int b = 4; // Lado B
        int c = 5; // Lado C

        if (esTrianguloRectangulo(a, b, c)) {
            System.out.println("Los lados forman un triángulo rectángulo.");
        } else {
            System.out.println("Los lados no forman un triángulo rectángulo.");
        }
    }

    public static boolean esTrianguloRectangulo(int lado1, int lado2, int lado3) {
        // Verificar si es un triángulo rectángulo usando el teorema de Pitágoras
        return (lado1 * lado1 + lado2 * lado2 == lado3 * lado3) ||
               (lado1 * lado1 + lado3 * lado3 == lado2 * lado2) ||
               (lado2 * lado2 + lado3 * lado3 == lado1 * lado1);
    }
}
