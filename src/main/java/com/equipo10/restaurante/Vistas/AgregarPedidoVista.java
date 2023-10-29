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
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.List;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Facua
 */
public class AgregarPedidoVista extends javax.swing.JDialog {

    private static DefaultListCellRenderer dlcr = new DefaultListCellRenderer();
    private static DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
    private static DefaultTableModel modelo;
    private static DetallePedidoData dpd = new DetallePedidoData();
    private static ProductoData prdg = new ProductoData();
    private static PedidoData pd = new PedidoData();
    private static MesaData md = new MesaData();
    private static MeseroData med = new MeseroData();
    HashSet<Integer> filas=new HashSet<>();
    
    int xMouse, yMouse;
    public AgregarPedidoVista(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        modelo = (DefaultTableModel) tabla.getModel();
        table();
        mostrarEnTabla();
        cargarCB();
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
        jLabel3 = new javax.swing.JLabel();
        jbAgregar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        cbMesa = new javax.swing.JComboBox<>();
        cbMozo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        fondo.setBackground(new java.awt.Color(251, 250, 241));
        fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 31, 32)));
        fondo.setPreferredSize(new java.awt.Dimension(452, 445));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mesero");
        fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 38, 160, 20));

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
        jLabel4.setText("Mesa");
        fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 38, 160, 20));

        jScrollPane1.setBackground(new java.awt.Color(56, 49, 39));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 32, 31)));
        jScrollPane1.setForeground(new java.awt.Color(251, 250, 241));
        jScrollPane1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N

        tabla.setBackground(new java.awt.Color(233, 237, 201));
        tabla.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        tabla.setForeground(new java.awt.Color(35, 32, 31));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Productos", "Stock", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
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
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla.setShowGrid(true);
        tabla.setShowVerticalLines(false);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setMinWidth(70);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(70);
            tabla.getColumnModel().getColumn(1).setMaxWidth(70);
            tabla.getColumnModel().getColumn(2).setMinWidth(70);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(70);
            tabla.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 119, 452, 280));

        cbMesa.setBackground(new java.awt.Color(251, 250, 241));
        cbMesa.setForeground(new java.awt.Color(35, 32, 31));
        cbMesa.setToolTipText("");
        cbMesa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        cbMesa.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        fondo.add(cbMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 160, 30));

        cbMozo.setBackground(new java.awt.Color(251, 250, 241));
        cbMozo.setForeground(new java.awt.Color(35, 32, 31));
        cbMozo.setToolTipText("");
        cbMozo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        cbMozo.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        fondo.add(cbMozo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 160, 30));

        jLabel5.setBackground(new java.awt.Color(255, 242, 175));
        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crear_icon2.png"))); // NOI18N
        jLabel5.setText("Pedidos");
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
        fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 449, 30));

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
        HashSet<Integer> f=new HashSet<>();
        int r=JOptionPane.showConfirmDialog(null, "Desea Confirmar el pedido?");
        if(r==0){
        try{
            Producto produ;
            if(cbMesa.getSelectedItem()!=null && cbMozo.getSelectedItem()!=null){
                
        if (!filas.isEmpty()) {
            for (Integer fila : filas) {
                if(modelo.getValueAt(fila, 2).toString().equals("") ){
                }else{
                    f.add(fila);
                }
            }
            System.out.println(f);
            
            for (int cada : f) {
                produ = (Producto) modelo.getValueAt(cada, 0);
                cant.add(Integer.valueOf(modelo.getValueAt(cada, 2).toString()));
                productos.add(produ);
            }
            
            int mesaN = ((Mesa)cbMesa.getSelectedItem()).getIdMesa();
            int moso = ((Mesero)cbMozo.getSelectedItem()).getIdMesero();
            Mesa mesa = md.buscarMesa(mesaN);
            Mesero mesero = med.buscarMozoxId(moso);
            int idPedido=pd.ultimo();
            pedido = new Pedido(idPedido,mesa, mesero, false, false, true);
            
            pd.agregarPedido(pedido);
            
            
            
            
            
            int num = 0;
            for (Producto cada : productos) {
                DetallePedido dp = new DetallePedido(dpd.ultimo(),cada.getIdProducto(), cant.get(num), pedido);
                num += 1;
                
                dpd.agregarDetallePedido(dp);
            }
            
            if(dpd.verificarPedidosEnDetalles(idPedido)){
            JOptionPane.showMessageDialog(null, "Pedido añadido con exito");
            }else{
                pd.anularPedido(idPedido);
            }
            mostrarEnTabla();
        }
        }else{
            JOptionPane.showMessageDialog(null, "El mozo y la mesa deben estar seleccionados");
        }}catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Todos los productos seleccionados deben tener cantidad");
            }
        filas.clear();
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

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
          if(tabla.getSelectedRow()>-1){
        filas.add(tabla.getSelectedRow());
          }  
    }//GEN-LAST:event_tablaMouseClicked

    private void jLabel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jLabel5MouseDragged

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jLabel5MousePressed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Mesa> cbMesa;
    private javax.swing.JComboBox<Mesero> cbMozo;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    private void table() {
        dlcr.setHorizontalAlignment(SwingConstants.CENTER);
        cbMesa.setRenderer(dlcr);
        cbMozo.setRenderer(dlcr);
        dtcr.setHorizontalAlignment(JLabel.CENTER);
        tabla.getColumnModel().getColumn(0).setCellRenderer(dtcr);
        tabla.getColumnModel().getColumn(1).setCellRenderer(dtcr);
    }

    private void mostrarEnTabla() {
        modelo.setRowCount(0);

        for (Producto cada : prdg.listarProductos()) {
            modelo.addRow(new Object[]{cada,cada.getCantidadEnStock(), ""});
        }
    }
    private void cargarCB(){
        for (Mesa mesa : md.obtenerMesas(1)) {
            cbMesa.addItem(mesa);
        }
        for (Mesero m : med.mozosActivos()) {
            cbMozo.addItem(m);
        }
    }
}
    
