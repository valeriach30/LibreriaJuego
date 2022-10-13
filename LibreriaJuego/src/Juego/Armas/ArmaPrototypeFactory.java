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
    private static HashMap<Arma, iPrototype> prototypes = new HashMap<>();
    
    public static iPrototype getProtype(Arma arm){
        if(arm != null){
            return prototypes.get(arm).deepClone();
        }
        return null;
    }
    
    public static void addProtype(Arma arm, iPrototype prototype){
        if(arm != null && prototype != null){
            prototypes.put(arm, prototype);
        }
        
    }
    
    
}
