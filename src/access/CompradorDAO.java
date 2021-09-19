
package access;
import  controlador.Conector;
import  modelo.Comprador;
import  java.sql.Connection;
import  java.sql.PreparedStatement ;
import  java.sql.ResultSet ;
import  java.sql.SQLException;
import  java.util.ArrayList;
import  java.util.List ;


public class CompradorDAO {
    //Atributos
    PreparedStatement ps;
    ResultSet rs;
    Connection conn;
    Conector newconection = new Conector();

    public List mostrar() {
        List<Comprador> datos = new ArrayList<>();
        try {
            //creando la conexion y la consulta a realizar en la BD.
            conn = newconection.getConn();
            ps = conn.prepareStatement("Select * from comprador");
            rs = ps.executeQuery();
            while (rs.next()) {
                Comprador customer = new Comprador();
                customer.setDocumento(rs.getInt(1));
                customer.setTipoDocumento(rs.getString(2));
                customer.setNombre(rs.getString(3));
                customer.setApellido(rs.getString(4));
                customer.setCelular(rs.getString(5));
                customer.setCorreo(rs.getString(6));
                //Agregando los datos de la tabla comprador a la lista datos
                datos.add(customer);
            }

        } catch (SQLException ex) {
        }
        return datos;
    }
        
    
}


