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
public class Durmiendo implements Estado {

    private Mascota mascota;
    
    public Durmiendo() {
    }

    @Override
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    @Override
    public void alimentar() {
        System.out.println("zzzzzzzzzzz");
    }

    @Override
    public void jugar() {
        System.out.println("zzzzzzzzzzzzzzz");
    }

    @Override
    public void dormir() {
        System.out.println("zzzzzzzzzzzz");
       
    }

    @Override
    public void comoEstas() {
        System.out.println("zzzzzzzzzzzzz");
    }
}
