package patrones.Fabrica;

public class DialogoWeb extends Dialogo {
    public Boton crearBoton() {
        return new BotonWeb();
    }

}