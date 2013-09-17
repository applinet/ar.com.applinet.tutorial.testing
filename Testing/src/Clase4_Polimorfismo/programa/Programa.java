/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase4_Polimorfismo.programa;

import Clase4_Polimorfismo.numero.NumeroNegativo;
import Clase4_Polimorfismo.numero.NumeroPositivo;
import Clase4_Polimorfismo.numero.Numero;

/**
 *
 * @author educacionit
 */
public class Programa {
    public static void main(String[] args) {
    Numero positivo = new NumeroPositivo();
    Numero negativo = new NumeroNegativo();
        System.out.println("positivo inicial = " + positivo);
        System.out.println("negativo inicial = " + negativo);
        positivo.proximo();
        negativo.proximo();
        System.out.println("positivo actual = " + positivo);
        System.out.println("negativo actual = " + negativo);
    }
    
         
       
}
