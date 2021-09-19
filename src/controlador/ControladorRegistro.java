
package controlador;
import modelo.Comprador;

public class ControladorRegistro {
    //metodo que crea un registro en la tabla comprador
    public static Comprador crearComprador(int documento, String tipoDocumento, String nombre, String apellido, String celular, String correo){
        Comprador cliente = new Comprador(documento, tipoDocumento, nombre, apellido, celular, correo);
        return cliente;
    }
    
    
}
