package Clase08;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author educacionit
 */
public class AverQuePasa {
    public static void main(String[] args) {
        try {
            //Codigo riesgoso
//            int num =10/0;
            String p = null;
            System.out.println("La longitud de p es:" + p.length());
        } catch (ArithmeticException a) { //Esta excepcion es la mas general
            // Código con medidas correctivas o de recuperacion
            a.printStackTrace();
            System.err.println("Division pòr cero: " + a);            
         } catch (NullPointerException npe) { //Esta excepcion es la mas general
            // Código con medidas correctivas o de recuperacion
            npe.printStackTrace();
            System.err.println("Se ha atrapado una null: " + npe);                        
          } catch (Exception e) { //Esta excepcion es la mas general
            // Código con medidas correctivas o de recuperacion
            System.err.println("Se ha atrapado una excepcion: " + e);
                
        }finally{
            //Código que se ejecuta SIEMPRE(haya o no excepción) [Cierre de conexion a dB]
            System.out.println("Salida finaly");
        }
        
    }
        
}
