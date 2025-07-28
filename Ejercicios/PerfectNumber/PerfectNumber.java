package PerfectNumber;

public class PerfectNumber {
    public static void main(String[] args) {
        int numero = 28; // Ejemplo de número a verificar
        if (esNumeroPerfecto(numero)) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }
    }

    public static boolean esNumeroPerfecto(int n) {
        int sumaDivisores = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumaDivisores += i;
            }
        }
        return sumaDivisores == n;
    }
}
