/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.equipo10.restaurante.Vistas;

import com.equipo10.restaurante.AccesoADatos.PedidoData;
import com.equipo10.restaurante.Entidades.Mesa;
import com.equipo10.restaurante.Entidades.Mesero;
import com.equipo10.restaurante.Entidades.Pedido;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Facua
 */
public class EditarPedidoVistaCOPIA extends javax.swing.JDialog {

int idPedido;
    public EditarPedidoVistaCOPIA(java.awt.Frame parent, boolean modal,Mesa m,String me,int id) {
        super(parent, modal);
        initComponents();
        jtMesa.setText(m.getIdMesa()+"");
        jtMesero.setText(me);
        this.idPedido=id;
    }

    public JPanel getFondo() {
        return fondo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcEntregado = new javax.swing.JCheckBox();
        jtMesero = new javax.swing.JTextField();
        jtMesa = new javax.swing.JTextField();
        jbConfirmar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        fondo.setBackground(new java.awt.Color(251, 250, 241));
        fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 31, 32)));
        fondo.setPreferredSize(new java.awt.Dimension(360, 270));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 242, 175));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar_icon.png"))); // NOI18N
        jLabel1.setText("Pedido");
        jLabel1.setOpaque(true);
        fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 358, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mesa");
        fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 47, 200, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mesero");
        fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 200, -1));

        jcEntregado.setBackground(new java.awt.Color(251, 250, 241));
        jcEntregado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jcEntregado.setForeground(new java.awt.Color(0, 0, 0));
        jcEntregado.setText("Entregado");
        jcEntregado.setBorder(null);
        jcEntregado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fondo.add(jcEntregado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 90, -1));

        jtMesero.setEditable(false);
        jtMesero.setBackground(new java.awt.Color(251, 250, 241));
        jtMesero.setForeground(new java.awt.Color(51, 51, 51));
        jtMesero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        fondo.add(jtMesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 200, 35));

        jtMesa.setEditable(false);
        jtMesa.setBackground(new java.awt.Color(251, 250, 241));
        jtMesa.setForeground(new java.awt.Color(51, 51, 51));
        jtMesa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        fondo.add(jtMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 67, 200, 35));

        jbConfirmar.setBackground(new java.awt.Color(124, 180, 144));
        jbConfirmar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        jbConfirmar.setText("Confirmar");
        jbConfirmar.setBorder(null);
        jbConfirmar.setBorderPainted(false);
        jbConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbConfirmar.setFocusPainted(false);
        jbConfirmar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbConfirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbConfirmarMouseExited(evt);
            }
        });
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });
        fondo.add(jbConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 224, 179, 45));

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
        fondo.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 224, 179, 45));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbConfirmarMouseEntered
        jbConfirmar.setBackground(new Color(90, 158, 115));
    }//GEN-LAST:event_jbConfirmarMouseEntered

    private void jbConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbConfirmarMouseExited
        jbConfirmar.setBackground(new Color(124, 180, 144));
    }//GEN-LAST:event_jbConfirmarMouseExited

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed

        PedidoData pd = new PedidoData();
        pd.setearEntregado(jcEntregado.isSelected(), idPedido);
        this.dispose();
        PedidoVistaCOPIA.CargarTabla();
    }//GEN-LAST:event_jbConfirmarActionPerformed

    private void jbSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSalirMouseEntered
        jbSalir.setBackground(new Color(188, 22, 0));
    }//GEN-LAST:event_jbSalirMouseEntered

    private void jbSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSalirMouseExited
        jbSalir.setBackground(new Color(211, 25, 0));
    }//GEN-LAST:event_jbSalirMouseExited

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JCheckBox jcEntregado;
    private javax.swing.JTextField jtMesa;
    private javax.swing.JTextField jtMesero;
    // End of variables declaration//GEN-END:variables

}
