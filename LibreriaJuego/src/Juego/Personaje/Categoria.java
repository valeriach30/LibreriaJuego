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

    public Categoria(String nombreCategoria, String nombre, int vida, int golpesxtiempo, int nivel, int campos, int nivelAparicion, int costo, int damage, int range, int reach) {
        super(nombreCategoria, nombre, vida, golpesxtiempo, nivel, campos, nivelAparicion, costo, damage, range, reach);
        this.nombreCategoria = nombreCategoria;
    }
    
    public Categoria(String nombre, int vida, int golpesxtiempo, int nivel, int campos, int nivelAparicion, int costo, int damage, int range, int reach){
        super(nombre, vida, golpesxtiempo, nivel, campos, nivelAparicion, costo, damage, range, reach);
    }
    
    public Categoria() {
    }
    public Categoria(String nombre) {
        this.nombreCategoria = nombre;
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

    @Override
    public String toString() {
        return super.toString() + "Subcategorias: " + subCategorias.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
