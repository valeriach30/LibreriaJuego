/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package juego;

import control.Controlador;

/**
 *
 * @author vchin
 */
public class CrearPersonaje extends javax.swing.JDialog {

    private Controlador controlPersonajes;
    /**
     * Creates new form CrearPersonaje
     */
    public CrearPersonaje(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public CrearPersonaje(java.awt.Frame parent, boolean modal, Controlador elControl) {
        super(parent, modal);
        initComponents();
        controlPersonajes = elControl;
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
        lblTitulo = new javax.swing.JLabel();
        nombretxt1 = new javax.swing.JTextField();
        edad = new javax.swing.JSpinner();
        lblTitulo1 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        lblTitulo2 = new javax.swing.JLabel();
        lblTitulo3 = new javax.swing.JLabel();
        edad1 = new javax.swing.JSpinner();
        edad2 = new javax.swing.JSpinner();
        edad3 = new javax.swing.JSpinner();
        lblTitulo4 = new javax.swing.JLabel();
        lblTitulo5 = new javax.swing.JLabel();
        edad4 = new javax.swing.JSpinner();
        btnJsonPersonajes = new javax.swing.JButton();
        btnJsonPersonajes1 = new javax.swing.JButton();
        btnJsonPersonajes2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo.setText("Golpes por tiempo");
        jPanel1.add(lblTitulo);
        lblTitulo.setBounds(20, 250, 130, 40);

        nombretxt1.setBackground(new java.awt.Color(255, 255, 255));
        nombretxt1.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        nombretxt1.setText("Nombre");
        nombretxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretxt1ActionPerformed(evt);
            }
        });
        jPanel1.add(nombretxt1);
        nombretxt1.setBounds(20, 130, 260, 50);

        edad.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jPanel1.add(edad);
        edad.setBounds(150, 260, 64, 30);

        lblTitulo1.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 72)); // NOI18N
        lblTitulo1.setText("Crear Personaje");
        jPanel1.add(lblTitulo1);
        lblTitulo1.setBounds(170, 10, 370, 84);

        btnCrear.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear);
        btnCrear.setBounds(20, 470, 140, 40);

        lblTitulo2.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo2.setText("Campos");
        jPanel1.add(lblTitulo2);
        lblTitulo2.setBounds(20, 310, 70, 40);

        lblTitulo3.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo3.setText("Vida");
        jPanel1.add(lblTitulo3);
        lblTitulo3.setBounds(20, 200, 70, 40);

        edad1.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jPanel1.add(edad1);
        edad1.setBounds(150, 310, 64, 30);

        edad2.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jPanel1.add(edad2);
        edad2.setBounds(150, 210, 64, 30);

        edad3.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jPanel1.add(edad3);
        edad3.setBounds(150, 360, 64, 30);

        lblTitulo4.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo4.setText("Nivel de Aparicion");
        jPanel1.add(lblTitulo4);
        lblTitulo4.setBounds(20, 360, 130, 40);

        lblTitulo5.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo5.setText("Costo");
        jPanel1.add(lblTitulo5);
        lblTitulo5.setBounds(20, 410, 70, 40);

        edad4.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jPanel1.add(edad4);
        edad4.setBounds(150, 420, 64, 30);

        btnJsonPersonajes.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        btnJsonPersonajes.setText("Subir Json");
        btnJsonPersonajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJsonPersonajesActionPerformed(evt);
            }
        });
        jPanel1.add(btnJsonPersonajes);
        btnJsonPersonajes.setBounds(180, 470, 140, 40);

        btnJsonPersonajes1.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        btnJsonPersonajes1.setText("Agregar Habilidades");
        jPanel1.add(btnJsonPersonajes1);
        btnJsonPersonajes1.setBounds(500, 470, 160, 40);

        btnJsonPersonajes2.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        btnJsonPersonajes2.setText("Agregar Armas");
        jPanel1.add(btnJsonPersonajes2);
        btnJsonPersonajes2.setBounds(340, 470, 140, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombretxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombretxt1ActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnJsonPersonajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJsonPersonajesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJsonPersonajesActionPerformed

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
            java.util.logging.Logger.getLogger(CrearPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CrearPersonaje dialog = new CrearPersonaje(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnJsonPersonajes;
    private javax.swing.JButton btnJsonPersonajes1;
    private javax.swing.JButton btnJsonPersonajes2;
    private javax.swing.JSpinner edad;
    private javax.swing.JSpinner edad1;
    private javax.swing.JSpinner edad2;
    private javax.swing.JSpinner edad3;
    private javax.swing.JSpinner edad4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JLabel lblTitulo4;
    private javax.swing.JLabel lblTitulo5;
    private javax.swing.JTextField nombretxt1;
    // End of variables declaration//GEN-END:variables
}
