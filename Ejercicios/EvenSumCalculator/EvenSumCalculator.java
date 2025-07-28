package EvenSumCalculator;

import java.util.ArrayList;

public class EvenSumCalculator {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(8);
        numbers.add(3);
        numbers.add(6);
        System.out.println("Sum of even numbers: " + sumOfEvenNumbers(numbers));
    }

    public static int sumOfEvenNumbers(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }
}
