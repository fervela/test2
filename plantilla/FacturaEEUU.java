/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iva.plantilla;

/**
 *
 * @author lorit
 */
public class FacturaEEUU extends FacturaTemplate {

    @Override
    public void ObtenerIva() {
        this.iva = this.precioSinIva * 0.07f;
    }
    
}
