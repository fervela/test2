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
public class Cuenta {
    private int idCuenta;
    private String usuario;
    private double saldoInicial;
    
    public Cuenta(int idCuenta, String usuario, double saldoInicial){
        this.idCuenta = idCuenta;
        this.usuario = usuario;
        this.saldoInicial = saldoInicial;
    }
    public int getIdCuenta(){
        return idCuenta;
    }
    public void setIdCuenta(int idCuenta){
        this.idCuenta = idCuenta;
    }
    public String getUsuario(){
        return usuario;
    }
    public double getSaldoInicial(){
        return saldoInicial;
    }
    public void setSaldoInicial(double saldoInicial){
        this.saldoInicial = saldoInicial;
    }
    
    
}
