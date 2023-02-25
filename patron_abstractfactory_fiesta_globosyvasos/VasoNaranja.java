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
public class VasoNaranja implements Vaso{

    @Override
    public void servir() {
        System.out.println("Servido vaso naranja");
    }

    @Override
    public void beber() {
        System.out.println("bebe vaso naranja");
    }
    
}
