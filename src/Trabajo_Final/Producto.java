/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo_Final;

import javax.swing.table.DefaultTableModel;
import javax.xml.bind.annotation.XmlElement;
import Sentencias.*;
import com.mysql.jdbc.ResultSetImpl;
import com.sun.net.httpserver.Filter;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class Producto extends javax.swing.JFrame {

    //varibles globales 
    private DefaultTableModel modeloTable;
    
    private  DefaultComboBoxModel modeloCombo;
    
    public Producto() {
      modeloTable = new DefaultTableModel(null, getColumn());
      modeloCombo = new DefaultComboBoxModel(new String [] {});
        initComponents();
        //Instancion al clase productos
        TablaProducto objTablaProducto = new TablaProducto();
        
        //ResultSet
        ResultSet estados;
        //Instancio la clase estados
        estados = objTablaProducto.consultarEstado();
        try {
            //Recorremos el resultado generado por la consulta
            while(estados.next()){
                //Con el metodo addElement vamos a agregar cada resultado al comboBox
                modeloCombo.addElement(new Estado(estados.getInt("Cod_proveedor"), estados.getString("nombre")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Consulta no hecha"+e.getMessage());
        }

        
    }
         
    private String[] getColumn(){
        String columnas[] = new String[]{"id","nombre","precio","id_proveedor"};
        return columnas;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        lblProducto1 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        lblProducto2 = new javax.swing.JLabel();
        cboEstado = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducto = new javax.swing.JTable();
        lblProducto3 = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("id");

        lblProducto.setText("precio:");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        lblProducto1.setText("nombre:");

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        lblProducto2.setText("proveedor");

        cboEstado.setModel(modeloCombo);

        tblProducto.setModel(modeloTable);
        jScrollPane1.setViewportView(tblProducto);

        lblProducto3.setText("PRODUCTOS");

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpiar1.setText("Limpiar");
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });

        jButton2.setText("vista principal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProducto)
                                    .addComponent(jLabel1)
                                    .addComponent(lblProducto1)
                                    .addComponent(lblProducto2))
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(txtId)
                                    .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdicionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar)
                                .addGap(54, 54, 54)
                                .addComponent(btnBuscar)
                                .addGap(72, 72, 72)
                                .addComponent(btnLimpiar1)
                                .addGap(31, 31, 31))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(lblProducto3)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProducto1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblProducto, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProducto2)
                    .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(jButton2)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar1)
                            .addComponent(btnBuscar)
                            .addComponent(btnEliminar)
                            .addComponent(btnAdicionar))
                        .addGap(84, 84, 84))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed

        //Validar los campos vac{ios
            if(txtId.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Ingrese id del proctud");
                txtId.requestFocus();
                return;
            }

            if(txtNombre.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Ingrese Nombre del Producto");
                txtNombre.requestFocus();
                return;
            }

            if(txtPrecio.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Ingrese Precio del producto");
                txtPrecio.requestFocus();
                return;
            }
            
           
            //Creamos un objeto
            Estado objEstado = (Estado) cboEstado.getSelectedItem();
            //Asignamos el atributo del objeto seleccionado en el combo.
            int estado = objEstado.getCod_proveedor(); //Ya aquí tenemos el id del estado seleccionado.

           if (objEstado == null) {
                JOptionPane.showMessageDialog(null, "Ingrese Proveedor");
                return;
            }

            //Instancio la clase
            TablaProducto objTablaProducto = new TablaProducto();

            //Declaro variables
            int id;
            String nombre;
            int id_estado = estado;
            int precio;

            //Asigno los valores del formualrio
            id = Integer.parseInt(txtId.getText());
            nombre = txtNombre.getText();
            precio = Integer.parseInt(txtPrecio.getText());
            System.out.println(id_estado);
            //Envio los datos
            boolean resultado = objTablaProducto.insertarProveedor(id,nombre,precio,id_estado);
            if(resultado == true){
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            }else{
                JOptionPane.showMessageDialog(null, "Registro no exitoso");

            }

            //Limpio los campos
            txtId.setText("");
            txtNombre.setText("");
            txtPrecio.setText("");
            //txtTelefono.setText("");

    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        TablaProducto objTablaProducto = new TablaProducto();

        //Asigno el modelo para el Jtable
        DefaultTableModel modeloTable = (DefaultTableModel) tblProducto.getModel();

        //Asigno el indice del elemento seleccionado
        int indice= tblProducto.getSelectedRow();

        //Asigno el campo de codigo al elemento a eliminar
        int id = Integer.parseInt(String.valueOf(modeloTable.getValueAt(indice, 0)));

        //Elimino el registro de la tabla
        modeloTable.removeRow(indice);

        //Elimino el registro de la BD

        try {

            boolean resultado = objTablaProducto.eliminarProveedor(id);

            if(resultado == true){
                JOptionPane.showMessageDialog(null, "Registro elimano correctamente");
            }else{
                JOptionPane.showMessageDialog(null, "Registro elimano correctamente");

            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        modeloTable.setNumRows(0);

        TablaProducto objTablaProducto = new TablaProducto();
        ResultSet resultado = objTablaProducto.cargaProducto();
        try {
            Object data[] = new Object[4];
            while (resultado.next()){
                for(int i = 0; i < 4; i++){
                    data[i] = resultado.getObject(i+1);
                }
                modeloTable.addRow(data);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
         txtId.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
//        txtTelefono.setText("");

        //Limpio las filas y columnas
        modeloTable.setNumRows(0);
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VistaPrincipal obj=new VistaPrincipal();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblProducto1;
    private javax.swing.JLabel lblProducto2;
    private javax.swing.JLabel lblProducto3;
    private javax.swing.JTable tblProducto;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
