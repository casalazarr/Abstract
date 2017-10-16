/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;

/**
 *
 * @author Familia
 */
public abstract class AConversor {
    double dato;
    
    abstract int grado2radian ();
    int farenheit2kelvin (){
        return (int) (9/5*dato+32);
    }
    
}
