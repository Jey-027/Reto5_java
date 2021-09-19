package modelo;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import controlador.Conector;
import javax.swing.JOptionPane;

public class Comprador {
    //Atributos
    private int documento;
    private String tipoDocumento;
    private String nombre;
    private String apellido;
    private String celular;
    private String correo;
    
//Metodo constructor
    public Comprador() {

    }
    //Metodo constructor
    public Comprador(int doc, String tipoDoc, String nombre, String apellido, String celular, String correo){
        this.documento = doc;
        this.tipoDocumento = tipoDoc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.correo = correo;
        crear_cliente();
    }


    //Metodos Getter y Setter de la clase Comprador
    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    //Metodo Crear cliente en la tabla comprador
    public void crear_cliente() {
        System.out.println("metodo crear cliente");
        String query = "INSERT INTO comprador(documento, tipo_de_documento, nombre, apellido, celular, correo) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement statement = Conector.getConn().prepareStatement(query);
            statement.setInt(1, getDocumento());
            statement.setString(2, getTipoDocumento());
            statement.setString(3, getNombre());
            statement.setString(4, getApellido());
            statement.setString(5, getCelular());
            statement.setString(6, getCorreo());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Se ha creado el comprador!");
                JOptionPane.showMessageDialog(null, "Se ha creado el comprador!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    
    

    
}
