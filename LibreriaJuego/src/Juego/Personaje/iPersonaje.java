/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego.Personaje;

/**
 *
 * @author fabri
 */
public interface iPersonaje {
 
    public String atacar(); //retorna el mensaje de error o un string con el ataque
    public int aumentarNivel(int nivel);
}
