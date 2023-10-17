/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.equipo10.restaurante.Vistas;

import com.equipo10.restaurante.AccesoADatos.Conexion;
import com.equipo10.restaurante.AccesoADatos.ReservaData;
import com.equipo10.restaurante.Entidades.Reserva;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Facua
 */
public class ReservaVista extends javax.swing.JPanel implements ActionListener {

    private static JPopupMenu popupmenu = new JPopupMenu();
    private static DefaultTableModel modelo;
    private static DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
    private static ReservaData rd = new ReservaData();
    private static boolean siDocumento;
    private static boolean siNombre;
    public static int dniEscrito = -1;
    public static LocalDate fecha;

    /**
     * Creates new form ReservaVista2
     */
    public ReservaVista() {
        initComponents();
        siDocumento = (!jTdocumento.getText().equals("Documento")) || (!jTdocumento.getText().equals(""));
        siNombre = (!jTnya.getText().equals("Nombre y Apellido")) || (!jTnya.getText().equals(""));
        opacos();
        modelo = (DefaultTableModel) jTReservas.getModel();
        tabla();
        mostrarReservas(3);
        botonesAnimacion();
        menuClickDerecho();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTReservas = new javax.swing.JTable();
        jBcrear = new javax.swing.JLabel();
        jDCfecha = new com.toedter.calendar.JDateChooser();
        buscar = new javax.swing.JLabel();
        jTdocumento = new javax.swing.JTextField();
        jTnya = new javax.swing.JTextField();
        jTDNI = new javax.swing.JTextField();
        jbPorFecha = new javax.swing.JButton();
        jbTodas = new javax.swing.JButton();
        jbActivas = new javax.swing.JButton();
        jbInactivas = new javax.swing.JButton();
        jbPorDni = new javax.swing.JButton();
        jBactualizar = new javax.swing.JButton();

        setBackground(new java.awt.Color(251, 250, 241));
        setMinimumSize(new java.awt.Dimension(633, 490));
        setPreferredSize(new java.awt.Dimension(633, 490));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setBackground(new java.awt.Color(251, 250, 241));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 10, 162, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Documento");
        fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 10, 162, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Fecha");
        fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 10, 162, 20));

        jScrollPane1.setBackground(new java.awt.Color(89, 68, 33));
        jScrollPane1.setForeground(new java.awt.Color(251, 250, 241));
        jScrollPane1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        jTReservas.setBackground(new java.awt.Color(56, 49, 39));
        jTReservas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTReservas.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jTReservas.setForeground(new java.awt.Color(251, 250, 241));
        jTReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Documento", "Fecha", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTReservas.setAlignmentX(0.0F);
        jTReservas.setAlignmentY(0.0F);
        jTReservas.setFillsViewportHeight(true);
        jTReservas.setGridColor(new java.awt.Color(54, 47, 37));
        jTReservas.setRowHeight(30);
        jTReservas.setRowMargin(2);
        jTReservas.setSelectionBackground(new java.awt.Color(57, 137, 111));
        jTReservas.setSelectionForeground(new java.awt.Color(251, 250, 241));
        jTReservas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTReservas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTReservas.setShowGrid(false);
        jTReservas.getTableHeader().setResizingAllowed(false);
        jTReservas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTReservas);
        if (jTReservas.getColumnModel().getColumnCount() > 0) {
            jTReservas.getColumnModel().getColumn(0).setResizable(false);
            jTReservas.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTReservas.getColumnModel().getColumn(1).setResizable(false);
            jTReservas.getColumnModel().getColumn(2).setResizable(false);
            jTReservas.getColumnModel().getColumn(3).setResizable(false);
            jTReservas.getColumnModel().getColumn(3).setPreferredWidth(20);
            jTReservas.getColumnModel().getColumn(4).setResizable(false);
            jTReservas.getColumnModel().getColumn(4).setPreferredWidth(15);
        }

        fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 633, 290));

        jBcrear.setBackground(new java.awt.Color(251, 250, 241));
        jBcrear.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jBcrear.setForeground(new java.awt.Color(0, 0, 0));
        jBcrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBcrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crear_icon2.png"))); // NOI18N
        jBcrear.setToolTipText("");
        jBcrear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBcrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBcrear.setOpaque(true);
        jBcrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBcrearMouseClicked(evt);
            }
        });
        fondo.add(jBcrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 70, 120, 42));

        jDCfecha.setBackground(new java.awt.Color(251, 250, 241));
        jDCfecha.setForeground(new java.awt.Color(0, 0, 0));
        jDCfecha.setDateFormatString("y MM d");
        jDCfecha.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        fondo.add(jDCfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 30, 162, 30));

        buscar.setBackground(new java.awt.Color(251, 250, 241));
        buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_icon.png"))); // NOI18N
        buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        buscar.setIconTextGap(10);
        buscar.setMaximumSize(new java.awt.Dimension(100, 100));
        buscar.setMinimumSize(new java.awt.Dimension(60, 60));
        buscar.setPreferredSize(new java.awt.Dimension(60, 60));
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
        });
        fondo.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 42, 42));

        jTdocumento.setBackground(new java.awt.Color(251, 250, 241));
        jTdocumento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTdocumento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTdocumento.setText("Documento");
        jTdocumento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jTdocumento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTdocumentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTdocumentoFocusLost(evt);
            }
        });
        fondo.add(jTdocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 30, 162, 30));

        jTnya.setBackground(new java.awt.Color(251, 250, 241));
        jTnya.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTnya.setText("Nombre y Apellido");
        jTnya.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jTnya.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTnyaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTnyaFocusLost(evt);
            }
        });
        fondo.add(jTnya, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 30, 162, 30));

        jTDNI.setBackground(new java.awt.Color(251, 250, 241));
        jTDNI.setForeground(new java.awt.Color(0, 0, 0));
        jTDNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTDNI.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar ID", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        fondo.add(jTDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 122, 100, 40));

        jbPorFecha.setBackground(new java.awt.Color(56, 49, 39));
        jbPorFecha.setForeground(new java.awt.Color(251, 250, 241));
        jbPorFecha.setText("POR FECHA");
        jbPorFecha.setBorder(null);
        jbPorFecha.setBorderPainted(false);
        jbPorFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbPorFecha.setFocusPainted(false);
        jbPorFecha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPorFechaActionPerformed(evt);
            }
        });
        fondo.add(jbPorFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 165, 125, 35));

        jbTodas.setBackground(new java.awt.Color(56, 49, 39));
        jbTodas.setForeground(new java.awt.Color(251, 250, 241));
        jbTodas.setText("TODAS");
        jbTodas.setBorder(null);
        jbTodas.setBorderPainted(false);
        jbTodas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbTodas.setFocusPainted(false);
        jbTodas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTodasActionPerformed(evt);
            }
        });
        fondo.add(jbTodas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 165, 125, 35));

        jbActivas.setBackground(new java.awt.Color(56, 49, 39));
        jbActivas.setForeground(new java.awt.Color(251, 250, 241));
        jbActivas.setText("ACTIVAS");
        jbActivas.setBorder(null);
        jbActivas.setBorderPainted(false);
        jbActivas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbActivas.setFocusPainted(false);
        jbActivas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbActivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActivasActionPerformed(evt);
            }
        });
        fondo.add(jbActivas, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 165, 126, 35));

        jbInactivas.setBackground(new java.awt.Color(56, 49, 39));
        jbInactivas.setForeground(new java.awt.Color(251, 250, 241));
        jbInactivas.setText("INACTIVAS");
        jbInactivas.setBorder(null);
        jbInactivas.setBorderPainted(false);
        jbInactivas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbInactivas.setFocusPainted(false);
        jbInactivas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbInactivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInactivasActionPerformed(evt);
            }
        });
        fondo.add(jbInactivas, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 165, 125, 35));

        jbPorDni.setBackground(new java.awt.Color(56, 49, 39));
        jbPorDni.setForeground(new java.awt.Color(251, 250, 241));
        jbPorDni.setText("POR DNI");
        jbPorDni.setBorder(null);
        jbPorDni.setBorderPainted(false);
        jbPorDni.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbPorDni.setFocusPainted(false);
        jbPorDni.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbPorDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPorDniActionPerformed(evt);
            }
        });
        fondo.add(jbPorDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 165, 126, 35));

        jBactualizar.setBackground(new java.awt.Color(251, 250, 241));
        jBactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar_icon.png"))); // NOI18N
        jBactualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBactualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBactualizar.setEnabled(false);
        jBactualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBactualizarActionPerformed(evt);
            }
        });
        fondo.add(jBactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 70, 120, 42));

        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 633, 490));
    }// </editor-fold>//GEN-END:initComponents

    public JPanel getFondo() {
        return fondo;
    }

    private void jBcrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBcrearMouseClicked
        if (siNombre && siDocumento) {
            String nom = jTnya.getText();
            int docu = Integer.parseInt(jTdocumento.getText());
            Calendar cal = jDCfecha.getCalendar();
            LocalDate fecha = LocalDate.of(cal.get(1), cal.get(2) + 1, cal.get(5));

            Reserva rv = new Reserva(cuentaIDs(), nom, docu, fecha, true);

            rd.guardarReserva(rv);

            toTabla(rv);

            jTnya.setText("");
            jTdocumento.setText("");
            jDCfecha.setCalendar(null);
            opacos();
        }
    }//GEN-LAST:event_jBcrearMouseClicked

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked
        Reserva res;
        try {
            int id = Integer.parseInt(jTDNI.getText());
            if (!jTDNI.getText().equals("")) {
                res = rd.buscarReserva(id);

                modelo.setRowCount(0);
                modelo.addRow(new Object[]{res.getIdReserva(), res.getNombreApellido(), res.getDni(), res.getFechaHora().toString(), res.isEstado()});
            }
        } catch (NumberFormatException ex) {
            jTDNI.setText("");
        }
    }//GEN-LAST:event_buscarMouseClicked

    private void jbTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTodasActionPerformed
        mostrarReservas(3);
    }//GEN-LAST:event_jbTodasActionPerformed

    private void jbActivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActivasActionPerformed
        mostrarReservas(1);
    }//GEN-LAST:event_jbActivasActionPerformed

    private void jbInactivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInactivasActionPerformed
        mostrarReservas(0);
    }//GEN-LAST:event_jbInactivasActionPerformed

    private void jbPorDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPorDniActionPerformed
        ElegirDNI ele = new ElegirDNI(null, true);
        ele.setSize(220, 200);
        ele.setVisible(true);

        modelo.setRowCount(0);
        for (Reserva res : rd.obtenerReservasPorDni(dniEscrito)) {
            modelo.addRow(new Object[]{res.getIdReserva(), res.getNombreApellido(), res.getDni(), res.getFechaHora().toString(), res.isEstado()});
        }
    }//GEN-LAST:event_jbPorDniActionPerformed

    private void jbPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPorFechaActionPerformed
        EleFecha eleF = new EleFecha(null, true);
        eleF.setSize(220, 200);
        eleF.setVisible(true);

        modelo.setRowCount(0);
        for (Reserva res : rd.todas()) {
            if (res.getFechaHora().toString().equals(fecha.toString())) {
                modelo.addRow(new Object[]{res.getIdReserva(), res.getNombreApellido(), res.getDni(), res.getFechaHora().toString(), res.isEstado()});
            }
        }
    }//GEN-LAST:event_jbPorFechaActionPerformed

    private void jBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBactualizarActionPerformed

        int fila = jTReservas.getSelectedRow();
        int id = Integer.parseInt(modelo.getValueAt(fila, 0).toString());

        String nom = jTnya.getText();
        int docu = Integer.parseInt(jTdocumento.getText());
        Calendar cal = jDCfecha.getCalendar();
        LocalDate fechaa = LocalDate.of(cal.get(1), cal.get(2) + 1, cal.get(5));

        Reserva rv = rd.buscarReserva(id);
        rv.setNombreApellido(nom);
        rv.setDni(docu);
        rv.setFechaHora(fechaa);

        rd.actualizarReserva(rv);
        mostrarReservas(3);

        jTnya.setText("");
        jTdocumento.setText("");
        jDCfecha.setCalendar(null);
        opacos();

        jBactualizar.setEnabled(false);
    }//GEN-LAST:event_jBactualizarActionPerformed

    private void jTnyaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTnyaFocusGained
        if (jTnya.getText().equals("Nombre y Apellido")) {
            jTnya.setText("");
            jTnya.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTnyaFocusGained

    private void jTnyaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTnyaFocusLost
        try{
            int nom = Integer.parseInt(jTdocumento.getText());
        }catch(NumberFormatException ex){
            if(jTnya.getText().equals("Nombre y Apellido") || jTnya.getText().equals("")){
            jTnya.setForeground(new Color(187, 187, 187));
            jTnya.setText("Nombre y Apellido");
            }
        }
    }//GEN-LAST:event_jTnyaFocusLost

    private void jTdocumentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTdocumentoFocusGained

        if (jTdocumento.getText().equals("Documento")) {
            jTdocumento.setText("");
            jTdocumento.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTdocumentoFocusGained

    private void jTdocumentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTdocumentoFocusLost
        try {
            int docu = Integer.parseInt(jTdocumento.getText());
            if (jTdocumento.getText().equals("")) {
                jTdocumento.setForeground(new Color(187, 187, 187));
                jTdocumento.setText("Documento");
            }
        } catch (NumberFormatException ex) {
            jTdocumento.setForeground(new Color(187, 187, 187));
            jTdocumento.setText("Documento");
        }
    }//GEN-LAST:event_jTdocumentoFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscar;
    private javax.swing.JPanel fondo;
    private javax.swing.JButton jBactualizar;
    private javax.swing.JLabel jBcrear;
    private com.toedter.calendar.JDateChooser jDCfecha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTDNI;
    private javax.swing.JTable jTReservas;
    private javax.swing.JTextField jTdocumento;
    private javax.swing.JTextField jTnya;
    private javax.swing.JButton jbActivas;
    private javax.swing.JButton jbInactivas;
    private javax.swing.JButton jbPorDni;
    private javax.swing.JButton jbPorFecha;
    private javax.swing.JButton jbTodas;
    // End of variables declaration//GEN-END:variables

    //Se necesita para la funcion -botonesAnimacion-.
    private void eventoMouse(JLabel label) {

        label.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent evt) {
                label.setSize(label.getWidth() + 2, label.getHeight() + 2);
            }

            @Override
            public void mouseExited(MouseEvent evt) {
                label.setSize(label.getWidth() - 2, label.getHeight() - 2);
            }
            
            @Override
            public void mousePressed(MouseEvent evt){
                jBcrear.setBackground(new Color(57,137,111));
            }
            
            @Override
            public void mouseReleased(MouseEvent evt){
                jBcrear.setBackground(new Color(251,250,241));
            }
        });

    }

    //Esta funcion hace que al pasar el mouse por encima de los "botones" resalten un poco.
    private void botonesAnimacion() {
        List<JLabel> lista = new ArrayList<>();

        lista.add(buscar);
        lista.add(jBcrear);

        for (JLabel cada : lista) {
            eventoMouse(cada);
        }
    }

    //Esto setea los colores iniciales de los jTextField y jSeparator.
    private void opacos() {
        jTnya.setForeground(new Color(187, 187, 187));
        jTdocumento.setForeground(new Color(187, 187, 187));
        jTnya.setText("Nombre y Apellido");
        jTdocumento.setText("Documento");
    }

    //Ingresa las Reservas al jTable dependiendo del parametro ingresado.
    //(0 == Inactivos, 1 == Activos y 3 == Todas)
    private void mostrarReservas(int num) {
        if (num == 3) {
            modelo.setRowCount(0);
            for (Reserva res : rd.todas()) {
                modelo.addRow(new Object[]{res.getIdReserva(), res.getNombreApellido(), res.getDni(), res.getFechaHora().toString(), res.isEstado()});
            }
        } else {
            modelo.setRowCount(0);
            for (Reserva res : rd.obtenerReservas(num)) {
                modelo.addRow(new Object[]{res.getIdReserva(), res.getNombreApellido(), res.getDni(), res.getFechaHora().toString(), res.isEstado()});
            }
        }
    }

    //Está al pedo, la uso una vez y nada mas, pero bueno, sirve.
    private void toTabla(Reserva res) {
        modelo.addRow(new Object[]{res.getIdReserva(), res.getNombreApellido(), res.getDni(), res.getFechaHora().toString(), res.isEstado()});
    }

    //Agrega los Items al jComboBo y lo centra.
    private void tabla() {
        dtcr.setHorizontalAlignment(JLabel.CENTER);
        jTReservas.getColumnModel().getColumn(0).setCellRenderer(dtcr);
        jTReservas.getColumnModel().getColumn(1).setCellRenderer(dtcr);
        jTReservas.getColumnModel().getColumn(2).setCellRenderer(dtcr);
        jTReservas.getColumnModel().getColumn(3).setCellRenderer(dtcr);
        jTReservas.getColumnModel().getColumn(4).setCellRenderer(dtcr);
    }

    //jTextField letra color negro.
    private void setBlack() {
        jTnya.setForeground((Color.BLACK));
        jTdocumento.setForeground((Color.BLACK));
    }

    private void menuClickDerecho() {
        JMenuItem item1 = new JMenuItem("Editar");
        item1.addActionListener(this);
        item1.setActionCommand("editar");
        popupmenu.add(item1);

        JMenuItem item2 = new JMenuItem("Eliminar");
        item2.addActionListener(this);
        item2.setActionCommand("eliminar");
        popupmenu.add(item2);

        jTReservas.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    popupmenu.show(jTReservas, e.getX(), e.getY());
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        switch (comando) {
            case "editar":
                Reserva res;
                int fila = jTReservas.getSelectedRow();
                if (fila >= 0) {
                    res = rd.buscarReserva(Integer.parseInt(modelo.getValueAt(fila, 0).toString()));

                    setBlack();

                    jTnya.setText(res.getNombreApellido());
                    jTdocumento.setText(res.getDni() + "");
                    jDCfecha.setDate(Date.valueOf(res.getFechaHora()));

                    jBactualizar.setEnabled(true);
                }
                break;
            case "eliminar":
                int fila2 = jTReservas.getSelectedRow();

                Reserva ress = rd.buscarReserva(Integer.parseInt(modelo.getValueAt(fila2, 0).toString()));

                rd.eliminarReserva(ress);
                mostrarReservas(0);
                break;
        }
    }

    private int cuentaIDs() {
        int cont = 0;
        String sql = "SELECT idReserva FROM reserva";
        try {
            PreparedStatement ps = Conexion.getConexion("restaurante").prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                cont += 1;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
        return cont + 1;
    }
}
