package FactorialCalculator;

public class FactorialCalculator {  
    public static void main(String[] args) {
        int numero = 5; // Ejemplo de número para calcular el factorial
        long factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }

    public static long calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // El factorial de 0 y 1 es 1
        }
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i; // Multiplicar cada número hasta n
        }
        return resultado;
    }
    
}
