/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase4_Polimorfismo.numero;

/**
 *
 * @author educacionit
 */
public class NumeroPositivo extends Numero {
    
   public NumeroPositivo(){
       numero = 0;
    
      
   }

    @Override
    public void proximo() {
   
        numero++;
    }
   
   
}
