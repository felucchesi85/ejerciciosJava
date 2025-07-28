package HexadecimalChecker;

public class HexadecimalChecker {

    public static void main(String[] args) {
        System.out.println(isHexadecimal("1A")); // true
        System.out.println(isHexadecimal("10")); // true
        System.out.println(isHexadecimal("10G")); // false
    }

    public static boolean isHexadecimal(String str) {
        // ^[0-9A-Fa-f]+$ es una expresión regular que verifica si la cadena contiene solo números hexadecimales
        // ^ es el inicio de la cadena
        // [0-9A-Fa-f] es un rango de caracteres que incluyen los números del 0 al 9 y las letras A a F en mayúsculas y minúsculas
        // + es un carácter que indica que el rango anterior puede aparecer una o más veces
        // $ es el final de la cadena
        return str.matches("^[0-9A-Fa-f]+$");
    }   
}
