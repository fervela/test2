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
public abstract class Figura {
   protected Color color;

    public Figura(Color color) {
        this.color = color;
    }
   public abstract void dibujar();
}
