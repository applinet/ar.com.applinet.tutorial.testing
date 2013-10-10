/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enume;

import ar.com.educacionit.base.entidades.Vehiculo;

/**
 *
 * @author educacionit
 */
public class AutoConColorTipoEnum extends Vehiculo {

    private ColorDeAuto color;
    
    public AutoConColorTipoEnum(int ancho, int largo, int altura, ColorDeAuto color) {
        super(ancho, largo, altura);
        this.color = color;
    }
    
}
