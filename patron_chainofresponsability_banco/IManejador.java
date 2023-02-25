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
public interface IManejador {
    public void peticion(int monto);
    public IManejador getSucesor();
    public void setSucesor(IManejador sucesor);
}
