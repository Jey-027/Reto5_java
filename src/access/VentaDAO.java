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
import modelo.Comprador;
import modelo.Venta;

/**
 *
 * @author jrodriguez
 */
public class VentaDAO {
    //Atributos
    PreparedStatement ps;
    ResultSet rs;
    Connection conn;
    Conector newconection = new Conector();
    Comprador c = new Comprador();
    
    // metodo borrar campo de la tabla venta
    public void borrarRegistro(int documento) {

        try {
            if (conn == null) {
                conn = newconection.getConn();
            }

            String sql = "Delete from venta where id = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, documento);
            int rowsDeleted = ps.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "registro borrado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "id : " + ex.getErrorCode() + "\nError" + ex.getMessage());
        }

    }
    
    //Metodo mostrar Ventas - realiza una consulta a la tabla venta
    public List mostrarVentas() {
        List<Venta> datos3 = new ArrayList<>();
        try {
            conn = newconection.getConn();
            ps = conn.prepareStatement("Select * from venta");
            rs = ps.executeQuery();
            while (rs.next()) {
                Venta venta = new Venta();
                venta.setIdVenta(rs.getInt(1));
                venta.setFecha(rs.getString(4));
                //guarda los datos consultados en la lista datos3.
                datos3.add(venta);
            }

        } catch (SQLException ex) {
            
        }
        return datos3;
    }
    
    
}
