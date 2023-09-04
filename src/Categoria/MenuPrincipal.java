package Categoria;


import Data.ProductosData;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TreeSet;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MenuPrincipal extends javax.swing.JFrame {
     public static TreeSet<ProductosData> productoAgg =new TreeSet<>();

    /**
     * Creates new form GestionDeProductos
     */
    public MenuPrincipal() {
        initComponents();
        //jPanel1.setBackground(Color.yellow);
     
    }
    private void iniComponents(){

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemProductos = new javax.swing.JMenuItem();
        jMenuConsultas = new javax.swing.JMenu();
        jMenuItemRubro = new javax.swing.JMenuItem();
        jMenuItemNombre = new javax.swing.JMenuItem();
        jMenuItemPrecio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 937, Short.MAX_VALUE)
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
        );

        jMenu1.setText("Administración");

        jMenuItemProductos.setText("Productos");
        jMenuItemProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProductosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemProductos);

        jMenuBar1.add(jMenu1);

        jMenuConsultas.setText("Consultas");

        jMenuItemRubro.setText("Por Rubro");
        jMenuItemRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRubroActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemRubro);

        jMenuItemNombre.setText("Por Nombre");
        jMenuItemNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNombreActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemNombre);

        jMenuItemPrecio.setText("Por Precio");
        jMenuItemPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPrecioActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemPrecio);

        jMenuBar1.add(jMenuConsultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProductosActionPerformed
        // TODO add your handling code here:
        ProductosFrame productosFrame = new ProductosFrame();
        productosFrame.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemProductosActionPerformed

    private void jMenuItemRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRubroActionPerformed
        // TODO add your handling code here:
        PorRubro consultasRubro = new PorRubro();
        consultasRubro.setVisible(true);
    }//GEN-LAST:event_jMenuItemRubroActionPerformed

    private void jMenuItemNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNombreActionPerformed
        // TODO add your handling code here:
      
        PorNombre consultasNombre = new PorNombre();
        consultasNombre.setVisible(true);
       
        
      
        //jPanel.moveToFront(pp);
    }//GEN-LAST:event_jMenuItemNombreActionPerformed

    private void jMenuItemPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPrecioActionPerformed
        // TODO add your handling code here:
        PorPrecio consultasPrecio = new PorPrecio();
        consultasPrecio.setVisible(true);
    }//GEN-LAST:event_jMenuItemPrecioActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);


            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenuItem jMenuItemNombre;
    private javax.swing.JMenuItem jMenuItemPrecio;
    private javax.swing.JMenuItem jMenuItemProductos;
    private javax.swing.JMenuItem jMenuItemRubro;
    private javax.swing.JPanel jPanel;
    // End of variables declaration//GEN-END:variables
}
