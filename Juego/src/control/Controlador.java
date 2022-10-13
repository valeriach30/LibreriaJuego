/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
// import de la libreria
/**
 *
 * @author vchin
 */
public class Controlador {
    // private Juego juego = new Juego()
    
    public Controlador() {                                      //AGREGAR AL UML
        
    }
    
    public void crear(){  
        // Crear el juego
    }
    
    // ------------------------------------------------ CREAR ------------------------------------------------
    
    // Retorna el Personaje Agregado
    public void agregarPersonaje(String nombrePersonaje, int vidaPer, int GxT, int camposV, int nivelV, int costoV, String categoriaV){
        
    }
    
    // Agrega un arma a un personaje
    public void agregarArma(String arma){
        
    }
    
    // Agrega una habilidad a un personaje
    public void agregarHabilidad(String habilidad){
        
    }
    
    // Agrega una image a un personaje
    public void agregarImagen(String imagen) {
        
    }
    
    public void agregarJugador(String nombreJ, String usuarioJ, String contraJ, int edadJ) {
        // Agregar jugador a la lista del  juego
    }
    
    // Retorna los Personajes Agregados
    public void clonarPersonaje(String nombrePersonaje, int vidaPer, int GxT, int camposV, int nivelV, int costoV, String categoriaV, int cantidadV) {

    }
    
    // Agrega un personaje a la lista del jugador
    public void agregarPerJugador(String nombrePersonaje) {

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
