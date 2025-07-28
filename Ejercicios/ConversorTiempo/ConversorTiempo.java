package ConversorTiempo;

public class ConversorTiempo {
    public static void main(String[] args) {
        int minutos = 120; // Ejemplo de minutos a convertir
        int horas = minutos / 60; // Conversión de minutos a horas
        int restantes = minutos % 60; // Minutos restantes
        System.out.println("Conversor de Tiempo");
        System.out.println(minutos + " minutos son " + horas + " horas y " + restantes + " minutos.");
    }
}
