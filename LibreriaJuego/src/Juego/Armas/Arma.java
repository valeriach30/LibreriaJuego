/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego.Armas;

import java.util.ArrayList;

/**
 *
 * @author Ray
 */
public class Arma {
    String name;
    int reach;
    int damage;
    int range;
    ArrayList<String> images; 

    public Arma(String name, int reach, int damage, int range, ArrayList<String> images) {
        this.name = name;
        this.reach = reach;
        this.damage = damage;
        this.range = range;
        this.images = images;
    }
    
}
