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
public class SubCategoria extends Categoria {
    
    // No se si debe agregar 2 veces el array

    public SubCategoria(String nombreCategoria, String nombre, int vida, int golpesxtiempo, int nivel, int campos, int nivelAparicion, int costo) {
        super(nombreCategoria, nombre, vida, golpesxtiempo, nivel, campos, nivelAparicion, costo);
    }

    @Override
    public void atacar(String ataque) {
        super.atacar(ataque); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int aumentarNivel(int nivel) {
        return super.aumentarNivel(nivel); //To change body of generated methods, choose Tools | Templates.
    }
    
    // Setters and getters?
    
}