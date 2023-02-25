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
public class Clasica implements Pizza{
    private String size;

    public Clasica(String size) {
        this.size = size;
    }
    

    @Override
    public String descripcion() {
        return "Clasica";
    }

    @Override
    public double costo() {
        switch(size){
            case "pequeña": return 47;
            case "mediana": return 55;
            default: return 64;
        }
    }

    @Override
    public String size() {
        return size;
    }
    
}
