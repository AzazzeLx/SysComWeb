/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OBJ;

import DAO.UsuarioDAO;
import Util.FN;
import Util.SSU;

/**
 *
 * @author Franz
 */
public class Usuario {

    String Usuario, Clave;

    /**
     * Creates a new instance of Usuario
     */
    public Usuario() {
    }

    // ATRIBUTOS DE LA CLASE
    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    // METODOS DE LA CLASE
    public String login() {
        String ruta = "";
        UsuarioDAO usuDAO = new UsuarioDAO();
        if (usuDAO.Login(this) != null) {
            ruta = FN.ruta("menu");
            Empresa em = new Empresa();
            em.setEmpresa("2101895685");
            em.setRazonSocial("Tibox SRL");
            em.setDireccion("MiCasa");
            SSU.sEmpresa(em);
            SSU.sUsuario(this);
        }
        return ruta;
    }

}
