package FindMaxEvenFinder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

//Enunciado resumido: Devolver el número par más alto de una lista.
//Ejemplo:
//Input: [1, 2, 3, 4, 5]
//Output: 4 o -1
public class FindMaxEvenFinder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> maxEven = findMaxEvenFinder(numbers);
        //Si no hay número par, se devuelve "No hay par" 
        System.out.println(maxEven.orElse(-1));
    }

    public static Optional<Integer> findMaxEvenFinder(List<Integer> numbers) {
        //Predicate<Integer> isEven = n -> n % 2 == 0;
        return numbers.stream()
                      .filter(n -> n % 2 == 0)
                      .max(Comparator.naturalOrder());
    }


    public static Optional<Integer> findMaxEvenFinder3(List<Integer> numbers) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        return numbers.stream()
                      .filter(isEven)
                      .max(Comparator.naturalOrder());
    }

    public static Optional<Integer> maxEvenFinder2andSquareOptional(List<Integer> numbers) {
        Function<Integer, Integer> square = n -> n * n;
        return numbers.stream()
                      .filter(n -> n % 2 == 0)
                      .map(square)
                      .max(Comparator.naturalOrder());
    }
}
