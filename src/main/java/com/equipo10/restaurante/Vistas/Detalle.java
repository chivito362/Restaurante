/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.equipo10.restaurante.Vistas;

import com.equipo10.restaurante.AccesoADatos.MesaData;
import com.equipo10.restaurante.AccesoADatos.MeseroData;
import com.equipo10.restaurante.AccesoADatos.ProductoData;
import com.equipo10.restaurante.Entidades.DetallePedido;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author Facua
 */
public class Detalle extends javax.swing.JFrame implements Printable {

    public static List<DetallePedido> detalles = new ArrayList<>();
    int xMouse, yMouse;

    public Detalle(List<DetallePedido> deta) {
        initComponents();
        detalles = deta;
        cantidades();
        productos();
        precios();
        fechaMeseroMesa();
        subTotal();
        impuestos();
        total();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        precio1 = new javax.swing.JLabel();
        precio2 = new javax.swing.JLabel();
        num1 = new javax.swing.JLabel();
        num2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        mesero = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        produ1 = new javax.swing.JLabel();
        produ2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cuentas = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        subtotal = new javax.swing.JLabel();
        impuesto = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        mesa = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                fondoMouseDragged(evt);
            }
        });
        fondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fondoMousePressed(evt);
            }
        });
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        precio1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        precio1.setForeground(new java.awt.Color(0, 0, 0));
        precio1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        precio1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 8));
        fondo.add(precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 70, 20));

        precio2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        precio2.setForeground(new java.awt.Color(0, 0, 0));
        precio2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        precio2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 8));
        fondo.add(precio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 70, 20));

        num1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        num1.setForeground(new java.awt.Color(0, 0, 0));
        num1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fondo.add(num1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 190, 25, 20));

        num2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        num2.setForeground(new java.awt.Color(0, 0, 0));
        num2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fondo.add(num2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 220, 25, 20));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        fondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 310, 5));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Mesero:");
        fondo.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 477, -1, -1));

        mesero.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        mesero.setForeground(new java.awt.Color(0, 0, 0));
        mesero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mesero.setText("nombre");
        fondo.add(mesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 477, 250, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        fondo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 310, 7));

        produ1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        produ1.setForeground(new java.awt.Color(0, 0, 0));
        produ1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fondo.add(produ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 190, 223, 20));

        produ2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        produ2.setForeground(new java.awt.Color(0, 0, 0));
        produ2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fondo.add(produ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 220, 223, 20));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        fondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 310, 10));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TEAM TEN");
        fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 370, -1));

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));
        jPanel1.setFocusable(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("#       Artículo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Precio");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 6, 50, -1));

        fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 330, 30));

        cuentas.setBackground(new java.awt.Color(242, 242, 242));
        cuentas.setFocusable(false);
        cuentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Subtotal");
        cuentas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 175, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Impuesto %100");
        cuentas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 175, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Total");
        cuentas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 175, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ARS");
        cuentas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("ARS");
        cuentas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 2, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("ARS");
        cuentas.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 21, -1, -1));

        total.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        total.setForeground(new java.awt.Color(0, 0, 0));
        total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        total.setText("0,0");
        cuentas.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 110, -1));

        subtotal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        subtotal.setForeground(new java.awt.Color(0, 0, 0));
        subtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        subtotal.setText("0,0");
        cuentas.add(subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 2, 110, -1));

        impuesto.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        impuesto.setForeground(new java.awt.Color(0, 0, 0));
        impuesto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        impuesto.setText("0,0");
        cuentas.add(impuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 21, 110, -1));

        fondo.add(cuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 378, 330, 60));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("PROPINA NO INCLUIDA");
        fondo.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 370, -1));

        mesa.setFont(new java.awt.Font("Segoe UI Semibold", 1, 25)); // NOI18N
        mesa.setForeground(new java.awt.Color(0, 0, 0));
        mesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mesa.setText("MESA 13");
        fondo.add(mesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 370, 30));

        fecha.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        fecha.setForeground(new java.awt.Color(102, 102, 102));
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fecha.setText("fecha");
        fecha.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        fecha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fondo.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 65, 310, 20));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        fondo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 525, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_fondoMousePressed

    private void fondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_fondoMouseDragged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cuentas;
    private javax.swing.JLabel fecha;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel impuesto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel mesa;
    private javax.swing.JLabel mesero;
    private javax.swing.JLabel num1;
    private javax.swing.JLabel num2;
    private javax.swing.JLabel precio1;
    private javax.swing.JLabel precio2;
    private javax.swing.JLabel produ1;
    private javax.swing.JLabel produ2;
    private javax.swing.JLabel subtotal;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex == 0) {
            Graphics2D graphics2d = (Graphics2D) graphics;
            graphics2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
            printAll(graphics2d);
            return PAGE_EXISTS;
        } else {
            return NO_SUCH_PAGE;
        }
    }

    private void cantidades() {
        int cont = detalles.size();
        int cantidadY = 250;
        for (int i = 0; i < detalles.size(); i++) {
            JLabel cantidad = new JLabel();
            cantidad.setText(detalles.get(0).getCantidad() + "");
            cantidad.setLocation(25, cantidadY);
            cantidadY += 30;
        }
        /*switch (cont) {
            case 1:
                num1.setText(detalles.get(0).getCantidad() + "");
                break;
            case 2:
                num1.setText(detalles.get(0).getCantidad() + "");
                num2.setText(detalles.get(1).getCantidad() + "");
                break;
            case 3:
                num1.setText(detalles.get(0).getCantidad() + "");
                num2.setText(detalles.get(1).getCantidad() + "");
                num3.setText(detalles.get(2).getCantidad() + "");
                break;

            case 4:
                num1.setText(detalles.get(0).getCantidad() + "");
                num2.setText(detalles.get(1).getCantidad() + "");
                num3.setText(detalles.get(2).getCantidad() + "");
                num4.setText(detalles.get(3).getCantidad() + "");
                break;
            case 5:
                num1.setText(detalles.get(0).getCantidad() + "");
                num2.setText(detalles.get(1).getCantidad() + "");
                num3.setText(detalles.get(2).getCantidad() + "");
                num4.setText(detalles.get(3).getCantidad() + "");
                num5.setText(detalles.get(4).getCantidad() + "");
                break;
            case 6:
                num1.setText(detalles.get(0).getCantidad() + "");
                num2.setText(detalles.get(1).getCantidad() + "");
                num3.setText(detalles.get(2).getCantidad() + "");
                num4.setText(detalles.get(3).getCantidad() + "");
                num5.setText(detalles.get(4).getCantidad() + "");
                num6.setText(detalles.get(5).getCantidad() + "");
                break;
        }*/

    }

    private void productos() {
        ProductoData prd = new ProductoData();
        int cont = detalles.size();

        switch (cont) {
            case 1:
                produ1.setText(prd.TraerProducto(detalles.get(0).getIdProducto()).getNombre() + "");
                break;
            case 2:
                produ1.setText(prd.TraerProducto(detalles.get(0).getIdProducto()).getNombre() + "");
                produ2.setText(prd.TraerProducto(detalles.get(1).getIdProducto()).getNombre() + "");
                break;
            case 3:
                produ1.setText(prd.TraerProducto(detalles.get(0).getIdProducto()).getNombre() + "");
                produ2.setText(prd.TraerProducto(detalles.get(1).getIdProducto()).getNombre() + "");
                break;

            case 4:
                produ1.setText(prd.TraerProducto(detalles.get(0).getIdProducto()).getNombre() + "");
                produ2.setText(prd.TraerProducto(detalles.get(1).getIdProducto()).getNombre() + "");
                break;
            case 5:
                produ1.setText(prd.TraerProducto(detalles.get(0).getIdProducto()).getNombre() + "");
                produ2.setText(prd.TraerProducto(detalles.get(1).getIdProducto()).getNombre() + "");
                break;
            case 6:
                produ1.setText(prd.TraerProducto(detalles.get(0).getIdProducto()).getNombre() + "");
                produ2.setText(prd.TraerProducto(detalles.get(1).getIdProducto()).getNombre() + "");
                break;
        }
    }

    private void precios() {
        int cont = detalles.size();

        switch (cont) {
            case 1:
                precio1.setText(detalles.get(0).getTotalPedido() + "");
                break;
            case 2:
                precio1.setText(detalles.get(0).getTotalPedido() + "");
                precio2.setText(detalles.get(1).getTotalPedido() + "");
                break;
            case 3:
                precio1.setText(detalles.get(0).getTotalPedido() + "");
                precio2.setText(detalles.get(1).getTotalPedido() + "");
                break;
            case 4:
                precio1.setText(detalles.get(0).getTotalPedido() + "");
                precio2.setText(detalles.get(1).getTotalPedido() + "");
                break;
            case 5:
                precio1.setText(detalles.get(0).getTotalPedido() + "");
                precio2.setText(detalles.get(1).getTotalPedido() + "");
                break;
            case 6:
                precio1.setText(detalles.get(0).getTotalPedido() + "");
                precio2.setText(detalles.get(1).getTotalPedido() + "");
                break;
        }
    }

    private void subTotal() {
        double todo = 0;

        for (DetallePedido cada : detalles) {
            todo += cada.getTotalPedido();
        }

        this.subtotal.setText(todo + "");
    }

    private void impuestos() {
        double todo = 0;

        for (DetallePedido cada : detalles) {
            todo += cada.getTotalPedido();
        }

        this.impuesto.setText(todo + "");
    }

    private void total() {
        double todo = 0;

        for (DetallePedido cada : detalles) {
            todo += cada.getTotalPedido();
        }

        todo *= 2;

        this.total.setText(todo + "");
    }

    private void fechaMeseroMesa() {
        LocalDateTime f = LocalDateTime.now(ZoneId.systemDefault());

        this.fecha.setText(f.getDayOfMonth() + "-" + f.getMonthValue() + "-" + f.getYear() + " " + f.getHour() + ":" + f.getMinute() + ":" + f.getSecond());

        MeseroData m = new MeseroData();

        this.mesero.setText(detalles.get(0).getPedido().getMesero().getNombreApellido());

        MesaData md = new MesaData();

        this.mesa.setText("MESA " + detalles.get(0).getPedido().getMesa().getIdMesa());
    }

}
