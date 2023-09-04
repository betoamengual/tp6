package Categoria;
import Data.ProductosData;

import Data.ProductosData;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
import java.util.TreeSet;
import javax.swing.JOptionPane;

public class ProductosFrame extends javax.swing.JFrame {
    private TreeSet<Categoria> categorias;
    private ProductosData prodEncontrado=null;
    private ProductosData pd;
    /**
     * Creates new form GestionProductos
     */
    public ProductosFrame() {
        initComponents();
        categorias = new TreeSet<>();
        pd = new ProductosData();
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
       // JButton buscarButton = new JButton(new ImageIcon("C:\\Users\\Usuario\\Desktop\\TUDS 2 CUATRIMESTRE\\LABORATORIO\\tp6\\src/descarga.jpg"));
        
       
    }




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonSalir = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldDescripcion = new javax.swing.JTextField();
        jTextFieldPrecio = new javax.swing.JTextField();
        jTextFieldStock = new javax.swing.JTextField();
        jComboBoxRubro = new javax.swing.JComboBox<>();
        jButtonLupa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.setEnabled(false);
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonGuardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setEnabled(false);
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonNuevo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setText("Gestión de Productos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Stock");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Rubro");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Precio");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Descripción");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Código");

        jTextFieldCodigo.setEnabled(false);
        jTextFieldCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldCodigoFocusLost(evt);
            }
        });
        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });

        jTextFieldDescripcion.setEnabled(false);
        jTextFieldDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldDescripcionFocusLost(evt);
            }
        });
        jTextFieldDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescripcionActionPerformed(evt);
            }
        });

        jTextFieldPrecio.setEnabled(false);
        jTextFieldPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldPrecioFocusLost(evt);
            }
        });

        jTextFieldStock.setEnabled(false);

        jComboBoxRubro.setModel(new javax.swing.DefaultComboBoxModel<>(new Categoria[] { Categoria.COMESTIBLE,Categoria.LIMPIEZA,Categoria.PERFUMERIA }));
        jComboBoxRubro.setSelectedIndex(-1);
        jComboBoxRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRubroActionPerformed(evt);
            }
        });

        jButtonLupa.setBackground(new java.awt.Color(255, 255, 255));
        jButtonLupa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Image20230831192303.png"))); // NOI18N
        jButtonLupa.setAlignmentX(0.5F);
        jButtonLupa.setMaximumSize(new java.awt.Dimension(259, 230));
        jButtonLupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLupaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonNuevo)
                                .addGap(38, 38, 38)
                                .addComponent(jButtonGuardar)
                                .addGap(37, 37, 37)
                                .addComponent(jButtonEliminar)
                                .addGap(129, 129, 129)
                                .addComponent(jButtonSalir))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonLupa, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldStock, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1)))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLupa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalir)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonNuevo))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
      //  ProductosData guardar = new ProductosData(new TreeSet<>);
        try {
        
            int codigo = Integer.parseInt(jTextFieldCodigo.getText());
            String descripcion = jTextFieldDescripcion.getText();
            double precio = Double.parseDouble(jTextFieldPrecio.getText());
            Categoria rubro = (Categoria) jComboBoxRubro.getSelectedItem();
            int stock = Integer.parseInt(jTextFieldStock.getText());
            ProductosData productos = new ProductosData(codigo, descripcion, precio,rubro,stock);
            
        if(descripcion.isEmpty()){
                JOptionPane.showMessageDialog(this, "No debe haber campos en blanco");
                return;
            }
        
        if (rubro == null) {
        JOptionPane.showMessageDialog(this, "Debe elegir un rubro");
        return;}
        
        boolean resultado= MenuPrincipal.productoAgg.add(productos);
        if(resultado){
            JOptionPane.showMessageDialog(this, "Producto Agregado con éxito");
            }else {
            
                JOptionPane.showMessageDialog(this, "Ya existe un producto con ese código");
            }
        desenableb();
        } catch (NumberFormatException nf) {

            JOptionPane.showMessageDialog(this, "Debe ingresar nros en codigo, precio y stock");
         
        }
       
         
        
        
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jComboBoxRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRubroActionPerformed
        // TODO add your handling code here:    
          if (jComboBoxRubro.getSelectedIndex()<0 && jComboBoxRubro.getSelectedIndex()>3) {
                    JOptionPane.showMessageDialog(null, "Por favor, seleccione un rubro válido.", "Error", JOptionPane.ERROR_MESSAGE);
                    jComboBoxRubro.requestFocusInWindow();
                }
    }//GEN-LAST:event_jComboBoxRubroActionPerformed

    private void jButtonLupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLupaActionPerformed
        // TODO add your handling code here:
        
        try {
            prodEncontrado=null;
            int codigo=Integer.parseInt(jTextFieldCodigo.getText());
            for (ProductosData prod : MenuPrincipal.productoAgg) {

                if (prod.getCodigo() == codigo) {

                    prodEncontrado = prod;
                    break;
                }
            }
            if(prodEncontrado==null){
        
            JOptionPane.showMessageDialog(this, "No se encontró producto");
        }else{
             jTextFieldDescripcion.setText(prodEncontrado.getDescripcion());
             jTextFieldPrecio.setText(prodEncontrado.getPrecio()+"");
             jTextFieldStock.setText(prodEncontrado.getStock()+"");
             jComboBoxRubro.setSelectedItem(prodEncontrado.getRubro());
            jButtonEliminar.setEnabled(true);
        }
        
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Usted de escribir un código");
        }
     
     
           
    }//GEN-LAST:event_jButtonLupaActionPerformed

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
        MenuPrincipal.productoAgg.remove(prodEncontrado);
        JOptionPane.showMessageDialog(this, "Producto borrado");
        limpiar();
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        // TODO add your handling code here:
        limpiar();
        enableb();
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jTextFieldCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCodigoFocusLost
        // TODO add your handling code here:
        String textoIngresado = jTextFieldCodigo.getText();
        String patronNumerico = "^[0-9]+$";
                if (textoIngresado.matches(patronNumerico)) {
 
                } else {

                    JOptionPane.showMessageDialog(this, "Ingrese solo números.");
                    jTextFieldCodigo.requestFocus(); 
                }
        
    }//GEN-LAST:event_jTextFieldCodigoFocusLost

    private void jTextFieldDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescripcionActionPerformed

    }//GEN-LAST:event_jTextFieldDescripcionActionPerformed

    private void jTextFieldDescripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldDescripcionFocusLost
       
        String textoIngresado = jTextFieldDescripcion.getText().trim(); // Obtiene el texto ingresado y elimina espacios en blanco al principio y al final

        if (!textoIngresado.isEmpty()) {
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese un valor en el campo.");
            jTextFieldDescripcion.requestFocus(); 
        }




    }//GEN-LAST:event_jTextFieldDescripcionFocusLost

    private void jTextFieldPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPrecioFocusLost
        // TODO add your handling code here:
           
           
                
                try {
                    double precioIngresado = Double.parseDouble(jTextFieldPrecio.getText()); 
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un precio válido");
            jTextFieldPrecio.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldPrecioFocusLost

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
         int confirmar = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas cerrar este proyecto?", "Confirmar Cierre", JOptionPane.YES_NO_OPTION);
                if (confirmar == JOptionPane.YES_OPTION) {
                    dispose(); // Cierra la ventana actual (proyecto)
                }
        
    }//GEN-LAST:event_jButtonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(ProductosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductosFrame().setVisible(true);
                
            }
        });
    }
    private void limpiar(){

        jTextFieldCodigo.setText("");
        jTextFieldDescripcion.setText("");
        jTextFieldPrecio.setText("");
        jTextFieldStock.setText("");
        prodEncontrado=null;
        jButtonEliminar.setEnabled(false);
    }
    private void enableb(){
        jButtonGuardar.setEnabled(true);
        jButtonEliminar.setEnabled(true);
        jTextFieldCodigo.setEnabled(true);
        jTextFieldDescripcion.setEnabled(true);
        jTextFieldPrecio.setEnabled(true);
        jTextFieldStock.setEnabled(true);
    }
 private void desenableb(){
        jButtonGuardar.setEnabled(false);
        jButtonEliminar.setEnabled(false);
        jTextFieldCodigo.setEnabled(false);
        jTextFieldDescripcion.setEnabled(false);
        jTextFieldPrecio.setEnabled(false);
        jTextFieldStock.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonLupa;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<Categoria> jComboBoxRubro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDescripcion;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldStock;
    // End of variables declaration//GEN-END:variables
}
