/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_memento_juegoconcheckpoints;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class CareTaker {
    private ArrayList<Memento> mementos = new ArrayList<>();

    public CareTaker() {
    }
    
    public void addMemento(Memento m){
        mementos.add(m);
    }
    public Memento getMememto(int index){
        return mementos.get(index);
    }
}
