package NumberReverser;

/*
 * Explicación del funcionamiento:
 * 
 * El objetivo de esta clase es invertir un número entero.
 * 
 * ¿Cómo funciona?
 * 1. Usamos number % 10 para obtener el último dígito del número.
 *    Por ejemplo, si number = 1234, entonces 1234 % 10 = 4.
 * 2. Ese dígito lo agregamos al final del número invertido (reversedNumber),
 *    multiplicando el número invertido por 10 y sumando el dígito extraído.
 * 3. Eliminamos el último dígito del número original dividiendo entre 10 (number /= 10).
 * 4. Repetimos el proceso hasta que el número original sea 0.
 * 
 * Ejemplo paso a paso con number = 1234:
 * - reversedNumber inicia en 0.
 * - Extraemos 4: reversedNumber = 0 * 10 + 4 = 4
 * - Extraemos 3: reversedNumber = 4 * 10 + 3 = 43
 * - Extraemos 2: reversedNumber = 43 * 10 + 2 = 432
 * - Extraemos 1: reversedNumber = 432 * 10 + 1 = 4321
 * 
 * Así, el número queda invertido.
 */

public class NumberReverser {
    public static void main(String[] args) {
        int number = 1234; // Ejemplo de número a invertir
        int reversedNumber = 0;

        while (number != 0) {
            // Extraer el último dígito y construir el número invertido
            int digit = number % 10;
            System.out.println("Dígito actual: " + digit);
            reversedNumber = reversedNumber * 10 + digit; // Construir el número invertido
            number /= 10; // Eliminar el último dígito del número original
        }

        System.out.println("Número invertido: " + reversedNumber);
    }
}