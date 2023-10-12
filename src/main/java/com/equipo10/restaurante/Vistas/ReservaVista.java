/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.equipo10.restaurante.Vistas;

import com.equipo10.restaurante.AccesoADatos.ReservaData;
import com.equipo10.restaurante.Entidades.Reserva;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Facua
 */
public class ReservaVista extends javax.swing.JPanel {

    private static DefaultTableModel modelo;
    private static DefaultListCellRenderer dlcr = new DefaultListCellRenderer();
    private static ReservaData rd = new ReservaData();
    public static int dniEscrito = -1;

    /**
     * Creates new form ReservaVista2
     */
    public ReservaVista() {
        initComponents();
        opacos();
        modelo = (DefaultTableModel) jTReservas.getModel();
        combo();
        botonesAnimacion();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCestado = new javax.swing.JCheckBox();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTReservas = new javax.swing.JTable();
        jTdocumento = new javax.swing.JTextField();
        jTidReserva = new javax.swing.JTextField();
        jTnya = new javax.swing.JTextField();
        jBactualizar = new javax.swing.JLabel();
        jBeliminar = new javax.swing.JLabel();
        jBcrear = new javax.swing.JLabel();
        jDCfecha = new com.toedter.calendar.JDateChooser();
        jCBestados = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        buscar = new javax.swing.JLabel();
        filtro = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(633, 490));
        setPreferredSize(new java.awt.Dimension(633, 490));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID Reserva:");
        fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre:");
        fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Documento:");
        fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Fecha:");
        fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 30));

        jCestado.setBackground(new java.awt.Color(255, 255, 255));
        jCestado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jCestado.setForeground(new java.awt.Color(0, 0, 0));
        jCestado.setText("Estado");
        jCestado.setBorder(null);
        jCestado.setContentAreaFilled(false);
        jCestado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCestado.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        fondo.add(jCestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 360, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        fondo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 190, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        fondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 190, 10));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        fondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 130, 10));

        jScrollPane1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        jTReservas.setBackground(java.awt.Color.darkGray);
        jTReservas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTReservas.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jTReservas.setForeground(new java.awt.Color(255, 255, 255));
        jTReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTReservas.setAlignmentX(0.0F);
        jTReservas.setAlignmentY(0.0F);
        jTReservas.setFillsViewportHeight(true);
        jTReservas.setRowHeight(40);
        jTReservas.setRowMargin(2);
        jTReservas.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jTReservas.setSelectionForeground(new java.awt.Color(0, 51, 255));
        jTReservas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTReservas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTReservas.setShowGrid(true);
        jTReservas.getTableHeader().setResizingAllowed(false);
        jTReservas.getTableHeader().setReorderingAllowed(false);
        jTReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTReservasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTReservas);
        if (jTReservas.getColumnModel().getColumnCount() > 0) {
            jTReservas.getColumnModel().getColumn(0).setResizable(false);
        }

        fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 273, 460));

        jTdocumento.setBackground(new java.awt.Color(255, 255, 255));
        jTdocumento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTdocumento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTdocumento.setText("Documento");
        jTdocumento.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTdocumento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTdocumentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTdocumentoFocusLost(evt);
            }
        });
        fondo.add(jTdocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 190, 20));

        jTidReserva.setBackground(new java.awt.Color(255, 255, 255));
        jTidReserva.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTidReserva.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTidReserva.setText("ID Reserva");
        jTidReserva.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTidReserva.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTidReservaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTidReservaFocusLost(evt);
            }
        });
        fondo.add(jTidReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 130, 20));

        jTnya.setBackground(new java.awt.Color(255, 255, 255));
        jTnya.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTnya.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTnya.setText("Nombre y Apellido");
        jTnya.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTnya.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTnyaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTnyaFocusLost(evt);
            }
        });
        fondo.add(jTnya, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 190, 20));

        jBactualizar.setBackground(new java.awt.Color(204, 204, 204));
        jBactualizar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jBactualizar.setForeground(new java.awt.Color(0, 0, 0));
        jBactualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar_icon.png"))); // NOI18N
        jBactualizar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jBactualizar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actualizar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jBactualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBactualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBactualizarMouseClicked(evt);
            }
        });
        fondo.add(jBactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 80, 50));

        jBeliminar.setBackground(new java.awt.Color(204, 204, 204));
        jBeliminar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jBeliminar.setForeground(new java.awt.Color(0, 0, 0));
        jBeliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBeliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar_icon.png"))); // NOI18N
        jBeliminar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jBeliminar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eliminar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jBeliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBeliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBeliminarMouseClicked(evt);
            }
        });
        fondo.add(jBeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 80, 50));

        jBcrear.setBackground(new java.awt.Color(204, 204, 204));
        jBcrear.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jBcrear.setForeground(new java.awt.Color(0, 0, 0));
        jBcrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBcrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crear_icon2.png"))); // NOI18N
        jBcrear.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jBcrear.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crear", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jBcrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBcrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBcrearMouseClicked(evt);
            }
        });
        fondo.add(jBcrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 80, 50));

        jDCfecha.setDateFormatString("y MM d");
        fondo.add(jDCfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 190, 30));

        jCBestados.setBackground(java.awt.Color.darkGray);
        jCBestados.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jCBestados.setForeground(new java.awt.Color(255, 255, 255));
        jCBestados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCBestados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBestadosActionPerformed(evt);
            }
        });
        fondo.add(jCBestados, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 273, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reserva_icon.png"))); // NOI18N
        jLabel5.setText("Reservas");
        jLabel5.setToolTipText("");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 80));

        buscar.setBackground(new java.awt.Color(204, 204, 204));
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
        fondo.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 107, 42, 42));

        filtro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        filtro.setForeground(new java.awt.Color(0, 0, 255));
        filtro.setText("Filtros --->");
        fondo.add(filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 633, 490));
    }// </editor-fold>//GEN-END:initComponents

    public JPanel getFondo() {
        return fondo;
    }

    private void jTdocumentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTdocumentoFocusGained
        if (jTdocumento.getText().equals("Documento")) {
            jTdocumento.setForeground(Color.BLACK);
            jTdocumento.setText("");
        }
    }//GEN-LAST:event_jTdocumentoFocusGained

    private void jTdocumentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTdocumentoFocusLost
        try {
            int num = Integer.parseInt(jTdocumento.getText());
            if (jTdocumento.getText().equals("")) {
                jTdocumento.setForeground(new Color(187, 187, 187));
                jTdocumento.setText("Documento");
            }
        } catch (NumberFormatException ex) {
            jTdocumento.setForeground(new Color(187, 187, 187));
            jTdocumento.setText("Documento");
        }
    }//GEN-LAST:event_jTdocumentoFocusLost

    private void jTidReservaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTidReservaFocusGained
        if (jTidReserva.getText().equals("ID Reserva")) {
            jTidReserva.setForeground(Color.BLACK);
            jTidReserva.setText("");
        }
    }//GEN-LAST:event_jTidReservaFocusGained

    private void jTidReservaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTidReservaFocusLost
        try {
            int num = Integer.parseInt(jTidReserva.getText());
            if (jTidReserva.getText().equals("")) {
                jTidReserva.setForeground(new Color(187, 187, 187));
                jTidReserva.setText("ID Reserva");
            }
        } catch (NumberFormatException ex) {
            jTidReserva.setForeground(new Color(187, 187, 187));
            jTidReserva.setText("ID Reserva");
        }
    }//GEN-LAST:event_jTidReservaFocusLost

    private void jTnyaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTnyaFocusGained
        if (jTnya.getText().equals("Nombre y Apellido")) {
            jTnya.setForeground(Color.BLACK);
            jTnya.setText("");
        }
    }//GEN-LAST:event_jTnyaFocusGained

    private void jTnyaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTnyaFocusLost
        if (jTnya.getText().equals("")) {
            jTnya.setForeground(new Color(187, 187, 187));
            jTnya.setText("Nombre y Apellido");
        }
    }//GEN-LAST:event_jTnyaFocusLost

    private void jBcrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBcrearMouseClicked
        if (!jTidReserva.getText().equals("") || !jTidReserva.getText().equals("ID Reserva")) {

            int id = Integer.parseInt(jTidReserva.getText());
            String nom = jTnya.getText();
            int docu = Integer.parseInt(jTdocumento.getText());
            Calendar cal = jDCfecha.getCalendar();
            LocalDate fecha = LocalDate.of(cal.get(1), cal.get(2) + 1, cal.get(5));
            boolean estado = jCestado.isSelected();

            Reserva rv = new Reserva(id, nom, docu, fecha, estado);

            rd.guardarReserva(rv);
            toTabla(rv);
        } else {

            String nom = jTnya.getText();
            int docu = Integer.parseInt(jTdocumento.getText());
            Calendar cal = jDCfecha.getCalendar();
            LocalDate fecha = LocalDate.of(cal.get(1), cal.get(2) + 1, cal.get(5));
            boolean estado = jCestado.isSelected();

            Reserva rv = new Reserva(nom, docu, fecha, estado);

            rd.guardarReserva(rv);
            toTabla(rv);
        }
    }//GEN-LAST:event_jBcrearMouseClicked

    private void jTReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTReservasMouseClicked
        int fila = jTReservas.getSelectedRow();
        Reserva res;
        if (fila >= 0) {
            res = (Reserva) modelo.getValueAt(fila, 0);
            
            setBlack();
            
            jTidReserva.setText(res.getIdReserva() + "");
            jTnya.setText(res.getNombreApellido());
            jTdocumento.setText(res.getDni() + "");
            jDCfecha.setDate(Date.valueOf(res.getFechaHora()));
            jCestado.setSelected(res.isEstado());
        }
    }//GEN-LAST:event_jTReservasMouseClicked

    private void jCBestadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBestadosActionPerformed
        filtro.setVisible(false);
        switch (jCBestados.getSelectedIndex()) {
            case 1:
                mostrarReservas(1);
                break;
            case 2:
                mostrarReservas(0);
                break;
            case 3:
                ElegirDNI ele = new ElegirDNI(null, true);
                ele.setLocationRelativeTo(buscar);
                ele.setVisible(true);

                modelo.setRowCount(0);
                for (Reserva cada : rd.obtenerReservasPorDni(dniEscrito)) {
                    modelo.addRow(new Object[]{cada});
                }
                break;
            default:
                mostrarReservas(3);
                break;
        }
    }//GEN-LAST:event_jCBestadosActionPerformed

    private void jBactualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBactualizarMouseClicked
        int id = Integer.parseInt(jTidReserva.getText());
        String nom = jTnya.getText();
        int docu = Integer.parseInt(jTdocumento.getText());
        Calendar cal = jDCfecha.getCalendar();
        LocalDate fecha = LocalDate.of(cal.get(1), cal.get(2) + 1, cal.get(5));
        boolean estado = jCestado.isSelected();

        Reserva rv = new Reserva(id, nom, docu, fecha, estado);

        rd.actualizarReserva(rv);
        jCBestados.setSelectedIndex(0);
        mostrarReservas(3);
    }//GEN-LAST:event_jBactualizarMouseClicked

    private void jBeliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBeliminarMouseClicked
        Reserva res = rd.buscarReserva(Integer.parseInt(jTidReserva.getText()));
        rd.eliminarReserva(res);
        jCBestados.setSelectedIndex(0);
        mostrarReservas(3);
    }//GEN-LAST:event_jBeliminarMouseClicked

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked
        Reserva res;
        if(!jTidReserva.getText().equals("") || !jTidReserva.getText().equals("ID Reserva")){
            
            res = rd.buscarReserva(Integer.parseInt(jTidReserva.getText()));
            
            setBlack();
            jTidReserva.setText(res.getIdReserva() + "");
            jTnya.setText(res.getNombreApellido());
            jTdocumento.setText(res.getDni() + "");
            jDCfecha.setDate(Date.valueOf(res.getFechaHora()));
            jCestado.setSelected(res.isEstado());
        }
    }//GEN-LAST:event_buscarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscar;
    private javax.swing.JLabel filtro;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jBactualizar;
    private javax.swing.JLabel jBcrear;
    private javax.swing.JLabel jBeliminar;
    private javax.swing.JComboBox<String> jCBestados;
    private javax.swing.JCheckBox jCestado;
    private com.toedter.calendar.JDateChooser jDCfecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTReservas;
    private javax.swing.JTextField jTdocumento;
    private javax.swing.JTextField jTidReserva;
    private javax.swing.JTextField jTnya;
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
        });

    }

    //Esta funcion hace que al pasar el mouse por encima de los "botones" resalten un poco.
    private void botonesAnimacion() {
        List<JLabel> lista = new ArrayList<>();

        lista.add(buscar);
        lista.add(jBcrear);
        lista.add(jBactualizar);
        lista.add(jBeliminar);

        for (JLabel cada : lista) {
            eventoMouse(cada);
        }
    }

    //Esto setea los colores iniciales de los jTextField y jSeparator.
    private void opacos() {
        jTidReserva.setForeground(new Color(187, 187, 187));
        jTnya.setForeground(new Color(187, 187, 187));
        jTdocumento.setForeground(new Color(187, 187, 187));
        jSeparator1.setForeground(Color.BLACK);
        jSeparator2.setForeground(Color.BLACK);
        jSeparator3.setForeground(Color.BLACK);
    }

    //Ingresa las Reservas al jTable dependiendo del parametro ingresado.
    //(0 == Inactivos, 1 == Activos y 3 == Todas)
    private void mostrarReservas(int num) {
        if (num == 3) {
            modelo.setRowCount(0);
            for (Reserva cada : rd.todas()) {
                modelo.addRow(new Object[]{cada});
            }
        } else {
            modelo.setRowCount(0);
            for (Reserva cada : rd.obtenerReservas(num)) {
                modelo.addRow(new Object[]{cada});
            }
        }
    }

    //Está al pedo, la uso una vez y nada mas, pero bueno, sirve.
    private void toTabla(Reserva res) {
        modelo.addRow(new Object[]{res});
    }

    //Agrega los Items al jComboBo y lo centra.
    private void combo() {
        jCBestados.addItem("Reservas");
        jCBestados.addItem("Reservas Activas");
        jCBestados.addItem("Reservas Inactivas");
        jCBestados.addItem("Reservas por DNI");
        dlcr.setHorizontalAlignment(DefaultListCellRenderer.CENTER);
        jCBestados.setRenderer(dlcr);
    }
    
    //jTextField letra color negro.
    private void setBlack(){
        jTidReserva.setForeground((Color.BLACK));
        jTnya.setForeground((Color.BLACK));
        jTdocumento.setForeground((Color.BLACK));
    }
}
