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
public class PersonajeBuilder {
    private ArrayList <String> apariencias = new ArrayList<>();
    private ArrayList <Arma> armas = new ArrayList<>();
    private ArrayList <Arma> hechizos = new ArrayList<>();
    
    public void PersonajeBuilder(){};
    public PersonajeBuilder agregarArma(){return null;} //No se como se deberia hacer esto aca    
    public PersonajeBuilder agregarHabilidad(){return null;} //No se como se deberia hacer esto aca    
    public PersonajeBuilder agregarApariencia(){return null;} //No creo que esto deba ir aca
    public void build(){}; // Creo que debe retornar PJ no?
}
