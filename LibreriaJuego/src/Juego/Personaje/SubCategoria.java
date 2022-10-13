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
public class SubCategoria extends Categoria {
    
    private String nombreSubCategoria;

    public SubCategoria(String nombreSubCategoria, String nombreCategoria, String nombre, int vida, int golpesxtiempo, int campos, int nivelAparicion, int costo, int damage, ArrayList<String> apariencias, ArrayList<Arma> armas, ArrayList<Arma> hechizos) {
        super(nombreCategoria, nombre, vida, golpesxtiempo, campos, nivelAparicion, costo, damage, apariencias, armas, hechizos);
        this.nombreSubCategoria = nombreSubCategoria;
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

    public String getNombreSubCategoria() {
        return nombreSubCategoria;
    }

    public void setNombreSubCategoria(String nombreSubCategoria) {
        this.nombreSubCategoria = nombreSubCategoria;
    }
    
}
