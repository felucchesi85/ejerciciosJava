package SecondLargest;

// Encontrar el segundo número más grande en un array.
public class SecondLargest {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int secondLargest = findSecondLargest2(array);
        System.out.println("Second largest: " + secondLargest);
    }

    public static int findSecondLargest(int[] array) {
        int largest = array[0];
        int secondLargest = array[0];
        // Recorrer el array y encontrar el segundo número más grande
        for (int i = 0; i < array.length; i++) {
            // Si el número actual es mayor que el número más grande, actualizar el segundo número más grande
            if (array[i] > largest) {
                // Actualizar el segundo número más grande
                secondLargest = largest;
                // Actualizar el número más grande
                largest = array[i]; 
            }
            // Si el número actual es mayor que el segundo número más grande y diferente al número más grande, actualizar el segundo número más grande
            else if (array[i] > secondLargest && array[i] != largest) {
                // Actualizar el segundo número más grande
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }

    public static int findSecondLargest2(int[] arr) {
            int max = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;
            for(int v: arr) {
              if(v > max) {
                 second = max; max = v; 
                }
              else if(v > second && v != max)
               second = v;
            }
            return second > Integer.MIN_VALUE ? second : null;
          }
}
