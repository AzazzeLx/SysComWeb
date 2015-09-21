/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import OBJ.Empresa;
import OBJ.Usuario;
import static javafx.scene.input.KeyCode.T;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Franz
 */
public class SSU {

     public static HttpSession varSession() {

        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext ext = context.getExternalContext();
        Object ojb = ext.getRequest();
        HttpServletRequest request = (HttpServletRequest) ojb;

        return request.getSession();

    }
     
     public static void setSession(String key, Object Objeto){
         HttpSession sessionh = varSession();
         Object obj = sessionh.getAttribute(key);
         if (obj != null) {
            sessionh.removeAttribute(key);
            sessionh.setAttribute(key, Objeto);
        } else {
            sessionh.setAttribute(key, Objeto);
        }
    
    }
     
     public static Object getSession(String key){
         HttpSession sessionh = varSession();
         return sessionh.getAttribute(key);
    }
     
    // TODOS LOS SETS DE SESSION 
     
    public static void sUsuario(Usuario usuario) {
        setSession("usuario", usuario);
    }
    
    public static void sEmpresa(Empresa empresa) {
        setSession("empresa", empresa);
    }

}
