/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego.Personaje;

import Juego.Armas.Arma;
import Juego.Prototype.iPrototype;
import java.util.ArrayList;

/**
 *
 * @author fabri
 */
public class Personaje implements iPersonaje, iPrototype<Personaje>{
    
    private String nombre;
    private int vida;
    private int golpesxtiempo;
    private int nivel = 0;
    private int campos;
    private int nivelAparicion;
    private int costo;
    private int reach = 1; // Alcance del ataque
    private int damage;
    private int range = 1; // Area de influecia
    private ArrayList <String> apariencias;
    private ArrayList <Arma> armas;
    private ArrayList <Arma> hechizos;
    private String apariencia;

    public Personaje(){
        if(apariencias != null){
            apariencia = apariencias.get(0);
        }
    }
    
    public Personaje(String nombre, int vida, int golpesxtiempo, int campos, int nivelAparicion, int costo, int damage, ArrayList<String> apariencias, ArrayList<Arma> armas, ArrayList<Arma> hechizos) {
        this.nombre = nombre;
        this.vida = vida;
        this.golpesxtiempo = golpesxtiempo;
        this.campos = campos;
        this.nivelAparicion = nivelAparicion;
        this.costo = costo;
        this.damage = damage;
        this.apariencias = apariencias;
        this.armas = armas;
        this.hechizos = hechizos;
    }

    public Personaje(String nombre, int vida, int golpesxtiempo, int nivel, int campos, int nivelAparicion, int costo) {
        this.nombre = nombre;
        this.vida = vida;
        this.golpesxtiempo = golpesxtiempo;
        this.campos = campos;
        this.nivelAparicion = nivelAparicion;
        this.costo = costo;
        this.damage = damage;
    }

    @Override
    public void atacar(String ataque) { // Revisar jugabilidad
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int aumentarNivel(int nivel) {
        if ((nivel + 1) <= apariencias.size()){
            nivel += 1; // Solo sube de nivel si le queda apariencias disponibles
            apariencia = apariencias.get(nivel);
            setApariencia(apariencia);
        }
        return nivel; // Si llega aca sin el if no sube de nivel
    }
    
    @Override
    public Personaje clone() {
        return new Personaje(this.nombre, this.vida, this.golpesxtiempo, this.campos, this.nivelAparicion, this.costo, this.damage, this.apariencias, this.armas, this.hechizos); 
    }
    
    @Override
    public Personaje deepClone() {
        Personaje cloneDeep = clone();
        cloneDeep.nombre = new String(this.nombre);
        cloneDeep.vida = this.vida;
        cloneDeep.golpesxtiempo = this.golpesxtiempo;
        cloneDeep.campos = this.campos;
        cloneDeep.nivelAparicion = this.nivelAparicion;
        cloneDeep.costo = this.costo;
        cloneDeep.damage = this.damage;
        ArrayList <String> aparienciasClon = new ArrayList<>();
        for(String aparienciaString : this.apariencias){
            aparienciasClon.add(aparienciaString);
        }            
        cloneDeep.apariencias = aparienciasClon;
        
        ArrayList <Arma> armasClon = new ArrayList<>();
        for(Arma ArmaClon : this.armas){
            armasClon.add(ArmaClon);
        }
        cloneDeep.armas = armasClon;
            
        ArrayList <Arma> hechizosClon = new ArrayList<>();
        for(Arma HechizoClon : this.armas){
            hechizosClon.add(HechizoClon);
        }
        cloneDeep.hechizos = hechizosClon;
        
        return cloneDeep;
    }

    @Override
    public String toString() {
        String texto =  "Nombre: " + nombre + "{ Vida:" + vida + ", Golpes por tiempo: " + golpesxtiempo +
        ", Nivel: " + nivel + ", Campos: " + campos + ", Nivel de Aparicion: " + nivelAparicion + 
        ", Costo: " + costo;
        if(apariencias != null){
            texto += "\n, Apariencias: " + apariencias.toString();
        }
        if(armas != null){
            texto += "\n, Armas: " + armas.toString().toString();
        }
        if(hechizos != null){
            texto += "\n, Habilidades: "+ hechizos.toString();
        }
        texto += "}";
        
        return texto;
    }
    
    
    // <editor-fold defaultstate="collapsed" desc=" Getters and Setters ">    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getGolpesxtiempo() {
        return golpesxtiempo;
    }

    public void setGolpesxtiempo(int golpesxtiempo) {
        this.golpesxtiempo = golpesxtiempo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getCampos() {
        return campos;
    }

    public void setCampos(int campos) {
        this.campos = campos;
    }

    public int getNivelAparicion() {
        return nivelAparicion;
    }

    public void setNivelAparicion(int nivelAparicion) {
        this.nivelAparicion = nivelAparicion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public ArrayList<String> getApariencias() {
        return apariencias;
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

    public String getApariencia() {
        return apariencia;
    }

    public void setApariencia(String apariencia) {
        this.apariencia = apariencia;
    }

    
    
    public void setApariencias(ArrayList<String> apariencias) {
        this.apariencias = apariencias;
    }

    public ArrayList<Arma> getArmas() {
        return armas;
    }

    public void setArmas(ArrayList<Arma> armas) {
        this.armas = armas;
    }

    public ArrayList<Arma> getHechizos() {
        return hechizos;
    }

    public void setHechizos(ArrayList<Arma> hechizos) {
        this.hechizos = hechizos;
    } 
    // </editor-fold>
    
    public static class PersonajeBuilder { //Builder de personaje
        private String nombre;
        private int vida;
        private int golpesxtiempo;
        private int nivel = 0;
        private int campos;
        private int nivelAparicion;
        private int costo;
        private int reach = 1; // Alcance del ataque
        private int damage;
        private int range = 1; // Area de influecia
        private ArrayList <String> apariencias;
        private ArrayList <Arma> armas;
        private ArrayList <Arma> hechizos;
        private String apariencia;

        public void PersonajeBuilder(){
            if(apariencias != null){
                apariencia = apariencias.get(0);
            }
            this.armas = new ArrayList<Arma>();
            this.hechizos = new ArrayList<Arma>();
            this.apariencias = new ArrayList<String>();
        }
        
        public PersonajeBuilder agregarAtributos(String nombre, int vida, int gxt, int nivel, 
        int campos, int nivelAparicion, int costo, int reach, int damage, int range){
            this.nombre = nombre;
            this.vida = vida;
            this.golpesxtiempo = gxt;
            this.nivel = nivel;
            this.campos = campos;
            this.nivelAparicion = nivelAparicion;
            this.costo = costo;
            this.reach = reach;
            this.damage = damage;
            this.range = range;
            return this;

        }
        
        public PersonajeBuilder agregarArma(Arma arma){
            if(arma != null){
               this.armas = new ArrayList<Arma>();
               armas.add(arma);
               return this;
            }
            return null;
        }   
        public PersonajeBuilder agregarHabilidad(Arma hechizo){
            if(hechizo != null){
               this.hechizos = new ArrayList<Arma>();
               hechizos.add(hechizo);
               return this;
            }
            return null;

        }   
        public PersonajeBuilder agregarApariencia(String imagen){
            if(imagen != null){
               this.apariencias = new ArrayList<String>();
               apariencias.add(imagen);
               return this;
            }
            return null;
        } 
        public Personaje build(){
            return new Personaje(nombre, vida, golpesxtiempo, campos, nivelAparicion, costo, damage, apariencias, armas, hechizos);
        } 
    }
    
}
