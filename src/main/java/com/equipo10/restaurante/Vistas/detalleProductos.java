package com.equipo10.restaurante.Vistas;

import com.equipo10.restaurante.Entidades.Producto;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class detalleProductos extends javax.swing.JDialog {

    DefaultTableModel modelo = new DefaultTableModel();
//DefaultTableModel modelo2=new DefaultTableModel();
    private javax.swing.JDesktopPane Escritorio;
    ArrayList<Producto> productos;

    public detalleProductos(ArrayList j) {
        initComponents();
        this.productos = j;
        modeloTabla();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbConfirmarP = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtTablaProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        print = new javax.swing.JButton();
        jlTotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(251, 250, 241));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 32, 31)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbConfirmarP.setBackground(new java.awt.Color(0, 21, 36));
        jbConfirmarP.setForeground(new java.awt.Color(255, 255, 255));
        jbConfirmarP.setText("Salir");
        jbConfirmarP.setBorder(null);
        jbConfirmarP.setBorderPainted(false);
        jbConfirmarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbConfirmarP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbConfirmarP.setOpaque(true);
        jbConfirmarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarPActionPerformed(evt);
            }
        });
        jPanel1.add(jbConfirmarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 75, 30));

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
                "ID Detalle", "ID Pedido", "Producto", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtTablaProductos.setGridColor(new java.awt.Color(214, 221, 155));
        jtTablaProductos.setRowHeight(25);
        jtTablaProductos.setSelectionBackground(new java.awt.Color(57, 137, 111));
        jtTablaProductos.setSelectionForeground(new java.awt.Color(251, 250, 241));
        jtTablaProductos.getTableHeader().setReorderingAllowed(false);
        jtTablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTablaProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtTablaProductos);
        if (jtTablaProductos.getColumnModel().getColumnCount() > 0) {
            jtTablaProductos.getColumnModel().getColumn(0).setMinWidth(70);
            jtTablaProductos.getColumnModel().getColumn(0).setPreferredWidth(70);
            jtTablaProductos.getColumnModel().getColumn(0).setMaxWidth(70);
            jtTablaProductos.getColumnModel().getColumn(1).setMinWidth(70);
            jtTablaProductos.getColumnModel().getColumn(1).setPreferredWidth(70);
            jtTablaProductos.getColumnModel().getColumn(1).setMaxWidth(70);
            jtTablaProductos.getColumnModel().getColumn(3).setMinWidth(90);
            jtTablaProductos.getColumnModel().getColumn(3).setPreferredWidth(90);
            jtTablaProductos.getColumnModel().getColumn(3).setMaxWidth(90);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 31, 470, 200));

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

        jlTotal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jlTotal.setForeground(new java.awt.Color(35, 32, 31));
        jlTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jlTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 470, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(35, 32, 31));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Total");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 470, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbConfirmarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarPActionPerformed
        limpiarTabla();
        this.dispose();
    }//GEN-LAST:event_jbConfirmarPActionPerformed

    private void jtTablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaProductosMouseClicked

    }//GEN-LAST:event_jtTablaProductosMouseClicked

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbConfirmarP;
    private javax.swing.JLabel jlTotal;
    public static javax.swing.JTable jtTablaProductos;
    private javax.swing.JButton print;
    // End of variables declaration//GEN-END:variables

    private void modeloTabla() {
        modelo.addColumn("idProducto");
        modelo.addColumn("nombre");
        modelo.addColumn("cantidad Stock");
        modelo.addColumn("precio");
        modelo.addColumn("Estado");

        jtTablaProductos.setModel(modelo);
//jtTablaP2.setModel(modelo);
    }
//private void modeloTabla2(){
//modelo2.addColumn("idProducto");
//modelo2.addColumn("nombre");
//modelo2.addColumn("cantidad");
//modelo2.addColumn("precio");
//modelo2.addColumn("categoria");
//
//jtTablaP2.setModel(modelo2);
//}

    private void limpiarTabla() {
        for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void cargarTabla() {
        for (Producto producto : productos) {
            modelo.addRow(new Object[]{producto.getIdProducto(), producto.getNombre(), producto.getCantidadEnStock(), producto.getPrecio(), producto.isEstado()});
        }
    }
}
// metodo para cargar una segunda tabla que al seleccionar los rows de una primera tabla se caguen en  esta seguna
//    public void cargarTabla2() {
//        int[] filaSeleccionada = jtTablaProductos.getSelectedRows();
//
//        for (int i = filaSeleccionada.length - 1; i >= 0; i--) {
//            int fila = filaSeleccionada[i];
//
//            Object[] datos = new Object[modelo.getColumnCount()];
//            for (int j = 0; j < modelo.getColumnCount(); j++) {
//                datos[j] = modelo.getValueAt(fila, j);
//            }
//            modelo2.addRow(datos);
//
//        }
//
//    }

// Evento de una tabla para que lleve los datos de los rows seleccionados a una segunda tabla
//     private void jtTablaProductosMouseClicked(java.awt.event.MouseEvent evt) {                                              
//        cargarTabla2();
//        ProductoData pd=new ProductoData();
//        List<Producto> productos = new ArrayList<>();
//        int[] filaSeleccionada = jtTablaProductos.getSelectedRows();
//        PedidoData ped=new PedidoData();
//        
//
//        for (int i = filaSeleccionada.length - 1; i >= 0; i--) {
//            int fila = filaSeleccionada[i];
//
//            Producto prod = new Producto();
//            for (int j = 0; j < modelo.getColumnCount(); j++) {
//                   if (j == 0) {
//                   int id=(int)modelo.getValueAt(fila, j);
//                    prod.setIdProducto(id);
//                } else if(j==1){
//                String nom=(String)modelo.getValueAt(fila, j);
//                prod.setNombre(nom);
//                } else if(j==2){
//                int cant=(int)modelo.getValueAt(fila, j);
//                prod.setCantidad(cant);
//                }else if(j==3){
//                double pre=(double)modelo.getValueAt(fila, j);
//                prod.setPrecio(pre);
//                }
//                   
//            }
//            int id=ped.getIdPedido();
//              ped.agregarProductoAlPedido(id, prod.getIdProducto(), prod.getCantidad());
//              productos.add(prod);
//              pd.guardarProcuto(prod);
//
//        }
//    }                                          
