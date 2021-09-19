package reto5;
import controlador.Conector;
import Vista.*;

public class Reto5 {

    public static void main(String[] args) {
        //llama al metodo encargado de realizar la conexion a la BD.
        Conector.conectar();
        //llama la vista menu que es el formulario principal de la aplicacion
        VistaMenu pantalla_menu = new VistaMenu();
        //Indica si la vista se puede visualizar
        pantalla_menu.setVisible(true);
        


    }
    
}
