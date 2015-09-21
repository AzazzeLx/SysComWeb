/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Franz
 */
@ManagedBean
@SessionScoped
public class FN {

    /**
     * Creates a new instance of FN
     * @param Pagina
     * @return 
     */
    public static String ruta(String Pagina){
        return "faces/"+Pagina+".xhtml";
    }
    
    public String ruta2(String Pagina){
        return "faces/"+Pagina+".xhtml";
    }
    
    public static void mensaje(Severity serverity,String Titulo,String Mensaje){
    
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(serverity,Titulo,Mensaje) );   
    
    }
    
}
