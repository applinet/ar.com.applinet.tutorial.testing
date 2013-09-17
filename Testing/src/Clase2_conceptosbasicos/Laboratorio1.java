/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2_conceptosbasicos;

/**
 *
 * @author educacionit
 */
public class Laboratorio1 {
    
              
    public static void main(String[] args) {
        int[] vecNumeros = new int[9];
        int[] vecPositivos = new int[10];
        int[] vecNegativos = new int[10];
        int totalNegativos = 0;
        int totalpositivos = 0;
        int idxa = 0;
        int idxb = 0;
        
        vecNumeros[0] = 11;
        vecNumeros[1] = -22;
        vecNumeros[2] = 33;
        vecNumeros[3] = -44;
        vecNumeros[4] = 55;
        vecNumeros[5] = -66;
        vecNumeros[6] = 77;
        vecNumeros[7] = -88;
        vecNumeros[8] = 99;
        
        
        for (int i = 0; i < vecNumeros.length; i++) {
            if (vecNumeros[i] >=0){
                vecPositivos[idxa]=vecNumeros[i];
                idxa++;
                 totalpositivos += vecNumeros[i];
            }else{
                vecNegativos[idxb]=vecNumeros[i];
                idxb++;
                totalNegativos += vecNumeros[i];
            }
        }
        System.out.println("-------------El Contenido de vecNumeros-------------");
        for (int i = 0; i < vecNumeros.length; i++) {
            System.out.println("vecNumeros[" + i + "]="+ vecNumeros[i]);
        }
        System.out.println("");
        System.out.println("-------------El Contenido de vecPositivos-------------");
        for (int i = 0; i < idxa; i++) {
                              System.out.println("vecPositivos[" + i + "]="+ vecPositivos[i]);
             
        }
        System.out.println("");
        System.out.println("-------------El Contenido de vecNegativos-------------");
        for (int i = 0; i < idxb; i++) {
                            System.out.println("vecNegativos[" + i + "]="+vecNegativos[i]);
            
        }
        System.out.println("");
        System.out.println("La sumatoria de VecPositivos es :" + totalpositivos);
        System.out.println("La sumatoria de VecNegativos es :" + totalNegativos);
        System.out.println("");
        System.out.println("La sumatoria VecPositivos + VecNegativos es :" + (totalpositivos + totalNegativos));
        
        System.out.println("");
        System.out.println("----------------------");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Args" + args[i]);
        }
    }
            
}
