/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria.Juego;

import Juego.Armas.Arma;
import Juego.Personaje.Personaje;
import java.util.ArrayList;

/**
 *
 * @author Ray
 */
public class Juego {
    ArrayList<Jugador> jugadores;
    ArrayList<Arma> habilidades;
    ArrayList<Arma> armas;
    ArrayList<Personaje> personajes;
    
    public Juego(){
        
    }
    
    public Juego(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<Arma> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(ArrayList<Arma> habilidades) {
        this.habilidades = habilidades;
    }

    public ArrayList<Arma> getArmas() {
        return armas;
    }

    public void setArmas(ArrayList<Arma> armas) {
        this.armas = armas;
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(ArrayList<Personaje> personajes) {
        this.personajes = personajes;
    }
    
    
}
