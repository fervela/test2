/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_proxy_cuentabancaria;

/**
 *
 * @author Fernando
 */
public class App {
    public static void main(String[] args) {
        Cuenta c = new Cuenta(1, "Fernando",100);
        
        ICuenta cuentaProxy = new CuentaProxy();
        cuentaProxy.mostrarSaldo(c);
        c = cuentaProxy.depositarDinero(c, 50);
        c = cuentaProxy.retirarDinero(c, 20);
        cuentaProxy.mostrarSaldo(c);
    }
}
