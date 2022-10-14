/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package juego;

import Libreria.Juego.Jugador;
import control.Controlador;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author vchin
 */
public class Jugar extends javax.swing.JDialog {

    /**
     * Creates new form Jugar
     */
    private Jugador objetoJugador1;
    private Jugador objetoJugador2;
    private Controlador controlJugar ;
    public Jugar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
    }
    
    public Jugar(java.awt.Frame parent, boolean modal, Controlador elControl) {
        super(parent, modal);
        initComponents();
        controlJugar = elControl;
        
        
        // Cargar Nombres de Jugadores
        ArrayList<String> nombresJugadores = controlJugar.getNombresJugadores();
        if(nombresJugadores != null){
            for(int i = 0; i < nombresJugadores.size(); i++){
                jugador1.addItem(nombresJugadores.get(i));
                jugador2.addItem(nombresJugadores.get(i));
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
        lblTitulo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblTitulo6 = new javax.swing.JLabel();
        jugador1 = new javax.swing.JComboBox<>();
        lblTitulo7 = new javax.swing.JLabel();
        arma2 = new javax.swing.JComboBox<>();
        lblTitulo8 = new javax.swing.JLabel();
        lblTitulo9 = new javax.swing.JLabel();
        btnAtacar2 = new javax.swing.JButton();
        personaje1 = new javax.swing.JComboBox<>();
        personaje2 = new javax.swing.JComboBox<>();
        lblTitulo10 = new javax.swing.JLabel();
        lblTitulo11 = new javax.swing.JLabel();
        fotoarma1 = new javax.swing.JLabel();
        fotopersonaje1 = new javax.swing.JLabel();
        fotopersonaje2 = new javax.swing.JLabel();
        fotoarma2 = new javax.swing.JLabel();
        btnSeleccionarPersonaje1 = new javax.swing.JButton();
        btnAtacar1 = new javax.swing.JButton();
        btnSeleccionarArmas = new javax.swing.JButton();
        btnSubirNivelA2 = new javax.swing.JButton();
        btnSubirNivelP2 = new javax.swing.JButton();
        btnSubirNivelP1 = new javax.swing.JButton();
        btnSubirNivelA1 = new javax.swing.JButton();
        lblTitulo12 = new javax.swing.JLabel();
        lblTitulo13 = new javax.swing.JLabel();
        arma1 = new javax.swing.JComboBox<>();
        jugador2 = new javax.swing.JComboBox<>();
        btnSeleccionarJugadores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        lblTitulo1.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 72)); // NOI18N
        lblTitulo1.setText("Jugar");
        jPanel1.add(lblTitulo1);
        lblTitulo1.setBounds(20, 10, 440, 84);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fight.gif"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(970, 0, 190, 170);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 300, 600, 440);

        lblTitulo6.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo6.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo6.setText("Seleccione el arma/hechizo 2 ");
        jPanel1.add(lblTitulo6);
        lblTitulo6.setBounds(620, 170, 200, 40);

        jugador1.setBackground(new java.awt.Color(153, 0, 25));
        jugador1.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        jPanel1.add(jugador1);
        jugador1.setBounds(100, 110, 120, 40);

        lblTitulo7.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo7.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo7.setText("Seleccione el personaje  2");
        jPanel1.add(lblTitulo7);
        lblTitulo7.setBounds(270, 170, 180, 40);

        arma2.setBackground(new java.awt.Color(0, 83, 196));
        arma2.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        arma2.setEnabled(false);
        jPanel1.add(arma2);
        arma2.setBounds(820, 170, 150, 40);

        lblTitulo8.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo8.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo8.setText("Jugador2");
        jPanel1.add(lblTitulo8);
        lblTitulo8.setBounds(10, 170, 90, 40);

        lblTitulo9.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo9.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo9.setText("Personaje 2");
        jPanel1.add(lblTitulo9);
        lblTitulo9.setBounds(660, 520, 180, 40);

        btnAtacar2.setBackground(new java.awt.Color(0, 83, 196));
        btnAtacar2.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        btnAtacar2.setForeground(new java.awt.Color(255, 255, 255));
        btnAtacar2.setText("Atacar");
        btnAtacar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtacar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtacar2);
        btnAtacar2.setBounds(660, 690, 90, 40);

        personaje1.setBackground(new java.awt.Color(153, 0, 25));
        personaje1.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        personaje1.setEnabled(false);
        jPanel1.add(personaje1);
        personaje1.setBounds(450, 110, 150, 40);

        personaje2.setBackground(new java.awt.Color(0, 83, 196));
        personaje2.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        personaje2.setEnabled(false);
        jPanel1.add(personaje2);
        personaje2.setBounds(450, 170, 150, 40);

        lblTitulo10.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo10.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo10.setText("Seleccione el arma/hechizo 1");
        jPanel1.add(lblTitulo10);
        lblTitulo10.setBounds(620, 110, 200, 40);

        lblTitulo11.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo11.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo11.setText("Personaje 1");
        jPanel1.add(lblTitulo11);
        lblTitulo11.setBounds(660, 300, 180, 40);

        fotoarma1.setText("Foto arma/hechizo");
        jPanel1.add(fotoarma1);
        fotoarma1.setBounds(900, 350, 150, 110);

        fotopersonaje1.setText("Foto personaje");
        fotopersonaje1.setMaximumSize(new java.awt.Dimension(190, 180));
        fotopersonaje1.setMinimumSize(new java.awt.Dimension(190, 180));
        jPanel1.add(fotopersonaje1);
        fotopersonaje1.setBounds(660, 350, 150, 110);

        fotopersonaje2.setText("Foto personaje");
        jPanel1.add(fotopersonaje2);
        fotopersonaje2.setBounds(660, 580, 150, 110);

        fotoarma2.setText("Foto arma/hechizo");
        jPanel1.add(fotoarma2);
        fotoarma2.setBounds(920, 570, 150, 110);

        btnSeleccionarPersonaje1.setBackground(new java.awt.Color(204, 128, 6));
        btnSeleccionarPersonaje1.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        btnSeleccionarPersonaje1.setForeground(new java.awt.Color(102, 102, 102));
        btnSeleccionarPersonaje1.setText("Seleccionar Personajes");
        btnSeleccionarPersonaje1.setEnabled(false);
        btnSeleccionarPersonaje1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarPersonaje1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionarPersonaje1);
        btnSeleccionarPersonaje1.setBounds(270, 230, 200, 40);

        btnAtacar1.setBackground(new java.awt.Color(153, 0, 25));
        btnAtacar1.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        btnAtacar1.setForeground(new java.awt.Color(255, 255, 255));
        btnAtacar1.setText("Atacar");
        btnAtacar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtacar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtacar1);
        btnAtacar1.setBounds(660, 470, 90, 40);

        btnSeleccionarArmas.setBackground(new java.awt.Color(204, 128, 6));
        btnSeleccionarArmas.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        btnSeleccionarArmas.setForeground(new java.awt.Color(102, 102, 102));
        btnSeleccionarArmas.setText("Seleccionar Armas");
        btnSeleccionarArmas.setEnabled(false);
        btnSeleccionarArmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarArmasActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionarArmas);
        btnSeleccionarArmas.setBounds(620, 230, 200, 40);

        btnSubirNivelA2.setBackground(new java.awt.Color(0, 83, 196));
        btnSubirNivelA2.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        btnSubirNivelA2.setForeground(new java.awt.Color(255, 255, 255));
        btnSubirNivelA2.setText("Subir nivel arma");
        btnSubirNivelA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirNivelA2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubirNivelA2);
        btnSubirNivelA2.setBounds(950, 690, 180, 40);

        btnSubirNivelP2.setBackground(new java.awt.Color(0, 83, 196));
        btnSubirNivelP2.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        btnSubirNivelP2.setForeground(new java.awt.Color(255, 255, 255));
        btnSubirNivelP2.setText("Subir nivel personaje");
        btnSubirNivelP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirNivelP2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubirNivelP2);
        btnSubirNivelP2.setBounds(760, 690, 180, 40);

        btnSubirNivelP1.setBackground(new java.awt.Color(153, 0, 25));
        btnSubirNivelP1.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        btnSubirNivelP1.setForeground(new java.awt.Color(255, 255, 255));
        btnSubirNivelP1.setText("Subir nivel personaje");
        btnSubirNivelP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirNivelP1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubirNivelP1);
        btnSubirNivelP1.setBounds(760, 470, 180, 40);

        btnSubirNivelA1.setBackground(new java.awt.Color(153, 0, 25));
        btnSubirNivelA1.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        btnSubirNivelA1.setForeground(new java.awt.Color(255, 255, 255));
        btnSubirNivelA1.setText("Subir nivel arma");
        btnSubirNivelA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirNivelA1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubirNivelA1);
        btnSubirNivelA1.setBounds(950, 470, 180, 40);

        lblTitulo12.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo12.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo12.setText("Seleccione el personaje 1");
        jPanel1.add(lblTitulo12);
        lblTitulo12.setBounds(270, 110, 180, 40);

        lblTitulo13.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        lblTitulo13.setForeground(new java.awt.Color(185, 185, 185));
        lblTitulo13.setText("Jugador1");
        jPanel1.add(lblTitulo13);
        lblTitulo13.setBounds(10, 110, 90, 40);

        arma1.setBackground(new java.awt.Color(153, 0, 25));
        arma1.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        arma1.setEnabled(false);
        jPanel1.add(arma1);
        arma1.setBounds(820, 110, 150, 40);

        jugador2.setBackground(new java.awt.Color(0, 83, 196));
        jugador2.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        jPanel1.add(jugador2);
        jugador2.setBounds(100, 170, 120, 40);

        btnSeleccionarJugadores.setBackground(new java.awt.Color(204, 128, 6));
        btnSeleccionarJugadores.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        btnSeleccionarJugadores.setForeground(new java.awt.Color(102, 102, 102));
        btnSeleccionarJugadores.setText("Seleccionar Jugadores");
        btnSeleccionarJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarJugadoresActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionarJugadores);
        btnSeleccionarJugadores.setBounds(20, 230, 200, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void changeComboBoxPJ(int indexJugador){
        String[] personajes = new String[4]; 
        DefaultComboBoxModel<String> model;
        
        for (int i = 0; i < 4; i++) {
            personajes[i] = controlJugar.getJugadorPersonajeNombre(indexJugador, i);
        }
        //cambia las opciones de los checkbox
        model = new DefaultComboBoxModel<>( personajes );        
        JComboBox<String> personajeCB;
        
        if(indexJugador == 0)
            personajeCB=personaje1;
        else
            personajeCB=personaje2;

        personajeCB.setModel(model);
        personajeCB.addActionListener(new PersonajeComboBox(personajeCB, controlJugar, indexJugador, this) );
        
        
    }
    
    public void changeComboBoxArma(int indexJugador, int indexPJ){
        String[] armas = new String[4]; 
        DefaultComboBoxModel<String> model;
        
        for (int i = 0; i < 4; i++) {
            armas[i] = controlJugar.getJugadorPersonajeArmaNombre(indexJugador, indexPJ ,i);
        }
        //cambia las opciones de los checkbox
        model = new DefaultComboBoxModel<>( armas );        
        JComboBox<String> armaCB;
        
        if(indexJugador == 0)
            armaCB=jugador1;
        else
            armaCB=arma2;
        armaCB.setModel(model);
        
        //armaCB.addActionListener(arma1);
        
        
    }
    
    private void btnAtacar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtacar2ActionPerformed
        String atacante = personaje2.getSelectedItem().toString();
        String arma = arma2.getSelectedItem().toString();
        String enemigo = personaje1.getSelectedItem().toString();
        
        if(atacante == ""){
            JOptionPane.showMessageDialog(null, "Falta un atacante", "Falta un atacante", JOptionPane.OK_OPTION);
        }else if(arma == ""){
            JOptionPane.showMessageDialog(null, "Falta un arma", "Falta un arma", JOptionPane.OK_OPTION);
        }else if(enemigo == ""){
            JOptionPane.showMessageDialog(null, "Falta un arma", "Falta un arma", JOptionPane.OK_OPTION);
        }else{
            int vidaAtacante = controlJugar.getVidaPersonaje(atacante);
            int vidaEnemigo = controlJugar.getVidaPersonaje(enemigo);
            if(vidaAtacante > 0 && vidaEnemigo > 0){
                String ataque = controlJugar.atacar(1,0,atacante,enemigo, arma);
                jTextArea1.setText(jTextArea1.getText() + ataque + "\n");
            }
            else{
                if(vidaAtacante == 0){
                    JOptionPane.showMessageDialog(null, "Ha perdido :(", "mensaje", JOptionPane.OK_OPTION);
                    JOptionPane.showMessageDialog(null, "El personaje ha muerto, no puede atacar", "Warning", JOptionPane.OK_OPTION);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Ha ganado :)!!!!!", "mensaje", JOptionPane.OK_OPTION);
                    JOptionPane.showMessageDialog(null, "El enemigo ha muerto, no puede volver a atacarlo", "Warning", JOptionPane.OK_OPTION);
                }
            }
        }
        
        // Mostrar las imagenes de los personajes
        
        
    }//GEN-LAST:event_btnAtacar2ActionPerformed

    private void btnSeleccionarPersonaje1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarPersonaje1ActionPerformed
        
            String atacante = personaje1.getSelectedItem().toString();
            String enemigo = personaje2.getSelectedItem().toString();

            // Cargar Nombres de Armas
            ArrayList<String> nombresArmas = controlJugar.getNombresArmasPersonaje(atacante);
            if(nombresArmas != null){
                for(int i = 0; i < nombresArmas.size(); i++){
                    arma1.addItem(nombresArmas.get(i));
                }   
            }
            else{
            }

            ArrayList<String> nombresArmas2 = controlJugar.getNombresArmasPersonaje(enemigo);
            if(nombresArmas2 != null){
                for(int i = 0; i < nombresArmas2.size(); i++){
                    arma2.addItem(nombresArmas2.get(i));
                }   
            }
            else{
            }
            // Obtener imagenes y setear
            String imagen1 = controlJugar.obtenerImagenPersonaje(atacante);
            System.out.println(imagen1);
            fotopersonaje1.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagen1))); 

            String imagen2 = controlJugar.obtenerImagenPersonaje(enemigo);
            System.out.println(imagen2);
            fotopersonaje2.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagen2))); 

            btnSeleccionarArmas.setEnabled(true);
            arma1.setEnabled(true);
            arma2.setEnabled(true);
            btnSeleccionarPersonaje1.setEnabled(false);
    }//GEN-LAST:event_btnSeleccionarPersonaje1ActionPerformed

    private void btnAtacar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtacar1ActionPerformed
        try{
            String atacante = personaje1.getSelectedItem().toString();
            String arma = arma1.getSelectedItem().toString();
            String enemigo = personaje2.getSelectedItem().toString();

            if(atacante == ""){
                JOptionPane.showMessageDialog(null, "Falta un atacante", "Falta un atacante", JOptionPane.OK_OPTION);
            }else if(arma == ""){
                JOptionPane.showMessageDialog(null, "Falta un arma", "Falta un arma", JOptionPane.OK_OPTION);
            }else if(enemigo == ""){
                JOptionPane.showMessageDialog(null, "Falta un arma", "Falta un arma", JOptionPane.OK_OPTION);
            }else{
                int vidaAtacante = controlJugar.getVidaPersonaje(atacante);
                int vidaEnemigo = controlJugar.getVidaPersonaje(enemigo);
                if(vidaAtacante > 0 && vidaEnemigo > 0){
                    String ataque = controlJugar.atacar(0,1,atacante,enemigo, arma);
                    jTextArea1.setText(jTextArea1.getText() + ataque + "\n");
                }
                else{
                    if(vidaAtacante == 0){
                        JOptionPane.showMessageDialog(null, "Ha perdido :(", "mensaje", JOptionPane.OK_OPTION);
                        JOptionPane.showMessageDialog(null, "El personaje ha muerto, no puede atacar", "Warning", JOptionPane.OK_OPTION);
                        jTextArea1.setText(jTextArea1.getText() + enemigo + " ha ganado!"  + "\n");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Ha ganado :)!!!!!", "mensaje", JOptionPane.OK_OPTION);
                        JOptionPane.showMessageDialog(null, "El enemigo ha muerto, no puede volver a atacarlo", "Warning", JOptionPane.OK_OPTION);
                        jTextArea1.setText(jTextArea1.getText() + atacante + " ha ganado!"  + "\n");
                    }
                }
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Debe agregarle personajes a los jugadores", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAtacar1ActionPerformed

    private void btnSeleccionarArmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarArmasActionPerformed
        try{
            String armas1 = arma1.getSelectedItem().toString();
            String armas2 = arma2.getSelectedItem().toString();

            // Obtener imagenes y setear
            String imagen1 = controlJugar.obtenerImagenArma(armas1);
            fotoarma1.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagen1))); 

            String imagen2 = controlJugar.obtenerImagenArma(armas2);
            fotoarma2.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagen2))); 

            SeleccionPersonajes pant1 = new SeleccionPersonajes(this, true, controlJugar);
            pant1.setVisible(true); 
            
            btnSeleccionarArmas.setEnabled(false);
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Debe agregarle armas o habilidades a los personajes", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSeleccionarArmasActionPerformed

    private void btnSubirNivelA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirNivelA2ActionPerformed
        String armas2 = arma2.getSelectedItem().toString();
        controlJugar.SubirNivelArma(armas2);
        try{
            // Obtener imagenes y setear
            String imagen2 = controlJugar.obtenerImagenArma(armas2);
            fotoarma2.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagen2))); 
        } catch(Error e){
            
        }
        jTextArea1.setText(jTextArea1.getText() + armas2 + " subio de nivel!" + "\n");
    }//GEN-LAST:event_btnSubirNivelA2ActionPerformed

    private void btnSubirNivelP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirNivelP2ActionPerformed
        String enemigo = personaje2.getSelectedItem().toString();
        controlJugar.SubirNivelPersonaje(enemigo);
        
        try{
            // Obtener imagenes y setear
            String imagen2 = controlJugar.obtenerImagenPersonaje(enemigo);
            System.out.println(imagen2);
            fotopersonaje2.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagen2))); 
        } catch(Error e){
            
        }
        jTextArea1.setText(jTextArea1.getText() + enemigo + " subio de nivel!" + "\n");
    }//GEN-LAST:event_btnSubirNivelP2ActionPerformed

    private void btnSubirNivelP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirNivelP1ActionPerformed
        String atacante = personaje1.getSelectedItem().toString();
        controlJugar.SubirNivelPersonaje(atacante);
        try{
            // Obtener imagenes y setear
            String imagen1 = controlJugar.obtenerImagenPersonaje(atacante);
            System.out.println(imagen1);
            fotopersonaje1.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagen1))); 
        } catch(Error e){
            
        }
        jTextArea1.setText(jTextArea1.getText() + atacante + " subio de nivel!" + "\n");
        
    }//GEN-LAST:event_btnSubirNivelP1ActionPerformed

    private void btnSubirNivelA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirNivelA1ActionPerformed
        String armas1 = arma1.getSelectedItem().toString();
        controlJugar.SubirNivelArma(armas1);
        try{
            // Obtener imagenes y setear
            String imagen1 = controlJugar.obtenerImagenArma(armas1);
            fotoarma1.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagen1))); 
        } catch(Error e){
            
        }
        jTextArea1.setText(jTextArea1.getText() + armas1 + " subio de nivel!" + "\n");
    }//GEN-LAST:event_btnSubirNivelA1ActionPerformed

    private void btnSeleccionarJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarJugadoresActionPerformed
        String jugador1V = jugador1.getSelectedItem().toString();
        
        // Cargar Nombres de Personajes
        ArrayList<String> nombresPersonajes = controlJugar.getNombresPersonajesJugador(jugador1V);
        if(nombresPersonajes != null){
            for(int i = 0; i < nombresPersonajes.size(); i++){
                personaje1.addItem(nombresPersonajes.get(i));
            }   
        }
        else{
        }
        // Guardar jugador 1
        this.objetoJugador1 = controlJugar.getJugador(jugador1V);
        
        String jugador2V = jugador2.getSelectedItem().toString();
        
        // Cargar Nombres de Personajes
        ArrayList<String> nombresPersonajes2 = controlJugar.getNombresPersonajesJugador(jugador2V);
        if(nombresPersonajes2 != null){
            for(int i = 0; i < nombresPersonajes2.size(); i++){
                personaje2.addItem(nombresPersonajes2.get(i));
            }   
        }
        else{
        }
        
        // Guardar jugador 2
        this.objetoJugador2 = controlJugar.getJugador(jugador2V);
        
        personaje1.setEnabled(true);
        personaje2.setEnabled(true);
        btnSeleccionarPersonaje1.setEnabled(true);
        btnSeleccionarJugadores.setEnabled(false);
    }//GEN-LAST:event_btnSeleccionarJugadoresActionPerformed

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
            java.util.logging.Logger.getLogger(Jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Jugar dialog = new Jugar(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> arma1;
    private javax.swing.JComboBox<String> arma2;
    private javax.swing.JButton btnAtacar1;
    private javax.swing.JButton btnAtacar2;
    private javax.swing.JButton btnSeleccionarArmas;
    private javax.swing.JButton btnSeleccionarJugadores;
    private javax.swing.JButton btnSeleccionarPersonaje1;
    private javax.swing.JButton btnSubirNivelA1;
    private javax.swing.JButton btnSubirNivelA2;
    private javax.swing.JButton btnSubirNivelP1;
    private javax.swing.JButton btnSubirNivelP2;
    private javax.swing.JLabel fotoarma1;
    private javax.swing.JLabel fotoarma2;
    private javax.swing.JLabel fotopersonaje1;
    private javax.swing.JLabel fotopersonaje2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> jugador1;
    private javax.swing.JComboBox<String> jugador2;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo10;
    private javax.swing.JLabel lblTitulo11;
    private javax.swing.JLabel lblTitulo12;
    private javax.swing.JLabel lblTitulo13;
    private javax.swing.JLabel lblTitulo6;
    private javax.swing.JLabel lblTitulo7;
    private javax.swing.JLabel lblTitulo8;
    private javax.swing.JLabel lblTitulo9;
    private javax.swing.JComboBox<String> personaje1;
    private javax.swing.JComboBox<String> personaje2;
    // End of variables declaration//GEN-END:variables
}

class PersonajeComboBox implements ActionListener {
    private javax.swing.JComboBox<String> comboBox;//este indica el personaje seleccionado
    private Controlador controlComboBox;
    private int indexJugador;
    private Jugar pantallaJugar;

    public PersonajeComboBox(JComboBox<String> comboBox, Controlador controlComboBox, int indexJugador, Jugar pantallaJugar) {
        this.comboBox = comboBox;
        this.controlComboBox = controlComboBox;
        this.indexJugador = indexJugador;
        this.pantallaJugar = pantallaJugar;
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        String personajeNombre = (String) comboBox.getSelectedItem();
        int indexPersonaje = controlComboBox.getIndexPersonaje(indexJugador,personajeNombre);
        pantallaJugar.changeComboBoxArma(indexJugador,indexPersonaje);

    }
}