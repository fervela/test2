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
public class Mascota {
    private Estado estado;
    
    public Mascota(){
        setEstado(new Aburrido());
    }
    
    public void setEstado(Estado estado){
        this.estado = estado;
        this.estado.setMascota(this);
    }
    
    public void alimentar(){
        this.estado.alimentar();
    }
    public void dormir(){
        this.estado.dormir();
        
    }
    public void jugar(){
        this.estado.jugar();
    }
    public void comoEstas(){
        this.estado.comoEstas();
    }
    
}
