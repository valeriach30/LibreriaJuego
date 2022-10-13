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
    private ArrayList <SubCategoria> subCategorias = new ArrayList<>(); 

    public Categoria(String nombreCategoria, String nombre, int vida, int golpesxtiempo, int campos, int nivelAparicion, int costo, int damage, ArrayList<String> apariencias, ArrayList<Arma> armas, ArrayList<Arma> hechizos) {
        super(nombre, vida, golpesxtiempo, campos, nivelAparicion, costo, damage, apariencias, armas, hechizos);
        this.nombreCategoria = nombreCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public ArrayList<SubCategoria> getSubCategorias() {
        return subCategorias;
    }

    public void setSubCategorias(ArrayList<SubCategoria> subCategorias) {
        this.subCategorias = subCategorias;
    }
    

    @Override
    public int aumentarNivel(int nivel) {
        return super.aumentarNivel(nivel); //To change body of generated methods, choose Tools | Templates.
    }
    
}
