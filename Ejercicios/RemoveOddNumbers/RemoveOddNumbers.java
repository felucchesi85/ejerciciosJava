package RemoveOddNumbers;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class RemoveOddNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(7);
        numbers.add(4);
        numbers.add(9);
        System.out.println("Numbers: " + removeOddNumbers3(numbers));
    }

    public static ArrayList<Integer> removeOddNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

    public static ArrayList<Integer> removeOddNumbers2(ArrayList<Integer> numbers) {
        return numbers.stream()
            .filter(number -> number % 2 == 0)
            .collect(Collectors.toCollection(ArrayList::new));
    }

    public static ArrayList<Integer> removeOddNumbers3(ArrayList<Integer> numbers) {
        numbers.removeIf(number -> number % 2 != 0);
        return numbers;
    }
}
