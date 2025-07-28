package WeatherAdvisor;

public class WeatherAdvisor {
    public static void main(String[] args) {
        int temperatura = 18; // Ejemplo de temperatura en grados Celsius
        String clima = "soleado"; // Ejemplo de clima

        if (temperatura > 25 && clima.equals("soleado")) {
            System.out.println("Es un buen día para ir a la playa.");
        } else if (temperatura < 15) {
            System.out.println("Hace frío, es mejor quedarse en casa.");
        } else {
            System.out.println("El clima es moderado, puedes hacer actividades al aire libre.");
        }
    }
}
