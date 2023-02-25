/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_prototipo_figuras;

/**
 *
 * @author Fernando
 */
public class PruevaFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo circulo = new Circulo();
        circulo.setNombre("mi circulo");
        circulo.mover(12, 34);
        
        Figura figura = circulo.clonar();
        figura.setNombre("soy una nueva figura ;D");
        
        
        System.out.println("circulo "+circulo.getNombre());
        circulo.getPosicion();
        
        System.out.println("esta es la figura clonada"+figura.getNombre());
        figura.getPosicion();
        
      
        
        
        
        
    }
    
    
}
