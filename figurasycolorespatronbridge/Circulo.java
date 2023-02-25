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
public class Circulo extends Figura{

    public Circulo(Color color) {
        super(color);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando");
        color.pintar();
    }
    
}
