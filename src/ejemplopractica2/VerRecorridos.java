/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejemplopractica2;

import static ejemplopractica2.PreparacionPedido.DistanciaImput;
import static ejemplopractica2.PreparacionPedido.VehiculoCbo;
import static ejemplopractica2.PreparacionPedido.distancia1;
import static ejemplopractica2.PreparacionPedido.distancia2;
import static ejemplopractica2.PreparacionPedido.distancia3;
import javax.swing.JLabel;

/**
 *
 * @author USUARIO
 */
public class VerRecorridos extends javax.swing.JFrame {

    /**
     * Creates new form VerRecorridos
     */
    public String moto;

    public static Distancia[] distancias = new Distancia[50];
    public static int contadorDistancias;

    public String distancia;

    public VerRecorridos() {
        initComponents();
        //No se cambie el tamaño de la ventana
        this.setResizable(false);
        //Utilizado para visualizar en el centro la ventana
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        DestinoLbl = new javax.swing.JLabel();
        Vehiculo2Lbl = new javax.swing.JLabel();
        TodosBtn = new javax.swing.JButton();
        Vehiculo1Lbl = new javax.swing.JLabel();
        Vehiculo3Lbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Vehiculo1Btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Vehiculo2Btn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Vehiculo3Btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DestinoLbl.setBackground(new java.awt.Color(51, 51, 255));
        DestinoLbl.setOpaque(true);
        jPanel1.add(DestinoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 10, 30, 570));

        Vehiculo2Lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/repartidor_ida.png"))); // NOI18N
        jPanel1.add(Vehiculo2Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 130, 130));

        TodosBtn.setText("Enviar Todos");
        TodosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodosBtnActionPerformed(evt);
            }
        });
        jPanel1.add(TodosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, -1, -1));

        Vehiculo1Lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/repartidor_ida.png"))); // NOI18N
        jPanel1.add(Vehiculo1Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 130, 130));

        Vehiculo3Lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/repartidor_ida.png"))); // NOI18N
        jPanel1.add(Vehiculo3Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 130, 130));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Motocicleta 1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Distancia:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        Vehiculo1Btn.setText("Enviar");
        Vehiculo1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vehiculo1BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Vehiculo1Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Motocicleta 2");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Distancia:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        Vehiculo2Btn.setText("Enviar");
        Vehiculo2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vehiculo2BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Vehiculo2Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Motocicleta 3");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Distancia:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        Vehiculo3Btn.setText("Enviar");
        Vehiculo3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vehiculo3BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Vehiculo3Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setText("Visualización de Trayectorias");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TodosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodosBtnActionPerformed
        // TODO add your handling code here:
        moto = (String) VehiculoCbo.getSelectedItem();

        Recorrido rec1 = new Recorrido(Vehiculo1Lbl, Integer.parseInt(distancia1));
        rec1.start();

        Recorrido rec2 = new Recorrido(Vehiculo2Lbl, Integer.parseInt(distancia2));
        rec2.start();

        Recorrido rec3 = new Recorrido(Vehiculo3Lbl, Integer.parseInt(distancia3));
        rec3.start();

    }//GEN-LAST:event_TodosBtnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.setVisible(false);
        PreparacionPedido pp = new PreparacionPedido();
        pp.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void Vehiculo1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vehiculo1BtnActionPerformed
        // TODO add your handling code here:

        moto = (String) VehiculoCbo.getSelectedItem();

        if (moto == "Motocicleta 1") {
            String distancia1 = DistanciaImput.getText();
            Recorrido rec1 = new Recorrido(Vehiculo1Lbl, Integer.parseInt(distancia1));
            rec1.start();
        }
    }//GEN-LAST:event_Vehiculo1BtnActionPerformed

    private void Vehiculo2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vehiculo2BtnActionPerformed
        // TODO add your handling code here:

        moto = (String) VehiculoCbo.getSelectedItem();

        if (moto == "Motocicleta 2") {
            String distancia2 = DistanciaImput.getText();
            Recorrido rec2 = new Recorrido(Vehiculo2Lbl, Integer.parseInt(distancia2));
            rec2.start();
        }
    }//GEN-LAST:event_Vehiculo2BtnActionPerformed

    private void Vehiculo3BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vehiculo3BtnActionPerformed
        // TODO add your handling code here:

        moto = (String) VehiculoCbo.getSelectedItem();

        if (moto == "Motocicleta 3") {
            String distancia3 = DistanciaImput.getText();
            Recorrido rec3 = new Recorrido(Vehiculo3Lbl, Integer.parseInt(distancia3));
            rec3.start();
        }
    }//GEN-LAST:event_Vehiculo3BtnActionPerformed

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
            java.util.logging.Logger.getLogger(VerRecorridos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerRecorridos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerRecorridos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerRecorridos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerRecorridos().setVisible(true);
            }
        });
    }
    /*
    public JLabel getVehiculo(){
        return Vehiculo1Lbl;
    }
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel DestinoLbl;
    private javax.swing.JButton TodosBtn;
    private javax.swing.JButton Vehiculo1Btn;
    public static javax.swing.JLabel Vehiculo1Lbl;
    private javax.swing.JButton Vehiculo2Btn;
    public static javax.swing.JLabel Vehiculo2Lbl;
    private javax.swing.JButton Vehiculo3Btn;
    public static javax.swing.JLabel Vehiculo3Lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
