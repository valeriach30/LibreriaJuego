/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego.Personaje;

import Juego.Prototype.iPrototype;
import java.util.HashMap;

/**
 *
 * @author fabri
 */
public class PersonajePrototypeFactory {
    
    private static HashMap<String, iPrototype> prototypes = new HashMap<>();
    
    public static iPrototype getPrototypeDeep(String nombrePj){ // Crea copias identicas pero con atributos individuales
        if (nombrePj != null){
            return prototypes.get(nombrePj).deepClone();
        }
        return null;
    }
    
    public static iPrototype getPrototypeClone(String nombrePj){ // Crea copias identicas
        if (nombrePj != null){
            return prototypes.get(nombrePj).clone();
        }
        return null;
    }
    
    public static void addPrototype(String nombrePj, iPrototype prototype){
        if (nombrePj != null && prototypes != null){
            prototypes.put(nombrePj, prototype);
        }
    }
}
