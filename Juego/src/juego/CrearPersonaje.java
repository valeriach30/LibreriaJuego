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
    
    
    public CrearPersonaje(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public CrearPersonaje(java.awt.Frame parent, boolean modal, Controlador elControl) {
        super(parent, modal);
        initComponents();
        controlPersonajes = elControl;
        //habilidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "xd", "xd 2", "xd 3", "xd 4" }));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        urltxt = new javax.swing.JTextField();
        gxp = new javax.swing.JSpinner();
        lblTitulo1 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        lblTitulo2 = new javax.swing.JLabel();
        campos = new javax.swing.JSpinner();
        cantidad = new javax.swing.JSpinner();
        nivel = new javax.swing.JSpinner();
        lblTitulo4 = new javax.swing.JLabel();
        lblTitulo5 = new javax.swing.JLabel();
        costo = new javax.swing.JSpinner();
        btnJson = new javax.swing.JButton();
        lblTitulo6 = new javax.swing.JLabel();
        lblTitulo7 = new javax.swing.JLabel();
        habilidades = new javax.swing.JComboBox<>();
        lblTitulo8 = new javax.swing.JLabel();
        personajes = new javax.swing.JComboBox<>();
        lblTitulo9 = new javax.swing.JLabel();
        categorias = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lblTitulo10 = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        btnAgregarCaract = new javax.swing.JButton();
        lblTitulo11 = new javax.swing.JLabel();
        vida = new javax.swing.JSpinner();
        lblTitulo12 = new javax.swing.JLabel();
        lblTitulo13 = new javax.swing.JLabel();
        armas = new javax.swing.JComboBox<>();
        lblTitulo14 = new javax.swing.JLabel();
        nivel2 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo.setText("Golpes por tiempo");
        jPanel1.add(lblTitulo);
        lblTitulo.setBounds(20, 240, 130, 40);

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
        urltxt.setBounds(370, 550, 150, 35);

        gxp.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jPanel1.add(gxp);
        gxp.setBounds(150, 250, 64, 30);

        lblTitulo1.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 72)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo1.setText("Crear Personaje");
        jPanel1.add(lblTitulo1);
        lblTitulo1.setBounds(20, 20, 370, 84);

        btnCrear.setBackground(new java.awt.Color(0, 102, 102));
        btnCrear.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(185, 185, 185));
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear);
        btnCrear.setBounds(20, 690, 140, 40);

        lblTitulo2.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo2.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo2.setText("Campos");
        jPanel1.add(lblTitulo2);
        lblTitulo2.setBounds(20, 300, 70, 40);

        campos.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jPanel1.add(campos);
        campos.setBounds(150, 300, 64, 30);

        cantidad.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        cantidad.setValue(1);
        jPanel1.add(cantidad);
        cantidad.setBounds(190, 630, 64, 30);

        nivel.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jPanel1.add(nivel);
        nivel.setBounds(150, 350, 64, 30);

        lblTitulo4.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo4.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo4.setText("Nivel");
        jPanel1.add(lblTitulo4);
        lblTitulo4.setBounds(20, 460, 130, 40);

        lblTitulo5.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo5.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo5.setText("Costo");
        jPanel1.add(lblTitulo5);
        lblTitulo5.setBounds(20, 400, 70, 40);

        costo.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jPanel1.add(costo);
        costo.setBounds(150, 410, 64, 30);

        btnJson.setBackground(new java.awt.Color(0, 102, 102));
        btnJson.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        btnJson.setForeground(new java.awt.Color(185, 185, 185));
        btnJson.setText("Subir Json");
        btnJson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJsonActionPerformed(evt);
            }
        });
        jPanel1.add(btnJson);
        btnJson.setBounds(170, 690, 140, 40);

        lblTitulo6.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo6.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo6.setText("Vida");
        jPanel1.add(lblTitulo6);
        lblTitulo6.setBounds(20, 190, 70, 40);

        lblTitulo7.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo7.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo7.setText("Seleccione el personaje al que desea agregarle algo");
        jPanel1.add(lblTitulo7);
        lblTitulo7.setBounds(370, 180, 350, 40);

        habilidades.setBackground(new java.awt.Color(71, 0, 71));
        habilidades.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        habilidades.setForeground(new java.awt.Color(185, 185, 185));
        habilidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(habilidades);
        habilidades.setBounds(370, 440, 150, 40);

        lblTitulo8.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo8.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo8.setText("Seleccione la categoria del personaje");
        jPanel1.add(lblTitulo8);
        lblTitulo8.setBounds(20, 510, 290, 40);

        personajes.setBackground(new java.awt.Color(71, 0, 71));
        personajes.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        personajes.setForeground(new java.awt.Color(185, 185, 185));
        personajes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(personajes);
        personajes.setBounds(370, 220, 150, 40);

        lblTitulo9.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo9.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo9.setText("Ingrese el url de la imagen que desea agregar");
        jPanel1.add(lblTitulo9);
        lblTitulo9.setBounds(370, 500, 320, 40);

        categorias.setBackground(new java.awt.Color(71, 0, 71));
        categorias.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        categorias.setForeground(new java.awt.Color(185, 185, 185));
        categorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(categorias);
        categorias.setBounds(20, 560, 150, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/personaje.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(630, 10, 180, 150);

        lblTitulo10.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo10.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo10.setText("Seleccione la habilidad que desea agregar");
        jPanel1.add(lblTitulo10);
        lblTitulo10.setBounds(370, 390, 290, 40);

        nombretxt.setBackground(new java.awt.Color(255, 255, 255));
        nombretxt.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        nombretxt.setForeground(new java.awt.Color(185, 185, 185));
        nombretxt.setText("Nombre");
        nombretxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretxtActionPerformed(evt);
            }
        });
        jPanel1.add(nombretxt);
        nombretxt.setBounds(20, 130, 200, 35);

        btnAgregarCaract.setBackground(new java.awt.Color(0, 102, 102));
        btnAgregarCaract.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        btnAgregarCaract.setForeground(new java.awt.Color(185, 185, 185));
        btnAgregarCaract.setText("Agregar Caracteristicas");
        btnAgregarCaract.setActionCommand("Agregar Caracteristicas");
        btnAgregarCaract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCaractActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarCaract);
        btnAgregarCaract.setBounds(320, 690, 200, 40);

        lblTitulo11.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo11.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo11.setText("de este tipo");
        jPanel1.add(lblTitulo11);
        lblTitulo11.setBounds(20, 640, 160, 40);

        vida.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jPanel1.add(vida);
        vida.setBounds(150, 200, 64, 30);

        lblTitulo12.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo12.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo12.setText("Cantidad de personajes");
        jPanel1.add(lblTitulo12);
        lblTitulo12.setBounds(20, 610, 160, 40);

        lblTitulo13.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo13.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo13.setText("Seleccione el arma  que desea agregar");
        jPanel1.add(lblTitulo13);
        lblTitulo13.setBounds(370, 270, 270, 40);

        armas.setBackground(new java.awt.Color(71, 0, 71));
        armas.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        armas.setForeground(new java.awt.Color(185, 185, 185));
        armas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(armas);
        armas.setBounds(370, 330, 150, 40);

        lblTitulo14.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo14.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo14.setText("Nivel de Aparicion");
        jPanel1.add(lblTitulo14);
        lblTitulo14.setBounds(20, 350, 130, 40);

        nivel2.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        nivel2.setValue(1);
        jPanel1.add(nivel2);
        nivel2.setBounds(150, 470, 64, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void urltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urltxtActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        String nombrePersonaje = nombretxt.getText();
        int vidaPer = (int) vida.getValue();
        int GxT = (int) gxp.getValue();
        int camposV = (int) campos.getValue();
        int nivelV = (int) nivel.getValue();
        int nivel2V = (int) nivel2.getValue();
        int costoV = (int) costo.getValue();
        String categoriaV = categorias.getSelectedItem().toString();
        
        
        int cantidadV = (int) cantidad.getValue();
        
        if(cantidadV > 1){
            // Clonar
            controlPersonajes.clonarPersonaje(nombrePersonaje, vidaPer, GxT, nivel2V, camposV, nivelV, costoV, categoriaV, cantidadV);
        }
        else{
            // Crear solo 1
            controlPersonajes.agregarPersonaje(nombrePersonaje, vidaPer, GxT, nivel2V, camposV, nivelV, costoV, categoriaV);
        }
        
        //this.repaint();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnJsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJsonActionPerformed
        
    }//GEN-LAST:event_btnJsonActionPerformed

    private void nombretxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombretxtActionPerformed

    private void btnAgregarCaractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCaractActionPerformed
        String armasV = armas.getSelectedItem().toString();
        String habilidadesV = habilidades.getSelectedItem().toString();
        
        String imagen = urltxt.getText();
        String nombrePersonaje = personajes.getSelectedItem().toString();
        
        controlPersonajes.buildPersonaje(armasV, habilidadesV, imagen, nombrePersonaje);
    }//GEN-LAST:event_btnAgregarCaractActionPerformed

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
    private javax.swing.JComboBox<String> armas;
    private javax.swing.JButton btnAgregarCaract;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnJson;
    private javax.swing.JSpinner campos;
    private javax.swing.JSpinner cantidad;
    private javax.swing.JComboBox<String> categorias;
    private javax.swing.JSpinner costo;
    private javax.swing.JSpinner gxp;
    private javax.swing.JComboBox<String> habilidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo10;
    private javax.swing.JLabel lblTitulo11;
    private javax.swing.JLabel lblTitulo12;
    private javax.swing.JLabel lblTitulo13;
    private javax.swing.JLabel lblTitulo14;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTitulo4;
    private javax.swing.JLabel lblTitulo5;
    private javax.swing.JLabel lblTitulo6;
    private javax.swing.JLabel lblTitulo7;
    private javax.swing.JLabel lblTitulo8;
    private javax.swing.JLabel lblTitulo9;
    private javax.swing.JSpinner nivel;
    private javax.swing.JSpinner nivel2;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JComboBox<String> personajes;
    private javax.swing.JTextField urltxt;
    private javax.swing.JSpinner vida;
    // End of variables declaration//GEN-END:variables
}
