/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author jeissoncc
 */
public class jpcancela extends javax.swing.JPanel {

    /**
     * Creates new form jpcancela
     */
    public jpcancela() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpcancelar = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lbservicio_1 = new javax.swing.JLabel();
        txtobservar = new javax.swing.JTextField();
        btbuscar1 = new javax.swing.JButton();
        btagendar2 = new javax.swing.JButton();
        btagendar3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_conse = new javax.swing.JTextField();
        btagendar4 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(630, 470));

        jpcancelar.setBackground(new java.awt.Color(255, 255, 255));
        jpcancelar.setMinimumSize(new java.awt.Dimension(630, 470));
        jpcancelar.setPreferredSize(new java.awt.Dimension(630, 470));
        jpcancelar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setText("Cliente:");
        jpcancelar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 66, -1, 30));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jpcancelar.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 300, -1));

        jLabel15.setText("ID:");
        jpcancelar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, 20));
        jpcancelar.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 139, -1));

        jLabel16.setText("Servicio:");
        jpcancelar.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel17.setText("Direccion:");
        jpcancelar.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 113, -1, -1));

        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        jpcancelar.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 113, 382, 16));

        jLabel19.setText("Telefono:");
        jpcancelar.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 141, 64, -1));

        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        jpcancelar.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 141, 382, 16));

        jLabel21.setText("Contacto:");
        jpcancelar.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 175, -1, -1));

        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        jpcancelar.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 175, 382, 16));
        jpcancelar.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 211, 200, 10));
        jpcancelar.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 211, 200, 10));

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Datos del Servicio");
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpcancelar.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 205, 201, -1));

        jLabel24.setText("Observaciones:");
        jpcancelar.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        lbservicio_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        jpcancelar.add(lbservicio_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 530, 20));
        jpcancelar.add(txtobservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 600, 110));

        btbuscar1.setBackground(new java.awt.Color(255, 255, 255));
        btbuscar1.setForeground(new java.awt.Color(51, 182, 215));
        btbuscar1.setText("Buscar");
        btbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscar1ActionPerformed(evt);
            }
        });
        jpcancelar.add(btbuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 130, 70));

        btagendar2.setBackground(new java.awt.Color(255, 255, 255));
        btagendar2.setForeground(new java.awt.Color(51, 182, 215));
        btagendar2.setText("Guardar");
        btagendar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btagendar2ActionPerformed(evt);
            }
        });
        jpcancelar.add(btagendar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 80, 40));

        btagendar3.setBackground(new java.awt.Color(255, 255, 255));
        btagendar3.setForeground(new java.awt.Color(51, 182, 215));
        btagendar3.setText("Cancelar");
        btagendar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btagendar3ActionPerformed(evt);
            }
        });
        jpcancelar.add(btagendar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 80, 40));

        jLabel2.setText("Consecutivo:");
        jpcancelar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));
        jpcancelar.add(txt_conse, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 130, -1));

        btagendar4.setBackground(new java.awt.Color(255, 255, 255));
        btagendar4.setForeground(new java.awt.Color(51, 182, 215));
        btagendar4.setText("Salir");
        btagendar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btagendar4ActionPerformed(evt);
            }
        });
        jpcancelar.add(btagendar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 60, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void btbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btbuscar1ActionPerformed

    private void btagendar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btagendar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btagendar2ActionPerformed

    private void btagendar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btagendar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btagendar3ActionPerformed

    private void btagendar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btagendar4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btagendar4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btagendar2;
    private javax.swing.JButton btagendar3;
    private javax.swing.JButton btagendar4;
    private javax.swing.JButton btbuscar1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPanel jpcancelar;
    private javax.swing.JLabel lbservicio_1;
    private javax.swing.JTextField txt_conse;
    private javax.swing.JTextField txtobservar;
    // End of variables declaration//GEN-END:variables
}