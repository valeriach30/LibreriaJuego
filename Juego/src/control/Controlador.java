/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

// import de la libreria

import Juego.Personaje.Personaje;
import Libreria.Juego.Jugador;
import java.util.ArrayList;
import Libreria.Juego.Juego;

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
            juegoV.getPersonajes().add(nuevoP);
        }
    }
    
    // Agrega un arma al juego
    public void agregarArma(String arma, int alcanceV, int danhoV, int nivelV, int rangoV, int cantidadV){
        
    }
    
    // Agrega una habilidad al juego
    public void agregarHabilidad(){
        
    }
    
    public void agregarJugador(String nombreJ, String usuarioJ, String contraJ, int edadJ) {
        // Agregar jugador a la lista del  juego
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
        // return juego.getPersonajes()
        return "";
    }
    
    public String consultarArma(){
        // return juego.getArmas()
        return "";
    }
    
    public String consultarHabilidad(){
        // return juego.getHabilidades()
        return "";
    }
    
    /* esta comentado solo paara que no salga error
    
    // Obtiene los nombres de los personajes
    public ArrayList<String> getNombresPersonajes(){
        
    }
    
    // Obtiene los nombres de las armas
    public ArrayList<String> getNombresArmas(){
        
    }
    
    // Obtiene los nombres de las habilidades
    public ArrayList<String> getNombresHabilidades(){
        
    }
    
    // Obtiene los nombres de las categorias de los personajes
    public ArrayList<String> getNombresCategorias(){
        
    }
    
    // Obtiene los nombres de las subcategorias de los personajes
    public ArrayList<String> getNombresSubCategorias(){
        
    }
    */
    
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

    

   
    

   

    

    
}
