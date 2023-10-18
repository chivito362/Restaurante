
package com.equipo10.restaurante.Vistas;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;


public class Principal extends javax.swing.JFrame {
private static final ReservaVista rv = new ReservaVista();
    public Principal() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        btnMesas = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnPedidos = new javax.swing.JButton();
        jBreservas = new javax.swing.JButton();
        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuCargaProductos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPrincipal.setBackground(new java.awt.Color(251, 250, 241));
        jPanelPrincipal.setPreferredSize(new java.awt.Dimension(833, 581));
        jPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMesas.setBackground(new java.awt.Color(56, 49, 39));
        btnMesas.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        btnMesas.setForeground(new java.awt.Color(251, 250, 241));
        btnMesas.setText("Mesas");
        btnMesas.setBorder(null);
        btnMesas.setBorderPainted(false);
        btnMesas.setFocusPainted(false);
        btnMesas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesasActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(btnMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 388, 196, 50));

        btnUsuarios.setBackground(new java.awt.Color(56, 49, 39));
        btnUsuarios.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(251, 250, 241));
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setBorder(null);
        btnUsuarios.setBorderPainted(false);
        btnUsuarios.setFocusPainted(false);
        btnUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelPrincipal.add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 465, 196, 50));

        btnPedidos.setBackground(new java.awt.Color(56, 49, 39));
        btnPedidos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        btnPedidos.setForeground(new java.awt.Color(251, 250, 241));
        btnPedidos.setText("Pedidos");
        btnPedidos.setBorder(null);
        btnPedidos.setBorderPainted(false);
        btnPedidos.setFocusPainted(false);
        btnPedidos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(btnPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 320, 196, 50));

        jBreservas.setBackground(new java.awt.Color(56, 49, 39));
        jBreservas.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jBreservas.setForeground(new java.awt.Color(251, 250, 241));
        jBreservas.setText("Reservas");
        jBreservas.setBorder(null);
        jBreservas.setBorderPainted(false);
        jBreservas.setFocusPainted(false);
        jBreservas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBreservas.setPreferredSize(new java.awt.Dimension(58, 24));
        jBreservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBreservasActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jBreservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 250, 196, 50));

        Escritorio.setBackground(new java.awt.Color(218, 247, 166));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jPanelPrincipal.add(Escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 91, 633, 490));

        jMenuBar1.setBackground(new java.awt.Color(161, 4, 18));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(251, 250, 241));
        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jMenuBar1.setOpaque(true);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(833, 23));

        jMenu1.setBackground(new java.awt.Color(251, 250, 241));
        jMenu1.setForeground(new java.awt.Color(251, 250, 241));
        jMenu1.setText("Administracion");

        jMenuItem1.setText("Carga Usuarios");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(251, 250, 241));
        jMenu2.setForeground(new java.awt.Color(251, 250, 241));
        jMenu2.setText("Gestion");

        MenuCargaProductos.setText("Carga Productos");
        MenuCargaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCargaProductosActionPerformed(evt);
            }
        });
        jMenu2.add(MenuCargaProductos);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBreservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBreservasActionPerformed

        showPanel(rv.getFondo());
    }//GEN-LAST:event_jBreservasActionPerformed

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
        PedidoVista ven=new PedidoVista();
        crearVentana(ven);
    }//GEN-LAST:event_btnPedidosActionPerformed

    private void btnMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesasActionPerformed
       MesaVista ven=new MesaVista();
        crearVentana(ven);
    }//GEN-LAST:event_btnMesasActionPerformed

    private void MenuCargaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCargaProductosActionPerformed
        ProductoCargaVista venta=new ProductoCargaVista();
        venta.setLocationRelativeTo(null);
        venta.setVisible(true);
    }//GEN-LAST:event_MenuCargaProductosActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem MenuCargaProductos;
    private javax.swing.JButton btnMesas;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton jBreservas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanelPrincipal;
    // End of variables declaration//GEN-END:variables


    private void showPanel(JPanel p){
        p.setSize(633, 490);
        p.setLocation(0, 0);
        Escritorio.removeAll();
        Escritorio.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        Escritorio.revalidate();
        Escritorio.repaint();
    }
    
    private void crearVentana(JInternalFrame fi){      
        Escritorio.removeAll();
        Escritorio.repaint();
        fi.setVisible(true);
        Escritorio.setSize(fi.getWidth(), fi.getHeight());
        Escritorio.add(fi);
        Escritorio.moveToFront(fi);
}
}
