/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasycolorespatronbridge;

/**
 *
 * @author Fernando
 */
public class FigurasyColoresPatronBridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Figura figura = new Circulo(new Negro());
        figura.dibujar();
    }
    
}
