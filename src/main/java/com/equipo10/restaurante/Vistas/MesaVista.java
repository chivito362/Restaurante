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
        agregarMesasConEstadoDesdeBaseDeDatos();// con este las levanto
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPmesas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

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

        jLabel1.setText("amarillo = mesa con reserva verde=abierta roja=cerrada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(jPmesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(jPmesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPmesas;
    // End of variables declaration//GEN-END:variables

public void abrirMesa(int numeroMesa) {
    
    mesa = mesaData.buscarMesaxNRO(numeroMesa);
    //JOptionPane.showMessageDialog(null, mesita.getNroMesa());
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
            pd.buscarPedidosxNumeroMesa(mesa.getIdMesa());
            ArrayList<Integer> pedidos=pd.buscarPedidosxIDMesa(mesa);
            for (Integer i : pedidos) {
                pd.CerrarPedido(i);
            }
            mesa.setEstado(false);
            mesaData.CerrarMesaxNRO(mesa);
            Detalle det=new Detalle(deta);
        }
};
private void agregarMesasConEstadoDesdeBaseDeDatos() {
  
    List<Mesa> mesasTodas = mesaData.obtenerTodasMesas();

for (Mesa mesita : mesasTodas) {
    JButton mesaButton = new JButton(Integer.toString(mesita.getIdMesa()));
    Font font = new Font("Segoe UI", Font.BOLD, 12);
    mesaButton.setFont(font);

    if (mesita.isEstado()) {
        mesaButton.setBackground(Color.green);
    } else if (mesita.getIdReserva().getIdReserva() != 0) {
        mesaButton.setBackground(Color.yellow);
    } else {
        mesaButton.setBackground(Color.red);
    }



        /*mesaButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {//agregar el amarillo!!!!
                if (e.getClickCount() == 2) {
                    // Cambiar el color del botón y actualizar el estado de la mesita en la base de datos
                    if (mesaButton.getBackground().equals(Color.green)) {
                        
                        cerrarMesa(mesita.getIdMesa());//aca habria que ver si la pude cerrar
                        mesaButton.setBackground(Color.red);
                    } else {
                        
                        abrirMesa(mesita.getIdMesa());//aca revisar si la pude abrir
                        mesaButton.setBackground(Color.green);
                    }
                }
            }
        }*/
        
       // );

        mesaButton.setPreferredSize(new Dimension(50, 50));
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(mesaButton);
        jPmesas.add(buttonPanel);//agrego la mesa al panel
    }//aca termina el foreach 
        // Vuelve a validar y repintar el panel de mesas
    jPmesas.revalidate();
    jPmesas.repaint();
}
}
