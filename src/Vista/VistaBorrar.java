/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import access.VentaDAO;
import controlador.ControladorBorrar;


/**
 *
 * @author jrodriguez
 */
public class VistaBorrar extends javax.swing.JFrame {
    //crea el objeto daoCargar desde VentaDao
    VentaDAO daoCargar = new VentaDAO();

    /**
     * Creates new form VistaBorrar
     */
    public void limpiaCampos(){
        inputCampo.setText(null);
        
    }
    
    public VistaBorrar() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ButtonVolver = new javax.swing.JButton();
        ButtonConsultar = new javax.swing.JButton();
        ButtonDelete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        inputCampo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ButtonConsulta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaConsultaVen = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(14, 100, 128));

        ButtonVolver.setBackground(new java.awt.Color(12, 20, 23));
        ButtonVolver.setFont(new java.awt.Font("Khmer OS System", 0, 18)); // NOI18N
        ButtonVolver.setForeground(new java.awt.Color(254, 254, 250));
        ButtonVolver.setText("Volver");
        ButtonVolver.setFocusable(false);
        ButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVolverActionPerformed(evt);
            }
        });

        ButtonConsultar.setBackground(new java.awt.Color(12, 20, 23));
        ButtonConsultar.setFont(new java.awt.Font("Khmer OS System", 0, 18)); // NOI18N
        ButtonConsultar.setForeground(new java.awt.Color(254, 254, 250));
        ButtonConsultar.setText("Consultar Cliente");
        ButtonConsultar.setFocusable(false);
        ButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConsultarActionPerformed(evt);
            }
        });

        ButtonDelete.setBackground(new java.awt.Color(12, 20, 23));
        ButtonDelete.setFont(new java.awt.Font("Khmer OS System", 0, 18)); // NOI18N
        ButtonDelete.setForeground(new java.awt.Color(254, 254, 250));
        ButtonDelete.setText("Borrar Registro");
        ButtonDelete.setFocusable(false);
        ButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeleteActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(1, 1, 1));
        jLabel7.setText("Store Music FY - Borrar Venta");

        inputCampo.setFont(new java.awt.Font("Khmer OS System", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Khmer OS System", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("ID venta a eliminar");

        ButtonConsulta.setBackground(new java.awt.Color(12, 20, 23));
        ButtonConsulta.setFont(new java.awt.Font("Khmer OS System", 0, 18)); // NOI18N
        ButtonConsulta.setForeground(new java.awt.Color(254, 254, 250));
        ButtonConsulta.setText("Consultar Ventas");
        ButtonConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConsultaActionPerformed(evt);
            }
        });

        TablaConsultaVen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Venta", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(TablaConsultaVen);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(ButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ButtonConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(ButtonConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(inputCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonDelete)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConsultarActionPerformed
        VistaConsulta consultaCliente = new VistaConsulta();
        consultaCliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonConsultarActionPerformed

    private void ButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVolverActionPerformed
        VistaMenu verMenu = new VistaMenu();
        verMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonVolverActionPerformed

    private void ButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteActionPerformed
     VentaDAO dao2 = new VentaDAO();
     dao2.borrarRegistro(Integer.parseInt(inputCampo.getText()));
     limpiaCampos();
     ControladorBorrar.limpiarTabla();
     
        
    }//GEN-LAST:event_ButtonDeleteActionPerformed

    private void ButtonConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConsultaActionPerformed
        ControladorBorrar.limpiarTabla();
        ControladorBorrar.mostrarVentas(TablaConsultaVen);
        
    }//GEN-LAST:event_ButtonConsultaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaBorrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaBorrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaBorrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaBorrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaBorrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton ButtonConsulta;
    private javax.swing.JButton ButtonConsultar;
    private javax.swing.JButton ButtonDelete;
    private javax.swing.JButton ButtonVolver;
    public javax.swing.JTable TablaConsultaVen;
    private javax.swing.JTextField inputCampo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
