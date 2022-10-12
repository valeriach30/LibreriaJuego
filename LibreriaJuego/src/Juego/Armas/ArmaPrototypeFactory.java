/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego.Armas;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Ray
 */
public class ArmaPrototypeFactory {
    HashMap<Arma, Iprotoype> prototypes;
    
    Iprototype getProtype(Arma arm){
        
        return new Iprototype();
    }
    
    void addProtype(Arma arm, iPrototype prototype){
        
    }
}
