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
public class CrearJugador extends javax.swing.JDialog {

    private Controlador controlJugador;

    /**
     * Creates new form CrearJugador
     */
    public CrearJugador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public CrearJugador(java.awt.Frame parent, boolean modal, Controlador elControl) {
        super(parent, modal);
        initComponents();
        controlJugador = elControl;
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
        contratxt = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        nombretxt1 = new javax.swing.JTextField();
        usuariotxt = new javax.swing.JTextField();
        edad = new javax.swing.JSpinner();
        lblTitulo1 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblTitulo7 = new javax.swing.JLabel();
        personajes = new javax.swing.JComboBox<>();
        btnAgregarPersonaje = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        contratxt.setBackground(new java.awt.Color(255, 255, 255));
        contratxt.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        contratxt.setForeground(new java.awt.Color(185, 185, 185));
        contratxt.setText("Contraseña");
        contratxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contratxtActionPerformed(evt);
            }
        });
        jPanel1.add(contratxt);
        contratxt.setBounds(20, 250, 260, 50);

        lblTitulo.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo.setText("Edad");
        jPanel1.add(lblTitulo);
        lblTitulo.setBounds(20, 310, 70, 40);

        nombretxt1.setBackground(new java.awt.Color(255, 255, 255));
        nombretxt1.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        nombretxt1.setForeground(new java.awt.Color(185, 185, 185));
        nombretxt1.setText("Nombre");
        nombretxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretxt1ActionPerformed(evt);
            }
        });
        jPanel1.add(nombretxt1);
        nombretxt1.setBounds(20, 130, 260, 50);

        usuariotxt.setBackground(new java.awt.Color(255, 255, 255));
        usuariotxt.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        usuariotxt.setForeground(new java.awt.Color(185, 185, 185));
        usuariotxt.setText("Usuario");
        usuariotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariotxtActionPerformed(evt);
            }
        });
        jPanel1.add(usuariotxt);
        usuariotxt.setBounds(20, 190, 260, 50);

        edad.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jPanel1.add(edad);
        edad.setBounds(90, 320, 64, 30);

        lblTitulo1.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 72)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo1.setText("Crear Jugador");
        jPanel1.add(lblTitulo1);
        lblTitulo1.setBounds(20, 10, 300, 84);

        btnCrear.setBackground(new java.awt.Color(0, 102, 0));
        btnCrear.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear);
        btnCrear.setBounds(20, 470, 140, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/personaje.gif"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(450, 0, 180, 160);

        lblTitulo7.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo7.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo7.setText("Agregar Personaje");
        jPanel1.add(lblTitulo7);
        lblTitulo7.setBounds(20, 360, 270, 40);

        personajes.setBackground(new java.awt.Color(30, 30, 30));
        personajes.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        personajes.setForeground(new java.awt.Color(185, 185, 185));
        personajes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(personajes);
        personajes.setBounds(20, 410, 150, 40);

        btnAgregarPersonaje.setBackground(new java.awt.Color(34, 33, 33));
        btnAgregarPersonaje.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        btnAgregarPersonaje.setForeground(new java.awt.Color(185, 185, 185));
        btnAgregarPersonaje.setText("Agregar Personaje");
        btnAgregarPersonaje.setActionCommand("AgregarPersonaje");
        btnAgregarPersonaje.setEnabled(false);
        btnAgregarPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPersonajeActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarPersonaje);
        btnAgregarPersonaje.setBounds(190, 410, 160, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contratxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contratxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contratxtActionPerformed

    private void nombretxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombretxt1ActionPerformed

    private void usuariotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuariotxtActionPerformed

    private void btnAgregarPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPersonajeActionPerformed
        String nombrePersonaje = personajes.getSelectedItem().toString();
        
        controlJugador.agregarPerJugador(nombrePersonaje);
    }//GEN-LAST:event_btnAgregarPersonajeActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        String nombreJ = nombretxt1.getText();
        String usuarioJ = usuariotxt.getText();
        String contraJ = contratxt.getText();
        int edadJ = (int) edad.getValue();
        
        controlJugador.agregarJugador(nombreJ, usuarioJ, contraJ, edadJ);
        btnAgregarPersonaje.setEnabled(true);
    }//GEN-LAST:event_btnCrearActionPerformed

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
            java.util.logging.Logger.getLogger(CrearJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CrearJugador dialog = new CrearJugador(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAgregarPersonaje;
    private javax.swing.JButton btnCrear;
    private javax.swing.JTextField contratxt;
    private javax.swing.JSpinner edad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo7;
    private javax.swing.JTextField nombretxt1;
    private javax.swing.JComboBox<String> personajes;
    private javax.swing.JTextField usuariotxt;
    // End of variables declaration//GEN-END:variables
}
