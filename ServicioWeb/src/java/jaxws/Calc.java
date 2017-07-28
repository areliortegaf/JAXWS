/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaxws;

/**
 *
 * @author asortega
 */

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public class Calc {
    
    public Calc(){}
    @WebMethod
    public String cuadrado(String number){
        //METODO PARA CONVERTIR AL CUADRADO
       double num = Double.valueOf(number); 
       return Double.toString(num * num);
    }
    
    
    public static void main(String[] args) {
        
    }
    
}
