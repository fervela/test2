/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_proxy_cuentabancaria;

import java.util.logging.Logger;

/**
 *
 * @author Fernando
 */
public class CuentaProxy implements ICuenta{
    private CuentaBancoAimpl cuentaReal;
    private final static Logger LOGGER = Logger.getLogger(CuentaProxy.class.getName());
    @Override
    public Cuenta retirarDinero(Cuenta cuenta, double monto) {
        LOGGER.info("----Cuenta Proxy - Retirar Dinero---");
        if (cuentaReal == null)
        {
            cuentaReal = new CuentaBancoAimpl();
            return cuentaReal.retirarDinero(cuenta, monto);
        }else{
            return cuentaReal.retirarDinero(cuenta, monto);
        }
    }

    @Override
    public Cuenta depositarDinero(Cuenta cuenta, double monto) {
        LOGGER.info("----Cuenta Proxy - Depositar Dinero ---");
        if (cuentaReal == null)
        {
            cuentaReal = new CuentaBancoAimpl();
            return cuentaReal.depositarDinero(cuenta, monto);
        }else{
            return cuentaReal.depositarDinero(cuenta, monto);
        }
    }

    @Override
    public void mostrarSaldo(Cuenta cuenta) {
        LOGGER.info("----Cuenta Proxy - Mostrar Dinero ----");
        if (cuentaReal == null)
        {
            cuentaReal = new CuentaBancoAimpl();
            cuentaReal.mostrarSaldo(cuenta);
        }else{
            cuentaReal.mostrarSaldo(cuenta);
        }
    }
    
}
