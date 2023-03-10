/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package iva.plantilla;

/**
 *
 * @author lorit
 */
public class FacturaVista extends javax.swing.JFrame {

    private FacturaTemplate factura;

    public FacturaVista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBolivia = new javax.swing.JButton();
        btnPeru = new javax.swing.JButton();
        btnEEUU = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtIva = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFinal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPrecio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Monto a facturar");

        btnBolivia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBolivia.setText("Calcular Iva Bolivia");
        btnBolivia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoliviaActionPerformed(evt);
            }
        });

        btnPeru.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPeru.setText("Calcular Iva Peru");
        btnPeru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeruActionPerformed(evt);
            }
        });

        btnEEUU.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEEUU.setText("Calcular Iva EEUU");
        btnEEUU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEEUUActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("IVA Calculado:");

        txtIva.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtIva.setText("0");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Precio Final Con Iva:");

        txtFinal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtFinal.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEEUU)
                            .addComponent(btnBolivia)
                            .addComponent(btnPeru))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9)
                        .addComponent(txtIva)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtFinal))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBolivia)
                        .addGap(18, 18, 18)
                        .addComponent(btnPeru)
                        .addGap(18, 18, 18)
                        .addComponent(btnEEUU)))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBoliviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoliviaActionPerformed
        this.factura = new FacturaBolivia();
        this.factura.setPrecio(Float.parseFloat(this.txtPrecio.getText()));
        this.factura.CalcularPrecioIva();
        Update();
    }//GEN-LAST:event_btnBoliviaActionPerformed

    private void btnPeruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeruActionPerformed
        this.factura = new FacturaPeru();
        this.factura.setPrecio(Float.parseFloat(this.txtPrecio.getText()));
        this.factura.CalcularPrecioIva();
        Update();
    }//GEN-LAST:event_btnPeruActionPerformed

    private void btnEEUUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEEUUActionPerformed
        this.factura = new FacturaEEUU();
        this.factura.setPrecio(Float.parseFloat(this.txtPrecio.getText()));
        this.factura.CalcularPrecioIva();
        Update();
    }//GEN-LAST:event_btnEEUUActionPerformed

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
            java.util.logging.Logger.getLogger(FacturaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacturaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacturaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacturaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacturaVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBolivia;
    private javax.swing.JButton btnEEUU;
    private javax.swing.JButton btnPeru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel txtFinal;
    private javax.swing.JLabel txtIva;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

    private void Update() {
        this.txtIva.setText(String.valueOf(this.factura.iva));
        this.txtFinal.setText(String.valueOf(this.factura.precioIva));
    }

}
