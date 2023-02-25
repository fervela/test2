/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_memento_juegoconcheckpoints;

/**
 *
 * @author Fernando
 */
public class Patron_Memento_JuegoConCheckPoints {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombreJuego = "Crash BANDICOOT";
        
        Juego juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpoint(1);
        
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();
        
        juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpoint(2);
        originator.setEstado(juego);
        
        juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpoint(3);
        originator.setEstado(juego);
        
        careTaker.addMemento(originator.guardar());
        
        originator.restaurar(careTaker.getMememto(0));
        
        
        
    }
    
}
