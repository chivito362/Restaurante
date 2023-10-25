
package com.equipo10.restaurante.Vistas;

import com.equipo10.restaurante.AccesoADatos.ProductoData;
import com.equipo10.restaurante.Entidades.Producto;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class busquedaProducto extends javax.swing.JDialog  {
    
    DefaultTableModel model=new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
        
    };
    ProductoCargaVistaCOPIA ven;
    
    
    public busquedaProducto(JDialog ven,java.awt.Frame parent, boolean modal) {
         super(parent, modal);
        initComponents();
        this.ven=(ProductoCargaVistaCOPIA) ven;
        cargarTabla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSelec = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla);

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        jLabel1.setText("Nombre producto");

        btnSelec.setText("Seleccionar");
        btnSelec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSelec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnSelec)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        limpiarTabla();
        ven.pd=new ProductoData();
        for (Producto t : ven.pd.listarProductos()) {
            if(t.getNombre().toLowerCase().contains(txtNombre.getText())){
            model.addRow(new Object[] {t.getIdProducto(),t.getNombre(),t.getPrecio(),t.getCantidadEnStock()});  
            }
        }
    }//GEN-LAST:event_txtNombreKeyReleased

    private void btnSelecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecActionPerformed
        if(Tabla.getSelectedRow()>-1){
            //guardo el item seleccionado en un objeto
            Producto t=ven.pd.TraerProducto((int)Tabla.getValueAt(Tabla.getSelectedRow(), 0));

            //asigno los valores
            ven.txtId.setText(String.valueOf(t.getIdProducto()));
            ven.txtNombre.setText(t.getNombre());
            ven.txtPrecio.setText(String.valueOf(t.getPrecio()));
            ven.txtStock.setText(String.valueOf(t.getCantidadEnStock()));
            ven.cbCategoria.setSelectedItem(t.getCategoria());
            ven.rbtnHabil.setSelected(t.isEstado());
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto");
        }
    }//GEN-LAST:event_btnSelecActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSelec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
private void cargarTabla(){
    String[] titles={"id","nombre","precio","stock"};
    model.setColumnIdentifiers(titles);
    Tabla.setModel(model);
    datosTabla();
    
}
private void limpiarTabla(){
    for(int i=Tabla.getRowCount()-1;i>=0;i--){
        model.removeRow(i);
    }
}
private void datosTabla(){
    ven.pd=new ProductoData();
    ven.pd.listarProductos().stream().forEach( (t) -> {
        Object[] obj={t.getIdProducto(),t.getNombre(),t.getPrecio(),t.getCantidadEnStock()};
        model.addRow(obj);          
    });
}
        
}
