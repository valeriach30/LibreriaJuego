/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

// import de la libreria
import Juego.Armas.Arma;
import Juego.Armas.ArmaPrototypeFactory;
import static Juego.Armas.ArmaPrototypeFactory.getPrototypeDeepArm;
import Libreria.Juego.Juego;

import Juego.Personaje.Categoria;
import Juego.Personaje.Personaje;
import Juego.Personaje.PersonajePrototypeFactory;
import static Juego.Personaje.PersonajePrototypeFactory.getPrototypeDeep;
import Juego.Personaje.SubCategoria;
import Juego.Prototype.iPrototype;
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
        // Agregar algunos personajes default
        
        // Armas
        builderArma("Pistol", 1, 1, 1, 1, 1, "/imagenes/pistol1.png");
        agregarArma("Pistol", "/imagenes/pistol2.jpg");
        agregarArma("Pistol", "/imagenes/pistol3.png");
        
        builderArma("Snipper", 10, 10, 1, 100, 1, "/imagenes/snipper1.jpg");
        agregarArma("Snipper", "/imagenes/snipper2.jpg");
        agregarArma("Snipper", "/imagenes/snipper3.jpg");
        
        // Habilidades
        builderHabilidad("Trueno", 5, 5, 1, 5, 1, "/imagenes/trueno1.jpg");
        agregarHabilidad("Trueno", "/imagenes/trueno2.jpg");
        agregarHabilidad("Trueno", "/imagenes/trueno3.jpg");
        
        builderHabilidad("Fuego", 4, 4, 1, 4, 1, "/imagenes/fuego1.jpg");
        agregarHabilidad("Fuego", "/imagenes/fuego2.jpg");
        agregarHabilidad("Fuego", "/imagenes/fuego3.jpg");
        
        // Personaje
        
        buildPersonaje("Pistol", 20, 5, 1, 5, 
       1, 1, "", 1, "Trueno", "Pickachu", 1, 1, 1, "");
        
        // Agregar imagenes a pickachu
        agregarPersonaje("Pistol", "Trueno", "/imagenes/pickachu1.png", "Pickachu");
        agregarPersonaje("Ninguna", "Ninguna", "/imagenes/pickachu2.png", "Pickachu");
        agregarPersonaje("Ninguna", "Ninguna", "/imagenes/pickachu3.png", "Pickachu");
        
        
        buildPersonaje("Snipper", 20, 5, 1, 5, 
       1, 1, "", 1, "Fuego", "Charmander", 1, 1, 1, "");
        agregarPersonaje("Snipper", "Fuego", "/imagenes/charmander1.png", "Charmander");
        agregarPersonaje("Ninguna", "Ninguna", "/imagenes/charmander2.jpg", "Charmander");
        agregarPersonaje("Ninguna", "Ninguna", "/imagenes/charmander3.png", "Charmander");
        
    }
    
    // ------------------------------------------------ CREAR ------------------------------------------------
    
    // ------------------------> Agregaciones Juego <------------------------
    
    // Agrega caracteristicas a un personaje
    public void agregarPersonaje(String armaNombre, String habilidadNombre, String imagen, String nombrePersonaje){
        
        // Encontrar el personaje
        Personaje personaje = null;
        for(int i = 0; i < juegoV.getPersonajes().size(); i++){
            if(juegoV.getPersonajes().get(i).getNombre().equals(nombrePersonaje)){
                personaje = juegoV.getPersonajes().get(i);
            }
        }
        if(personaje != null){
            if(armaNombre != "Ninguna"){
                // Buscar arma
                Arma arma = null;
                for(int i = 0; i < juegoV.getArmas().size(); i++){
                    if(juegoV.getArmas().get(i).getName() == armaNombre){
                        arma = juegoV.getArmas().get(i);
                        break;
                    }
                }
                
                // Agregar arma al personaje
                ArrayList<Arma> array = new ArrayList<Arma>();
                if(personaje.getArmas() != null){
                    for(int i = 0; i < personaje.getArmas().size(); i++){
                        array.add (personaje.getArmas().get(i));
                    }
                }
                array.add(arma);
                personaje.setArmas(array);
            }
            if(habilidadNombre != "Ninguna"){
                
                // Buscar habilidad
                Arma habilidad = null;
                for(int i = 0; i < juegoV.getHabilidades().size(); i++){
                    if(juegoV.getHabilidades().get(i).getName() == habilidadNombre){
                        habilidad = juegoV.getHabilidades().get(i);
                        break;
                    }
                }

                // Agregar habilidad al personaje
            
                ArrayList<Arma> array = new ArrayList<Arma>();
                if(personaje.getHechizos() != null){
                    for(int i = 0; i < personaje.getHechizos().size(); i++){
                        array.add(personaje.getHechizos().get(i));
                    }
                }
                array.add(habilidad);
                personaje.setHechizos(array);
            }
            if(imagen != "Url"){
                
                // Agregar imagen al personaje
                ArrayList<String> array = new ArrayList<String>();
                if(personaje.getApariencias() != null){
                    for(int i = 0; i < personaje.getApariencias().size(); i++){
                        array.add(personaje.getApariencias().get(i));
                    }
                }
                array.add(imagen);
                personaje.setApariencias(array);
            }
        }
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
    
    // ------------------------> Factory Prototype Personaje <------------------------
    
    // Retorna los Personajes Agregados, se usa el clone del factory
    public void clonarPersonaje(String nombreArma, int vidaPer, int GxT,
           int nivelAparicion, int camposV, int nivelV, int costoV, String categoriaV,
           int cantidadV, String habilidadNombre, String nombrePersonaje, int alcance, 
           int danho, int rango, String subCategoria) {
        
        // Buscar el arma y la habilidad
        
        Arma habilidad = null;
        for(int i = 0; i < juegoV.getHabilidades().size(); i++){
            if(juegoV.getHabilidades().get(i).getName() == habilidadNombre){
                habilidad = juegoV.getHabilidades().get(i);
            }
        }
        
        Arma arma = null;
        for(int i = 0; i < juegoV.getArmas().size(); i++){
            if(juegoV.getArmas().get(i).getName() == nombreArma){
                arma = juegoV.getArmas().get(i);
            }
        }
        
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
        
        PersonajePrototypeFactory factory = new PersonajePrototypeFactory();
        factory.addPrototype(nombrePersonaje, nuevoPer);
        
        // Clonar personaje y agregarlos al juego
        ArrayList<Personaje> array = new ArrayList<Personaje>();
        if(juegoV.getPersonajes() != null){
            for(int i = 0; i < juegoV.getPersonajes().size(); i++){
                array.add(juegoV.getPersonajes().get(i));
            }
        }
        array.add(nuevoPer);
        
        // Clonar y agregar
        for(int i = 0; i < cantidadV - 1; i++){
            array.add((Personaje) getPrototypeDeep(nombrePersonaje));
        }
        juegoV.setPersonajes(array);
        
    }

    // ------------------------> Build Personaje <------------------------
    
    public void buildPersonaje(String nombreArma, int vidaPer, int GxT,
           int nivelAparicion, int camposV, int nivelV, int costoV, String categoriaV,
           int cantidadV, String habilidadNombre, String nombrePersonaje, int alcance, 
           int danho, int rango, String subCategoria) {
        
        // Buscar el arma y la habilidad
        
        Arma habilidad = null;
        for(int i = 0; i < juegoV.getHabilidades().size(); i++){
            
            if(juegoV.getHabilidades().get(i).getName() == habilidadNombre){
                habilidad = juegoV.getHabilidades().get(i);
            }
        }
        
        Arma arma = null;
        for(int i = 0; i < juegoV.getArmas().size(); i++){
            
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
    
    // Agrega imagenes a un arma
    public void agregarArma(String armaNombre, String imagen){
        
        // Buscar el arms
        Arma arma = null;
        for(int i = 0; i < juegoV.getArmas().size(); i++){
            
            if(juegoV.getArmas().get(i).getName() == armaNombre){
                arma = juegoV.getArmas().get(i);
            }
        }  
        
        ArrayList<String> array = new ArrayList<String>();
        if(arma != null){
            for(int i = 0; i < arma.getImages().size(); i++){
                array.add(arma.getImages().get(i));
            }
        }
        array.add(imagen);
        arma.setImages(array);
    }
    
    // ------------------------> Factory Prototype Arma <------------------------
    public void clonarArma(String nombreArma, int alcanceV, int danhoV, int nivelV, int rangoV, int cantidadV, String imagen) {
        Arma nuevaAr = new Arma.ArmaBuilder().AgregarImagen(imagen).build();

        nuevaAr.setRange(rangoV);
        nuevaAr.setDamage(danhoV);
        nuevaAr.setName(nombreArma);
        nuevaAr.setReach(alcanceV);
        nuevaAr.setLevel(nivelV);
        
        ArmaPrototypeFactory factoryArm = new ArmaPrototypeFactory();
        factoryArm.addProtype(nombreArma, nuevaAr);
        
        // Agregar arma al juego
        ArrayList<Arma> array = new ArrayList<Arma>();
        if(juegoV.getArmas() != null){
            for(int i = 0; i < juegoV.getArmas().size(); i++){
                array.add(juegoV.getArmas().get(i));
            }
        }
        array.add(nuevaAr);

        // Clonar y agregar
        for(int i = 0; i < cantidadV - 1; i++){
            array.add((Arma) getPrototypeDeepArm(nombreArma));
        }
        juegoV.setArmas(array);
    }
    // ------------------------> Builder Arma <------------------------
    public void builderArma(String arma, int alcanceV, int danhoV, int nivel, int rangoV, int cantidadV, String imagen){
        
        Arma nuevaAr = new Arma.ArmaBuilder().AgregarImagen(imagen).build();

        nuevaAr.setRange(rangoV);
        nuevaAr.setDamage(danhoV);
        nuevaAr.setName(arma);
        nuevaAr.setReach(alcanceV);
        nuevaAr.setLevel(nivel);
        
        // Agregar arma al juego
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
    public void agregarHabilidad(String nombreArma, String imagenUrl){
        // Buscar la habilidad
        Arma habilidad = null;
        for(int i = 0; i < juegoV.getHabilidades().size(); i++){
            
            if(juegoV.getHabilidades().get(i).getName() == nombreArma){
                habilidad = juegoV.getHabilidades().get(i);
            }
        }  
        
        ArrayList<String> array = new ArrayList<String>();
        if(habilidad != null){
            for(int i = 0; i < habilidad.getImages().size(); i++){
                array.add(habilidad.getImages().get(i));
            }
        }
        array.add(imagenUrl);
        habilidad.setImages(array);
    }
    
    // ------------------------> Factory Prototype Habilidad <------------------------
    public void clonarHabilidad(String nombreHab, int alcanceV, int danhoV, int nivelV, int rangoV, int cantidadV, String imagen) {
        Arma nuevaHabilidad = new Arma.ArmaBuilder().AgregarImagen(imagen).build();

        nuevaHabilidad.setRange(rangoV);
        nuevaHabilidad.setDamage(danhoV);
        nuevaHabilidad.setName(nombreHab);
        nuevaHabilidad.setReach(alcanceV);
        nuevaHabilidad.setLevel(nivelV);
        
        ArmaPrototypeFactory factoryArm = new ArmaPrototypeFactory();
        factoryArm.addProtype(nombreHab, nuevaHabilidad);
        
        // Agregar arma al juego
        ArrayList<Arma> array = new ArrayList<Arma>();
        if(juegoV.getHabilidades() != null){
            for(int i = 0; i < juegoV.getHabilidades().size(); i++){
                array.add(juegoV.getHabilidades().get(i));
            }
        }
        array.add(nuevaHabilidad);

        // Clonar y agregar
        for(int i = 0; i < cantidadV - 1; i++){
            array.add((Arma) getPrototypeDeepArm(nombreHab));
        }
        juegoV.setHabilidades(array);
    }

    // ------------------------> Builder Habilidad <------------------------
    public void builderHabilidad(String nombreArma, int alcanceV, int danhoV, int nivelV, int rangoV, int cantidadV, String imagen) {
        Arma nuevaHabilidad = new Arma.ArmaBuilder().AgregarImagen(imagen).build();

        nuevaHabilidad.setRange(rangoV);
        nuevaHabilidad.setDamage(danhoV);
        nuevaHabilidad.setName(nombreArma);
        nuevaHabilidad.setReach(alcanceV);
        nuevaHabilidad.setLevel(nivelV);
        
        // Agregar arma al juego
        ArrayList<Arma> array = new ArrayList<Arma>();
        if(juegoV.getHabilidades() != null){
            for(int i = 0; i < juegoV.getHabilidades().size(); i++){
                array.add(juegoV.getHabilidades().get(i));
            }
        }
        array.add(nuevaHabilidad);
        juegoV.setHabilidades(array);
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

            Personaje nuevoP = p.clone();
            // Buscar el jugador y agregarle el personaje
            for(int i = 0; i < juegoV.getJugadores().size(); i++){
                if(juegoV.getJugadores().get(i).getNombre() == nombreJugador){
                    
                    ArrayList<Personaje> array = new ArrayList<Personaje>();
                    array.add(nuevoP);
                    juegoV.getJugadores().get(i).setPersonajes(array);
                }
            }
        }
    }
    //este funciona por indice directo
     public void agregarPerJugador(int indexJugador, String nombrePersonaje1) {
        
        //como el juego solo tiene dos jugadores pregunta si el index en menor a 
        if(nombrePersonaje1 != ""){
            // Buscar el personaje
            Personaje p = new Personaje();
            for(int i = 0; i < juegoV.getPersonajes().size(); i++){
                if(juegoV.getPersonajes().get(i).getNombre() == nombrePersonaje1){
                    p = juegoV.getPersonajes().get(i);
                }
            }

            Personaje nuevoP = p.clone();
            // Buscar el jugador y agregarle el personaje
            juegoV.getJugadores().get(indexJugador).addPersonaje(nuevoP);
        }
     }
     public void eliminarPerJugador(int indexJugador, String nombrePersonaje1) {
        
        //como el juego solo tiene dos jugadores pregunta si el index en menor a 
        if(nombrePersonaje1 != ""){
            // Buscar el personaje
            Personaje p = new Personaje();
            for(int i = 0; i < juegoV.getPersonajes().size(); i++){
                if(juegoV.getPersonajes().get(i).getNombre() == nombrePersonaje1){
                    p = juegoV.getPersonajes().get(i);
                }
            }


            // Buscar el jugador y agregarle el personaje
            juegoV.getJugadores().get(indexJugador).removePersonaje(p);
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
    
    public String consultarPersonajesJugador(int index){ //el index el numero del jugador
        ArrayList<Personaje> personajesJugador = juegoV.getJugadores().get(index).getPersonajes();
        if(personajesJugador != null){
            String texto = "";
            
            for(int i = 0; i < personajesJugador.size() ; i++){
                texto += "\n";
                texto += personajesJugador.get(i).toString();
            }
            return texto;
        }
        else{
            return "El jugador " +index+" no tiene personajes";
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
    
    // Obtiene los nombres de los personajes de un jugador
    public ArrayList<String> getNombresPersonajesJugador(String jugador) {
        ArrayList<String> nombres = new ArrayList<String>();
        
        if(juegoV.getJugadores() != null){
            for(int i = 0; i < juegoV.getJugadores().size(); i++){
                // Agregar nombres de los personajes del jugador
                if(juegoV.getJugadores().get(i).getNombre() == jugador){
                    for(int j = 0; j < juegoV.getJugadores().get(i).getPersonajes().size(); j++){
                        nombres.add(juegoV.getJugadores().get(i).getPersonajes().get(j).getNombre());
                    }
                }
            }
            return nombres;
        }
        else{
            return nombres;
        }
    }
    
    public Jugador getJugador(String jugador){
        Jugador nuevoJ = null;
        if(juegoV.getJugadores() != null){
            for(int i = 0; i < juegoV.getJugadores().size(); i++){
                // Agregar nombres de los personajes del jugador
                if(juegoV.getJugadores().get(i).getNombre() == jugador){
                    nuevoJ = juegoV.getJugadores().get(i);
                }
            }
            return nuevoJ;
        }
        else{
            return nuevoJ;
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
    
    // Obtiene los nombres de las armas de un pesonaje
    public ArrayList<String> getNombresArmasPersonaje(String nombrePersonaje ){
        // Encontrar pesonaje
        Personaje per = null;
        for(int i = 0; i < juegoV.getPersonajes().size(); i++){
            System.out.println("----------------");
            System.out.println("nombre: " + nombrePersonaje);
            System.out.println(juegoV.getPersonajes().get(i).getNombre());
            if(juegoV.getPersonajes().get(i).getNombre() == nombrePersonaje){
                System.out.println("entre");
                per = juegoV.getPersonajes().get(i);
            }
        }
        
        ArrayList<String> nombres = new ArrayList<String>();
        
        if(per.getArmas() != null){
            for(int i = 0; i < per.getArmas().size(); i++){
                nombres.add(per.getArmas().get(i).getName());
            }
            if(per.getHechizos() != null){
                for(int i = 0; i < per.getHechizos().size(); i++){
                    nombres.add(per.getHechizos().get(i).getName());
                }
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
    
    public String atacar(int indexJugador, int indexJugadorEnemigo ,String nombrePersonaje, String nombreEnemigo, String nombreArma){
        ArrayList<Personaje> personajes = juegoV.getJugadores().get(indexJugador).getPersonajes();
        ArrayList<Personaje> enemigos = juegoV.getJugadores().get(indexJugadorEnemigo).getPersonajes();
        
        // Encontrar el arma y obtener el daño
        Arma arma = null;
        for(int i = 0; i < juegoV.getArmas().size(); i++){
            if(juegoV.getArmas().get(i).getName() == nombreArma){
                arma = juegoV.getArmas().get(i);
                break;
            }
        }
        // No es un arma, es una habilidad
        if(arma == null){
            for(int i = 0; i < juegoV.getHabilidades().size(); i++){
                if(juegoV.getHabilidades().get(i).getName() == nombreArma){
                    arma = juegoV.getHabilidades().get(i);
                    break;
                }
            }
        }
        // Encontrar enemigo
        int indexPersonaje = this.getIndexPersonaje(indexJugador,nombrePersonaje);
        int indexEnemigo = this.getIndexPersonaje(indexJugadorEnemigo,nombreEnemigo);
        
        //setea el enemigo que se va a atacar
        personajes.get(indexPersonaje).setEnemy(enemigos.get(indexEnemigo)); 
        
        // Setear la info del arma al personaje para que ataque con eso
        personajes.get(indexPersonaje).setDamage(arma.getDamage());
        personajes.get(indexPersonaje).setReach(arma.getReach());
        personajes.get(indexPersonaje).setRange(arma.getRange());
        
        // Atacar
        personajes.get(indexPersonaje).setDamage(arma.getDamage());
        String texto = personajes.get(indexPersonaje).atacar();
        System.out.println(personajes.get(indexPersonaje).getVida());
        System.out.println(personajes.get(indexPersonaje).getEnemigo().getVida());
        return texto;

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
        // Buscar categoria
        Categoria categoria = null;
        for(int i = 0; i < juegoV.getCategorias().size(); i++){
            
            if(juegoV.getCategorias().get(i).getNombreCategoria() == nombreCategoria){
                categoria = juegoV.getCategorias().get(i);
            }
        } 
        // Buscar subcategoria
        SubCategoria subcategoria = null;
        for(int i = 0; i < juegoV.getSubcategorias().size(); i++){
            
            if(juegoV.getSubcategorias().get(i).getNombreSubCategoria() == nombreSubCategoria){
                subcategoria = juegoV.getSubcategorias().get(i);
            }
        } 
        
        // Agregar subcategoria a la categoria
        if(categoria != null){
            
            ArrayList<SubCategoria> subcategorias = new ArrayList<SubCategoria>();
            if(categoria.getSubCategorias() != null){
                for(int i = 0; i < categoria.getSubCategorias().size(); i++){
                    subcategorias.add(categoria.getSubCategorias().get(i));
                }
            }
            subcategorias.add(subcategoria);
            categoria.setSubCategorias(subcategorias);
        }
        
        System.out.println(categoria.toString());
    }
    
    //metodos para el manejo de arrays de hechizos armas y combate
    //gets:
    public int getArmasSize(){
        return juegoV.getArmas().size();
    
    }
    public int getHechizosSize(){
        return juegoV.getHabilidades().size();
    
    } 
    public int getPersoanjesSize(){
        return juegoV.getPersonajes().size();
    
    } 
    
    public int getJugarPersonajesSize(int index){
        if ( juegoV.getJugadores().get(index).getPersonajes() == null)
            return 0;
        return juegoV.getJugadores().get(index).getPersonajes().size();
    
    } 
    
    public String getArmaNombre(int index){
        return juegoV.getArmas().get(index).getName();
    
    } 
    public String getHabilidadesNombre(int index){
        return juegoV.getHabilidades().get(index).getName();
    
    } 
    
    public String getPersonajeNombre(int index){
        return juegoV.getPersonajes().get(index).getNombre();
    
    } 
    
    public int getIndexPersonaje(int indexJugador,String personajeNombre){ 
        for(int i=0; i < juegoV.getJugadores().get(indexJugador).getPersonajes().size() ;i++){
            if(juegoV.getJugadores().get(indexJugador).getPersonajes().get(i).getNombre() == personajeNombre){
                return i;
            }
        }
        return 0;
    
    }
    
    public String getJugadorPersonajeNombre(int indexJugador, int indexPersonaje){
        if(juegoV.getJugadores().get(indexJugador).getPersonajes().size() > indexPersonaje)
            return juegoV.getJugadores().get(indexJugador).getPersonajes().get(indexPersonaje).getNombre();
        return ""; //no hay personajes en esa posicion
    } 
    
    public String getJugadorPersonajeArmaNombre(int indexJugador, int indexPersonaje, int indexArma){
        if(juegoV.getJugadores().get(indexJugador).getPersonajes().size() > indexPersonaje)
            if(juegoV.getJugadores().get(indexJugador).getPersonajes().get(indexPersonaje).getArmas().size() > indexArma)
                return juegoV.getJugadores().get(indexJugador).getPersonajes().get(indexPersonaje).getArmas().get(indexArma).getName();
        return ""; //no hay armas en esa posicion
    } 
    
    public String obtenerImagenPersonaje(String nombrePersonaje){
        String imagen = "";
        for(int i = 0; i < juegoV.getPersonajes().size(); i++){
            
            if(juegoV.getPersonajes().get(i).getNombre() == nombrePersonaje){
                int nivel = juegoV.getPersonajes().get(i).getNivel();
                if(nivel <= juegoV.getPersonajes().get(i).getApariencias().size()){
                    if(nivel > 0){
                        nivel = nivel - 1;
                    }
                    imagen = juegoV.getPersonajes().get(i).getApariencias().get(nivel);
                }
            }
        }
        return imagen;
    }

    public String obtenerImagenArma(String nombreArma) {
        String imagen = "";
        for(int i = 0; i < juegoV.getArmas().size(); i++){
            
            if(juegoV.getArmas().get(i).getName() == nombreArma){
                int nivel = juegoV.getArmas().get(i).getLevel();
                
                if(nivel <= juegoV.getArmas().get(i).getImages().size()){
                    if(nivel > 0){
                        nivel = nivel - 1;
                    }
                    imagen = juegoV.getArmas().get(i).getImages().get(nivel);
                }
            }
        }
        if(imagen == ""){
            // Buscar en habilidades
            for(int i = 0; i < juegoV.getHabilidades().size(); i++){
            
                if(juegoV.getHabilidades().get(i).getName() == nombreArma){
                    int nivel = juegoV.getHabilidades().get(i).getLevel();

                    if(nivel <= juegoV.getHabilidades().get(i).getImages().size()){
                        if(nivel > 0){
                            nivel = nivel - 1;
                        }
                        imagen = juegoV.getHabilidades().get(i).getImages().get(nivel);
                    }
                }
            }
        }
        
        return imagen;
    }

    public int getJugadores() {
        if(juegoV.getJugadores() != null){
            return juegoV.getJugadores().size();
        }
        else{
            return 0;
        }
    }

    public int getVidaPersonaje(String nombrePersonaje, String nombreJugador) {
        // Encontrar el personaje del jugador
        int vida = 0;
        if(juegoV.getJugadores() != null){
            for(int i = 0; i < juegoV.getJugadores().size(); i++){
                // Determinar si el jugador es el recibido
                if(juegoV.getJugadores().get(i).getNombre() == nombreJugador){
                    // Obtener el personaje
                    for(int j = 0; j < juegoV.getJugadores().get(i).getPersonajes().size(); j++){
                        String nombreActual = juegoV.getJugadores().get(i).getPersonajes().get(j).getNombre();
                        if(nombreActual == nombrePersonaje){
                            vida = juegoV.getJugadores().get(i).getPersonajes().get(j).getVida();
                        }
                    }
                }
            }
        }
        return vida;
    }

    public void SubirNivelPersonaje(String nombrePersonaje) {
        Personaje personaje = null;
        int indice = 0;
        for(int i = 0; i < juegoV.getPersonajes().size(); i++){
            if(juegoV.getPersonajes().get(i).getNombre().equals(nombrePersonaje)){
                personaje = juegoV.getPersonajes().get(i);
                indice = i;
            }
        }
        juegoV.getPersonajes().get(indice).setNivel(personaje.getNivel() + 1);
    }

    public void SubirNivelArma(String armaNombre) {
        // Buscar arma
        Arma arma = null;
        int indice = 0;
        for(int i = 0; i < juegoV.getArmas().size(); i++){
            if(juegoV.getArmas().get(i).getName() == armaNombre){
                arma = juegoV.getArmas().get(i);
                indice = i;
                break;
            }
        }
        if(arma == null){
            // Buscar en habilidades
            Arma habilidad = null;
            for(int i = 0; i < juegoV.getHabilidades().size(); i++){
                if(juegoV.getHabilidades().get(i).getName() == armaNombre){
                    habilidad = juegoV.getHabilidades().get(i);
                    indice = i;
                    break;
                }
            }
            juegoV.getHabilidades().get(indice).setLevel(habilidad.getLevel() + 1);
        }
        else{
            juegoV.getArmas().get(indice).setLevel(arma.getLevel() + 1);
        }
    }

    
}
