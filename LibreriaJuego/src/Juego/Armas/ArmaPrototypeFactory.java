/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego.Armas;

import Juego.Personaje.iPrototype;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Ray
 */
public class ArmaPrototypeFactory {
    HashMap<Arma, iPrototype> prototypes;
    
    iPrototype getProtype(Arma arm){
        
        return new iPrototype();
    }
    
    void addProtype(Arma arm, iPrototype prototype){
        
    }
}
