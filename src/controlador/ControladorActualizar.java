/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.VistaActualizar;
import access.ProductoDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;
/**
 *
 * @author jrodriguez
 */
//se usa para detectar y manejar eventos de acción
public class ControladorActualizar implements ActionListener {
    
    public static ProductoDAO dao = new ProductoDAO();
    public static VistaActualizar vista = new VistaActualizar();
    public static DefaultTableModel modelo = new DefaultTableModel();
    
    public ControladorActualizar(VistaActualizar v){
        ControladorActualizar.vista = v;
        this.vista.ButtonConsulta.addActionListener(this);
        
    }

    @Override
    //metodo que genera un evento de accion al momento de dar clic en el boton consulta
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.ButtonConsulta){
            mostrar(vista.tableConsulta);
        } 
    }
    
    //metodo mostrar tabla productos
    public static void mostrar(JTable tabla){
        modelo = (DefaultTableModel)tabla.getModel();
        tabla.setModel(modelo);
        List<Producto> lista = dao.mostrarProductos();
        Object[] object = new Object[6];
        for(int i=0; i<lista.size(); i++){
            object[0] = lista.get(i).getId();
            object[1] = lista.get(i).getNombre();
            object[2] = lista.get(i).getPrecio();
            object[3] = lista.get(i).getGenero();
            modelo.addRow(object);
        }
        
    }
    
    //Limpia la tabla de la vista actualizar
    public static void limpiarTabla() {        
            modelo.setRowCount(0);
    }
    
}
