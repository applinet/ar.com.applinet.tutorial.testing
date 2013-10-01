/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase08.customexceptions;

/**
 *
 * @author educacionit
 */
public class NoHayMasPasajesException extends Exception{
    private int cantidadDePasajes;
    private String vuelo;

    public NoHayMasPasajesException() {
    }
    
    public NoHayMasPasajesException(int cantidadDePasajes, String vuelo) {
        this.cantidadDePasajes = cantidadDePasajes;
        this.vuelo = vuelo;
    }

    /**
     * @return the cantidadDePasajes
     */
    public int getCantidadDePasajes() {
        return cantidadDePasajes;
    }

    /**
     * @param cantidadDePasajes the cantidadDePasajes to set
     */
    public void setCantidadDePasajes(int cantidadDePasajes) {
        this.cantidadDePasajes = cantidadDePasajes;
    }

    /**
     * @return the vuelo
     */
    public String getVuelo() {
        return vuelo;
    }

    /**
     * @param vuelo the vuelo to set
     */
    public void setVuelo(String vuelo) {
        this.vuelo = vuelo;
    }
    
    
}
