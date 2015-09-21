/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Util.RS;
import OBJ.*;
import Util.Parametros;
import Util.SS;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Franz
 */
public class TipoComprobanteDAO {
    

    public static boolean Registrar(TipoComprobante tc){
        String Query="RegTipoComprobante";
        SS s=new SS();
        Parametros param=new Parametros();
        param.AddParametro("vTipoComprobante",tc.getTipoComprobante());
        param.AddParametro("vDescripcion", tc.getDescripcion());
        param.AddParametro("vEmpresa", s.sEmpresa().getEmpresa());
        
        return RS.IUD2(Query, param);
    
    }
    
    public static List<TipoComprobante> Listar(){
        List<TipoComprobante> lista=new ArrayList<>();
        try {
            
            
            ResultSet rs = RS.CDatos("select * from tipocomprobante");
            
            while(rs.next()){
                TipoComprobante tc=new TipoComprobante();
                tc.setTipoComprobante(rs.getString("vTipoComprobante"));
                tc.setDescripcion(rs.getString("vDescripcion"));
                tc.setvEmpresa(rs.getString("vEmpresa"));
                lista.add(tc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TipoComprobanteDAO.class.getName()).log(Level.SEVERE, null, ex);
            lista=null;
        }
    
    return lista;
    }
    
}
