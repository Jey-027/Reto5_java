/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.VistaBorrar;
import access.VentaDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Venta;

/**
 *
 * @author jrodriguez
 */
//se usa para detectar y manejar eventos de acción
public class ControladorBorrar implements ActionListener {
    public static VentaDAO dao = new VentaDAO();
    public static VistaBorrar vista = new VistaBorrar();
    public static DefaultTableModel modelo = new DefaultTableModel();
    
    public ControladorBorrar(VistaBorrar v){
        ControladorBorrar.vista = v;
        this.vista.ButtonConsulta.addActionListener(this);
        
    }

    @Override
    //metodo que genera un evento de accion al momento de dar clic en el boton consulta
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.ButtonConsulta){
            mostrarVentas(vista.TablaConsultaVen);
        } 
    }
    
    //metodo mostrar tabla ventas
    public static void mostrarVentas(JTable tabla){
        modelo = (DefaultTableModel)tabla.getModel();
        tabla.setModel(modelo);
        List<Venta> lista = dao.mostrarVentas();
        Object[] object = new Object[2];
        for(int i=0; i<lista.size(); i++){
            object[0] = lista.get(i).getId();
            object[1] = lista.get(i).getFecha();
            modelo.addRow(object);
        }
        
    }
    
    //Limpia la tabla de la vista borrar
    public static void limpiarTabla() {
        modelo.setRowCount(0);
    }
    
}
