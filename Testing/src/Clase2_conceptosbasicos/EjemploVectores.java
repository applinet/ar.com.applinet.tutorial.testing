/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2_conceptosbasicos;

/**
 *
 * @author educacionit
 */
public class EjemploVectores {
    public static void main(String[] args) {
        int[] edades = new int[5];
        edades[0] = 10;
        edades[1] = 23;
        edades[2] = 55;
        edades[3] = 3;
        edades[4] = 21;
        
        int acumuladorEdad = 0;
       
        for (int i = 0; i < edades.length; i++) {
            acumuladorEdad += edades[i]; // sumaedad = sumaedad + edades[i]
                        
        }
        System.out.println("La sumatoria de edades es: " + acumuladorEdad / edades.length);
        
    }
  
    
}
