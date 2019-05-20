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
import javax.swing.JOptionPane;
//

/**
 *
 * @author Felipe
 */
public class proveedor extends javax.swing.JFrame {

    //varibles globales 
    private DefaultTableModel modeloTable;
    
    public proveedor() {
        modeloTable = new DefaultTableModel(null, getColumn());
        initComponents();
    }
      
    private String[] getColumn(){
        String columnas[] = new String[]{"Cod Proveedor","nombre","telefono","direccion"};
        return columnas;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jButton1.setText("vista principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        jLabel2.setText("cod_proveedor");

        jLabel3.setText("proveedor");

        txtProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProveedorKeyTyped(evt);
            }
        });

        jLabel4.setText("telefono");

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        jLabel5.setText("Direccion");

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

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        tblProveedor.setModel(modeloTable);
        jScrollPane1.setViewportView(tblProveedor);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton5)
                                .addComponent(jButton1)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnAdicionar)
                            .addGap(47, 47, 47)
                            .addComponent(btnEliminar)
                            .addGap(47, 47, 47)
                            .addComponent(btnBuscar)
                            .addGap(46, 46, 46)
                            .addComponent(btnLimpiar)
                            .addGap(191, 191, 191)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(171, 171, 171)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(137, 137, 137)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnBuscar)
                    .addComponent(jButton5)
                    .addComponent(btnAdicionar)
                    .addComponent(btnLimpiar))
                .addGap(23, 23, 23)
                .addComponent(jButton1)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VistaPrincipal obj=new VistaPrincipal();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        
        //Validar los campos vac{ios
        if(txtCodigo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese codigo");
            txtCodigo.requestFocus();
            return;
        }   
        
        if(txtProveedor.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese Proveedor");
            txtProveedor.requestFocus();
            return;
        }   
        
        if(txtTelefono.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese Telefono");
            txtTelefono.requestFocus();
            return;
        }   
        
        if(txtDireccion.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese Direccion");
            txtDireccion.requestFocus();
            return;
        }   
        
        //Instancio la clase 
        TablaProveedor objTablaProveedor = new TablaProveedor();
        
        //Declaro variables
        int codigo;
        String proveedor;
        String telefono;
        String direccion;
        String sqlConsulta;
        
        //Asigno los valores del formualrio 
        codigo = Integer.parseInt(txtCodigo.getText());
        proveedor = txtProveedor.getText();
        //telefono = Integer.parseInt(txtTelefono.getText());
        telefono = txtTelefono.getText();
        direccion = txtDireccion.getText();
        
        //Envio los datos
        sqlConsulta = "select * from proveedor where Cod_proveedor ="+ codigo;
        
        boolean resultado = objTablaProveedor.insertarProveedor(codigo,proveedor,telefono,direccion);
            if(resultado == true){
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            }else{
                JOptionPane.showMessageDialog(null, "Registro no exitoso");

            }
            
        //Limpio los campos
        txtCodigo.setText("");
        txtProveedor.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        
       
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        modeloTable.setNumRows(0);
       
        TablaProveedor objTablaProveedor = new TablaProveedor();
        ResultSet resultado = objTablaProveedor.cargarProveedor();
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

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "solo numeros xd");
         }
    
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProveedorKeyTyped
        char validar = evt.getKeyChar();
        
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "solo Letras");
         }
    }//GEN-LAST:event_txtProveedorKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "solo numeros xd");
         }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        //Limpio los campos
        txtCodigo.setText("");
        txtProveedor.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        
        //Limpio las filas y columnas
        modeloTable.setNumRows(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        TablaProveedor objTablaProveedor = new TablaProveedor();
        
        //Asigno el modelo para el Jtable
        DefaultTableModel modeloTable = (DefaultTableModel) tblProveedor.getModel();
        
        //Asigno el indice del elemento seleccionado
        int indice= tblProveedor.getSelectedRow();
        
        //Asigno el campo de codigo al elemento a eliminar
        int codigo = Integer.parseInt(String.valueOf(modeloTable.getValueAt(indice, 0)));
        
        //Elimino el registro de la tabla
        modeloTable.removeRow(indice);
        
        //Elimino el registro de la BD
        
        try {
            
            boolean resultado = objTablaProveedor.eliminarProveedor(codigo);
            
            if(resultado == true){
                JOptionPane.showMessageDialog(null, "Registro elimano correctamente");
            }else{
                JOptionPane.showMessageDialog(null, "Registro elimano correctamente");

            }
            
        } catch (Exception e) {
        }
        
        
       
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProveedor;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
