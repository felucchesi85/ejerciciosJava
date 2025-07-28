package SecondLargestElement;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 8, 15};
        int secondLargestElement = findSecondLargestElement(numbers);
        System.out.println("Second largest element: " + secondLargestElement);
    }

    public static int findSecondLargestElement(int[] array) {
        Arrays.sort(array);
        return array[array.length - 2];
    }

}
