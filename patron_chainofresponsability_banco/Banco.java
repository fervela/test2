/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_chainofresponsability_banco;

/**
 *
 * @author Fernando
 */
public class Banco implements IManejador{
    private IManejador sucesor;
    @Override
    public void peticion(int monto) {
        CajeroAutomatico ca = new CajeroAutomatico();
        setSucesor(ca);
        
        
        CajeroSucursal cs = new CajeroSucursal();
        ca.setSucesor(cs);
        
        AsesorFinanciero af = new AsesorFinanciero();
        cs.setSucesor(af);
        
        sucesor.peticion(monto);
    }

    @Override
    public IManejador getSucesor() {
        return sucesor;
    }

    @Override
    public void setSucesor(IManejador sucesor) {
        this.sucesor = sucesor;
    }
    
}
