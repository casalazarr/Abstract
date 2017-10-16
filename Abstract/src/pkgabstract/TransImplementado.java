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
public class TransImplementado implements ITransformador  {
    double dato;

    @Override
    public int grado2radian() {
         return (int) (dato*(3.1416/180));
    }

    @Override
    public int farenheit2kelvin() {
        return (int) (9/5*dato+32);
    }
    
}
