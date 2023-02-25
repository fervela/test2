/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_estado_mascotas;

/**
 *
 * @author Fernando
 */
public class Aburrido implements Estado{
    private Mascota mascota;

    @Override
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    @Override
    public void alimentar() {
        System.out.println("NO QUIERO COMER");
    }

    @Override
    public void jugar() {
        System.out.println("JUGUEMOS");
        mascota.setEstado(new Cansado());
    }

    @Override
    public void dormir() {
        System.out.println("no quiero dormir");
    }

    @Override
    public void comoEstas() {
        System.out.println("estoy aburrido quiero jugar");
    }
    
    
}
