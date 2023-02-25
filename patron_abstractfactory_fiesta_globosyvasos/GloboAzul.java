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
public class GloboAzul implements Globo{

    @Override
    public void flotar() {
        System.out.println("flotando globo azul");
    }

    @Override
    public void explotar() {
        System.out.println("explota globo azul");
    }

    @Override
    public void llenar() {
        System.out.println("llenando globo azul");
    }
    
}
