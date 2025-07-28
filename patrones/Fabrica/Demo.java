package patrones.Fabrica;
public class Demo {
    public static void main(String[] args) {
    Dialogo dialogo;

        //Supongamos que queremos botones segun el entorno
        String sistema = "web"; // podria venir de una configuracion

        if (sistema.equals("Windows")) {
            dialogo = new DialogoWindows();
        } else {
            dialogo = new DialogoWeb();
        }

        dialogo.mostrar();
    }
}
