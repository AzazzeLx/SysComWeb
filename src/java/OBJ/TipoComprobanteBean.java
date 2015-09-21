/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OBJ;

import DAO.TipoComprobanteDAO;
import Util.FN;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Franz
 */
@ManagedBean
@SessionScoped
public class TipoComprobanteBean {
    List<TipoComprobante>  lista;
    TipoComprobante tipoComprobante;
    /**
     * Creates a new instance of TipoComprobanteBean
     */
    @PostConstruct
    public void initialize() {
        this.tipoComprobante = new TipoComprobante();
    }

    public TipoComprobante getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(TipoComprobante tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public List<TipoComprobante> getLista() {
        return lista;
    }

    public void setLista(List<TipoComprobante> lista) {
        this.lista = lista;
    }
    
    
    
    public void registrar(){
       if( TipoComprobanteDAO.Registrar(tipoComprobante)){
       FN.mensaje(FacesMessage.SEVERITY_INFO, "Registro Correcto", "");
       }
       else{
       FN.mensaje(FacesMessage.SEVERITY_INFO, "Error Al Registrar", "");
       }
    }
    
    
    
    public void listar(){
       lista=new ArrayList<>();
       lista=TipoComprobanteDAO.Listar();  
    }
    
    public List<TipoComprobante> listarIni(){
       return TipoComprobanteDAO.Listar();  
    }
    
}
