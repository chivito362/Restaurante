
package com.equipo10.restaurante.Vistas;

import javax.swing.JPanel;


public class Principal extends javax.swing.JFrame {
 
    public Principal() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jBreservas = new javax.swing.JButton();
        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuCargaProductos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPrincipal.setPreferredSize(new java.awt.Dimension(833, 581));
        jPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Mesas");
        jPanelPrincipal.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 388, 200, 50));

        jButton3.setText("Usuarios");
        jPanelPrincipal.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 465, 200, 50));

        jButton4.setText("Pedidos");
        jPanelPrincipal.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 200, 50));

        jBreservas.setText("Reservas");
        jBreservas.setPreferredSize(new java.awt.Dimension(58, 24));
        jBreservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBreservasActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jBreservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 200, 50));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jPanelPrincipal.add(desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 91, 633, 490));

        jMenuBar1.setPreferredSize(new java.awt.Dimension(833, 23));

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

    private void jBreservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBreservasActionPerformed
        ReservaVista rv = new ReservaVista();
        showPanel(rv.getFondo());
    }//GEN-LAST:event_jBreservasActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuCargaProductos;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JButton jBreservas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanelPrincipal;
    // End of variables declaration//GEN-END:variables


    private void showPanel(JPanel p){
        p.setSize(633, 490);
        p.setLocation(0, 0);
        desktop.removeAll();
        desktop.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        desktop.revalidate();
        desktop.repaint();
    }
}
