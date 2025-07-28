package MultiplesGeneratorList;

import java.util.ArrayList;
import java.util.List;

public class MultiplesGenerator {
    public static void main(String[] args) {
        int number = 3;
        int limit = 20;
        List<Integer> multiples = generateMultiples(number, limit);
        System.out.println("Multiples of " + number + " less than " + limit + " : " + multiples);
    }

    public static List<Integer> generateMultiples(int number, int limit) {
        List<Integer> multiples = new ArrayList<Integer>();
        // Itera desde el número inicial hasta el límite, incrementando en pasos del número
        // para generar todos sus múltiplos menores al límite
        for (int i = number; i < limit; i += number) {
            multiples.add(i);
        }
        return multiples;
    }
}
