/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_abstractfactory_fiesta_globosyvasos;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Patron_AbstractFactory_Fiesta_GlobosYVasos {

    /**
     * @param args the command line arguments
     */
    
    static int tipo;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Como quiere su fiesta?");
        System.out.println("1 = naranja, 2 = azul");
        tipo = sc.nextInt();
        AbstractFactoryScene();
    }
    private static void AbstractFactoryScene(){
        System.out.println("--------------------------------");
        fabricaParty fp;
        if (tipo == 1)
        {
            fp = new fabricaAzulParty();
        }else{
            fp = new fabricaNaranjaParty();
        }
        Vaso vasosParty[] = new Vaso[3];
        Globo globosParty[] = new Globo[3];
        for (int i = 0; i < globosParty.length; i++)
        {
            globosParty[i]=fp.crearGlobo();
            globosParty[i].llenar();
            globosParty[i].flotar();                    
        }
        for (int i = 0; i < vasosParty.length; i++)
        {
            vasosParty[i] = fp.crearVaso();
            vasosParty[i].servir();
        }
        
        for(Vaso vasoPartyActual : vasosParty){
            vasoPartyActual.beber();            
        }
        for (Globo globo : globosParty)
        {
            globo.explotar();
        }
        
        
        
        
    }
    
}
