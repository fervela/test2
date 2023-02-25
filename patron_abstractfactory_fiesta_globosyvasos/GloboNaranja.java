/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_abstractfactory_fiesta_globosyvasos;

/**
 *
 * @author Fernando
 */
public class GloboNaranja implements Globo{

    @Override
    public void flotar() {
        System.out.println("flotando globo naranja");
    }

    @Override
    public void explotar() {
        System.out.println("explotando globo naranja");
    }

    @Override
    public void llenar() {
        System.out.println("llenando globo naranja");
    }
    
}
