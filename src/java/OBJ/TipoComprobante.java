/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OBJ;

import DAO.TipoComprobanteDAO;
import Util.Parametros;
import Util.RS;
import Util.SS;
import java.util.List;

/**
 *
 * @author Franz
 */
public class TipoComprobante {
    
    String TipoComprobante,Descripcion,UsuarioReg,UsuarioMod,vEmpresa;
    int Estado,Formato;

    public String getTipoComprobante() {
        return TipoComprobante;
    }

    public void setTipoComprobante(String TipoComprobante) {
        this.TipoComprobante = TipoComprobante;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getUsuarioReg() {
        return UsuarioReg;
    }

    public void setUsuarioReg(String UsuarioReg) {
        this.UsuarioReg = UsuarioReg;
    }

    public String getUsuarioMod() {
        return UsuarioMod;
    }

    public void setUsuarioMod(String UsuarioMod) {
        this.UsuarioMod = UsuarioMod;
    }

    public String getvEmpresa() {
        return vEmpresa;
    }

    public void setvEmpresa(String vEmpresa) {
        this.vEmpresa = vEmpresa;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

    public int getFormato() {
        return Formato;
    }

    public void setFormato(int Formato) {
        this.Formato = Formato;
    }
    
    
}
