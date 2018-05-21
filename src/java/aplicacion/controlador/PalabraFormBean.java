package aplicacion.controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Fer
 */
@ManagedBean
@ViewScoped
public class PalabraFormBean {
    private String palabra;
    private ArrayList<String> listaPalabras;
    
    /**
     * Creates a new instance of PalabraFormBean
     */
    public PalabraFormBean() {
        listaPalabras=new ArrayList();
    }
    public void guardarPalabra(){
        getListaPalabras().add(getPalabra());
    }
    public void ordenarA(){
        String auxp = null;
        int aux;
        for(int i=0;i<getListaPalabras().size();i++){
            for(int j=i;j<getListaPalabras().size();j++){
                aux=getListaPalabras().get(i).compareToIgnoreCase(getListaPalabras().get(j));
                if(aux>0){
                    auxp=getListaPalabras().get(i);
                    getListaPalabras().set(i, getListaPalabras().get(j));
                    getListaPalabras().set(j, auxp);
                    //palabra.compareToIgnoreCase(palabra);Si es negativo es mayor, 0 es igual y positivo es menor
            }
        }
    }
}
    public PalabraFormBean(String palabra) {
        this.palabra = palabra;
    }
    /**
     * @return the palabra
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * @param palabra the palabra to set
     */
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    /**
     * @return the listaPalabras
     */
    public ArrayList<String> getListaPalabras() {
        return listaPalabras;
    }

    /**
     * @param listaPalabras the listaPalabras to set
     */
    public void setListaPalabras(ArrayList<String> listaPalabras) {
        this.listaPalabras = listaPalabras;
    }
}
