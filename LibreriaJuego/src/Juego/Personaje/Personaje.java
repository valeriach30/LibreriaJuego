/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego.Personaje;

import Juego.Armas.Arma;
import Juego.Prototype.iPrototype;
import java.util.ArrayList;

/**
 *
 * @author fabri
 */
public class Personaje implements iPersonaje, iPrototype<Personaje>{
    
    private String nombre;
    private int vida;
    private int golpesxtiempo;
    private int nivel;
    private int campos;
    private int nivelAparicion;
    private int costo;
    private ArrayList <String> apariencias;
    private ArrayList <Arma> armas;
    private ArrayList <Arma> hechizos;

    public Personaje(String nombre, int vida, int golpesxtiempo, 
            int nivel, int campos, int nivelAparicion, int costo, 
            ArrayList<String> apariencias, ArrayList<Arma> armas, 
            ArrayList<Arma> hechizos) {
        
        this.nombre = nombre;
        this.vida = vida;
        this.golpesxtiempo = golpesxtiempo;
        this.nivel = nivel;
        this.campos = campos;
        this.nivelAparicion = nivelAparicion;
        this.costo = costo;
        this.apariencias = apariencias;
        this.armas = armas;
        this.hechizos = hechizos;
    }
    
    public Personaje(String nombre, int vida, int golpesxtiempo, 
            int nivel, int campos, int nivelAparicion, int costo) {
        
        this.nombre = nombre;
        this.vida = vida;
        this.golpesxtiempo = golpesxtiempo;
        this.nivel = nivel;
        this.campos = campos;
        this.nivelAparicion = nivelAparicion;
        this.costo = costo;
    }
    
    @Override
    public void atacar(String ataque) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int aumentarNivel(int nivel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Personaje clone() {
        return new Personaje(nombre, vida, golpesxtiempo, nivel, campos, nivelAparicion, costo, apariencias, armas, hechizos);
    }

    @Override
    public Personaje deepClone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // <editor-fold defaultstate="collapsed" desc=" Getters and Setters ">    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getGolpesxtiempo() {
        return golpesxtiempo;
    }

    public void setGolpesxtiempo(int golpesxtiempo) {
        this.golpesxtiempo = golpesxtiempo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getCampos() {
        return campos;
    }

    public void setCampos(int campos) {
        this.campos = campos;
    }

    public int getNivelAparicion() {
        return nivelAparicion;
    }

    public void setNivelAparicion(int nivelAparicion) {
        this.nivelAparicion = nivelAparicion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public ArrayList<String> getApariencias() {
        return apariencias;
    }

    public void setApariencias(ArrayList<String> apariencias) {
        this.apariencias = apariencias;
    }

    public ArrayList<Arma> getArmas() {
        return armas;
    }

    public void setArmas(ArrayList<Arma> armas) {
        this.armas = armas;
    }

    public ArrayList<Arma> getHechizos() {
        return hechizos;
    }

    public void setHechizos(ArrayList<Arma> hechizos) {
        this.hechizos = hechizos;
    } 
    // </editor-fold>
    
    public static class PersonajeBuilder { //Builder de personaje
        private String nombre;
        private int vida;
        private int golpesxtiempo;
        private int nivel;
        private int campos;
        private int nivelAparicion;
        private int costo;
        private ArrayList <String> apariencias = new ArrayList<>();
        private ArrayList <Arma> armas = new ArrayList<>();
        private ArrayList <Arma> hechizos = new ArrayList<>();

        public void PersonajeBuilder(){}
        
        public PersonajeBuilder agregarArma(Arma arma){
            if(arma != null){
               armas.add(arma);
               return this;
            }
            return null;
        }   
        public PersonajeBuilder agregarHabilidad(Arma hechizo){
            if(hechizo != null){
               hechizos.add(hechizo);
               return this;
            }
            return null;

        }   
        public PersonajeBuilder agregarApariencia(String imagen){
            if(imagen != null){
               apariencias.add(imagen);
               return this;
            }
            return null;
        } 
        public Personaje build(){
            return new Personaje(nombre, vida, golpesxtiempo, nivel, campos, nivelAparicion, costo, apariencias, armas, hechizos);
        } 
    }
    
}
