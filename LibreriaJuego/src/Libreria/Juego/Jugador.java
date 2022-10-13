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
public class Jugador {
    String nombre;
    String usuario;
    String contra;
    int edad;
    ArrayList<Personaje> personajes;

    public Jugador(String nombre, String usuario, String contra, int edad, ArrayList<Personaje> personajes) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contra = contra;
        this.edad = edad;
        this.personajes = personajes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(ArrayList<Personaje> personajes) {
        this.personajes = personajes;
    }
    
    
}
