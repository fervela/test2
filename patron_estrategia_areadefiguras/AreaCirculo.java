/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_estrategia_areadefiguras;

/**
 *
 * @author Fernando
 */
public class AreaCirculo implements IArea{
    private final float radio;

    public AreaCirculo(float radio) {
        this.radio = radio;
    }
    
    
    @Override
    public float calcularArea() {
        return (float) (Math.PI*Math.pow(radio,2));
    }

    @Override
    public String getResultado() {
        return "El area del circulo es "+ calcularArea();
    }
    
}
