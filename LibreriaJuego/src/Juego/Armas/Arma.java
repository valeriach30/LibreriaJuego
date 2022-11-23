/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego.Armas;

import Juego.Prototype.iPrototype;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Ray
 */
public class Arma implements iPrototype<Arma>, Serializable {

    private String name;
    private int reach; // Alcance del ataque
    private int damage;
    private int range; // Area de influencia
    private int level;
    private ArrayList<String> images;
    private ArrayList<Integer> danhos;
    private boolean available;
    
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
    
    public void upgradeWeapon(int nivel){
        setDamage( this.damage + (int) (nivel * (this.damage * 0.3)) ); //aumenta un 30% el dano del arma por default
    }
    
    // <editor-fold defaultstate="collapsed" desc=" Getters and Setters ">   
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    // </editor-fold>
    
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
        String texto = "\n" + "-" + name + "\nAlcance:" + reach + "\nDaño: " + damage +
        "\nRango: " + range + "\nNivel: "+ level;
        if(images != null){
            texto += "\nApariencias: " + images.toString();
        }
        return texto;
    }

    public ArrayList<Integer> getDanhos() {
        return danhos;
    }

    public void setDanhos(ArrayList<Integer> danhos) {
        this.danhos = danhos;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    
    public static class ArmaBuilder {

        private String name;
        private int reach;
        private int damage;
        private int range;
        private int level;
        private ArrayList<String> imagenes;
        private ArrayList<Integer> danhos;
        private boolean available;
        
        public ArmaBuilder() {

        }

        public ArmaBuilder AgregarImagen(String imagen) {
            this.imagenes = new ArrayList<String>();
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

        public ArrayList<Integer> getDanhos() {
            return danhos;
        }

        public ArmaBuilder setDanhos(ArrayList<Integer> danhos) {
            this.danhos = danhos;
            return this;
        }

        public boolean isAvailable() {
            return available;
        }

        public ArmaBuilder setAvailable(boolean available) {
            this.available = available;
            return this;
        }
        
    }
}
