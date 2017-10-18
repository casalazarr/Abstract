
package pkgabstract;


public class Abstract {

   
    public static void main(String[] args) {
       
        TransImplementado mitrans=new TransImplementado();
        mitrans.dato=6;
        System.out.println(mitrans.kelvin2celcius());
        System.out.println(mitrans.grado2radian());
    }
    
}
