/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego.Armas;

import Juego.Prototype.iPrototype;
import java.util.ArrayList;

/**
 *
 * @author Ray
 */
public class Arma implements iPrototype<Arma> {

    private String name;
    private int reach; // Alcance del ataque
    private int damage;
    private int range; // Area de influencia
    private int level;
    private ArrayList<String> images;

    public Arma(){
    }
    
    public Arma(String name, int reach, int damage, int range, int level, ArrayList<String> images) {
        this.name = name;
        this.reach = reach;
        this.damage = damage;
        this.range = range;
        this.level = level;
        this.images = images;
    }
    public Arma(String name, int reach, int damage, int level, int range) {
        this.name = name;
        this.reach = reach;
        this.damage = damage;
        this.range = range;
        this.level = level;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReach() {
        return reach;
    }

    public void setReach(int reach) {
        this.reach = reach;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }

    @Override
    public Arma clone() {
        return new Arma(name, reach, damage, range, level, images);
    }

    @Override
    public Arma deepClone() {
        return clone();
    }

    @Override
    public String toString() {
        String texto = "\n" + "Nombre: " + name + "{ Alcance:" + reach + ", Daño: " + damage +
        ", Rango: " + range + ", Nivel: "+ level;
        if(images != null){
            texto += "\n, Apariencias: " + images.toString();
        }
        texto += "}";
        return texto;
    }

    
    public static class ArmaBuilder {

        private String name;
        private int reach;
        private int damage;
        private int range;
        private int level;
        private ArrayList<String> imagenes;

        public ArmaBuilder() {

        }

        public ArmaBuilder AgregarImagen(String imagen) {
            if (imagen != null) {
                imagenes.add(imagen);//quizas se tenga que cambiar esto
            }
            return this;
        }

        public ArmaBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ArmaBuilder setReach(int reach) {
            this.reach = reach;
            return this;
        }

        public ArmaBuilder setDamage(int damage) {
            this.damage = damage;
            return this;
        }

        public ArmaBuilder setRange(int range) {
            this.range = range;
            return this;
        }


        public ArmaBuilder setLevel(int level) {
            this.level = level;
            return this;
        }

        public Arma build() {
            return new Arma(name, reach, damage, level, range, imagenes);
        }

    }
}
