package LCMCalculator;

// Ejercicio: Calcular el Mínimo Común Múltiplo (MCM) de dos números enteros
public class LCMCalculator {
    public static void main(String[] args) {
        int num1 = 2; // Primer número
        int num2 = 4; // Segundo número
        int lcm = findLCM(num1, num2); // Calcular el MCM
        System.out.println("El MCM de " + num1 + " y " + num2 + " es: " + lcm);
    }
    // Fórmula para calcular el MCM: (a * b) / MCD(a, b)
    public static int findLCM(int a, int b) {
        int result = (a * b) / findGCD(a, b);
        System.out.println("result: " + result);
        return (a * b) / findGCD(a, b); // Fórmula para calcular el MCM
    }
    // Fórmula para calcular el MCD: a % b
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a; // Retorna el MCD
    }
}
