/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import OBJ.Empresa;
import OBJ.Usuario;
import static javafx.scene.input.KeyCode.T;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Franz
 */
@ManagedBean
@RequestScoped
public class SS {
    
    // TODOS LOS GETS DE SESSION
    
    public Usuario sUsuario() {
        return (Usuario)SSU.getSession("usuario");
    }
    
    public Empresa sEmpresa() {
        return (Empresa)SSU.getSession("empresa");
    }
    
}
