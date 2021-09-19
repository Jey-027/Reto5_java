/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import controlador.ControladorConsulta;



/**
 *
 * @author jrodriguez
 */
public class VistaConsulta extends javax.swing.JFrame {

    /**
     * Creates new form VistaConsulta
     */
    public VistaConsulta() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tableConsulta = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        ButtonVolver2 = new javax.swing.JButton();
        ButtonConsulta = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(7, 100, 130));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(7, 100, 130));

        tableConsulta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(161, 17, 17)));
        tableConsulta.setForeground(new java.awt.Color(14, 7, 7));
        tableConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento", "TipoDocumento", "Nombre", "Apellido", "Celular", "Correo"
            }
        ));
        jScrollPane2.setViewportView(tableConsulta);

        jPanel2.setBackground(new java.awt.Color(14, 100, 128));

        ButtonVolver2.setBackground(new java.awt.Color(12, 20, 23));
        ButtonVolver2.setFont(new java.awt.Font("Khmer OS System", 0, 18)); // NOI18N
        ButtonVolver2.setForeground(new java.awt.Color(254, 254, 254));
        ButtonVolver2.setText("Volver");
        ButtonVolver2.setFocusable(false);
        ButtonVolver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVolver2ActionPerformed(evt);
            }
        });

        ButtonConsulta.setBackground(new java.awt.Color(12, 20, 23));
        ButtonConsulta.setFont(new java.awt.Font("Khmer OS System", 0, 18)); // NOI18N
        ButtonConsulta.setForeground(new java.awt.Color(254, 254, 251));
        ButtonConsulta.setText("Consultar Comprador");
        ButtonConsulta.setFocusable(false);
        ButtonConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(ButtonConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205)
                .addComponent(ButtonVolver2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonVolver2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(14, 100, 128));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(90, 26, 26)));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(1, 1, 1));
        jLabel7.setText("Store Music FY - Lista de clientes");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConsultaActionPerformed
        ControladorConsulta.limpiarTabla();
        ControladorConsulta.mostrar(tableConsulta);
    }//GEN-LAST:event_ButtonConsultaActionPerformed

    private void ButtonVolver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVolver2ActionPerformed
        VistaMenu verMenu = new VistaMenu();
        verMenu.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_ButtonVolver2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton ButtonConsulta;
    private javax.swing.JButton ButtonVolver2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tableConsulta;
    // End of variables declaration//GEN-END:variables
}