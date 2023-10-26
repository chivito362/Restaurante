
package com.equipo10.restaurante.Vistas;

import com.equipo10.restaurante.AccesoADatos.PedidoData;
import com.equipo10.restaurante.Entidades.Pedido;
import com.equipo10.restaurante.Entidades.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class BuscarPedidoVista extends javax.swing.JDialog {
DefaultTableModel modelo=new DefaultTableModel();
   
    public BuscarPedidoVista() {
        initComponents();
        modeloTabla();
        cargarTabla();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        PorId = new javax.swing.JRadioButton();
        PorMesa = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        JbBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        buttonGroup1.add(PorId);
        PorId.setText("Buscar por ID");
        PorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PorIdActionPerformed(evt);
            }
        });
        jPanel1.add(PorId);
        PorId.setBounds(16, 6, 97, 18);

        buttonGroup1.add(PorMesa);
        PorMesa.setText("Buscar por Mesa");
        PorMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PorMesaActionPerformed(evt);
            }
        });
        jPanel1.add(PorMesa);
        PorMesa.setBounds(170, 10, 115, 18);

        jButton1.setText("salilr");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(220, 140, 55, 28);

        jBuscar.setEditable(false);
        jPanel1.add(jBuscar);
        jBuscar.setBounds(50, 40, 197, 28);

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTabla);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(2, 76, 300, 60);

        JbBuscar.setText("Buscar");
        JbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(JbBuscar);
        JbBuscar.setBounds(0, 140, 67, 28);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 460, 316);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PorMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PorMesaActionPerformed
        jBuscar.setEditable(true);
    }//GEN-LAST:event_PorMesaActionPerformed

    private void PorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PorIdActionPerformed
        jBuscar.setEditable(true);
    }//GEN-LAST:event_PorIdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbBuscarActionPerformed
        cargarTabla();
    }//GEN-LAST:event_JbBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarPedidoVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbBuscar;
    private javax.swing.JRadioButton PorId;
    private javax.swing.JRadioButton PorMesa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField jBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    // End of variables declaration//GEN-END:variables

private void modeloTabla(){
modelo.addColumn("idPedido");
modelo.addColumn("Mesa");
modelo.addColumn("Mesero");
modelo.addColumn("Entregado");
modelo.addColumn("Pagado");
modelo.addColumn("Estado");

jTabla.setModel(modelo);
}
    private void cargarTabla() {

        List<Pedido> pedidos = new ArrayList<>();
        PedidoData pd = new PedidoData();
        
        if (PorId.isSelected()) {
            int idMesa = Integer.parseInt(jBuscar.getText());
                Pedido pedido = new Pedido();
                pedido = pd.buscarPedido(idMesa);
                modelo.addRow(new Object[]{pedido.getIdPedido(), pedido.getMesa().getIdMesa(), pedido.getMesero().getIdMesero(), pedido.isEntregado(), pedido.isPagado(), pedido.isEstado()});
            }
            if (PorMesa.isSelected()) {
                Pedido pedido = new Pedido();
                int id = Integer.parseInt(jBuscar.getText());
                pedido = pd.buscarPedido(id);
                modelo.addRow(new Object[]{pedido.getIdPedido(), pedido.getMesa().getIdMesa(), pedido.getMesero().getIdMesero(), pedido.isEntregado(), pedido.isPagado(), pedido.isEstado()});
            }
        }
    }


