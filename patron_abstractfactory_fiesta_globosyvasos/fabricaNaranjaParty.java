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
public class fabricaNaranjaParty implements fabricaParty{

    @Override
    public Vaso crearVaso() {
        return new VasoNaranja();
    }

    @Override
    public Globo crearGlobo() {
        return new GloboNaranja();
    }
    
}
