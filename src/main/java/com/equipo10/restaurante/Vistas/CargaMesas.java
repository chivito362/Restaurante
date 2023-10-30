
package com.equipo10.restaurante.Vistas;

import com.equipo10.restaurante.AccesoADatos.MesaData;
import com.equipo10.restaurante.ValidacionDatos;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Facua
 */
public class CargaMesas extends javax.swing.JDialog {

    MesaData me = new MesaData();
    int xMouse, yMouse;

    public CargaMesas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel1 = new javax.swing.JPanel();
        txtnumero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbAgregar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(251, 250, 241));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 32, 31), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtnumero.setBackground(new java.awt.Color(251, 250, 241));
        txtnumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel1.add(txtnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 130, 35));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(35, 32, 31));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cantidad de Mesas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 160, -1));

        jLabel5.setBackground(new java.awt.Color(255, 242, 175));
        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crear_icon2.png"))); // NOI18N
        jLabel5.setText("Mesas");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel5.setOpaque(true);
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel5MouseDragged(evt);
            }
        });
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 412, 30));

        jbAgregar.setBackground(new java.awt.Color(98, 210, 106));
        jbAgregar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jbAgregar.setText("Agregar");
        jbAgregar.setBorder(null);
        jbAgregar.setBorderPainted(false);
        jbAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAgregar.setFocusPainted(false);
        jbAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbAgregarMouseExited(evt);
            }
        });
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 253, 206, 45));

        jbSalir.setBackground(new java.awt.Color(211, 25, 0));
        jbSalir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("Salir");
        jbSalir.setBorder(null);
        jbSalir.setBorderPainted(false);
        jbSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSalir.setFocusPainted(false);
        jbSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbSalirMouseExited(evt);
            }
        });
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 253, 206, 45));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jLabel5MouseDragged

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jLabel5MousePressed

    private void jbAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAgregarMouseEntered
        jbAgregar.setBackground(new Color(54, 190, 64));
    }//GEN-LAST:event_jbAgregarMouseEntered

    private void jbAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAgregarMouseExited
        jbAgregar.setBackground(new Color(98, 210, 106));
    }//GEN-LAST:event_jbAgregarMouseExited

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        if (ValidacionDatos.validarNumeroPositivo(txtnumero.getText())) {
            if (Integer.parseInt(txtnumero.getText()) <= 15) {
                me.insertarMesas(Integer.parseInt(txtnumero.getText()));
            } else {
                JOptionPane.showMessageDialog(null, "Solo puede ingresar hasta 10 mesas");
            }

        }
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSalirMouseEntered
        jbSalir.setBackground(new Color(188, 22, 0));
    }//GEN-LAST:event_jbSalirMouseEntered

    private void jbSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSalirMouseExited
        jbSalir.setBackground(new Color(211, 25, 0));
    }//GEN-LAST:event_jbSalirMouseExited

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField txtnumero;
    // End of variables declaration//GEN-END:variables
}
