/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeriapatrondecorador;

/**
 *
 * @author Fernando
 */
public class DecoradorAnchoa extends Decorador{
    
    public DecoradorAnchoa(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String descripcion() {
        return super.descripcion() + ", anchoa";
    }

    @Override
    public double costo() {
        double costo = super.costo();
        switch(super.size()){
            case "pequeña": costo += 9.50;
            break;
            case "mediana": costo += 10.10;
            break;
            default: costo += 11.50;
            break;  
        }
        return costo;
    }
    
    
}
