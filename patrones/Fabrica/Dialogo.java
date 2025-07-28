package patrones.Fabrica;

public abstract class Dialogo {
    
    public void mostrar() {
        Boton boton = crearBoton();
        boton.dibujar();
        System.out.println("Mostrando el dialogo");
    }

    public abstract Boton crearBoton();

}
