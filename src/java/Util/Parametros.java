/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Franz
 */
public class Parametros {
    
    String key;
    Object value;
    List<Parametros> LParametros;

    public String getKey() {
        return key;
    }

    private void setKey(String key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    private void setValue(Object value) {
        this.value = value;
    }

    public List<Parametros> getLParametros() {
        return LParametros;
    }
    
    
   
    public void AddParametro(String key,Object value){ 
        Parametros param=new Parametros();
        param.setKey(key);
        param.setValue(value);
        
        if(this.LParametros==null){
            this.LParametros=new ArrayList<>();
        }
        
        LParametros.add(param);
    }
}
