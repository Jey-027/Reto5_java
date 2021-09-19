
package controlador;

import access.CompradorDAO;
import Vista.VistaConsulta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Comprador;

//se usa para detectar y manejar eventos de acción
public class ControladorConsulta implements ActionListener{
    
    public static CompradorDAO dao = new CompradorDAO();
    public static VistaConsulta vista = new VistaConsulta();
    public static DefaultTableModel modelo = new DefaultTableModel();
    
    //Metodo constructor
    public ControladorConsulta(VistaConsulta v){
        ControladorConsulta.vista = v;
        this.vista.ButtonConsulta.addActionListener(this);
        
    }

    @Override
    //metodo que genera un evento de accion al momento de dar clic en el boton consulta
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.ButtonConsulta){
            mostrar(vista.tableConsulta);
        } 
    }
    
    //Metodo que muestra la tabla comprador a traves de una lista
    public static void mostrar(JTable tabla){
        modelo = (DefaultTableModel)tabla.getModel();
        tabla.setModel(modelo);
        List<Comprador> lista = dao.mostrar();
        Object[] object = new Object[6];
        for(int i=0; i<lista.size(); i++){
            object[0] = lista.get(i).getDocumento();
            object[1] = lista.get(i).getTipoDocumento();
            object[2] = lista.get(i).getNombre();
            object[3] = lista.get(i).getApellido();
            object[4] = lista.get(i).getCelular();
            object[5] = lista.get(i).getCorreo();
            modelo.addRow(object);
        }
        
    }
    
    //limpia la tabla de la vista consulta
    public static void limpiarTabla() {
        modelo.setRowCount(0);
    }
    


    

    
}
