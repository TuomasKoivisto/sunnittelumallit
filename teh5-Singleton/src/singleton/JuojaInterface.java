/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author koivi
 */
public interface JuojaInterface {
    Vesipullo vesipullo = Vesipullo.getInstance();
    
    public abstract void juo();
}