package DigitCounter;

public class DigitCounter {
    public static void main(String[] args) {
        int number = 12345; // Ejemplo de número
        int count = countDigits(number);
        System.out.println("El número " + number + " tiene " + count + " dígitos.");
    }

    public static int countDigits(int number) {
        if (number == 0) return 1; // El número 0 tiene un dígito
        int count = 0;
        while (number != 0) {
            number /= 10; // Eliminar el último dígito
            count++;
        }
        return count;
    }
    
}
