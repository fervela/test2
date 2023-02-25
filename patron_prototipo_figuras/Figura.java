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
public interface Figura {
    public void setNombre(String n);
    public String getNombre();
    public void mover(int x, int y);
    public void getPosicion();
    public Figura clonar();   
}
