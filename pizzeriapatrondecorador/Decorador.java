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
public abstract class Decorador implements Pizza{
    private Pizza pizza;

    public Decorador(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public  String size(){
        return pizza.size();
                
    };

    @Override
    public  double costo(){
        return pizza.costo();
    };

    @Override
    public  String descripcion(){
        return pizza.descripcion();
    };
    
    
   
    
}
