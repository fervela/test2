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
public class ContextoGeometrico {
    private IArea figura;
    private float radio;
    private float base;
    private float altura;

    public ContextoGeometrico( float base, float altura) {
        
        this.base = base;
        this.altura = altura;
    }

    public ContextoGeometrico(float radio) {
        this.radio = radio;
    }

   
    
    public  void setStrategy(){
        if (this.radio == 0)
        {
            figura = new AreaRectangulo(base, altura);
        }else{
            figura = new AreaCirculo(radio);
        }
    }
    
    public String obtenerResultado(){
        return figura.getResultado();
    }
}
