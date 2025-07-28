package AnagramChecker;

import java.util.Arrays;

// Verificar si dos cadenas son anagramas.
// Dos cadenas son anagramas si tienen las mismas letras en diferente orden.
// Ejemplo: "listen" y "silent" son anagramas.
// Ejemplo: "hello" y "world" no son anagramas.
public class AnagramChecker {

    public static void main(String[] args) {
        System.out.println(isAnagram3("listen", "silent")); // true
        System.out.println(isAnagram3("hello", "world"));   // false
    }

    // Método 1: Usando Arrays.sort()
    // Este método es más eficiente que el método 2 porque no recorre el array dos veces
    // isAnagram es un metodo que se usa para comparar si dos cadenas son anagramas
    public static boolean isAnagram(String str1, String str2) {
        char[] a = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] b = str2.replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    // Método 3: Usando un bucle for each
    public static boolean isAnagram3(String str1, String str2) {
        // Si las cadenas no tienen el mismo tamaño, no son anagramas
        if (str1.length() != str2.length()) {
            return false;
        }
        // Si las cadenas tienen el mismo tamaño, se compara cada caracter de la primera cadena con cada caracter de la segunda cadena
        for (char c : str1.toCharArray()) {
            // Si el caracter de la primera cadena no se encuentra en la segunda cadena, no son anagramas
            // indexOf() devuelve la posición de la primera aparición del caracter en la cadena
            // Si el caracter no se encuentra, indexOf() devuelve -1
            if (str2.indexOf(c) == -1) {
                return false;
            }

        }   
        return true;
    }
}
