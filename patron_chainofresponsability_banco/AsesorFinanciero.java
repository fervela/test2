/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_chainofresponsability_banco;

import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class AsesorFinanciero implements IManejador{
    private IManejador sucesor;
    @Override
    public void peticion(int monto) {
        if (monto >= 300)
        {
            JOptionPane.showMessageDialog(null, "La peticion a sido atendida por el asesor financiero");
        }else{
            sucesor.peticion(monto);
        }
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

