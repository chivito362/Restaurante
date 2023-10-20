
package com.equipo10.restaurante.Vistas;

import com.equipo10.restaurante.AccesoADatos.PedidoData;
import com.equipo10.restaurante.AccesoADatos.ProductoData;
import com.equipo10.restaurante.Entidades.Categoria;
import com.equipo10.restaurante.Entidades.Pedido;
import com.equipo10.restaurante.Entidades.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class detalleProductos extends javax.swing.JFrame {
DefaultTableModel modelo=new DefaultTableModel();
DefaultTableModel modelo2=new DefaultTableModel();

    public detalleProductos() {
        initComponents();
        modeloTabla();
        modeloTabla2();
        cargarTabla();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbConfirmarP = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaProductos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtTablaP2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cargar productos");

        jbConfirmarP.setText("Confirmar");
        jbConfirmarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarPActionPerformed(evt);
            }
        });

        jtTablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtTablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtTablaProductos);

        jtTablaP2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jtTablaP2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbConfirmarP))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbConfirmarP)
                .addGap(525, 525, 525))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbConfirmarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarPActionPerformed
   limpiarTabla();
   this.dispose();
    }//GEN-LAST:event_jbConfirmarPActionPerformed

    private void jtTablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaProductosMouseClicked
        cargarTabla2();
        ProductoData pd=new ProductoData();
        List<Producto> productos = new ArrayList<>();
        int[] filaSeleccionada = jtTablaProductos.getSelectedRows();

        for (int i = filaSeleccionada.length - 1; i >= 0; i--) {
            int fila = filaSeleccionada[i];

            Producto prod = new Producto();
            for (int j = 0; j < modelo.getColumnCount(); j++) {
                   if (j == 0) {
                   int id=(int)modelo.getValueAt(fila, j);
                    prod.setIdProducto(id);
                } else if(j==1){
                String nom=(String)modelo.getValueAt(fila, j);
                prod.setNombre(nom);
                } else if(j==2){
                int cant=(int)modelo.getValueAt(fila, j);
                prod.setCantidad(cant);
                }else if(j==3){
                double pre=(double)modelo.getValueAt(fila, j);
                prod.setPrecio(pre);
                }
            }
              productos.add(prod);
              pd.guardarProcuto(prod);

        }
    }//GEN-LAST:event_jtTablaProductosMouseClicked

  
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new detalleProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbConfirmarP;
    private javax.swing.JTable jtTablaP2;
    private javax.swing.JTable jtTablaProductos;
    // End of variables declaration//GEN-END:variables

private void modeloTabla(){
modelo.addColumn("idProducto");
modelo.addColumn("nombre");
modelo.addColumn("cantidad");
modelo.addColumn("precio");
//modelo.addColumn("categoria");

jtTablaProductos.setModel(modelo);
jtTablaP2.setModel(modelo);
}
private void modeloTabla2(){
modelo2.addColumn("idProducto");
modelo2.addColumn("nombre");
modelo2.addColumn("cantidad");
modelo2.addColumn("precio");
//modelo2.addColumn("categoria");

jtTablaP2.setModel(modelo2);
}
private void cargarTabla(){

limpiarTabla();

List<Producto> productos=new ArrayList<>();
ProductoData pd=new ProductoData();
 productos = pd.listarProductos();

    for (Producto producto : productos) {
        modelo.addRow(new Object[]{producto.getIdProducto(), producto.getNombre(), producto.getCantidad(), producto.getPrecio(), producto.getCategoria()});
    }
}
private void limpiarTabla(){
        for (int i = modelo.getRowCount()-1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    public void cargarTabla2() {
        int[] filaSeleccionada = jtTablaProductos.getSelectedRows();

        for (int i = filaSeleccionada.length - 1; i >= 0; i--) {
            int fila = filaSeleccionada[i];

            Object[] datos = new Object[modelo.getColumnCount()];
            for (int j = 0; j < modelo.getColumnCount(); j++) {
                datos[j] = modelo.getValueAt(fila, j);
            }
            modelo2.addRow(datos);

        }

    }
}