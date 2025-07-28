package FactorsFinder;

import java.util.ArrayList;
import java.util.List;

public class FactorsFinder {
    public static void main(String[] args) {
        int number = 12;
        List<Integer> factors = findFactors(number);
        System.out.println("Factors of " + number + " are: " + factors);
    }

    // Método para encontrar los factores de un número
    public static List<Integer> findFactors(int number) {
        List<Integer> factors = new ArrayList<Integer>();
        // Itera desde 1 hasta el número, y si el número es divisible por i, se añade a la lista de factores
        for (int i = 1; i <= number; i++) {
            // Si el número es divisible por i, se añade a la lista de factores
            if (number % i == 0) {  
                factors.add(i);
            }
        }
        return factors;
    }
}
