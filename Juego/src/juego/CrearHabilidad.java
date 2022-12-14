/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package juego;

import control.Controlador;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author vchin
 */
public class CrearHabilidad extends javax.swing.JDialog {

    private Controlador controlHabilidad;
    /**
     * Creates new form CrearHabilidad
     */
    public CrearHabilidad(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public CrearHabilidad(java.awt.Frame parent, boolean modal, Controlador elControl) {
        super(parent, modal);
        initComponents();
        controlHabilidad = elControl;
        
        // Cargar nombres de habilidades
        ArrayList<String> nombresHabilidades = controlHabilidad.getNombresHabilidades();
        if(nombresHabilidades != null){
            for(int i = 0; i < nombresHabilidades.size(); i++){
                habilidades.addItem(nombresHabilidades.get(i));
            }   
        }
        else{
        }
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
        imagentxt = new javax.swing.JTextField();
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
        lblTitulo13 = new javax.swing.JLabel();
        lblTitulo11 = new javax.swing.JLabel();
        cantidad = new javax.swing.JSpinner();
        lblTitulo7 = new javax.swing.JLabel();
        habilidades = new javax.swing.JComboBox<>();
        nombretxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        imagentxt.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        imagentxt.setForeground(new java.awt.Color(185, 185, 185));
        imagentxt.setText("Imagen");
        imagentxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagentxtActionPerformed(evt);
            }
        });
        jPanel1.add(imagentxt);
        imagentxt.setBounds(240, 130, 200, 50);

        lblTitulo1.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 72)); // NOI18N
        lblTitulo1.setText("Crear Habilidad");
        jPanel1.add(lblTitulo1);
        lblTitulo1.setBounds(20, 10, 330, 84);

        btnCrear.setBackground(new java.awt.Color(0, 102, 102));
        btnCrear.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear);
        btnCrear.setBounds(10, 500, 150, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/spell_1.gif"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(450, 0, 180, 170);

        lblTitulo6.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo6.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo6.setText("Alcance");
        jPanel1.add(lblTitulo6);
        lblTitulo6.setBounds(20, 190, 70, 40);

        alcance.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jPanel1.add(alcance);
        alcance.setBounds(150, 200, 70, 30);

        lblTitulo.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo.setText("Da??o");
        jPanel1.add(lblTitulo);
        lblTitulo.setBounds(20, 240, 130, 40);

        danho.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jPanel1.add(danho);
        danho.setBounds(150, 250, 70, 30);

        lblTitulo2.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo2.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo2.setText("Nivel");
        jPanel1.add(lblTitulo2);
        lblTitulo2.setBounds(20, 300, 70, 40);

        nivel.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jPanel1.add(nivel);
        nivel.setBounds(150, 300, 70, 30);

        lblTitulo4.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo4.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo4.setText("Rango");
        jPanel1.add(lblTitulo4);
        lblTitulo4.setBounds(20, 350, 130, 40);

        rango.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jPanel1.add(rango);
        rango.setBounds(150, 350, 70, 30);

        lblTitulo9.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo9.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo9.setText("Ingrese el url de la imagen que desea agregar");
        jPanel1.add(lblTitulo9);
        lblTitulo9.setBounds(280, 310, 320, 40);

        urltxt.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        urltxt.setForeground(new java.awt.Color(185, 185, 185));
        urltxt.setText("Url");
        urltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urltxtActionPerformed(evt);
            }
        });
        jPanel1.add(urltxt);
        urltxt.setBounds(280, 360, 150, 35);

        btnAgregarImagen.setBackground(new java.awt.Color(204, 153, 0));
        btnAgregarImagen.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        btnAgregarImagen.setForeground(new java.awt.Color(102, 102, 102));
        btnAgregarImagen.setText("Agregar Imagen");
        btnAgregarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarImagenActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarImagen);
        btnAgregarImagen.setBounds(450, 360, 140, 40);

        lblTitulo12.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo12.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo12.setText("Cantidad de ");
        jPanel1.add(lblTitulo12);
        lblTitulo12.setBounds(20, 390, 160, 40);

        lblTitulo13.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo13.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo13.setText("habilidades de ");
        jPanel1.add(lblTitulo13);
        lblTitulo13.setBounds(20, 420, 160, 40);

        lblTitulo11.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo11.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo11.setText("este tipo");
        jPanel1.add(lblTitulo11);
        lblTitulo11.setBounds(20, 450, 160, 40);

        cantidad.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jPanel1.add(cantidad);
        cantidad.setBounds(150, 420, 70, 30);

        lblTitulo7.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo7.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo7.setText("Seleccionela habilidad a la que desea agregarle imagen");
        jPanel1.add(lblTitulo7);
        lblTitulo7.setBounds(280, 220, 370, 40);

        habilidades.setBackground(new java.awt.Color(0, 102, 102));
        habilidades.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        habilidades.setForeground(new java.awt.Color(185, 185, 185));
        habilidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna" }));
        jPanel1.add(habilidades);
        habilidades.setBounds(280, 260, 150, 40);

        nombretxt.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        nombretxt.setForeground(new java.awt.Color(185, 185, 185));
        nombretxt.setText("Nombre");
        nombretxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretxtActionPerformed(evt);
            }
        });
        jPanel1.add(nombretxt);
        nombretxt.setBounds(20, 130, 200, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imagentxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagentxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imagentxtActionPerformed

    private void urltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urltxtActionPerformed

    private void btnAgregarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarImagenActionPerformed
        String habilidad = habilidades.getSelectedItem().toString();
        String imagenUrl = urltxt.getText();
        controlHabilidad.agregarHabilidad(habilidad, imagenUrl);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarImagenActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        String nombreArma = nombretxt.getText();
        String imagen = imagentxt.getText();
        int alcanceV = (int) alcance.getValue();
        int danhoV = (int) danho.getValue();
        int nivelV = (int) nivel.getValue();
        int rangoV = (int) rango.getValue();
        int cantidadV = (int) cantidad.getValue();
        
        if(nombreArma.equals("Nombre")){
            JOptionPane.showMessageDialog(null, "Falta Rellenar el nombre", "Nombre invalido", JOptionPane.OK_OPTION);
            
        }else{
            if(cantidadV > 1){
                controlHabilidad.clonarHabilidad(nombreArma, alcanceV, danhoV, nivelV, rangoV, cantidadV, imagen);
            }
            else{
                controlHabilidad.builderHabilidad(nombreArma, alcanceV, danhoV, nivelV, rangoV, cantidadV, imagen);
            }

            this.setVisible(false);
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void nombretxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombretxtActionPerformed

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
            java.util.logging.Logger.getLogger(CrearHabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearHabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearHabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearHabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CrearHabilidad dialog = new CrearHabilidad(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAgregarImagen;
    private javax.swing.JButton btnCrear;
    private javax.swing.JSpinner cantidad;
    private javax.swing.JSpinner danho;
    private javax.swing.JComboBox<String> habilidades;
    private javax.swing.JTextField imagentxt;
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
    private javax.swing.JTextField nombretxt;
    private javax.swing.JSpinner rango;
    private javax.swing.JTextField urltxt;
    // End of variables declaration//GEN-END:variables
}
