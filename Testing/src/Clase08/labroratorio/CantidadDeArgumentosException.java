/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase08.labroratorio;

import Clase08.customexceptions.*;

/**
 *
 * @author educacionit
 */
public class CantidadDeArgumentosException extends Exception{
    private String id;
    private String nivelDeError;
    private String mensajeError;

    public CantidadDeArgumentosException() {
    }

    public CantidadDeArgumentosException(String id, String nivelDeError, String mensajeError) {
        this.id = id;
        this.nivelDeError = nivelDeError;
        this.mensajeError = mensajeError;
    }

    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the nivelDeError
     */
    public String getNivelDeError() {
        return nivelDeError;
    }

    /**
     * @return the mensajeError
     */
    public String getMensajeError() {
        return mensajeError;
    }
    
   
    
}
