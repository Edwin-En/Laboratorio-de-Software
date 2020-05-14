/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;


public class jpfactura extends javax.swing.JPanel{
 
    public jpfactura() {
        
        initComponents();        
    }
   
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpfacturar1 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        lbservicio_2 = new javax.swing.JLabel();
        btbuscar2 = new javax.swing.JButton();
        btagregar = new javax.swing.JButton();
        btagendar6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btagendar7 = new javax.swing.JButton();
        lbobservar1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtproductos = new javax.swing.JTable();
        jcservicios = new javax.swing.JComboBox<>();
        btagendar8 = new javax.swing.JButton();
        lbespecialista = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(630, 470));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpfacturar1.setBackground(new java.awt.Color(255, 255, 255));
        jpfacturar1.setPreferredSize(new java.awt.Dimension(690, 650));
        jpfacturar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setText("Cliente:");
        jpfacturar1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 30));

        jLabel26.setText("ID:");
        jpfacturar1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, 30));
        jpfacturar1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 130, -1));
        jpfacturar1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 200, 10));
        jpfacturar1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 200, 10));

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Datos del Servicio");
        jLabel34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpfacturar1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 201, -1));

        jLabel35.setText("Observaciones:");
        jpfacturar1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        lbservicio_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        jpfacturar1.add(lbservicio_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 540, 20));

        btbuscar2.setBackground(new java.awt.Color(255, 255, 255));
        btbuscar2.setForeground(new java.awt.Color(51, 182, 215));
        btbuscar2.setText("Buscar");
        btbuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscar2ActionPerformed(evt);
            }
        });
        jpfacturar1.add(btbuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 90, 40));

        btagregar.setBackground(new java.awt.Color(255, 255, 255));
        btagregar.setForeground(new java.awt.Color(51, 182, 215));
        btagregar.setText("Agregar");
        btagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btagregarActionPerformed(evt);
            }
        });
        jpfacturar1.add(btagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 90, 40));

        btagendar6.setBackground(new java.awt.Color(255, 255, 255));
        btagendar6.setForeground(new java.awt.Color(51, 182, 215));
        btagendar6.setText("Imprimir");
        btagendar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btagendar6ActionPerformed(evt);
            }
        });
        jpfacturar1.add(btagendar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 90, 40));

        jLabel3.setText("No. Factura:");
        jpfacturar1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, -1));

        btagendar7.setBackground(new java.awt.Color(255, 255, 255));
        btagendar7.setForeground(new java.awt.Color(51, 182, 215));
        btagendar7.setText("Salir");
        btagendar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btagendar7ActionPerformed(evt);
            }
        });
        jpfacturar1.add(btagendar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 60, 40));

        lbobservar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        jpfacturar1.add(lbobservar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 610, 60));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jpfacturar1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 230, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jpfacturar1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 230, -1));

        jLabel6.setText("Firma Cliente");
        jpfacturar1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jLabel7.setText("Firma Especilista");
        jpfacturar1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, -1, -1));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 182, 215)));
        jpfacturar1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 120, 20));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 182, 215));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("FACTURA VENTA");
        jLabel2.setToolTipText("");
        jpfacturar1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 10, 620, -1));

        jLabel8.setText("Fecha:");
        jpfacturar1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));
        jpfacturar1.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 110, 30));

        jtproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cant.", "Descripcion", "Desc.", "Vl. Unitario", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtproductos);

        jpfacturar1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 610, 110));

        jcservicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcserviciosActionPerformed(evt);
            }
        });
        jpfacturar1.add(jcservicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 500, -1));

        btagendar8.setBackground(new java.awt.Color(255, 255, 255));
        btagendar8.setForeground(new java.awt.Color(51, 182, 215));
        btagendar8.setText("Guardar");
        btagendar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btagendar8ActionPerformed(evt);
            }
        });
        jpfacturar1.add(btagendar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 90, 40));

        lbespecialista.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jpfacturar1.add(lbespecialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 376, 230, 20));

        add(jpfacturar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 470));
    }// </editor-fold>//GEN-END:initComponents

       
    private void btbuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btbuscar2ActionPerformed

    private void btagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btagregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btagregarActionPerformed

    private void btagendar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btagendar6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btagendar6ActionPerformed

    private void btagendar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btagendar7ActionPerformed
            System.exit(0);
    }//GEN-LAST:event_btagendar7ActionPerformed

    private void btagendar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btagendar8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btagendar8ActionPerformed

    private void jcserviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcserviciosActionPerformed
                 
              
    }//GEN-LAST:event_jcserviciosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btagendar6;
    private javax.swing.JButton btagendar7;
    private javax.swing.JButton btagendar8;
    private javax.swing.JButton btagregar;
    private javax.swing.JButton btbuscar2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JComboBox<String> jcservicios;
    private javax.swing.JPanel jpfacturar1;
    private javax.swing.JTable jtproductos;
    private javax.swing.JLabel lbespecialista;
    private javax.swing.JLabel lbobservar1;
    private javax.swing.JLabel lbservicio_2;
    // End of variables declaration//GEN-END:variables
}
