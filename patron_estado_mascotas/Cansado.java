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
public class Cansado implements Estado{
    private Mascota mascota;
    
    public Cansado() {
    }

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
        System.out.println("NO QUIERO JUGAR ESTOY CANSADO");
    }

    @Override
    public void dormir() {
        System.out.println("buenas noches");
        mascota.setEstado(new Durmiendo());
    }

    @Override
    public void comoEstas() {
        System.out.println("Tengo sueno, quiero ir a dormir");
    }
    
}
