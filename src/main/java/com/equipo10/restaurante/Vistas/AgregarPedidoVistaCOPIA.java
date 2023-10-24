/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.equipo10.restaurante.Vistas;

import com.equipo10.restaurante.AccesoADatos.DetallePedidoData;
import com.equipo10.restaurante.AccesoADatos.MesaData;
import com.equipo10.restaurante.AccesoADatos.MeseroData;
import com.equipo10.restaurante.AccesoADatos.PedidoData;
import com.equipo10.restaurante.AccesoADatos.ProductoData;
import com.equipo10.restaurante.Entidades.DetallePedido;
import com.equipo10.restaurante.Entidades.Mesa;
import com.equipo10.restaurante.Entidades.Mesero;
import com.equipo10.restaurante.Entidades.Pedido;
import com.equipo10.restaurante.Entidades.Producto;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Facua
 */
public class AgregarPedidoVistaCOPIA extends javax.swing.JDialog {

    private static DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
    private static DefaultTableModel modelo;
    private static DetallePedidoData dpd = new DetallePedidoData();
    private static ProductoData prdg = new ProductoData();
    private static PedidoData pd = new PedidoData();
    private static MesaData md = new MesaData();
    private static MeseroData med = new MeseroData();

    public AgregarPedidoVistaCOPIA(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        modelo = (DefaultTableModel) tabla.getModel();
        table();
        mostrarEnTabla();
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
        jLabel3 = new javax.swing.JLabel();
        jtMesa = new javax.swing.JTextField();
        jtPedido = new javax.swing.JTextField();
        jbAgregar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        fondo.setBackground(new java.awt.Color(251, 250, 241));
        fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 31, 32)));
        fondo.setPreferredSize(new java.awt.Dimension(452, 445));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 242, 175));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crear_icon2.png"))); // NOI18N
        jLabel1.setText("Pedidos");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel1.setOpaque(true);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 450, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mesero:");
        fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 150, 20));

        jtMesa.setBackground(new java.awt.Color(251, 250, 241));
        jtMesa.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jtMesa.setForeground(new java.awt.Color(35, 32, 31));
        jtMesa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtMesa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jtMesa.setOpaque(true);
        fondo.add(jtMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 150, 30));

        jtPedido.setBackground(new java.awt.Color(251, 250, 241));
        jtPedido.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jtPedido.setForeground(new java.awt.Color(35, 32, 31));
        jtPedido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtPedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jtPedido.setOpaque(true);
        fondo.add(jtPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 150, 30));

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
        fondo.add(jbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 399, 225, 45));

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
        fondo.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 399, 225, 45));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Mesa:");
        fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 150, 20));

        jScrollPane1.setBackground(new java.awt.Color(56, 49, 39));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 32, 31)));
        jScrollPane1.setForeground(new java.awt.Color(251, 250, 241));
        jScrollPane1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N

        tabla.setBackground(new java.awt.Color(233, 237, 201));
        tabla.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        tabla.setForeground(new java.awt.Color(35, 32, 31));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Productos", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setFocusable(false);
        tabla.setGridColor(new java.awt.Color(216, 223, 159));
        tabla.setRowHeight(30);
        tabla.setSelectionBackground(new java.awt.Color(57, 137, 111));
        tabla.setSelectionForeground(new java.awt.Color(251, 250, 241));
        tabla.setShowGrid(true);
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setMinWidth(70);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(70);
            tabla.getColumnModel().getColumn(1).setMaxWidth(100);
        }

        fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 119, 452, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAgregarMouseEntered
        jbAgregar.setBackground(new Color(54,190,64));
    }//GEN-LAST:event_jbAgregarMouseEntered

    private void jbAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAgregarMouseExited
        jbAgregar.setBackground(new Color(98,210,106));
    }//GEN-LAST:event_jbAgregarMouseExited

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        List<Producto> productos = new ArrayList<>();
        List<Integer> cant = new ArrayList<>();
        ProductoData prd = new ProductoData();
        Pedido pedido = null;

        if (tabla.getSelectedRows().length > 0) {
            
            
            int mesaN = Integer.parseInt(jtMesa.getText());
            int moso = Integer.parseInt(jtPedido.getText());
            Mesa mesa = md.buscarMesa(mesaN);
            Mesero mesero = med.buscarMozoxId(moso);
            pedido = new Pedido(pd.ultimo(),mesa, mesero, false, false, true);
            
            pd.agregarPedido(pedido);
            
            Producto produ;
            for (int cada : tabla.getSelectedRows()) {
                produ = (Producto) modelo.getValueAt(cada, 0);
                cant.add(Integer.valueOf(modelo.getValueAt(cada, 1).toString()));
                productos.add(produ);
            }
            
            int num = 0;
            for (Producto cada : productos) {
                //total = (double) (Double.parseDouble(modelo.getValueAt(num, 1).toString()) * cada.getPrecio());
                DetallePedido dp = new DetallePedido(dpd.ultimo(),cada.getIdProducto(), cant.get(num), pedido);
                num += 1;
                dpd.agregarDetallePedido(dp);
            }

        }

        
        jtMesa.setText("");
        jtPedido.setText("");
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

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtMesa;
    private javax.swing.JTextField jtPedido;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    private void table() {
        dtcr.setHorizontalAlignment(JLabel.CENTER);
        tabla.getColumnModel().getColumn(0).setCellRenderer(dtcr);
        tabla.getColumnModel().getColumn(1).setCellRenderer(dtcr);
    }

    private void mostrarEnTabla() {
        modelo.setRowCount(0);

        for (Producto cada : prdg.listarProductos()) {
            modelo.addRow(new Object[]{cada, ""});
        }
    }
}
