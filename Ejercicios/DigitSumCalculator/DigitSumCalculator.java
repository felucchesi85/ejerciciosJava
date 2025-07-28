package DigitSumCalculator;

// Este programa calcula la suma de los dígitos de un número entero positivo.
public class DigitSumCalculator {
    public static void main(String[] args) {
        int number = 1234; // Ejemplo de número
        int sum = 0;

        while (number > 0) {
            sum += number % 10; // Sumar el último dígito
            number /= 10; // Eliminar el último dígito
        }

        System.out.println("La suma de los dígitos es: " + sum);
    }
}
