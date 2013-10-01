/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase08.labroratorio;

/**
 *
 * @author educacionit
 */
public class Programa {
    private static int resultado;
    public static void main(String[] args) throws CantidadDeArgumentosException{
        
        int param1 = 0;
        int param2 = 0;        
        if(args.length != 2){
              throw new CantidadDeArgumentosException("id1", "Nivel1", "Los dos valores deben ser numéricos");
        }
        
        try {
            param1 = Integer.parseInt(args[0]);
            param2 = Integer.parseInt(args[1]);
            float result = division(param1, param2);
            System.out.println("El resultado es = " + result);
        } catch (NumberFormatException n) {
            System.out.println("Los dos valores deben ser numéricos");
        } catch (ArithmeticException a) {
            System.out.println("Se ha detectado el error: " + a.getMessage());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
        public static float division (int par1, int par2) throws ArithmeticException{
            float resultado = par1 / par2;
            return resultado;
  
        }
            
               
  
}
