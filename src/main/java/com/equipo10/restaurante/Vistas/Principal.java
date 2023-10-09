
package com.equipo10.restaurante.Vistas;

import java.awt.LayoutManager;

public class Principal extends javax.swing.JFrame {

 
    public Principal() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        desktop = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuCargaProductos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        desktop.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );

        jPanelPrincipal.add(desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 91, -1, 490));

        jButton1.setText("Mesas");
        jPanelPrincipal.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 388, 200, 50));

        jButton3.setText("Usuarios");
        jPanelPrincipal.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 465, 200, 50));

        jButton4.setText("Pedidos");
        jPanelPrincipal.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 200, 50));

        jButton2.setText("Reservas");
        jButton2.setPreferredSize(new java.awt.Dimension(58, 24));
        jPanelPrincipal.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 200, 50));

        jMenu1.setText("Administracion");

        jMenuItem1.setText("Carga Usuarios");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Gestion");

        MenuCargaProductos.setText("Carga Productos");
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

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuCargaProductos;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanelPrincipal;
    // End of variables declaration//GEN-END:variables
}
