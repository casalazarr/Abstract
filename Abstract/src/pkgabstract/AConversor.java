
package pkgabstract;


public abstract class AConversor {
    double dato;
    
    abstract int grado2radian ();
    int farenheit2kelvin (){
        return (int) (9/5*dato+32);
    }
    
}
