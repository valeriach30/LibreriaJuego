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
    
    private static HashMap<Personaje, iPrototype> prototypes = new HashMap<>();
    
    public static iPrototype getPrototypeDeep(Personaje pj){ // Crea copias identicas pero con atributos individuales
        if (pj != null){
            return prototypes.get(pj).deepClone();
        }
        return null;
    }
    
    public static iPrototype getPrototypeClone(Personaje pj){ // Crea copias identicas
        if (pj != null){
            return prototypes.get(pj).clone();
        }
        return null;
    }
    
    public static void addPrototype(Personaje pj, iPrototype prototype){
        if (pj != null && prototypes != null){
            prototypes.put(pj, prototype);
        }
    }
}
