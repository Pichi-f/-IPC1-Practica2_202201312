/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejemplopractica2;

import static ejemplopractica2.VerRecorridos.Vehiculo1Lbl;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class PreparacionPedido extends javax.swing.JFrame {

    /**
     * Creates new form PreparacionPedido
     */
    public static Producto[] productos = new Producto[50];
    public static int contadorProductos;
    
    

    public String nombre;
    public String precio;
    public String distancia1;
    public String distancia2;
    public String moto;

    public PreparacionPedido() {
        initComponents();
        //No se cambie el tamaño de la ventana
        this.setResizable(false);
        //Utilizado para visualizar en el centro la ventana
        this.setLocationRelativeTo(null);
        actualizarListadoProductos();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListadoPedidos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListadoProductos = new javax.swing.JTable();
        AgregarProductoBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        VehiculoCbo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        DistanciaImput = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        AcumuladoLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Pedido");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Productos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        ListadoPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Precio"
            }
        ));
        jScrollPane1.setViewportView(ListadoPedidos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 290, 120));

        ListadoProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Pizza Grande", "50"},
                {"Hamburguesa", "25"},
                {"Gaseosa", "10"},
                {"Papas Fritas", "15"}
            },
            new String [] {
                "Producto", "Precio"
            }
        ));
        jScrollPane2.setViewportView(ListadoProductos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 290, 120));

        AgregarProductoBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AgregarProductoBtn.setText("Agregar Producto Seleccionado al Pediddo");
        AgregarProductoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarProductoBtnActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarProductoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel3.setText("Vehiculo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        VehiculoCbo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "null", "Motocicleta 1", "Motocicleta 2", "Motocicleta 3" }));
        jPanel1.add(VehiculoCbo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        jLabel4.setText("Dsitancia a Recorrer");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));
        jPanel1.add(DistanciaImput, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 30, -1));

        jLabel5.setText("Km");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, -1, -1));

        jButton2.setBackground(new java.awt.Color(102, 255, 0));
        jButton2.setText("Confirmar Pedido");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, -1, -1));
        jPanel1.add(AcumuladoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        VerRecorridos vr = new VerRecorridos();
        vr.setVisible(true);

        moto = (String) VehiculoCbo.getSelectedItem();
        String distancia1 = DistanciaImput.getText();
        String distancia2 = DistanciaImput.getText();
        
        String distancias = DistanciaImput.getText();
        
        Distancia nuevaDistancia = new Distancia(distancias);
        int contadorDistancias = VerRecorridos.contadorDistancias;
        VerRecorridos.distancias[contadorDistancias] = nuevaDistancia;
        VerRecorridos.contadorDistancias++;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.setVisible(false);
        Inicio in = new Inicio();
        in.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void AgregarProductoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarProductoBtnActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = ListadoProductos.getSelectedRow();

        //nombre = ListadoProductos.getModel().getValueAt(filaSeleccionada, 1).toString();
        //precio = ListadoProductos.getModel().getValueAt(filaSeleccionada, 2).toString();
        if (filaSeleccionada != -1) {
            String nombre, precio;
            nombre = ListadoProductos.getValueAt(filaSeleccionada, 0).toString();
            precio = ListadoProductos.getValueAt(filaSeleccionada, 1).toString();

            String datos[] = {nombre, precio};
            DefaultTableModel modeloProducto = (DefaultTableModel) ListadoPedidos.getModel();
            modeloProducto.addRow(datos);
        } else {
            JOptionPane.showMessageDialog(this, "Error debe seleccionar un registro");
        }

        sumar();

    }//GEN-LAST:event_AgregarProductoBtnActionPerformed

    public void actualizarListadoProductos() {
        if (contadorProductos > 0) {

            //Actualizar listado
            DefaultTableModel modeloListado = (DefaultTableModel) ListadoProductos.getModel();

            for (int i = 0; i < contadorProductos; i++) {
                modeloListado.setValueAt(productos[i].nombre, i, 0);
                modeloListado.setValueAt(productos[i].precio, i, 1);
            }
        }
    }

    public void sumar() {
        int fila = 0;
        int total = 0;
        for (int i = 0; i < ListadoPedidos.getRowCount(); i++) {
            fila = Integer.parseInt(ListadoPedidos.getValueAt(i, 1).toString());
            total += fila;
        }
        AcumuladoLbl.setText("Total: Q " + total);
    }

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
            java.util.logging.Logger.getLogger(PreparacionPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PreparacionPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PreparacionPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PreparacionPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PreparacionPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AcumuladoLbl;
    private javax.swing.JButton AgregarProductoBtn;
    public static javax.swing.JTextField DistanciaImput;
    private javax.swing.JTable ListadoPedidos;
    private javax.swing.JTable ListadoProductos;
    public static javax.swing.JComboBox<String> VehiculoCbo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
