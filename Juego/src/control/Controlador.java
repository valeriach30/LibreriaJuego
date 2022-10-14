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
import Libreria.Juego.Jugador;
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
    
    // Agrega caracteristicas a un personaje
    public void agregarPersonaje(String armaNombre, String habilidadNombre, String imagen, String nombrePersonaje){
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
        Jugador player = new Jugador(nombreJ, usuarioJ, contraJ, edadJ);
        ArrayList<Jugador> array = new ArrayList<Jugador>();
        if(juegoV.getJugadores() != null){
            for(int i = 0; i < juegoV.getJugadores().size(); i++){
                array.add(juegoV.getJugadores().get(i));
            }
        }
        array.add(player);
        juegoV.setJugadores(array);
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
        SubCategoria nuevaSubCat = new SubCategoria(nombre);
        
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
    public void clonarPersonaje(String nombreArma, int vidaPer, int GxT,
           int nivelAparicion, int camposV, int nivelV, int costoV, String categoriaV,
           int cantidadV, String habilidadNombre, String nombrePersonaje, int alcance, 
           int danho, int rango, String subCategoria) {
        
        

    }
    
    // Retorna las armas agregadas, se usa el clone del factory
    public void clonarArma(String nombreArma, int alcanceV, int danhoV, int nivelV, int rangoV, int cantidadV) {
    }

    // ------------------------> Build Personaje <------------------------
    
    public void buildPersonaje(String nombreArma, int vidaPer, int GxT,
           int nivelAparicion, int camposV, int nivelV, int costoV, String categoriaV,
           int cantidadV, String habilidadNombre, String nombrePersonaje, int alcance, 
           int danho, int rango, String subCategoria) {
        
        // Buscar el arma y la habilidad
        
        Arma habilidad = null;
        for(int i = 0; i < juegoV.getHabilidades().size(); i++){
            System.out.println(juegoV.getHabilidades().get(i).getName());
            System.out.println(nombreArma);
            if(juegoV.getHabilidades().get(i).getName() == habilidadNombre){
                habilidad = juegoV.getHabilidades().get(i);
            }
        }
        
        Arma arma = null;
        for(int i = 0; i < juegoV.getArmas().size(); i++){
            System.out.println(juegoV.getArmas().get(i).getName());
            System.out.println(nombreArma);
            if(juegoV.getArmas().get(i).getName() == nombreArma){
                arma = juegoV.getArmas().get(i);
            }
        }
       
        // Usar builder
        if(arma != null && habilidad != null && categoriaV == "Ninguna" && subCategoria == "Ninguna"){

            Personaje nuevoPer = new Personaje.PersonajeBuilder()
            .agregarArma(arma)
            .agregarHabilidad(habilidad)
            .build();

            // Agregar atributos
            nuevoPer.setNombre(nombrePersonaje);
            nuevoPer.setVida(vidaPer);
            nuevoPer.setGolpesxtiempo(GxT);
            nuevoPer.setNivel(nivelAparicion);
            nuevoPer.setCampos(camposV);
            nuevoPer.setNivelAparicion(nivelV);
            nuevoPer.setCosto(costoV);
            nuevoPer.setReach(alcance);
            nuevoPer.setDamage(danho);
            nuevoPer.setRange(rango);
            
            // Agregar el personaje al juego
            ArrayList<Personaje> array = new ArrayList<Personaje>();
            if(juegoV.getPersonajes() != null){
                for(int i = 0; i < juegoV.getPersonajes().size(); i++){
                    array.add(juegoV.getPersonajes().get(i));
                }
            }
            array.add(nuevoPer);
            juegoV.setPersonajes(array);
        }
        else{
            
            // Crear un personaje de una categoria
            if(categoriaV != "Ninguna" && subCategoria == "Ninguna"){
                
                Categoria nuevoPersonaje = new Categoria(categoriaV, 
                nombrePersonaje, vidaPer, GxT, nivelV, 
                camposV, nivelAparicion, costoV, danho, rango, 
                alcance);
                
                // Agregar el personaje al juego
                ArrayList<Personaje> array = new ArrayList<Personaje>();
                if(juegoV.getPersonajes() != null){
                    for(int i = 0; i < juegoV.getPersonajes().size(); i++){
                        array.add(juegoV.getPersonajes().get(i));
                    }
                }
                array.add(nuevoPersonaje);
                juegoV.setPersonajes(array);
                
                
            }
            // Crear un personaje de una subcategoria
            else{
                SubCategoria nuevoPersonaje = new SubCategoria(subCategoria, 
                nombrePersonaje, vidaPer, GxT, nivelV, 
                camposV, nivelAparicion, costoV, danho, rango, 
                alcance);
                
                // Agregar el personaje al juego
                ArrayList<Personaje> array = new ArrayList<Personaje>();
                if(juegoV.getPersonajes() != null){
                    for(int i = 0; i < juegoV.getPersonajes().size(); i++){
                        array.add(juegoV.getPersonajes().get(i));
                    }
                }
                array.add(nuevoPersonaje);
                juegoV.setPersonajes(array);
            }
            
            
        }
    }
    
    // ------------------------> Agregaciones Jugador <------------------------
    
    // Agrega un personaje a la lista del jugador
    public void agregarPerJugador(String nombreJugador, String nombrePersonaje1) {
        
        if(nombreJugador != "" && nombrePersonaje1 != ""){
            // Buscar el personaje
            Personaje p = new Personaje();
            for(int i = 0; i < juegoV.getPersonajes().size(); i++){
                if(juegoV.getPersonajes().get(i).getNombre() == nombrePersonaje1){
                    p = juegoV.getPersonajes().get(i);
                }
            }


            // Buscar el jugador y agregarle el personaje
            for(int i = 0; i < juegoV.getJugadores().size(); i++){
                if(juegoV.getJugadores().get(i).getNombre() == nombreJugador){
                    
                    ArrayList<Personaje> array = new ArrayList<Personaje>();
                    array.add(p);
                    juegoV.getJugadores().get(i).setPersonajes(array);
                }
            }
        }
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
    
    public ArrayList<String> getNombresJugadores(){
        ArrayList<String> nombres = new ArrayList<String>();
        if(juegoV.getJugadores()!= null){
            for(int i = 0; i < juegoV.getJugadores().size(); i++){
                nombres.add(juegoV.getJugadores().get(i).getNombre());
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
