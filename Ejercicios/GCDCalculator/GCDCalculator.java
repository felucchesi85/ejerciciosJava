package GCDCalculator;

// Ejercicio: Calcular el Máximo Común Divisor (MCD) de dos números enteros
public class GCDCalculator {
    public static void main(String[] args) {
        int num1 = 48; // Primer número
        int num2 = 18; // Segundo número
        int gcd = findGCD(num1, num2); // Calcular el MCD
        System.out.println("El MCD de " + num1 + " y " + num2 + " es: " + gcd);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a; // Retorna el MCD
    }
}
