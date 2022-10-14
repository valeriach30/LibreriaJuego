/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package juego;

import control.Controlador;
import java.util.ArrayList;

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
        
        label1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar caracteristicas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT Condensed", 0, 36))); // NOI18N
        jPanel1.add(label1);

        
        controlPersonajes = elControl;
        
        // Cargar Nombres de Personajes
        ArrayList<String> nombresPersonajes = controlPersonajes.getNombresPersonajes();
        if(nombresPersonajes != null){
            for(int i = 0; i < nombresPersonajes.size(); i++){
                personajes.addItem(nombresPersonajes.get(i));
            }   
        }
        else{
        }
        
        // Cargar Nombres de Armas
        ArrayList<String> nombresArmas = controlPersonajes.getNombresArmas();
        if(nombresArmas != null){
            for(int i = 0; i < nombresArmas.size(); i++){
                armas.addItem(nombresArmas.get(i));
                armaBuilder.addItem(nombresArmas.get(i));
            }   
        }
        else{
        }
        
        // Cargar nombres de habilidades
        ArrayList<String> nombresHabilidades = controlPersonajes.getNombresHabilidades();
        if(nombresHabilidades != null){
            for(int i = 0; i < nombresHabilidades.size(); i++){
                habilidades.addItem(nombresHabilidades.get(i));
                habilidadBuilder.addItem(nombresHabilidades.get(i));
            }   
        }
        else{
        }
        
        // Cargar nombres de categorias
        ArrayList<String> nombresCategorias = controlPersonajes.getNombresCategorias();
        if(nombresCategorias != null){
            for(int i = 0; i < nombresCategorias.size(); i++){
                categorias.addItem(nombresCategorias.get(i));
            }   
        }
        else{
        }
        
        // Cargar nombres de habilidades
        ArrayList<String> nombresSubcategorias = controlPersonajes.getNombresSubCategorias();
        if(nombresSubcategorias != null){
            for(int i = 0; i < nombresSubcategorias.size(); i++){
                subcategoria.addItem(nombresSubcategorias.get(i));
            }   
        }
        else{
        }
        
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
        danho = new javax.swing.JSpinner();
        btnJson = new javax.swing.JButton();
        lblTitulo6 = new javax.swing.JLabel();
        habilidades = new javax.swing.JComboBox<>();
        lblTitulo8 = new javax.swing.JLabel();
        personajes = new javax.swing.JComboBox<>();
        lblTitulo9 = new javax.swing.JLabel();
        categorias = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lblTitulo10 = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        btnAgregarCaract = new javax.swing.JButton();
        vida = new javax.swing.JSpinner();
        lblTitulo12 = new javax.swing.JLabel();
        lblTitulo13 = new javax.swing.JLabel();
        habilidadBuilder = new javax.swing.JComboBox<>();
        lblTitulo14 = new javax.swing.JLabel();
        nivel2 = new javax.swing.JSpinner();
        lblTitulo15 = new javax.swing.JLabel();
        subcategoria = new javax.swing.JComboBox<>();
        armas = new javax.swing.JComboBox<>();
        lblTitulo11 = new javax.swing.JLabel();
        lblTitulo16 = new javax.swing.JLabel();
        armaBuilder = new javax.swing.JComboBox<>();
        label1 = new javax.swing.JLabel();
        lblTitulo17 = new javax.swing.JLabel();
        costo = new javax.swing.JSpinner();
        rango = new javax.swing.JSpinner();
        lblTitulo7 = new javax.swing.JLabel();
        lblTitulo18 = new javax.swing.JLabel();
        lblTitulo19 = new javax.swing.JLabel();
        alcance = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo.setText("Golpes por tiempo");
        jPanel1.add(lblTitulo);
        lblTitulo.setBounds(170, 180, 130, 40);

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
        urltxt.setBounds(760, 420, 150, 35);

        gxp.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jPanel1.add(gxp);
        gxp.setBounds(300, 190, 64, 30);

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
        btnCrear.setBounds(20, 700, 140, 40);

        lblTitulo2.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo2.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo2.setText("Campos");
        jPanel1.add(lblTitulo2);
        lblTitulo2.setBounds(20, 240, 70, 40);

        campos.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jPanel1.add(campos);
        campos.setBounds(90, 240, 64, 30);

        cantidad.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        cantidad.setValue(1);
        jPanel1.add(cantidad);
        cantidad.setBounds(280, 640, 64, 30);

        nivel.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jPanel1.add(nivel);
        nivel.setBounds(300, 240, 64, 30);

        lblTitulo4.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo4.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo4.setText("Nivel");
        jPanel1.add(lblTitulo4);
        lblTitulo4.setBounds(170, 290, 130, 40);

        lblTitulo5.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo5.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo5.setText("Rango");
        jPanel1.add(lblTitulo5);
        lblTitulo5.setBounds(20, 380, 70, 40);

        danho.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jPanel1.add(danho);
        danho.setBounds(300, 340, 64, 30);

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
        btnJson.setBounds(170, 700, 140, 40);

        lblTitulo6.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo6.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo6.setText("Vida");
        jPanel1.add(lblTitulo6);
        lblTitulo6.setBounds(20, 190, 70, 40);

        habilidades.setBackground(new java.awt.Color(71, 0, 71));
        habilidades.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        habilidades.setForeground(new java.awt.Color(185, 185, 185));
        habilidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna" }));
        jPanel1.add(habilidades);
        habilidades.setBounds(760, 370, 150, 40);

        lblTitulo8.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo8.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo8.setText("Habilidad");
        jPanel1.add(lblTitulo8);
        lblTitulo8.setBounds(20, 580, 290, 40);

        personajes.setBackground(new java.awt.Color(71, 0, 71));
        personajes.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        personajes.setForeground(new java.awt.Color(185, 185, 185));
        personajes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno" }));
        jPanel1.add(personajes);
        personajes.setBounds(440, 260, 150, 40);

        lblTitulo9.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo9.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo9.setText("Ingrese el url de la imagen que desea agregar");
        jPanel1.add(lblTitulo9);
        lblTitulo9.setBounds(440, 420, 320, 40);

        categorias.setBackground(new java.awt.Color(71, 0, 71));
        categorias.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        categorias.setForeground(new java.awt.Color(185, 185, 185));
        categorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna" }));
        jPanel1.add(categorias);
        categorias.setBounds(220, 430, 150, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/personaje.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(760, 10, 180, 150);

        lblTitulo10.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo10.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo10.setText("Seleccione la habilidad que desea agregar");
        jPanel1.add(lblTitulo10);
        lblTitulo10.setBounds(440, 370, 290, 40);

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
        btnAgregarCaract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCaractActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarCaract);
        btnAgregarCaract.setBounds(440, 470, 200, 40);

        vida.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jPanel1.add(vida);
        vida.setBounds(90, 190, 64, 30);

        lblTitulo12.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo12.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo12.setText("Cantidad de personajes de este tipo");
        jPanel1.add(lblTitulo12);
        lblTitulo12.setBounds(20, 640, 250, 40);

        lblTitulo13.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo13.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo13.setText("Seleccione el arma  que desea agregar");
        jPanel1.add(lblTitulo13);
        lblTitulo13.setBounds(440, 310, 270, 40);

        habilidadBuilder.setBackground(new java.awt.Color(71, 0, 71));
        habilidadBuilder.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        habilidadBuilder.setForeground(new java.awt.Color(185, 185, 185));
        habilidadBuilder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna" }));
        jPanel1.add(habilidadBuilder);
        habilidadBuilder.setBounds(220, 580, 150, 40);

        lblTitulo14.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo14.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo14.setText("Nivel de Aparicion");
        jPanel1.add(lblTitulo14);
        lblTitulo14.setBounds(170, 240, 130, 40);

        nivel2.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        nivel2.setValue(1);
        jPanel1.add(nivel2);
        nivel2.setBounds(300, 290, 64, 30);

        lblTitulo15.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo15.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo15.setText("Subcategoria del personaje");
        jPanel1.add(lblTitulo15);
        lblTitulo15.setBounds(20, 490, 290, 40);

        subcategoria.setBackground(new java.awt.Color(71, 0, 71));
        subcategoria.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        subcategoria.setForeground(new java.awt.Color(185, 185, 185));
        subcategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna" }));
        jPanel1.add(subcategoria);
        subcategoria.setBounds(220, 480, 150, 40);

        armas.setBackground(new java.awt.Color(71, 0, 71));
        armas.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        armas.setForeground(new java.awt.Color(185, 185, 185));
        armas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna" }));
        jPanel1.add(armas);
        armas.setBounds(760, 320, 150, 40);

        lblTitulo11.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo11.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo11.setText("Categoria del personaje");
        jPanel1.add(lblTitulo11);
        lblTitulo11.setBounds(20, 430, 290, 40);

        lblTitulo16.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo16.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo16.setText("Arma");
        jPanel1.add(lblTitulo16);
        lblTitulo16.setBounds(20, 530, 290, 40);

        armaBuilder.setBackground(new java.awt.Color(71, 0, 71));
        armaBuilder.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        armaBuilder.setForeground(new java.awt.Color(185, 185, 185));
        armaBuilder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna" }));
        jPanel1.add(armaBuilder);
        armaBuilder.setBounds(220, 530, 150, 40);

        label1.setBackground(new java.awt.Color(255, 255, 255));
        label1.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 36)); // NOI18N
        label1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT Condensed", 0, 36))); // NOI18N
        jPanel1.add(label1);
        label1.setBounds(420, 160, 510, 390);
        label1.getAccessibleContext().setAccessibleDescription("");

        lblTitulo17.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo17.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo17.setText("Seleccione el personaje al que desea agregarle algo");
        jPanel1.add(lblTitulo17);
        lblTitulo17.setBounds(440, 220, 350, 40);

        costo.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jPanel1.add(costo);
        costo.setBounds(90, 290, 64, 30);

        rango.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jPanel1.add(rango);
        rango.setBounds(90, 380, 64, 30);

        lblTitulo7.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo7.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo7.setText("Costo");
        jPanel1.add(lblTitulo7);
        lblTitulo7.setBounds(20, 290, 70, 40);

        lblTitulo18.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo18.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo18.setText("Alcance");
        jPanel1.add(lblTitulo18);
        lblTitulo18.setBounds(20, 340, 70, 40);

        lblTitulo19.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo19.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo19.setText("Daño");
        jPanel1.add(lblTitulo19);
        lblTitulo19.setBounds(170, 340, 70, 40);

        alcance.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jPanel1.add(alcance);
        alcance.setBounds(90, 340, 64, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 952, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        int alcanceV = (int) alcance.getValue();
        int danhoV = (int) danho.getValue();
        int rangoV = (int) rango.getValue();
        String categoriaV = categorias.getSelectedItem().toString();
        String subCategoriaV = subcategoria.getSelectedItem().toString();
        String armaNombre = armaBuilder.getSelectedItem().toString();
        String habilidadNombre = habilidadBuilder.getSelectedItem().toString();
        
        
        int cantidadV = (int) cantidad.getValue();
        
        if(cantidadV > 1){
            // Clonar
            controlPersonajes.clonarPersonaje(armaNombre, vidaPer, GxT,
           nivel2V, camposV, nivelV, costoV, categoriaV,
           cantidadV, habilidadNombre, nombrePersonaje, alcanceV, danhoV, rangoV, subCategoriaV);
        }
        else{
            // Crear solo 1
            controlPersonajes.buildPersonaje(armaNombre, vidaPer, GxT,
           nivel2V, camposV, nivelV, costoV, categoriaV,
           cantidadV, habilidadNombre, nombrePersonaje, alcanceV, danhoV, rangoV, subCategoriaV);
        }
        
        this.setVisible(false);
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnJsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJsonActionPerformed
        
    }//GEN-LAST:event_btnJsonActionPerformed

    private void nombretxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombretxtActionPerformed

    private void btnAgregarCaractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCaractActionPerformed
        try{
        String armasV = habilidadBuilder.getSelectedItem().toString();
        String habilidadesV = habilidades.getSelectedItem().toString();
        
        String imagen = urltxt.getText();
        String nombrePersonaje = personajes.getSelectedItem().toString();
        
        controlPersonajes.agregarPersonaje(armasV, habilidadesV, imagen, nombrePersonaje);
        } catch(Error e){
            
        }
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
    private javax.swing.JSpinner alcance;
    private javax.swing.JComboBox<String> armaBuilder;
    private javax.swing.JComboBox<String> armas;
    private javax.swing.JButton btnAgregarCaract;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnJson;
    private javax.swing.JSpinner campos;
    private javax.swing.JSpinner cantidad;
    private javax.swing.JComboBox<String> categorias;
    private javax.swing.JSpinner costo;
    private javax.swing.JSpinner danho;
    private javax.swing.JSpinner gxp;
    private javax.swing.JComboBox<String> habilidadBuilder;
    private javax.swing.JComboBox<String> habilidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo10;
    private javax.swing.JLabel lblTitulo11;
    private javax.swing.JLabel lblTitulo12;
    private javax.swing.JLabel lblTitulo13;
    private javax.swing.JLabel lblTitulo14;
    private javax.swing.JLabel lblTitulo15;
    private javax.swing.JLabel lblTitulo16;
    private javax.swing.JLabel lblTitulo17;
    private javax.swing.JLabel lblTitulo18;
    private javax.swing.JLabel lblTitulo19;
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
    private javax.swing.JSpinner rango;
    private javax.swing.JComboBox<String> subcategoria;
    private javax.swing.JTextField urltxt;
    private javax.swing.JSpinner vida;
    // End of variables declaration//GEN-END:variables
}
