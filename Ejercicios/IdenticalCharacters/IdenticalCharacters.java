package IdenticalCharacters;

public class IdenticalCharacters {
    public static void main(String[] args) {
        String text = "Call ";            	
        boolean hasConsecutive = hasConsecutiveCharacters(text);
        System.out.println("Has consecutive characters: " + hasConsecutive);
    }

        public static boolean hasConsecutiveCharacters(String text) {
            // El bucle itera a través de cada carácter en el texto excepto el último
            // i comienza en 0 (primer carácter) y va hasta length-1 (penúltimo carácter)
            // Esto es porque comparamos cada carácter con el siguiente (i+1)
            // Ejemplo: para el texto "Call":
            // i=0: compara 'C' con 'a' 
            // i=1: compara 'a' con 'l'
            // i=2: compara 'l' con 'l' (retorna true aquí)
            // i=3: compararía 'l' con nada, por eso paramos en length-1
            for (int i = 0; i < text.length() - 1; i++) {
                if (text.charAt(i) == text.charAt(i + 1)) {
                    return true;
                }
            }
            return false;
 
    }
}



