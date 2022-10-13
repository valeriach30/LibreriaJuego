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

    public SubCategoria(String nombreCategoria, String nombre, String apariencia, int vida, int golpesxtiempo, int campos, int nivelAparicion, int costo, int damage, ArrayList<String> apariencias, ArrayList<Arma> armas, ArrayList<Arma> hechizos) {
        super(nombreCategoria, nombre, apariencia, vida, golpesxtiempo, campos, nivelAparicion, costo, damage, apariencias, armas, hechizos);
    }

    @Override
    public int aumentarNivel(int nivel) {
        return super.aumentarNivel(nivel); //To change body of generated methods, choose Tools | Templates.
    }
}
