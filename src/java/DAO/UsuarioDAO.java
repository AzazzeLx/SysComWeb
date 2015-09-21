/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Util.RS;
import OBJ.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Franz
 */
public class UsuarioDAO {
    
    public Usuario Login(Usuario usuario){
        Usuario usu=null;
        try {
            ResultSet rs=RS.CDatos("select * from Usuario where vUsuario='admin' and vClave='admin'");
            rs.last();
            if(rs.getRow()>0){
            usu=usuario;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            usu=null;
        }
        return usu;
    }
    
}
