/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego.Armas;

import Juego.Prototype.iPrototype;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Ray
 */
public class ArmaPrototypeFactory {
    private static HashMap<String, iPrototype> prototypes = new HashMap<>();
    
    public static iPrototype getPrototypeDeepArm(String nombreArma){ // Crea copias identicas pero con atributos individuales
        if (nombreArma != null){
            return prototypes.get(nombreArma).deepClone();
        }
        return null;
    }
    
    public static iPrototype getProtype(String nombreArma){
        if(nombreArma != null){
            return prototypes.get(nombreArma).deepClone();
        }
        return null;
    }
    
    public static void addProtype(String nombreArma, iPrototype prototype){
        if(nombreArma != null && prototype != null){
            prototypes.put(nombreArma, prototype);
        }
        
    }
}
