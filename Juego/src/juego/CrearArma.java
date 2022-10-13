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
public class CrearArma extends javax.swing.JDialog {
    
    
    private Controlador controlArmas;
    /**
     * Creates new form CrearArma
     */
    public CrearArma(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public CrearArma(java.awt.Frame parent, boolean modal, Controlador elControl) {
        super(parent, modal);
        initComponents();
        controlArmas = elControl;
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
        nombretxt1 = new javax.swing.JTextField();
        lblTitulo1 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblTitulo6 = new javax.swing.JLabel();
        alcance = new javax.swing.JSpinner();
        lblTitulo = new javax.swing.JLabel();
        danho = new javax.swing.JSpinner();
        lblTitulo2 = new javax.swing.JLabel();
        nivel = new javax.swing.JSpinner();
        lblTitulo4 = new javax.swing.JLabel();
        rango = new javax.swing.JSpinner();
        lblTitulo9 = new javax.swing.JLabel();
        urltxt = new javax.swing.JTextField();
        btnAgregarImagen = new javax.swing.JButton();
        lblTitulo12 = new javax.swing.JLabel();
        lblTitulo11 = new javax.swing.JLabel();
        cantidad = new javax.swing.JSpinner();
        lblTitulo13 = new javax.swing.JLabel();
        armas = new javax.swing.JComboBox<>();
        lblTitulo7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

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
        nombretxt1.setBounds(20, 130, 200, 50);

        lblTitulo1.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 72)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo1.setText("Crear Arma");
        jPanel1.add(lblTitulo1);
        lblTitulo1.setBounds(20, 10, 300, 84);

        btnCrear.setBackground(new java.awt.Color(58, 0, 58));
        btnCrear.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(185, 185, 185));
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear);
        btnCrear.setBounds(10, 520, 150, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/arm.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(420, 0, 200, 170);

        lblTitulo6.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo6.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo6.setText("Alcance");
        jPanel1.add(lblTitulo6);
        lblTitulo6.setBounds(20, 190, 70, 40);

        alcance.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jPanel1.add(alcance);
        alcance.setBounds(150, 200, 64, 30);

        lblTitulo.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo.setText("Daño");
        jPanel1.add(lblTitulo);
        lblTitulo.setBounds(20, 240, 130, 40);

        danho.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jPanel1.add(danho);
        danho.setBounds(150, 250, 64, 30);

        lblTitulo2.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo2.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo2.setText("Nivel");
        jPanel1.add(lblTitulo2);
        lblTitulo2.setBounds(20, 300, 70, 40);

        nivel.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jPanel1.add(nivel);
        nivel.setBounds(150, 300, 64, 30);

        lblTitulo4.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo4.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo4.setText("Rango");
        jPanel1.add(lblTitulo4);
        lblTitulo4.setBounds(20, 350, 130, 40);

        rango.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jPanel1.add(rango);
        rango.setBounds(150, 350, 64, 30);

        lblTitulo9.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo9.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo9.setText("Ingrese el url de la imagen que desea agregar");
        jPanel1.add(lblTitulo9);
        lblTitulo9.setBounds(280, 290, 320, 40);

        urltxt.setBackground(new java.awt.Color(255, 255, 255));
        urltxt.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        urltxt.setForeground(new java.awt.Color(185, 185, 185));
        urltxt.setText("Url");
        urltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urltxtActionPerformed(evt);
            }
        });
        jPanel1.add(urltxt);
        urltxt.setBounds(280, 340, 150, 35);

        btnAgregarImagen.setBackground(new java.awt.Color(58, 0, 58));
        btnAgregarImagen.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        btnAgregarImagen.setForeground(new java.awt.Color(185, 185, 185));
        btnAgregarImagen.setText("Agregar Imagen");
        btnAgregarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarImagenActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarImagen);
        btnAgregarImagen.setBounds(450, 340, 140, 40);

        lblTitulo12.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo12.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo12.setText("Cantidad de ");
        jPanel1.add(lblTitulo12);
        lblTitulo12.setBounds(10, 400, 160, 40);

        lblTitulo11.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo11.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo11.setText("este tipo");
        jPanel1.add(lblTitulo11);
        lblTitulo11.setBounds(10, 460, 160, 40);

        cantidad.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jPanel1.add(cantidad);
        cantidad.setBounds(150, 430, 64, 30);

        lblTitulo13.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo13.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo13.setText("armas de ");
        jPanel1.add(lblTitulo13);
        lblTitulo13.setBounds(10, 430, 160, 40);

        armas.setBackground(new java.awt.Color(153, 0, 153));
        armas.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        armas.setForeground(new java.awt.Color(185, 185, 185));
        armas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(armas);
        armas.setBounds(280, 240, 150, 40);

        lblTitulo7.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo7.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo7.setText("Seleccione el arma al que desea agregarle imagen");
        jPanel1.add(lblTitulo7);
        lblTitulo7.setBounds(280, 200, 350, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombretxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombretxt1ActionPerformed

    private void urltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urltxtActionPerformed

    private void btnAgregarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarImagenActionPerformed
        String arma = armas.getSelectedItem().toString();
        String imagenUrl = urltxt.getText();
        controlArmas.agregarImagenArma(arma, imagenUrl);
    }//GEN-LAST:event_btnAgregarImagenActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        String nombreArma = nombretxt1.getText();
        int alcanceV = (int) alcance.getValue();
        int danhoV = (int) danho.getValue();
        int nivelV = (int) nivel.getValue();
        int rangoV = (int) rango.getValue();
        int cantidadV = (int) cantidad.getValue();
        
        if(cantidadV > 1){
            controlArmas.clonarArma(nombreArma, alcanceV, danhoV, nivelV, rangoV, cantidadV);
        }
        else{
            controlArmas.agregarArma(nombreArma, alcanceV, danhoV, nivelV, rangoV, cantidadV);
        }
        
        //this.repaint();
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
            java.util.logging.Logger.getLogger(CrearArma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearArma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearArma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearArma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CrearArma dialog = new CrearArma(new javax.swing.JFrame(), true);
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
    private javax.swing.JSpinner alcance;
    private javax.swing.JComboBox<String> armas;
    private javax.swing.JButton btnAgregarImagen;
    private javax.swing.JButton btnCrear;
    private javax.swing.JSpinner cantidad;
    private javax.swing.JSpinner danho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo11;
    private javax.swing.JLabel lblTitulo12;
    private javax.swing.JLabel lblTitulo13;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTitulo4;
    private javax.swing.JLabel lblTitulo6;
    private javax.swing.JLabel lblTitulo7;
    private javax.swing.JLabel lblTitulo9;
    private javax.swing.JSpinner nivel;
    private javax.swing.JTextField nombretxt1;
    private javax.swing.JSpinner rango;
    private javax.swing.JTextField urltxt;
    // End of variables declaration//GEN-END:variables
}
