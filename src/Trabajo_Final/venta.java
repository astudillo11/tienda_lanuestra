package Trabajo_Final;

import Sentencias.TablaVenta;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class venta extends javax.swing.JFrame {

    //Declaro el DefaultTableModel
    //private DefaultTableModel modelTableVenta;
    //Close global para cgargar el formulario
    private int control = 0;
    private double total = 0;
    private int subtotal = 0;
    private double iva = 0;
    private double acum = 0;
    private int cantidadCap = 0;
    private int precioCap = 0;
    private int subtotalCap = 0;
    private double ivaRestar = 0;
    
   
    private DefaultComboBoxModel modelComboProducto;

    public venta() {
        //modelTableVenta = new DefaultTableModel(null, getColumn());
        modelComboProducto = new DefaultComboBoxModel(new String[]{});

        initComponents();
        txtPrecio.setEditable(false);

        //Instancion de la clase TablaVenta
        TablaVenta objTablaVenta = new TablaVenta();

        //ResultSet
        ResultSet estadoProductoCombo;

        //Instancio la clase productoCombo       
        estadoProductoCombo = objTablaVenta.consultarProductoCombo();

        try {
            //Recorremos el resultado generado por la consulta
            while (estadoProductoCombo.next()) {
                //Con el metodo addElement vamos a agregar cada resultado al comboBox
                modelComboProducto.addElement(new productoCombo(estadoProductoCombo.getInt("id"), estadoProductoCombo.getString("nombre"), estadoProductoCombo.getInt("precio")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Consulta no hecha" + e.getMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtPrecio = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lblCantidad = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblIva = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        lblSubtotal1 = new javax.swing.JLabel();
        btnTotalizar = new javax.swing.JButton();
        lblTotal1 = new javax.swing.JLabel();
        lblIva1 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cboProducto = new javax.swing.JComboBox<>();
        txtSubtotal = new javax.swing.JTextField();
        btnReporteVentas = new javax.swing.JButton();
        txtIva = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIdVenta = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 163, -1));

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblTabla);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 720, 160));

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo.setText("VENTA");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        lblProducto.setText("PRODUCTO");
        getContentPane().add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, -1, -1));

        lblCantidad.setText("CANTIDAD");
        getContentPane().add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        lblSubtotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblSubtotal.setText("SUBTOTAL:");
        getContentPane().add(lblSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, -1));

        lblPrecio.setText("PRECIO");
        getContentPane().add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        lblIva.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblIva.setText("IVA:");
        getContentPane().add(lblIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, -1, -1));

        btnAdicionar.setText("ADICIONAR");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        lblTotal.setText("TOTAL A PAGAR:");
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, -1, -1));

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, -1, -1));
        getContentPane().add(lblSubtotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 383, 72, 16));

        btnTotalizar.setText("TOTALIZAR");
        btnTotalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnTotalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));
        getContentPane().add(lblTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 377, 72, 16));
        getContentPane().add(lblIva1, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 383, 77, 16));

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 163, -1));

        btnLimpiar.setText("NUEVA VENTA");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, -1));

        jButton2.setText("VISTA PRINCIPAL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 500, -1, -1));

        cboProducto.setModel(modelComboProducto);
        cboProducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboProductoItemStateChanged(evt);
            }
        });
        getContentPane().add(cboProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 163, -1));
        getContentPane().add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 100, -1));

        btnReporteVentas.setText("REPORTE VENTAS");
        getContentPane().add(btnReporteVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, -1, -1));
        getContentPane().add(txtIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 120, -1));
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 120, -1));

        jLabel2.setText("ID VENTA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));
        getContentPane().add(txtIdVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 160, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        //Validar los campos vacios              
        if (txtPrecio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite el precio");
            txtPrecio.requestFocus();
            return;
        }

        if (txtCantidad.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite la cantidad");
            txtCantidad.requestFocus();
            return;
        }

        //Cargar la tabla
        DefaultTableModel modelo = (DefaultTableModel) tblTabla.getModel();

        if (control == 0) {
            modelo.addColumn("PRODUCTO");
            modelo.addColumn("CANTIDAD");
            modelo.addColumn("PRECIO");

            control = control + 1;
        }

        //Creamos un objeto
        productoCombo objProductoCombo = (productoCombo) cboProducto.getSelectedItem();
        //Asignamos el atributo del objeto seleccionado en el combo.
        String estadoProductoCombo = objProductoCombo.getNombre(); //Ya aquí tenemos el id del estado seleccionado.

        String vector[] = new String[3];
        vector[0] = estadoProductoCombo;
        vector[1] = txtCantidad.getText();
        vector[2] = txtPrecio.getText();
     
        //Añado los valores de los elementos graficos a las variables
        int valorPrecio = Integer.parseInt(txtPrecio.getText());
        int cantidad = Integer.parseInt(txtCantidad.getText());
    
        subtotal = valorPrecio * cantidad;
        acum = acum  + subtotal;
        iva = acum * 0.19;
        total = iva + acum;
        
        txtSubtotal.setText(Integer.toString((int) acum));
        txtIva.setText(Integer.toString((int) iva));
        txtTotal.setText(Integer.toString((int) total));
        
        modelo.addRow(vector);
        
        //Limpio los campos
        txtPrecio.setText("");
        txtCantidad.setText("");

    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         // Eliminar el registro de la tabla
        DefaultTableModel modelo = (DefaultTableModel) tblTabla.getModel();
        
        double xd = 0;
        
        subtotalCap = precioCap * cantidadCap;
        ivaRestar = (subtotalCap * 0.19);
        xd = subtotalCap + ivaRestar;
        
        acum = acum - subtotalCap;
        iva = iva - ivaRestar;
        total = total - xd; 
        
        txtSubtotal.setText(Integer.toString((int) acum));
        txtIva.setText(Integer.toString((int) iva));
        txtTotal.setText(Integer.toString((int) total));
        
        
        //System.out.println(subtotalCap);
        //System.out.println(ivaRestar);
        
        //Identificar el elemento a eliminar
        int indice = tblTabla.getSelectedRow();

        modelo.removeRow(indice);
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnTotalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalizarActionPerformed

        //Modelo tabla
        DefaultTableModel modelo = (DefaultTableModel) tblTabla.getModel();
        int cadaFilaTabla = modelo.getRowCount();

        //Declaro variables
        double iva;
        double subtotal;
        double totalPagar;
        int cantidadProducto;
        int precioProducto;
        subtotal = 0;
        iva = 19;

        for (int fila = 0; fila < cadaFilaTabla; fila++) {

            cantidadProducto = Integer.parseInt((String) modelo.getValueAt(fila, 1));
            precioProducto = Integer.parseInt((String) modelo.getValueAt(fila, 2));
            subtotal = subtotal + (cantidadProducto * precioProducto);
        }

        iva = subtotal * iva / 100;
        totalPagar = subtotal + iva;

        lblSubtotal1.setText(String.valueOf(subtotal));
        lblIva1.setText(String.valueOf(iva));
        lblTotal1.setText(String.valueOf(totalPagar));

    }//GEN-LAST:event_btnTotalizarActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed

    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        //Validar Solo Numeros.
        char numero = evt.getKeyChar();
        if (numero < '0' || numero > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        for (int fila = 0; fila < tblTabla.getRowCount(); fila++) {

            DefaultTableModel modelo = (DefaultTableModel) tblTabla.getModel();
            modelo.removeRow(fila);
            fila -= 1;

        }
        //Limpiar los campos
        //txtProducto.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
        //txtProducto.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VistaPrincipal obj = new VistaPrincipal();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        //Validar Solo Numeros.
        char precio = evt.getKeyChar();
        if (precio < '0' || precio > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void cboProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboProductoItemStateChanged
        //Creamos un objeto
        productoCombo objProductoCombo = (productoCombo) cboProducto.getSelectedItem();
        //Asignamos el atributo del objeto seleccionado en el combo.
        int estadoPrecio = objProductoCombo.getPrecio();
        txtPrecio.setText(Integer.toString(estadoPrecio));
    }//GEN-LAST:event_cboProductoItemStateChanged

    private void tblTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaMouseClicked
        
        //Defino el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) tblTabla.getModel();
        
        //Asigno los elementos de la tabla a los respectivos campos
        String capCantidad = (String)modelo.getValueAt(tblTabla.getSelectedRow(), 1);
        String capPrecio = (String)modelo.getValueAt(tblTabla.getSelectedRow(), 2);
        
        //Convierto las vatiables de Int a String 
        cantidadCap = Integer.parseInt(capCantidad);
       precioCap = Integer.parseInt(capPrecio);
       
        System.out.println(cantidadCap);
       System.out.println(precioCap);        
    }//GEN-LAST:event_tblTablaMouseClicked

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
            java.util.logging.Logger.getLogger(venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnReporteVentas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTotalizar;
    private javax.swing.JComboBox<String> cboProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblIva;
    private javax.swing.JLabel lblIva1;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblSubtotal1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotal1;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtIdVenta;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
