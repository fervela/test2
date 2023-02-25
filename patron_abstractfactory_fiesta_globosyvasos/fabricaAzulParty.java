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
public class fabricaAzulParty implements fabricaParty{

    @Override
    public Vaso crearVaso() {
        return new VasoAzul();
    }

    @Override
    public Globo crearGlobo() {
        return new GloboAzul();
    }
    
}
