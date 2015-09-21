/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import DB.DBConexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Franz
 */
public class RS {
    
    
    
    public static ResultSet CDatos(String Query){
        DBConexion Conexion=new DBConexion();
        ResultSet Datos = null;
        Connection con = null;
        try {
            con=Conexion.getConexion();
            Statement cst =con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            Datos = cst.executeQuery(Query);
        } catch (SQLException ex) {
            Logger.getLogger(RS.class.getName()).log(Level.SEVERE, null, ex);
        }
    return Datos;
    }
    
    public static int IUD(String Procedimiento, Parametros param) {
        int Validador=0;
        try {
            DBConexion Conexion=new DBConexion();
            Connection con = null;
            
            /*ARMA EL QUERY*/
            String Q="";
            if (param != null) {
                List<Parametros> lp = param.getLParametros();
                for (int i = 0; i < lp.size(); i++) {
                    if (i == 0) {
                        Q = "?";
                    } else {
                        Q = ",?";
                    }
                }
                Q = "( " + Q + " )";
                Q = "{ call " + Procedimiento + " " + Q + " }";
            }

            /*EJECUTA EL QUERY EL QUERY*/
            con=Conexion.getConexion();
            CallableStatement cst = con.prepareCall(Q);
            List<Parametros> listap = param.getLParametros();
            for (int i = 0; i < listap.size(); i++) {
                cst.setObject(listap.get(i).getKey(), listap.get(i).getValue());
            }
            
            /*RETORNA EL VALOR DE LOS REGISTRO MODIFICADOS POR EL QUERY*/
            Validador=cst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RS.class.getName()).log(Level.SEVERE, null, ex);
            Validador=0;
        }
      
        return Validador;
        
    }
    
    public static boolean IUD2(String Procedimiento, Parametros param) {
        int Validador=0;
        boolean val=false;
        try {
            DBConexion Conexion=new DBConexion();
            Connection con = null;
            
            /*ARMA EL QUERY*/
            String Q="";
            if (param != null) {
                List<Parametros> lp = param.getLParametros();
                for (int i = 0; i < lp.size(); i++) {
                    if (i == 0) {
                        Q = "?";
                    } else {
                        Q = Q+",?";
                    }
                }
                Q = "( " + Q + " )";
                Q = "{ call " + Procedimiento + " " + Q + " }";
            }

            /*EJECUTA EL QUERY EL QUERY*/
            con=Conexion.getConexion();
            CallableStatement cst = con.prepareCall(Q);
            List<Parametros> listap = param.getLParametros();
            for (int i = 0; i < listap.size(); i++) {
                cst.setObject(listap.get(i).getKey(), listap.get(i).getValue());
            }
            
            /*RETORNA EL VALOR DE LOS REGISTRO MODIFICADOS POR EL QUERY*/
            Validador=cst.executeUpdate();
            
            if(Validador>0){
            val=true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RS.class.getName()).log(Level.SEVERE, null, ex);
            val=false;
        }
      
        return val;
        
    }
    
    
}
