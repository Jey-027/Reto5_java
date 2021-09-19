/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

import controlador.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Producto;

/**
 *
 * @author jrodriguez
 */
public class ProductoDAO {
    //Atributos
    PreparedStatement ps;
    ResultSet rs;
    Connection conn;
    Conector newconection = new Conector();
    
    //Metodo actualizar datos, recibiendo los parametros precio y id de la tabla producto
    public void actualizaRegistro(int precio, int id) {
        try {
            if (conn == null) {
                conn = newconection.getConn();
            }
            //realizando la actualizacion en la BD
            String sql = "Update producto set precio = ? where id = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, precio);
            ps.setInt(2, id);
            int rowsUpdate = ps.executeUpdate();
            if (rowsUpdate > 0) {
                JOptionPane.showMessageDialog(null, "Precio Actualizado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "precio : " + ex.getErrorCode() + "\nError" + ex.getMessage());
        }

    }
    
     //Metodo mostrar productos - realiza una consulta a la tabla productos
     public List mostrarProductos() {
        List<Producto> datos2 = new ArrayList<>();
        try {
            conn = newconection.getConn();
            ps = conn.prepareStatement("Select * from producto");
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto producto2 = new Producto();
                producto2.setId(rs.getInt(1));
                //producto2.setAutor(rs.getAutor(2));
                producto2.setNombre(rs.getString(3));
                producto2.setPrecio(rs.getInt(4));
                producto2.setGenero(rs.getString(5));
                //guarda los datos consultados en la lista datos2.
                datos2.add(producto2);
            }

        } catch (SQLException ex) {
        }
        return datos2;
    }
    
}
