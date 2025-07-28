package FilterOddNumbers;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// Ejercicio 1: Filtrar números impares
// Dada una lista de números enteros, filtra los números impares y devuelve una nueva lista con los números impares.
// Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
// Output: [1, 3, 5, 7, 9]
public class FilterOddNumbers {

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> oddNumbers = filterOddNumbers(input);
        System.out.println(oddNumbers);
    }

    public static List<Integer> filterOddNumbers(List<Integer> numbers) {
        Predicate<Integer> isOdd = n -> n % 2 != 0;
        return numbers.stream()
                      .filter(isOdd)
                      .collect(Collectors.toList());
    }
    
    
}
