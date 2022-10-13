/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

// import de la libreria
import Juego.Armas.Arma;
import Libreria.Juego.Juego;

import Juego.Personaje.Categoria;
import Juego.Personaje.Personaje;
import Juego.Personaje.SubCategoria;
import java.util.ArrayList;


/**
 *
 * @author vchin
 */
public class Controlador {
    private Juego juegoV = new Juego();
    
    public Controlador() {                                      //AGREGAR AL UML
        
    }
    
    public void crear(){  
        // Crear el juego
    }
    
    // ------------------------------------------------ CREAR ------------------------------------------------
    
    // ------------------------> Agregaciones Juego <------------------------
    
    // Retorna el Personaje Agregado
    public void agregarPersonaje(String nombre, int vida, int golpesxtiempo, 
    int nivel, int campos, int nivelAparicion, int costo, String categoria){
        
        if(categoria != "Ninguna"){
            
        }else{
            Personaje nuevoP = new Personaje(nombre, vida, golpesxtiempo, nivel, campos, nivelAparicion, costo);
            
            ArrayList<Personaje> array = new ArrayList<Personaje>();
            if(juegoV.getPersonajes() != null){
                for(int i = 0; i < juegoV.getPersonajes().size(); i++){
                    array.add(juegoV.getPersonajes().get(i));
                }
            }
            array.add(nuevoP);
            juegoV.setPersonajes(array);
        }
    }
    
    // Agrega un arma al juego
    public void agregarArma(String arma, int alcanceV, int danhoV, int nivelV, int rangoV, int cantidadV){
        Arma nuevaAr = new Arma(arma, alcanceV, danhoV, nivelV, rangoV);
            
        ArrayList<Arma> array = new ArrayList<Arma>();
        if(juegoV.getArmas() != null){
            for(int i = 0; i < juegoV.getArmas().size(); i++){
                array.add(juegoV.getArmas().get(i));
            }
        }
        array.add(nuevaAr);
        juegoV.setArmas(array);
    }
    
    // Agrega una habilidad al juego
    public void agregarHabilidad(String nombreArma, int alcanceV, int danhoV, int nivelV, int rangoV, int cantidadV){
        Arma nuevaAr = new Arma(nombreArma, alcanceV, danhoV, nivelV, rangoV);
            
        ArrayList<Arma> array = new ArrayList<Arma>();
        if(juegoV.getHabilidades() != null){
            for(int i = 0; i < juegoV.getHabilidades().size(); i++){
                array.add(juegoV.getHabilidades().get(i));
            }
        }
        array.add(nuevaAr);
        juegoV.setHabilidades(array);
    }
    
    public void agregarJugador(String nombreJ, String usuarioJ, String contraJ, int edadJ) {
        // Agregar jugador a la lista del  juego
    }
    
    public void agregarCategoria(String nombre) {
        Categoria nuevaCat = new Categoria();
        nuevaCat.setNombreCategoria(nombre);
        
        ArrayList<Categoria> array = new ArrayList<Categoria>();
        if(juegoV.getCategorias() != null){
            for(int i = 0; i < juegoV.getCategorias().size(); i++){
                array.add(juegoV.getCategorias().get(i));
            }
        }
        array.add(nuevaCat);
        juegoV.setCategorias(array);
    }

    public void agregarSubCategoria(String nombre) {
        SubCategoria nuevaSubCat = new SubCategoria();
        nuevaSubCat.setNombreCategoria(nombre);
        
        ArrayList<SubCategoria> array = new ArrayList<SubCategoria>();
        if(juegoV.getSubcategorias()!= null){
            for(int i = 0; i < juegoV.getSubcategorias().size(); i++){
                array.add(juegoV.getSubcategorias().get(i));
            }
        }
        array.add(nuevaSubCat);
        juegoV.setSubcategorias(array);
    }
    
    // ------------------------> Imagenes <------------------------
    
   
    // Agrega imagen a un arma
    public void agregarImagenArma(String arma, String imagenUrl) {

    }
    
    // Agrega imagen a una habilidad
    public void agregarImagenHabilidad(String habilidad, String imagenUrl) {
    }

     
    
    // ------------------------> Clonar <------------------------
    
    // Retorna los Personajes Agregados, se usa el clone del factory
    public void clonarPersonaje(String nombrePersonaje, int vidaPer, int GxT, int camposV, int nivelV, int costoV, int cantidadV, String categoriaV, int cantidadV1) {

    }
    
    // Retorna las armas agregadas, se usa el clone del factory
    public void clonarArma(String nombreArma, int alcanceV, int danhoV, int nivelV, int rangoV, int cantidadV) {
    }

    // ------------------------> Build Personaje <------------------------
    
    public void buildPersonaje(String armasV, String habilidadesV, String imagen, String nombrePersonaje) {
        
        // Buscar el arma y la habilidad
        // Usar builder, falta agregar aarma y habilidad
        Personaje.PersonajeBuilder p = new Personaje.PersonajeBuilder().agregarApariencia(imagen);
    }
    
    // ------------------------> Agregaciones Jugador <------------------------
    
    // Agrega un personaje a la lista del jugador
    public void agregarPerJugador(String nombrePersonaje, String nombrePersonaje1) {

    }
    
     // ------------------------------------------------ CONSULTAR ------------------------------------------------
    
    
    public String consultarPersonajes(){
        if(juegoV.getPersonajes() != null){
            String texto = "";
            for(int i = 0; i < juegoV.getPersonajes().size(); i++){
                texto += "\n";
                texto += juegoV.getPersonajes().get(i).toString();
            }
            return texto;
        }
        else{
            return "No hay personajes";
        }
    }
    
    public String consultarArma(){
        if(juegoV.getArmas() != null){
            String texto = "";
            for(int i = 0; i < juegoV.getArmas().size(); i++){
                texto += juegoV.getArmas().get(i).toString();
            }
            return texto;
        }
        else{
            return "No hay armas";
        }
    }
    
    public String consultarHabilidad(){
        if(juegoV.getHabilidades() != null){
            String texto = "";
            for(int i = 0; i < juegoV.getHabilidades().size(); i++){
                texto += juegoV.getHabilidades().get(i).toString();
            }
            return texto;
        }
        else{
            return "No hay habilidades";
        }
    }
    
    
    
    // Obtiene los nombres de los personajes
    public ArrayList<String> getNombresPersonajes(){
        ArrayList<String> nombres = new ArrayList<String>();
        
        if(juegoV.getPersonajes() != null){
            for(int i = 0; i < juegoV.getPersonajes().size(); i++){
                nombres.add(juegoV.getPersonajes().get(i).getNombre());
            }
            return nombres;
        }
        else{
            return nombres;
        }
    }
    
    // Obtiene los nombres de las armas
    public ArrayList<String> getNombresArmas(){
        ArrayList<String> nombres = new ArrayList<String>();
        
        if(juegoV.getArmas() != null){
            for(int i = 0; i < juegoV.getArmas().size(); i++){
                nombres.add(juegoV.getArmas().get(i).getName());
            }
            return nombres;
        }
        else{
            return nombres;
        }    
    }
    
    // Obtiene los nombres de las habilidades
    public ArrayList<String> getNombresHabilidades(){
        ArrayList<String> nombres = new ArrayList<String>();
        
        if(juegoV.getHabilidades() != null){
            for(int i = 0; i < juegoV.getHabilidades().size(); i++){
                nombres.add(juegoV.getHabilidades().get(i).getName());
            }
            return nombres;
        }
        else{
            return nombres;
        } 
    }
    
    
    // Obtiene los nombres de las categorias de los personajes
    public ArrayList<String> getNombresCategorias(){
        ArrayList<String> nombres = new ArrayList<String>();
        if(juegoV.getCategorias()!= null){
            for(int i = 0; i < juegoV.getCategorias().size(); i++){
                nombres.add(juegoV.getCategorias().get(i).getNombreCategoria());
            }
            return nombres;
        }
        else{
            return nombres;
        } 
    }
    
    // Obtiene los nombres de las subcategorias de los personajes
    public ArrayList<String> getNombresSubCategorias(){
        ArrayList<String> nombres = new ArrayList<String>();
        if(juegoV.getSubcategorias()!= null){
            for(int i = 0; i < juegoV.getSubcategorias().size(); i++){
                nombres.add(juegoV.getSubcategorias().get(i).getNombreSubCategoria());
            }
            return nombres;
        }
        else{
            return nombres;
        } 
    }
    
    
    // Obtiene la imagen actual de un personaje
    public String getImagenPersonaje(String nombrePersonaje){
        return "";
    }
    
    // Obtiene la imagen actual del arma
    public String getImagenArma(String nombreArma){
        return "";
    }
    
    
    
     // ------------------------------------------------ OTROS ------------------------------------------------
    
    // Funcion para leer json y crear personajes
    public String leerJson(String Json){
        return "";
    }
    
    // Este es el metodo que hace que los personajes se ataquen 
    public String Jugar(){
        return "";
    }

    public void agregarRelacionCatSubCat(String nombreCategoria, String nombreSubCategoria) {
    }

    

    

   
    

   

    

    
}
