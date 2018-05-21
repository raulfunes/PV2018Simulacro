/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.datos;

import aplicacion.modelo.Imagen;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class ListadoImagen implements Serializable{
    private ArrayList<Imagen>listaImagenes;
    private int numImg;
    private byte[] imagen;

    public ListadoImagen() {
    listaImagenes=new ArrayList();
    }
    public void llenarListado(byte[] imgGuardar){
        if(getListaImagenes().isEmpty())setNumImg(0);
        else setNumImg(getListaImagenes().size());
        //este if sirve para guardar el numero de posicion de la imagen en la variable numimg de IMagen y se la pasa por parametro
        getListaImagenes().add(new Imagen(getNumImg(),imgGuardar));
    }

    /**
     * @return the listaImagenes
     */
    public ArrayList<Imagen> getListaImagenes() {
        return listaImagenes;
    }

    /**
     * @param listaImagenes the listaImagenes to set
     */
    public void setListaImagenes(ArrayList<Imagen> listaImagenes) {
        this.listaImagenes = listaImagenes;
    }

    /**
     * @return the numImg
     */
    public int getNumImg() {
        return numImg;
    }

    /**
     * @param numImg the numImg to set
     */
    public void setNumImg(int numImg) {
        this.numImg = numImg;
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
