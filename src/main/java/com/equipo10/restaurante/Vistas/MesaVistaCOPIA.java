package com.equipo10.restaurante.Vistas;

import com.equipo10.restaurante.AccesoADatos.DetallePedidoData;
import com.equipo10.restaurante.AccesoADatos.MesaData;
import com.equipo10.restaurante.AccesoADatos.PedidoData;
import com.equipo10.restaurante.AccesoADatos.ReservaData;
import com.equipo10.restaurante.Entidades.DetallePedido;
import com.equipo10.restaurante.Entidades.Mesa;
import com.equipo10.restaurante.Entidades.Pedido;
import com.equipo10.restaurante.Entidades.Reserva;
import com.equipo10.restaurante.ValidacionDatos;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class MesaVistaCOPIA extends javax.swing.JPanel {

    private static DefaultListCellRenderer dlcr = new DefaultListCellRenderer();
    private static MesaData md = new MesaData();
    private static DetallePedidoData dpd = new DetallePedidoData();
    private static PedidoData pd = new PedidoData();
    private static List<Mesa> lista = new ArrayList<>();
    private static List<JButton> botones = new ArrayList<>();
    public static List<DetallePedido> detalles = new ArrayList<>();
    private static Mesa me = new Mesa();

    public MesaVistaCOPIA() {
        initComponents();
        txtReserva.setForeground(new Color(187, 187, 187));
        lista = md.obtenerTodasMesas();
        cargarCB();
        cargarMesas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtReserva = new javax.swing.JTextField();
        contenedor = new javax.swing.JPanel();
        jlReservar = new javax.swing.JLabel();
        cbReservas = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(251, 250, 241));
        setPreferredSize(new java.awt.Dimension(633, 490));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtReserva.setBackground(new java.awt.Color(251, 250, 241));
        txtReserva.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtReserva.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtReserva.setText("ID Mesa");
        txtReserva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtReserva.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtReservaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtReservaFocusLost(evt);
            }
        });
        add(txtReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 70, 30));

        contenedor.setBackground(new java.awt.Color(251, 250, 241));
        contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 75, 600, 405));

        jlReservar.setBackground(new java.awt.Color(0, 21, 36));
        jlReservar.setForeground(new java.awt.Color(255, 255, 255));
        jlReservar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlReservar.setText("Reservar");
        jlReservar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlReservar.setOpaque(true);
        jlReservar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlReservarMouseClicked(evt);
            }
        });
        add(jlReservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 70, 30));

        cbReservas.setBackground(new java.awt.Color(251, 250, 241));
        cbReservas.setForeground(new java.awt.Color(35, 32, 31));
        cbReservas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        cbReservas.setOpaque(true);
        add(cbReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 150, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jlReservarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlReservarMouseClicked
        if (cbReservas.getSelectedIndex() > -1) {

            Reserva res = (Reserva) cbReservas.getSelectedItem();
            int idMesa = Integer.parseInt(txtReserva.getText());

            for (Mesa cada : lista) {
                if (cada.getIdMesa() == idMesa) {
                    Mesa m = cada;
                    m.setIdReserva(res);
                    md.anadirReserva(m);
                    cargarMesas();
                    cargarCB();
                }
            }
        }
    }//GEN-LAST:event_jlReservarMouseClicked

    private void txtReservaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtReservaFocusGained

        if (txtReserva.getText().equals("ID Mesa")) {
            txtReserva.setText("");
            txtReserva.setForeground(new Color(35, 32, 31));
        }
    }//GEN-LAST:event_txtReservaFocusGained

    private void txtReservaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtReservaFocusLost
        try {
            int docu = Integer.parseInt(txtReserva.getText());
            if (txtReserva.getText().equals("")) {
                txtReserva.setForeground(new Color(187, 187, 187));
                txtReserva.setText("ID Mesa");
            }
        } catch (NumberFormatException ex) {
            txtReserva.setForeground(new Color(187, 187, 187));
            txtReserva.setText("ID Mesa");
        }
    }//GEN-LAST:event_txtReservaFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Reserva> cbReservas;
    public static javax.swing.JPanel contenedor;
    private javax.swing.JLabel jlReservar;
    private javax.swing.JTextField txtReserva;
    // End of variables declaration//GEN-END:variables

    public void cargarMesas() {
        contenedor.removeAll();
        int X = 5;
        int Y = 0;

        for (Mesa cada : lista) {

            if (X > 401) {
                X = 5;
                Y += 82;
            }

            JButton mesa = new JButton();
            mesa.setBackground(colorSegun(cada));
            mesa.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
            mesa.setForeground(new java.awt.Color(35, 32, 31));
            mesa.setText(cada.getIdMesa() + "");
            mesa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            mesa.setBorder(javax.swing.BorderFactory.createLineBorder(bordeSegun(cada), 2));
            mesa.setFocusPainted(false);
            botones.add(mesa);
            contenedor.add(mesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(X, Y, 193, 77));

            X += 198;

            mesa.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent e) {
                    if (e.getClickCount() == 2) {
                        // Cambiar el color del botón y actualizar el estado de la mesita en la base de datos
                        if (mesa.getBackground().equals(Color.green)) {

                            cerrarMesa(Integer.parseInt(mesa.getText()), mesa);//aca habria que ver si la pude cerrar
                        } else {

                            abrirMesa(Integer.parseInt(mesa.getText()), mesa);//aca revisar si la pude abrir
                        }
                    }
                }

                //Le agreaga un borde celeste cuando posicionan el mouse por encima y luego vuelve al predeterminado.
                @Override
                public void mouseEntered(MouseEvent e) {
                    mesa.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(112, 255, 255), 2));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    mesa.setBorder(javax.swing.BorderFactory.createLineBorder(bordeSegun(cada), 2));
                }

            }
            );
        }
        contenedor.revalidate();
        contenedor.repaint();

    }

    public void abrirMesa(int numeroMesa, JButton boton) {

        me = md.buscarMesa(numeroMesa);

        if (me != null && !me.isEstado()) {
            me.setEstado(true);
            md.AbrirMesaxNRO(me);
            boton.setBackground(Color.green);
            boton.setBorder(javax.swing.BorderFactory.createLineBorder(bordeSegun(1, null), 2));
        }
    }

    public void cerrarMesa(int numeroMesa, JButton boton) {

        int pane = JOptionPane.showConfirmDialog(null, "¿Desea cobrar la mesa?", "Cobrar", JOptionPane.YES_NO_OPTION);
        if (pane == JOptionPane.YES_OPTION) {

            me = md.buscarMesa(numeroMesa);

            List<DetallePedido> deta = new ArrayList<>();
            List<Pedido> pedidos = pd.ListarPedidosDeLaMesa(me);
            boolean entre = false;
            if (!pedidos.isEmpty()) {
                for (Pedido cada : pedidos) {
                    deta.addAll(dpd.obtenerDetalleXPedido(cada));
                    if (cada.isEntregado()) { //Solo cierra el pedido solo si está entregado
                        pd.CerrarPedido(cada.getIdPedido());
                        entre = true;
                    }
                }

                if (entre) { //si el pedido está entregado cierra la mesa
                    md.CerrarMesaxNRO(me);
                    boton.setBackground(Color.red);
                    boton.setBorder(javax.swing.BorderFactory.createLineBorder(bordeSegun(0, null), 2));

                    //Abre el ticker para imprimir
                    Detalle de = new Detalle(deta);
                    de.setLocationRelativeTo(Login.prin);
                    de.setVisible(true);

                    PrinterJob job = PrinterJob.getPrinterJob();

                    job.setPrintable(de);

                    if (job.printDialog()) {
                        try {
                            job.print();
                        } catch (PrinterException ex) {

                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "No se pudo Imprimir");
                    }
                }
            }
        }
    }

    private static Color colorSegun(Mesa m) {

        if (m.getIdReserva() == null) {
            if (m.isEstado()) {
                return Color.green;
            } else {
                return Color.red;
            }
        } else {
            return Color.yellow;
        }
    }

    private static Color bordeSegun(Mesa m) {

        if (m.getIdReserva() == null) {
            if (m.isEstado()) {
                return new java.awt.Color(0, 220, 0);
            } else {
                return new java.awt.Color(220, 0, 0);
            }
        } else {
            return new java.awt.Color(229, 229, 0);
        }
    }

    private static Color bordeSegun(int m, Reserva res) {

        if (res == null) {
            if (m == 1) {
                return new java.awt.Color(0, 220, 0);
            } else {
                return new java.awt.Color(220, 0, 0);
            }
        } else {
            return new java.awt.Color(229, 229, 0);
        }
    }

    private void cargarCB() {
        ReservaData rd = new ReservaData();
        dlcr.setHorizontalAlignment(SwingConstants.CENTER);
        cbReservas.setRenderer(dlcr);


        for (Reserva cada : rd.obtenerReservas(1)) {
            cbReservas.addItem(cada);
        }

        cbReservas.setSelectedIndex(-1);
    }

}
