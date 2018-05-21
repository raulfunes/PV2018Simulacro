/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo;

import java.io.Serializable;

/**
 *
 * @author acer
 */
public class Imagen implements Serializable{
    private int numI;
    private byte[] imagen;

    public Imagen() {
    }

    public Imagen(int numI, byte[] imagen) {
        this.numI = numI;
        this.imagen = imagen;
    }

    /**
     * @return the numI
     */
    public int getNumI() {
        return numI;
    }

    /**
     * @param numI the numI to set
     */
    public void setNumI(int numI) {
        this.numI = numI;
    }

    /**
     * @return the imagen
     */
    public byte[] getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
    
    
}
