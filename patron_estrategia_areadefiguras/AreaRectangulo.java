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
public class AreaRectangulo implements IArea{
    private String nombre;
    private float base;
    private float altura;

    public AreaRectangulo(float base, float altura) {
        nombre = "rectangulo";
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public float calcularArea() {
        return (base*altura);
    }

    @Override
    public String getResultado() {
        return "el area del "+ nombre + "es " + calcularArea();
    }
    
}
