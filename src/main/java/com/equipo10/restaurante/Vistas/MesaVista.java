package com.equipo10.restaurante.Vistas;

import com.equipo10.restaurante.AccesoADatos.MesaData;
import com.equipo10.restaurante.AccesoADatos.PedidoData;
import com.equipo10.restaurante.Entidades.DetallePedido;
import com.equipo10.restaurante.Entidades.Mesa;
import com.equipo10.restaurante.ValidacionDatos;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class MesaVista extends javax.swing.JInternalFrame {
    Mesa mesa = new Mesa();
    private MesaData mesaData;
    PedidoData pd=new PedidoData();
    
    public MesaVista() {
        initComponents();
        BasicInternalFrameUI ui = (BasicInternalFrameUI) getUI();
        ui.setNorthPane(null);
        jPmesas.setLayout(new GridLayout(0, 10)); // 0 filas y 3 columnas
            
        mesaData = new MesaData();
        agregarMesasAbiertasDesdeBaseDeDatos();// con este las levanto
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPmesas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(633, 490));

        javax.swing.GroupLayout jPmesasLayout = new javax.swing.GroupLayout(jPmesas);
        jPmesas.setLayout(jPmesasLayout);
        jPmesasLayout.setHorizontalGroup(
            jPmesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        jPmesasLayout.setVerticalGroup(
            jPmesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addComponent(jPmesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPmesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPmesas;
    // End of variables declaration//GEN-END:variables

public void abrirMesa(int numeroMesa) {
    
    mesa = mesaData.buscarMesaxNRO(numeroMesa);
    //JOptionPane.showMessageDialog(null, mesa.getNroMesa());
    if (mesa != null && !mesa.isEstado()) {
        mesa.setEstado(true);
        mesaData.AbrirMesaxNRO(mesa);
                JOptionPane.showMessageDialog(null, "Mesa " + numeroMesa + " abierta");
    }
}
    public void cerrarMesa(int numeroMesa) {

        int r = JOptionPane.showConfirmDialog(null, "Desea cobrar la mesa?");
        if (r == 0) {
            
            mesa = mesaData.buscarMesaxNRO(numeroMesa);
            List<DetallePedido>deta=new ArrayList<>();
            pd.listar(mesa.getIdMesa());
            ArrayList<Integer> pedidos=pd.buscarPedidosxIDMesa(mesa);
            for (Integer i : pedidos) {
                pd.CerrarPedido(i);
            }
            mesa.setEstado(false);
            mesaData.CerrarMesaxNRO(mesa);
            Detalle det=new Detalle(deta);
        }
};
private void agregarMesasAbiertasDesdeBaseDeDatos() {
  
    List<Mesa> mesasTodas = mesaData.obtenerTodasMesas();

    for (Mesa mesa : mesasTodas) {
        JButton mesaButton = new JButton(Integer.toString(mesa.getIdMesa()));
        Font font = new Font("Segoe UI", Font.BOLD, 12);
        mesaButton.setFont(font);

        
        
        
        // Establecer el color del botón según el estado de la mesa
        if (mesa.isEstado()) {
            mesaButton.setBackground(Color.green); // Verde para mesas abiertas
        } else {
            mesaButton.setBackground(Color.red); // Rojo para mesas cerradas
        }

        mesaButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    // Cambiar el color del botón y actualizar el estado de la mesa en la base de datos
                    if (mesaButton.getBackground().equals(Color.green)) {
                        mesaButton.setBackground(Color.red);
                        cerrarMesa(mesa.getIdMesa());
                    } else {
                        mesaButton.setBackground(Color.green);
                        abrirMesa(mesa.getIdMesa());
                    }
                }
            }
        });

        mesaButton.setPreferredSize(new Dimension(50, 50));

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(mesaButton);
        jPmesas.add(buttonPanel);
    }
        // Vuelve a validar y repintar el panel de mesas
    jPmesas.revalidate();
    jPmesas.repaint();
}
}
