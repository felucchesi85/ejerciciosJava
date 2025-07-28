package SumaCuadrados;

public class SumaCuadrados {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 5; i++) {
            // Sumar el cuadrado de cada número del 1 al 5
            suma += i * i;
        }
        System.out.println("La suma de los cuadrados de los primeros 5 números es: " + suma);
    }
}
