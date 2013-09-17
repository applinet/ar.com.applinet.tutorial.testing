/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;
import java.util.Date;

/**
 *
 * @author educacionit
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola, Mundo");
        System.out.println("Hoy es"  + new Date() );
        
        System.out.println("Bucle con for");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " es: ");
            System.out.println(i % 2 == 0 ? "Par":"Impar");
            if (true) {
                
            }
        }
        
//        System.out.println("Bucle con while");
//        int i = 1;
//        while (i <= 10) {            
//            System.out.println(i);
//            i++;
//        }
    }
}
