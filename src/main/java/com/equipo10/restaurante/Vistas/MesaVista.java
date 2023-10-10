/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.equipo10.restaurante.Vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sebastian
 */
public class MesaVista extends javax.swing.JFrame {
 private int numeroMesa = 1;
 int cantMesa = 0;
    /**
     * Creates new form Mesas
     */
    public MesaVista() {
        initComponents();
        jPmesas.setLayout(new GridLayout(10, 3)); // 0 filas y 3 columnas
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPmesas = new javax.swing.JPanel();
        jBagregarMesa = new javax.swing.JButton();
        jTcantMesas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(633, 490));

        javax.swing.GroupLayout jPmesasLayout = new javax.swing.GroupLayout(jPmesas);
        jPmesas.setLayout(jPmesasLayout);
        jPmesasLayout.setHorizontalGroup(
            jPmesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPmesasLayout.setVerticalGroup(
            jPmesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );

        jBagregarMesa.setText("Agregar");
        jBagregarMesa.setPreferredSize(new java.awt.Dimension(100, 20));
        jBagregarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarMesaActionPerformed(evt);
            }
        });

        jTcantMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcantMesasActionPerformed(evt);
            }
        });

        jLabel1.setText("Cantidad de Mesas a agregar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPmesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTcantMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBagregarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBagregarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTcantMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(13, 13, 13)
                .addComponent(jPmesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBagregarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarMesaActionPerformed
    cantMesa=Integer.parseInt(jTcantMesas.getText());
        for (int i = 0; i<=cantMesa;i++){    
        
 JButton mesaButtonManual = new JButton("Mesa " + numeroMesa);
 mesaButtonManual.setBackground(Color.red);
  mesaButtonManual.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    if(mesaButtonManual.getBackground().equals(Color.green)){//abierta
                    // Cambia el color del botón a rojo
                    mesaButtonManual.setBackground(Color.red);
                     JOptionPane.showMessageDialog(null, mesaButtonManual.getText() + " mesa cerrada");
                }else{ mesaButtonManual.setBackground(Color.green);
                     JOptionPane.showMessageDialog(null, mesaButtonManual.getText() + " mesa abierta");}
            }}
        });
 
    mesaButtonManual.setPreferredSize(new Dimension(150, 50));
    mesaButtonManual.setMaximumSize(new Dimension(150, 50));
    
    JPanel buttonPanel = new JPanel();
    buttonPanel.add(mesaButtonManual);
    
    // Agrega el panel del botón al panel de mesas
    jPmesas.add(buttonPanel);
    
    // Vuelve a validar y repintar el panel de mesas
    jPmesas.revalidate();
    jPmesas.repaint();
    numeroMesa++;
  
    }
    }//GEN-LAST:event_jBagregarMesaActionPerformed

    private void jTcantMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcantMesasActionPerformed
    
    cantMesa=Integer.parseInt(jTcantMesas.getText());
    }//GEN-LAST:event_jTcantMesasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MesaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MesaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MesaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MesaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MesaVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBagregarMesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPmesas;
    private javax.swing.JTextField jTcantMesas;
    // End of variables declaration//GEN-END:variables
}
