/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase4_Polimorfismo.numero;

/**
 *
 * @author educacionit
 */
public class NumeroNegativo extends Numero {
    public NumeroNegativo(){
       numero = -1;
    
      
   }

    @Override
    public void proximo() {
        numero--;
    }
    
}
