package AreSumOfArraysEqual;

public class AreSumOfArraysEqual {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        boolean areSumOfArraysEqual = areSumOfArraysEqual(array1, array2);
        System.out.println("Are sum of arrays equal: " + areSumOfArraysEqual);
    }

    // Método para verificar si la suma de los elementos de dos arrays es igual
    public static boolean areSumOfArraysEqual(int[] array1, int[] array2) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            sum2 += array2[i];
        }
        return sum1 == sum2;
    }
}
