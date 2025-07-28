package SecondLargestElement;

public class SecondLargestElement2 {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 8, 15};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > max) {
                secondMax = max;
                max = number;
            } else if (number > secondMax && number != max) {
                secondMax = number;
            }
        }

        System.out.println("Second largest element: " + secondMax);
    }
}
