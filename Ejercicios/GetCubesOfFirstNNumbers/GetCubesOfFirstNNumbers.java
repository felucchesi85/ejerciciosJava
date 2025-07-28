package GetCubesOfFirstNNumbers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Enunciado resumido: Generar una lista con los cubos de los primeros N números.
// Dado un número N, calcula el cubo de los primeros N números y devuelve una lista con los resultados.
// Ejemplo:
// Input: 3
// Output: [1, 8, 27]
public class GetCubesOfFirstNNumbers {

    public static void main(String[] args) {
        int n = 3;
        List<Integer> cubes = cubesOfN(n);
        System.out.println(cubes);
    }

    public static List<Integer> cubesOfN(int n) {
        return IntStream.rangeClosed(1, n)
                       .map(i -> i * i * i)
                       .boxed()
                       .collect(Collectors.toList());
    }
}
