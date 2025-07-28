package ReverseArray;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] reversedArray = reverseArray(array);
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
    }

    // Método para invertir un array
    public static int[] reverseArray(int[] array) {
        // Crea un nuevo array con el mismo tamaño que el array original
        int[] reversedArray = new int[array.length];
        // Itera desde el final del array hasta el principio
        for (int i = 0; i < array.length; i++) {
            System.out.println("i: " + i);
            System.out.println("array.length - i - 1: " + (array.length - i - 1));
            System.out.println("array[array.length - i - 1]: " + array[array.length - i - 1]);
            System.out.println("reversedArray[i]: " + reversedArray[i]);
            System.out.println("--------------------------------");
            // Asigna el valor del array original en la posición i al array invertido en la posición array.length - i - 1
            // Se resta 1 a la posición del array original para que el array invertido comience en 0
            reversedArray[i] = array[array.length - i - 1];
        }
        return reversedArray;
    }
}
