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
public class DecoradorJamon extends Decorador{
    
    public DecoradorJamon(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double costo() {
        double costo = super.costo();
        switch(super.size()){
            case "pequeña": costo += 6.50;
            break;
            case "mediana": costo += 8.10;
            break;
            default: costo += 10.50;
            break;  
        }
        return costo;
    }

    @Override
    public String descripcion() {
        return super.descripcion() + ", jamon";
    }
    
}
