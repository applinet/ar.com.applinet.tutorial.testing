/*
 * Main.java
 *
 * Created on 26 de agosto de 2009, 13:21
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Clase2_conceptosbasicos;

/**
 *
 * @author Educacion IT
 */
public class Main {
    
    /** Creates a new instance of Main */
    public Main() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] vecNumeros = {11, -22, 33, -44, 55, -66, 77, -88, 99};
        int[] vecPositivos = new int[10];
        int indicePositivos = 0;
        int totalPositivos = 0;
        int[] vecNegativos = new int[10];
        int indiceNegativos = 0;
        int totalNegativos = 0;
        
        for(int i = 0; i < vecNumeros.length; i++){
            if( vecNumeros[i] < 0 ){
                vecNegativos[indiceNegativos] = vecNumeros[i];
                indiceNegativos++;
                totalNegativos = totalNegativos + vecNumeros[i];
            }else{
                vecPositivos[indicePositivos] = vecNumeros[i];
                indicePositivos++;
                totalPositivos = totalPositivos + vecNumeros[i];
            }
        }
        
        System.out.println("Numeros: ");
        for(int i=0; i<vecNumeros.length; i++){
            System.out.print(vecNumeros[i] + " ");
        }
        System.out.println();

        System.out.println("Numeros Positivos: ");
        for(int i=0; i<indicePositivos; i++){
            System.out.print(vecPositivos[i] + " ");
        }
        System.out.println();
        
        System.out.println("Numeros Negativos: ");
        for(int i=0; i<indiceNegativos; i++){
            System.out.print(vecNegativos[i] + " ");
        }
        System.out.println();

        System.out.println("Suma de positivos mas negativos: " + (totalPositivos+totalNegativos));
        
        System.out.println("Argumentos: ");
        for(int j = 0; j<args.length; j++){
            System.out.print(args[j]+" ");
        }
        System.out.println();
    }
    
}
