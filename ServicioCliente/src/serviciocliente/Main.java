/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciocliente;

/**
 *
 * @author asortega
 */
public class Main {
    //CORRER EL PROYECTO NO LA CLASE
    //FUNCIONA CON EL PROYECTO WS ServicioWeb
    
    public static void main(String[] args) {
        //instancia de los archivos autogenerados del web service
        CalcService calc = new CalcService();
        Calc x = calc.getCalcPort();
        
        System.out.println("El cuadrado de 9 es " + x.cuadrado("9"));
        System.out.println("El cuadrado de 10 es " + x.cuadrado("10"));
    }
    
}
