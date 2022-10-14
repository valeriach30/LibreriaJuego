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

    public SubCategoria(String nombreCategoria, String nombre, int vida, int golpesxtiempo, int nivel, int campos, int nivelAparicion, int costo, int damage, int range, int reach) {
        super(nombreCategoria, nombre, vida, golpesxtiempo, nivel, campos, nivelAparicion, costo, damage, range, reach);
        this.nombreSubCategoria = nombreCategoria;
    }
    
    public SubCategoria() {
    }
    
    public SubCategoria(String nombre) {
        super(nombre);
        this.nombreSubCategoria = nombre;
    }
    @Override
    public String atacar() {
        return super.atacar(); //To change body of generated methods, choose Tools | Templates.
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
