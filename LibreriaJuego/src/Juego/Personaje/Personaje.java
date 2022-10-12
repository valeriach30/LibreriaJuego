/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego.Personaje;

import Juego.Armas.Arma;
import java.util.ArrayList;

/**
 *
 * @author fabri
 */
public class Personaje implements iPersonaje{
    
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

    public Personaje(String nombre, int vida, int golpesxtiempo, int nivel, int campos, int nivelAparicion, int costo) {
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
    // </editor-fold>
    
    
    
}
