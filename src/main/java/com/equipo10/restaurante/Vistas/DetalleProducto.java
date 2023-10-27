/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.equipo10.restaurante.Vistas;

import com.equipo10.restaurante.AccesoADatos.ProductoData;
import com.equipo10.restaurante.Entidades.DetallePedido;
import com.equipo10.restaurante.Entidades.Producto;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Facua
 */
public class DetalleProducto extends javax.swing.JDialog {

    DefaultTableModel modelo = new DefaultTableModel();
    private static DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();

    public DetalleProducto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        modelo = (DefaultTableModel) jtTablaProductos.getModel();
        modeloTabla();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtTablaProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        print = new javax.swing.JButton();
        jlTotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(251, 250, 241));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 32, 31)));
        jPanel1.setPreferredSize(new java.awt.Dimension(470, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbSalir.setBackground(new java.awt.Color(0, 21, 36));
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("Salir");
        jbSalir.setBorder(null);
        jbSalir.setBorderPainted(false);
        jbSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSalir.setOpaque(true);
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 75, 30));

        jScrollPane2.setBackground(new java.awt.Color(42, 36, 29));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 32, 31)));
        jScrollPane2.setForeground(new java.awt.Color(251, 250, 241));
        jScrollPane2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        jtTablaProductos.setBackground(new java.awt.Color(233, 237, 201));
        jtTablaProductos.setForeground(new java.awt.Color(35, 32, 31));
        jtTablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Pedido", "Producto", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtTablaProductos.setFocusable(false);
        jtTablaProductos.setGridColor(new java.awt.Color(214, 221, 155));
        jtTablaProductos.setRowHeight(25);
        jtTablaProductos.setRowSelectionAllowed(false);
        jtTablaProductos.setSelectionBackground(new java.awt.Color(57, 137, 111));
        jtTablaProductos.setSelectionForeground(new java.awt.Color(251, 250, 241));
        jtTablaProductos.setShowGrid(true);
        jtTablaProductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtTablaProductos);
        if (jtTablaProductos.getColumnModel().getColumnCount() > 0) {
            jtTablaProductos.getColumnModel().getColumn(0).setMinWidth(70);
            jtTablaProductos.getColumnModel().getColumn(0).setPreferredWidth(70);
            jtTablaProductos.getColumnModel().getColumn(0).setMaxWidth(70);
            jtTablaProductos.getColumnModel().getColumn(2).setMinWidth(90);
            jtTablaProductos.getColumnModel().getColumn(2).setPreferredWidth(90);
            jtTablaProductos.getColumnModel().getColumn(2).setMaxWidth(90);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 31, 470, 240));

        jLabel1.setBackground(new java.awt.Color(255, 242, 175));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Detalle");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel1.setOpaque(true);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 468, 30));

        print.setBackground(new java.awt.Color(0, 21, 36));
        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/print.png"))); // NOI18N
        print.setBorder(null);
        print.setBorderPainted(false);
        print.setContentAreaFilled(false);
        print.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        print.setFocusPainted(false);
        print.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel1.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 357, 36, 36));

        jlTotal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jlTotal.setForeground(new java.awt.Color(35, 32, 31));
        jlTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jlTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 470, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(35, 32, 31));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Total");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 470, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        limpiarTabla();
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        Detalle de = new Detalle(PedidoVistaCOPIA.detalleDelPedido());
        de.setLocationRelativeTo(this);
        de.setVisible(true);
        
        PrinterJob job = PrinterJob.getPrinterJob();
        
        job.setPrintable(de);
        
        if(job.printDialog()){
            try{
                job.print();
            }catch(PrinterException ex){
                
            }
        }else{
            JOptionPane.showMessageDialog(this,"No se pudo Imprimir");
        }
    }//GEN-LAST:event_printActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlTotal;
    public static javax.swing.JTable jtTablaProductos;
    private javax.swing.JButton print;
    // End of variables declaration//GEN-END:variables

    private void modeloTabla() {
        dtcr.setHorizontalAlignment(JLabel.CENTER);
        
        jtTablaProductos.getColumnModel().getColumn(0).setCellRenderer(dtcr);
        jtTablaProductos.getColumnModel().getColumn(1).setCellRenderer(dtcr);
        jtTablaProductos.getColumnModel().getColumn(2).setCellRenderer(dtcr);
    }

    private void limpiarTabla() {
        modelo.setRowCount(0);
    }

    private void cargarTabla() {
        limpiarTabla();
        Producto produ;
        ProductoData prd = new ProductoData();
        double total = 0;
        for (DetallePedido cada : PedidoVistaCOPIA.detalleDelPedido()) {
            produ = prd.TraerProducto(cada.getIdProducto());
            modelo.addRow(new Object[]{cada.getPedido().getIdPedido(),produ.getNombre(),cada.getCantidad()});
            total += cada.getTotalPedido();
        }
        
        jlTotal.setText("$"+total);
    }
}
