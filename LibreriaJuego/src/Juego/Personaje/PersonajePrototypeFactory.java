/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego.Personaje;

import java.util.HashMap;

/**
 *
 * @author fabri
 */
public class PersonajePrototypeFactory {
    
    HashMap<Personaje, iPrototype> prototypes = new HashMap<>();
    
    public iPrototype getPrototype(Personaje pj){
        if (pj != null){
            return prototypes.get(pj).deepclone();
        }
        return null;
    }
    public void addPrototype(Personaje pj, iPrototype prototype){
        if (pj != null && prototypes != null){
            prototypes.put(pj, prototype);
        }
    }
}
