/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import aplicacion.modelo.datos.ListadoImagen;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseId;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author acer
 */
@ManagedBean
@SessionScoped
public class ImagenFormBean implements Serializable{
    private UploadedFile file=null;
    private byte[] imagen;
    private byte[] nuevaImagen;
    private ListadoImagen listadoImagen;

    /**
     * Creates a new instance of ImagenFormBean
     */
    public ImagenFormBean() {
        listadoImagen=new ListadoImagen();
    }
    public void agregarImagen(){
        setImagen(file.getContents());
        getListadoImagen().llenarListado(imagen);
        FacesMessage message=new FacesMessage("Succeful",file.getFileName()+" is uploaded.");
        FacesContext.getCurrentInstance().addMessage(null, message);
                }
    public StreamedContent getImagenSubida() throws IOException{
        FacesContext context=FacesContext.getCurrentInstance();
        if (context.getCurrentPhaseId()==PhaseId.RENDER_RESPONSE) return new DefaultStreamedContent();
        else{
            if(getImagen()==null) return null;
            //NO TIENE IMAGEN
            else return new DefaultStreamedContent(new ByteArrayInputStream(getImagen()),"img.png");
            
        }
    }

    /**
     * @return the file
     */
    public UploadedFile getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(UploadedFile file) {
        this.file = file;
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

    /**
     * @return the nuevaImagen
     */
    public byte[] getNuevaImagen() {
        return nuevaImagen;
    }

    /**
     * @param nuevaImagen the nuevaImagen to set
     */
    public void setNuevaImagen(byte[] nuevaImagen) {
        this.nuevaImagen = nuevaImagen;
    }

    /**
     * @return the listadoImagen
     */
    public ListadoImagen getListadoImagen() {
        return listadoImagen;
    }

    /**
     * @param listadoImagen the listadoImagen to set
     */
    public void setListadoImagen(ListadoImagen listadoImagen) {
        this.listadoImagen = listadoImagen;
    }
    
}
