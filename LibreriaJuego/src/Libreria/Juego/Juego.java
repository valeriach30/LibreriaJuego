/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria.Juego;

import Juego.Armas.Arma;
import Juego.Personaje.Categoria;
import Juego.Personaje.Personaje;
import Juego.Personaje.SubCategoria;
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
    ArrayList<Categoria> categorias;
    ArrayList<SubCategoria> subcategorias;
    
    public Juego(){
        this.habilidades  = new ArrayList<Arma>();
        this.armas  = new ArrayList<Arma>();
        this.personajes  = new ArrayList<Personaje>();
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

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    public ArrayList<SubCategoria> getSubcategorias() {
        return subcategorias;
    }

    public void setSubcategorias(ArrayList<SubCategoria> subcategorias) {
        this.subcategorias = subcategorias;
    }

    
}
