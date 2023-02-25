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
public interface Estado {
    void setMascota(Mascota mascota);
    void alimentar();
    void jugar();
    void dormir();
    void comoEstas();
    
}
