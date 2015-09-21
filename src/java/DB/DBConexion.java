/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Franz
 */ 
public class DBConexion {
    private String Server,DataBase,Usuario,Clave;
    private Connection Conexion;
    
    public DBConexion(){
    Server="JESUS-PC\\SQLEXPRESS";
    DataBase="DBComercial";
    Usuario="sa";
    Clave="123456";    
    Conectar();
    }

    public Connection getConexion() {
        return Conexion;
    }
    
    private void Conectar()
    {
        Connection conexion=null;
      
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://"+Server+";"
                       + "databaseName="+DataBase+";"
                       + "user="+Usuario+";"
                       + "password="+Clave+";";
            conexion= DriverManager.getConnection(url);
        }
        catch (SQLException ex) {        
            Logger.getLogger(DBConexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConexion.class.getName()).log(Level.SEVERE, null, ex);
        }        
        finally
        {
          this.Conexion=conexion;
        }
    }
    
}
