package IsArraySorted;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 4};
        boolean isSorted = isSorted(numbers);
        System.out.println("Is array sorted: " + isSorted);
    }
    // Método para verificar si un array está ordenado
    public static boolean isSorted(int[] array) {
        // Inicializa la variable isSorted en true
        boolean isSorted = true;
        // Itera desde el principio del array hasta el penúltimo elemento
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSorted = false;
                // Si el elemento actual es mayor que el siguiente, el array no está ordenado
                break;
                // Se sale del bucle
            }
        }
        return isSorted;
    }
}
