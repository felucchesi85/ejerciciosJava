package SumOfSquares;

import java.util.Arrays;
import java.util.List;

//Enunciado resumido: Calcular la suma de los cuadrados de los números de una lista.
//Ejemplo:
//Input: [1, 2, 3, 4, 5]
//Output: 55
public class SumOfSquares {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sumOfSquares = sumOfSquares(numbers);
        System.out.println(sumOfSquares);
    }

    public static int sumOfSquares(List<Integer> numbers) {
        return numbers.stream()
                      .map(n -> n * n)
                      .reduce(0, Integer::sum);
    }
}
