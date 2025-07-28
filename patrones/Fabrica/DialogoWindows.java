package patrones.Fabrica;

public class DialogoWindows extends Dialogo {
    public Boton crearBoton() {
        return new BotonWindows();
    }

}