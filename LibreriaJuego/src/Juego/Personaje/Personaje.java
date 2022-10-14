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
    private int nivel = 1; //para mostrar las imagenes se resta un nivel
    private int campos;
    private int nivelAparicion;
    private int costo;
    private int reach = 1; // Alcance del ataque
    private int damage;
    private int range = 1; // Area de influecia
    private Personaje enemigo = null;
    private String nombreCategoria;
    private ArrayList <String> apariencias;
    private ArrayList <Arma> armas;
    //private Arma armaActual = null;
    private ArrayList <Arma> hechizos;
    //private Arma hechizoActual = null;
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

    public Personaje(String nombre, int vida, int golpesxtiempo, int nivel, int campos, int nivelAparicion, int costo, int damage, int range, int reach) {
        this.nombre = nombre;
        this.vida = vida;
        this.golpesxtiempo = golpesxtiempo;
        this.campos = campos;
        this.nivelAparicion = nivelAparicion;
        this.costo = costo;
        this.damage = damage;
        this.range = range;
        this.reach = reach;
    }
    
    public Personaje(String nombreCategoria, String nombre, int vida, int golpesxtiempo, int nivel, int campos, int nivelAparicion, int costo, int damage, int range, int reach) {
        this.nombre = nombre;
        this.vida = vida;
        this.golpesxtiempo = golpesxtiempo;
        this.campos = campos;
        this.nivelAparicion = nivelAparicion;
        this.costo = costo;
        this.damage = damage;
        this.range = range;
        this.reach = reach;
        this.nombreCategoria = nombreCategoria;
    }
    
    
    @Override
    public String atacar() { // Revisar jugabilidad
        //System.out.println("entre");
        
        if(this.getEnemigo() != null & this.enemigo.getVida() > 0){
            if(this.damage > 0){
                this.enemigo.setVida(this.enemigo.getVida() - this.damage );
                return (this.nombre + " realizo un ataque a " + this.enemigo.getNombre() + "y le infliguio un total de: " +
                        this.damage);
            }
            return "El personaje no puede atacar o no dispone un arma";
        }
        return "No hay un enemigo para realizar el ataque";
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
    private void setArmaActual(Arma armaActual){
        armaActual.upgradeWeapon(this.nivel); 
        this.damage = armaActual.getDamage();
        this.range = armaActual.getRange();
        this.range = armaActual.getReach();
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
        if(this.apariencias != null){
            for(String aparienciaString : this.apariencias){
                aparienciasClon.add(aparienciaString);
            }            
            cloneDeep.apariencias = aparienciasClon;
        }
        if(this.armas != null){
            ArrayList <Arma> armasClon = new ArrayList<>();
            for(Arma ArmaClon : this.armas){
                armasClon.add(ArmaClon);
            }
            cloneDeep.armas = armasClon;
        } 
        if(this.hechizos != null){
            ArrayList <Arma> hechizosClon = new ArrayList<>();
            for(Arma HechizoClon : this.hechizos){
                hechizosClon.add(HechizoClon);
            }
            cloneDeep.hechizos = hechizosClon;
        }
        return cloneDeep;
    }

    @Override
    public String toString() {
        String texto =  "Nombre: " + nombre + "{ Vida:" + vida + ", Golpes por tiempo: " + golpesxtiempo +
        ", Nivel: " + nivel + ", Campos: " + campos + ", Nivel de Aparicion: " + nivelAparicion + 
        ", Costo: " + costo;
        if(nombreCategoria != null){
            texto += "Categoria: " + nombreCategoria;
        }
        if(apariencias != null){
            texto += "\nApariencias: " + apariencias.toString() + "\n";
        }
        if(armas != null){
            texto += "\nArmas: " + armas.toString().toString() + "\n";
        }
        if(hechizos != null){
            texto += "\nHabilidades: "+ hechizos.toString()+ "\n";
        }
        texto += "}";
        
        return texto;
    }
    
    
    // <editor-fold defaultstate="collapsed" desc=" Getters and Setters ">    
    public String getNombre() {
        return nombre;
    }

    public Personaje getEnemigo() {
        return enemigo;
    }

    public void setEnemy(Personaje enemigo) {
        this.enemigo = enemigo;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
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
        this.apariencia = apariencias.get(0);
        this.apariencias = apariencias;
    }
    
    public void addApariencias(String apariencia) {
        if(this.armas == null)
            this.apariencias = new ArrayList<String>();
        this.apariencias.add(apariencia);
    }
    
    public ArrayList<Arma> getArmas() {
        return armas;
    }

    public void setArmas(ArrayList<Arma> armas) {
        this.armas = armas;
    }
    
    public void addArmas(Arma arma) {
        if(this.armas == null)
            this.armas = new ArrayList<Arma>();
        this.armas.add(arma);
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
        private Personaje enemigo;
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
        int campos, int nivelAparicion, int costo, int reach, int damage, int range, Personaje enemigo){
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
            this.enemigo = enemigo;
            return this;

        }

        // <editor-fold defaultstate="collapsed" desc=" Setters ">  
        public PersonajeBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public PersonajeBuilder setVida(int vida) {
            this.vida = vida;
            return this;
        }

        public PersonajeBuilder setGolpesxtiempo(int golpesxtiempo) {
            this.golpesxtiempo = golpesxtiempo;
            return this;
        }

        public PersonajeBuilder setNivel(int nivel) {
            this.nivel = nivel;
            return this;
        }

        public PersonajeBuilder setCampos(int campos) {
            this.campos = campos;
            return this;
        }

        public PersonajeBuilder setNivelAparicion(int nivelAparicion) {
            this.nivelAparicion = nivelAparicion;
            return this;
        }

        public PersonajeBuilder setCosto(int costo) {
            this.costo = costo;
            return this;
        }

        public PersonajeBuilder setReach(int reach) {
            this.reach = reach;
            return this;
        }

        public PersonajeBuilder setDamage(int damage) {
            this.damage = damage;
            return this;
        }

        public PersonajeBuilder setRange(int range) {
            this.range = range;
            return this;
        }

        public PersonajeBuilder setEnemigo(Personaje enemigo) {
            this.enemigo = enemigo;
            return this;
        }
        // </editor-fold>    
        

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
