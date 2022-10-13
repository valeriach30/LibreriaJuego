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
public class Categoria extends Personaje{
    
    private String nombreCategoria;
    private ArrayList <SubCategoria> subCategorias = new ArrayList<>(); // No se si deba ir aca

    public Categoria(String nombreCategoria, String nombre, int vida, int golpesxtiempo, int nivel, int campos, int nivelAparicion, int costo, ArrayList<String> apariencias, ArrayList<Arma> armas, ArrayList<Arma> hechizos) {
        super(nombre, vida, golpesxtiempo, nivel, campos, nivelAparicion, costo, apariencias, armas, hechizos);
        this.nombreCategoria = nombreCategoria;
    }
    
    // No se si debe agregar los setters and getterse de PJ

    @Override
    public int aumentarNivel(int nivel) {
        return super.aumentarNivel(nivel); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacar(String ataque) {
        super.atacar(ataque); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
