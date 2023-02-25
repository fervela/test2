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
public class Patron_ChainOfResponsability_Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int monto = 300;
        Banco banco = new Banco();
        banco.peticion(monto);
        
        
    }
    
}
