/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase4_Polimorfismo.numero;

/**
 *
 * @author educacionit
 */
public abstract class Numero {
    int numero;
    
    public abstract void proximo();

    @Override
    public String toString() {
        return String.valueOf(numero);
    }
    
    
}
