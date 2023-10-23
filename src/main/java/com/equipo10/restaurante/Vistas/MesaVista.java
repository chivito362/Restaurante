package com.equipo10.restaurante.Vistas;

import com.equipo10.restaurante.AccesoADatos.MesaData;
import com.equipo10.restaurante.Entidades.Mesa;
import com.equipo10.restaurante.ValidacionDatos;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class MesaVista extends javax.swing.JInternalFrame {
    Mesa mesa = new Mesa();
    private int numeroMesa;
    int cantMesa = 0;
    private MesaData mesaData;
    
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
        jBagregarMesa = new javax.swing.JButton();
        jTcantMesas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBquitarMesa = new javax.swing.JButton();

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

        jBagregarMesa.setText("Agregar");
        jBagregarMesa.setPreferredSize(new java.awt.Dimension(100, 20));
        jBagregarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarMesaActionPerformed(evt);
            }
        });

        jTcantMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcantMesasActionPerformed(evt);
            }
        });

        jLabel1.setText("Cantidad de Mesas:");

        jBquitarMesa.setText("Quitar");
        jBquitarMesa.setPreferredSize(new java.awt.Dimension(100, 20));
        jBquitarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBquitarMesaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTcantMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBagregarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBquitarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(jPmesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBagregarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTcantMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jBquitarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPmesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBagregarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarMesaActionPerformed
   //jTcantMesas
   if (!ValidacionDatos.validarNumeroPositivo(jTcantMesas.getText())) {
            JOptionPane.showMessageDialog(this, "EPA!!!");
            return;
        }
        agregarMesa();// con esto las creo
       
    }//GEN-LAST:event_jBagregarMesaActionPerformed

    private void jTcantMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcantMesasActionPerformed

  
    }//GEN-LAST:event_jTcantMesasActionPerformed

    private void jBquitarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBquitarMesaActionPerformed
       if (!ValidacionDatos.validarNumeroPositivo(jTcantMesas.getText())) {
            JOptionPane.showMessageDialog(this, "EPA!!!");
            return;
        }
        quitarMesa(Integer.parseInt(jTcantMesas.getText()));
    }//GEN-LAST:event_jBquitarMesaActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MesaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MesaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MesaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MesaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MesaVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBagregarMesa;
    private javax.swing.JButton jBquitarMesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPmesas;
    private javax.swing.JTextField jTcantMesas;
    // End of variables declaration//GEN-END:variables

public void abrirMesa(int numeroMesa) {
    
    mesa = mesaData.buscarMesaxNRO(numeroMesa);
    //JOptionPane.showMessageDialog(null, mesa.getNroMesa());
    if (mesa != null && !mesa.isEstado()) {
        mesa.setEstado(true);
        mesaData.actualizarMesa(mesa);
                JOptionPane.showMessageDialog(null, "Mesa " + numeroMesa + " abierta");
    }
}
public void cerrarMesa(int numeroMesa){
  mesa = mesaData.buscarMesaxNRO(numeroMesa);
  //JOptionPane.showMessageDialog(null, mesa.getNroMesa());
    
    //if (mesa != null && mesa.isEstado()) {
        mesa.setEstado(false);
        mesaData.actualizarMesa(mesa);
                JOptionPane.showMessageDialog(null, "Mesa " + numeroMesa + " cerrada");
  //  }
};
private void agregarMesasAbiertasDesdeBaseDeDatos() {
  
    //List<Mesa> mesasAbiertas = mesaData.obtenerMesas(1); // Mesas abiertas
    //List<Mesa> mesasCerradas = mesaData.obtenerMesas(0); // Mesas cerradas
    //List<Mesa> mesasTodas = new ArrayList<>();
    List<Mesa> mesasTodas = mesaData.obtenerTodasMesas();

    for (Mesa mesa : mesasTodas) {
        JButton mesaButton = new JButton(Integer.toString(mesa.getNroMesa()));
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
                        cerrarMesa(mesa.getNroMesa());
                    } else {
                        mesaButton.setBackground(Color.green);
                        abrirMesa(mesa.getNroMesa());
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
    private void agregarMesa() {
        int mesasMax = 70;
        int numeroMasAlto = mesaData.obtenerNumeroMesaMasAlto();
       // JOptionPane.showMessageDialog(null, numeroMasAlto ); aca lo trae bien
           
       if (numeroMasAlto > 0) {
            numeroMesa = numeroMasAlto + 1;
             } else {
            numeroMesa = 1; // Si no hay mesas en la base de datos, comenzar desde 1.
             }
           
        cantMesa = Integer.parseInt(jTcantMesas.getText());
        
        if (numeroMesa + cantMesa > mesasMax+1){
             JOptionPane.showMessageDialog(null, "La cantidad deseada de mesas excede el límite permitido de " + mesasMax);
        } else {
        for (int i = 0; i < cantMesa; i++) {

            JButton mesaButtonManual = new JButton(""+numeroMesa);
            Font font = new Font("Segoe UI", Font.BOLD, 12); 
            mesaButtonManual.setFont(font);
            mesaButtonManual.setBackground(Color.red);//rojo cerradas
             //guardarMesa String sql = "INSERT INTO mesa (nroMesa, capacidad, estado, idReserva) VALUES (?, ?, ?, ?)";
             mesa.setCapacidad(4);
             mesa.setEstado(false);
             mesa.setNroMesa(numeroMesa);
             mesa.setIdReserva(null);
             //aca falla?
             crearMesa(mesa); 
           
             mesaButtonManual.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (e.getClickCount() == 2) {
                        if (mesaButtonManual.getBackground().equals(Color.green)) {//abierta
                            // Cambia el color del botón a rojo y cierra la mesa
                              mesaButtonManual.setBackground(Color.red);
                            //JOptionPane.showMessageDialog(null, mesaButtonManual.getText() + " mesa cerrada");
                            cerrarMesa(Integer.parseInt(mesaButtonManual.getText()));   
                        } else {
                            mesaButtonManual.setBackground(Color.green);
                           // JOptionPane.showMessageDialog(null, mesaButtonManual.getText() + " mesa abierta");
                             abrirMesa(Integer.parseInt(mesaButtonManual.getText()));                        }
                    }
                }
            });

            mesaButtonManual.setPreferredSize(new Dimension(50, 50));
            mesaButtonManual.setMaximumSize(new Dimension(30, 30));

            JPanel buttonPanel = new JPanel();
            buttonPanel.add(mesaButtonManual);

            // Agrega el panel del botón al panel de mesas
            jPmesas.add(buttonPanel);

            // Vuelve a validar y repintar el panel de mesas
            jPmesas.revalidate();
            jPmesas.repaint();
            numeroMesa++;

        }}
    }

    private void crearMesa(Mesa mesaPasada) {
       mesa=mesaPasada;
       mesaData.guardarMesa(mesa);
    }

    private void quitarMesa(int cantidadMesas) {
    Component[] components = jPmesas.getComponents(); // Obtener los componentes en el panel
    
    int startIndex = components.length - 1; // Empezar desde el último componente
    
    for (int i = 0; i < cantidadMesas && startIndex >= 0; i++) {
        Component component = components[startIndex];
        if (component instanceof JPanel) {
            JPanel buttonPanel = (JPanel) component;
            if (buttonPanel.getComponentCount() > 0 && buttonPanel.getComponent(0) instanceof JButton) {
                JButton mesaButtonManual = (JButton) buttonPanel.getComponent(0);
                String textoDelBoton = mesaButtonManual.getText();
                
                // Muestra el texto del botón en un cuadro de diálogo
               // JOptionPane.showMessageDialog(null, "Texto del botón: " + textoDelBoton);
               // mesaData.eliminarMesaxNRO(Integer.parseInt(textoDelBoton));
               
            }
            jPmesas.remove(buttonPanel); // Eliminar el panel del botón
        }
        startIndex--; // Mover al componente anterior en orden inverso
    }
    
    jPmesas.revalidate();
    jPmesas.repaint();
}


}
