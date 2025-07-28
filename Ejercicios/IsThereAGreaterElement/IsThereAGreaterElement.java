package IsThereAGreaterElement;

// Recorrer un array y determinar si hay un número mayor que un valor dado.
public class IsThereAGreaterElement {   

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int x = 6;
        boolean result = isThereAGreaterElement(array, x);
        System.out.println("Is there a greater element? " + result);
    }
    // Método 1: Usando un bucle for each
    // Este método es más eficiente que el método 2 porque no recorre el array dos veces
    // isThereAGreaterElement2 es un metodo que se usa para comparar el valor de x con el valor de cada elemento del array
    public static boolean isThereAGreaterElement(int[] array, int x) {
        for (int i : array) {
            if (i > x) {
                return true;
            }
        }
        return false;
    }

    public static boolean isThereAGreaterElement2(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > x) {
                return true;
            }
        }
        return false;
    }
    
}
