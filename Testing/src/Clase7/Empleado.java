/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase7;

/**
 *
 * @author educacionit
 */
public class Empleado {
    private String nombre;
    private int edad;
    private String dni; 
    private String datosConcatenados;
    
    
    public Empleado(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDatosConcatenados() {
        return "El empleado " + nombre + " DNI Nº " + dni + " tiene " + edad + " años";
    }

    public void setDatosConcatenados(String datosConcatenados) {
        this.datosConcatenados = datosConcatenados;
    }

}
