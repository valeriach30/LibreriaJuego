/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego.Prototype;

/**
 *
 * @author fabri
 */
public interface iPrototype<T extends iPrototype> extends Cloneable{
    public T clone();
    public T deepClone();
}