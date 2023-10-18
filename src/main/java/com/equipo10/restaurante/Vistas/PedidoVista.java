
package com.equipo10.restaurante.Vistas;

import com.equipo10.restaurante.AccesoADatos.PedidoData;
import com.equipo10.restaurante.Entidades.Mesa;
import com.equipo10.restaurante.Entidades.Mesero;
import com.equipo10.restaurante.Entidades.Pedido;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;


public class PedidoVista extends javax.swing.JFrame {

    private DefaultTableModel modelo = new DefaultTableModel ();
    private javax.swing.JDesktopPane Escritorio;
    
    
    public PedidoVista() {
        initComponents();
        ArmarTabla();
        CargarTabla();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbAgregar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jcFiltro = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(633, 490));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 88, -1, -1));

        jbEditar.setText("Editar");
        jbEditar.setEnabled(false);
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 134, 71, -1));

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 71, -1));

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 71, -1));

        jtTabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtTabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTabla1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtTabla1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 294, 265));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 28)); // NOI18N
        jLabel1.setText("Pedidos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 6, 170, 33));

        jcFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pedidos", "Entregados", "Pagados", "No pagados", "No entregados" }));
        jPanel1.add(jcFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 50, 100, -1));

        jButton1.setText("Detalle");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
      AgregarPedidoVista apv=new AgregarPedidoVista();
      crearVentana(apv);
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtTabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTabla1MouseClicked
       jbEditar.setEnabled(true);
    }//GEN-LAST:event_jtTabla1MouseClicked

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        EditarPedidoVista epv=new EditarPedidoVista();
        crearVentana(epv);
    }//GEN-LAST:event_jbEditarActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedidoVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcFiltro;
    private javax.swing.JTable jtTabla1;
    // End of variables declaration//GEN-END:variables

     private void ArmarTabla(){
    modelo.addColumn("ID-Pedido");
    modelo.addColumn("Mesa");
    modelo.addColumn("Mesero");
    modelo.addColumn("Entregado");
    modelo.addColumn("Pagado");
    
    jtTabla1.setModel(modelo);
    }; 
 private void limpiarTabla(){
        for (int i = modelo.getRowCount()-1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
 
public void CargarTabla(){
    if (jcFiltro.getSelectedItem().equals("Pedidos")) {
limpiarTabla();

Pedido pedido=new Pedido();
List<Pedido> pedidos=new ArrayList<>();
PedidoData pd=new PedidoData();
pedidos = pd.listarPedido();

    for (Pedido pedido1 : pedidos) {
        modelo.addRow(new Object[]{pedido.getIdPedido(), pedido.getMesa().getIdMesa(), pedido.getMesero().getIdMesero(), pedido.isEstado()});
    }
}
  if (jcFiltro.getSelectedItem().equals("Entregados")) {
limpiarTabla();

Pedido pedido=new Pedido();
List<Pedido> pedidos=new ArrayList<>();
PedidoData pd=new PedidoData();
pedidos = pd.listarPedidoEntregado();

    for (Pedido pedido1 : pedidos) {
        modelo.addRow(new Object[]{pedido.getIdPedido(), pedido.getMesa(), pedido.getMesero(), pedido.isEstado()});
    }
}  
  if (jcFiltro.getSelectedItem().equals("Pagados")) {
limpiarTabla();

Pedido pedido=new Pedido();
List<Pedido> pedidos=new ArrayList<>();
PedidoData pd=new PedidoData();
pedidos = pd.listarPedidoPagado();

    for (Pedido pedido1 : pedidos) {
        modelo.addRow(new Object[]{pedido.getIdPedido(), pedido.getMesa().getIdMesa(), pedido.getMesero().getIdMesero(), pedido.isEstado()});
    }
}
    if (jcFiltro.getSelectedItem().equals("No pagados")) {
limpiarTabla();

Pedido pedido=new Pedido();
List<Pedido> pedidos=new ArrayList<>();
PedidoData pd=new PedidoData();
pedidos = pd.listarPedidoNoPagado();

    for (Pedido pedido1 : pedidos) {
        modelo.addRow(new Object[]{pedido.getIdPedido(), pedido.getMesa().getIdMesa(), pedido.getMesero().getIdMesero(), pedido.isEstado()});
    }
}
  if (jcFiltro.getSelectedItem().equals("No entregados")) {
limpiarTabla();

Pedido pedido=new Pedido();
List<Pedido> pedidos=new ArrayList<>();
PedidoData pd=new PedidoData();
pedidos = pd.listarPedidoNoEntregados();

    for (Pedido pedido1 : pedidos) {
        modelo.addRow(new Object[]{pedido.getIdPedido(), pedido.getMesa().getIdMesa(), pedido.getMesero().getIdMesero(), pedido.isEntregado()});
    }
}  
    
}
private void crearVentana(JInternalFrame fi){      
        Escritorio.removeAll();
        Escritorio.repaint();
        fi.setVisible(true);
        Escritorio.setSize(fi.getWidth(), fi.getHeight());
        Escritorio.add(fi);
        Escritorio.moveToFront(fi);
}

public Object[] traerDatosFila(){
int fila=jtTabla1.getSelectedRow();
    if (fila!=-1){
        int columnas= modelo.getColumnCount();
        Object[]datos=new Object[columnas];
        for (int i = 0; i < columnas; i++) {
            datos[i]=modelo.getValueAt(fila, i);
        }
        return datos;
    }else{
    return null;
    }

}

}