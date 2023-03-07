/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iva.plantilla;

/**
 *
 * @author lorit
 */
public abstract class FacturaTemplate {

    protected float iva;
    protected float precioSinIva;
    protected float precioIva;

    public void CalcularPrecioIva() {
        ObtenerIva();
        precioIva = precioSinIva + iva;
    }

    public void setPrecio(float precio) {
        this.precioSinIva = precio;
    }

    public abstract void ObtenerIva();

}
