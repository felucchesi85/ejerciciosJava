package LeapYear;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2020;

        if (esAnioBisiesto(year)) {
            System.out.println(year + " es un año bisiesto.");
        } else {
            System.out.println(year + " no es un año bisiesto.");
        }
    }

    public static boolean esAnioBisiesto(int anio) {
        // Un año es bisiesto si es divisible por 4
        // pero no por 100, a menos que también sea divisible por 400
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
}
