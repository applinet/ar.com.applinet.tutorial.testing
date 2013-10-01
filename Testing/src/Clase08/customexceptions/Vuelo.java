/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase08.customexceptions;

/**
 *
 * @author educacionit
 */
public class Vuelo {
    private String nombre;
    private int lugaresDisponibles;

    
    public Vuelo(String nombre, int lugaresDisponibles) {
        this.nombre = nombre;
        this.lugaresDisponibles = lugaresDisponibles;
    }
    
    
    
    public void venderPasajes(int cantidadDePasajes) throws NoHayMasPasajesException{
        if(getLugaresDisponibles() < cantidadDePasajes){
            throw new NoHayMasPasajesException(cantidadDePasajes, getNombre());
        }
        
        setLugaresDisponibles(getLugaresDisponibles() - cantidadDePasajes);
        //asignar asientos a los pasajeros
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the lugaresDisponibles
     */
    public int getLugaresDisponibles() {
        return lugaresDisponibles;
    }

    /**
     * @param lugaresDisponibles the lugaresDisponibles to set
     */
    public void setLugaresDisponibles(int lugaresDisponibles) {
        this.lugaresDisponibles = lugaresDisponibles;
    }
            
    
}
