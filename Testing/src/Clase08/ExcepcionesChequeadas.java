/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author educacionit
 */
public class ExcepcionesChequeadas {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("c:/saraza.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExcepcionesChequeadas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
