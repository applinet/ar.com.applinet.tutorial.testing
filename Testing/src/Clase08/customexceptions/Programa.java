/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase08.customexceptions;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author educacionit
 */
public class Programa {
    public static void main(String[] args) {
        List<Vuelo> vuelos = new ArrayList<>();
        int cantidadPasajes = 100;
        int cantidadPequeñaPasajes = 25;
        Vuelo vuelo1 = new Vuelo("Educacion it123", cantidadPasajes);
        Vuelo vuelo2 = new Vuelo("Educacion it456", cantidadPequeñaPasajes);
        vuelos.add(vuelo1);
        vuelos.add(vuelo2);
        for(Vuelo v: vuelos){
            try {
                v.venderPasajes(cantidadPasajes);
            } catch (NoHayMasPasajesException ex) {
                System.out.print("El vuelo " + ex.getVuelo() + " no tiene ");
                System.out.println(ex.getCantidadDePasajes() + " disponibles");                
            }
        }
     }
}
